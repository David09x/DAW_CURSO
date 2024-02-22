import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class TaulerJocBuscamines {

    Casella [][] caselles;
    int numFiles;
    int numColumnes;
    int numMines;

    int numCasellesObertes;
    boolean jocAcabat;

    private Consumer<Casella[]> eventPartidaPerduda;
    private Consumer<Casella[]> eventPartidaGuanyada;

    private Consumer<Casella> eventCasellaOberta;

    public TaulerJocBuscamines(int numFilesIn, int numColumnesIn, int numMinesIn) {
        this.numFiles = numFilesIn;
        this.numColumnes = numColumnesIn;
        this.numMines = numMinesIn;

        inicialitzarCaselles();

    }

    public void inicialitzarCaselles(){

        caselles = new Casella[this.numFiles][this.numColumnes];

        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[0].length; j++) {
                caselles [i][j] = new Casella(i, j);
            }
        }

        generarMines();
    }

    private Casella [] buidarNulls(Casella[] arrCasellas){
        int cont=0;
        /*for(Casella casella: arrCasellas){
            if (caselles != null) {
                cont++;
            }
        }*/
        for (int j = 0; j<arrCasellas.length;j++){
            if(arrCasellas[j]!=null){
                cont++;
            }
        }
        Casella[] arrAux = new Casella[cont];
        for (int i = 0; i < cont; i++) {
            arrAux[i]=arrCasellas[i];            
        }
        
        return arrAux;
    }

    private void generarMines(){
        
        int contadorMinas= 0;
        int fila = 0;
        int columna = 0;
       
        while(contadorMinas < this.numMines){
            
             fila = (int) (Math.random() *numFiles);
             columna = (int) (Math.random() *numColumnes);
            if(!caselles[fila][columna].esMina()){
                caselles[fila][columna].ponMina(true);
                contadorMinas++;
            }
            
        }
        
        actualitzarNumeroMinesAlVoltant();
    }

    public void imprimirTauler() {
        
        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[0].length; j++) {
                System.out.print(caselles[i][j].getNum_mines());
            }
            System.out.println("");
        }
    }

    private void imprimirPistes() {
        
        
        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[0].length; j++) {
                if(caselles[i][j].esMina()){
                  System.out.print("*");
                }
                else
                {
                    System.out.print(0);
                }

            }
            System.out.println("");
        }
    }


    private void actualitzarNumeroMinesAlVoltant(){

        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[0].length; j++) {
                if(!caselles[i][j].esMina())
                caselles[i][j].setNumMinesAlVoltant(calculaNumMines(caselles[i][j]));
            }     
        }
    }

    private int calculaNumMines(Casella casilla){

        int contadorMinas = 0;
        for (int i = casilla.getFila()-1 ; i <= casilla.getFila()+1 ; i++) {
            for (int j = casilla.getCol()-1 ; j <= casilla.getCol()+1; j++) {
                if(i >= 0 && j>=0 && i <= caselles.length-1 && j <= caselles[0].length-1){
                    if(caselles[i][j].esMina()){
                        contadorMinas+=1;    
                    }
                }
            }
        }

        return contadorMinas;
    }

    public static void main(String[] args) {
        TaulerJocBuscamines tauler=new TaulerJocBuscamines(5, 5, 4);
        tauler.imprimirTauler();
        System.out.println("---");
        tauler.imprimirPistes();
    }

    Casella [] obtenirCasellesAlVoltant(int fila, int col){

        Casella [] casellesAlVoltant;
        Casella cas;
        String cadena = "";
        int contador = 0;
        for (int i = fila-1; i <= fila+1; i++) {
            for (int j = col-1; j <= col+1; j++) {
                if(i >= 0 && j>=0 && i <= caselles.length-1 && j <= caselles[0].length-1){
                    cadena += i + "," + j + ",";
                }

            }
        }
        cadena = cadena.substring(0,cadena.length()-1);
        String [] arr = cadena.split(",");
        casellesAlVoltant = new Casella[arr.length/2];
        contador =0;
        for (int i = 1; i < arr.length; i=i+2) {
            cas = new Casella(Integer.parseInt(arr[i-1]), Integer.parseInt(arr[i]));
            cas.setOberta(false);
            casellesAlVoltant[contador++]=cas;
        }
        
        return  casellesAlVoltant;
    }

    Casella[] obtenirCasellesAmbMines() {

        int contador = 0;
        Casella [] casellesAmbMines;
        casellesAmbMines = new Casella[numMines];
        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[0].length; j++) {
                if(caselles[i][j].esMina()){
                    casellesAmbMines[contador]=caselles[i][j];
                    contador++;   
                }
            }
        }

        return casellesAmbMines;
    }

    public void seleccionarCasella(int posFila, int posColumna) {
        eventCasellaOberta.accept(caselles[posFila][posColumna]);
        if (caselles[posFila][posColumna].esMina()) {
            eventPartidaPerduda.accept(obtenirCasellesAmbMines());
        }else if (caselles[posFila][posColumna].getNumMinesAlVoltant()==0){
            marcarCasellaOberta(posFila, posColumna);
            Casella[] casellesAlVoltant=obtenirCasellesAlVoltant(posFila, posColumna);
            for(Casella casella: casellesAlVoltant){
                if (!casella.estaOberta()){
                    seleccionarCasella(casella.fila, casella.col);
                }
            }
        }else{
            marcarCasellaOberta(posFila, posColumna);
        }
        if (partidaGuanyada()){
         eventPartidaGuanyada.accept(obtenirCasellesAmbMines());
        }
    }

    void marcarCasellaOberta(int posFila, int posColumna){
        if (!caselles[posFila][posColumna].estaOberta()){
            numCasellesObertes++;
            caselles[posFila][posColumna].setOberta(true);
        }
    }

    boolean partidaGuanyada(){

        return numCasellesObertes>=(numFiles*numColumnes)-numMines;
    }

    public void setEventPartidaPerduda(Consumer<Casella[]> eventPartidaPerduda) {
        this.eventPartidaPerduda = eventPartidaPerduda;
    }

    public void setEventCasellaOberta(Consumer<Casella> eventCasellaOberta) {
        this.eventCasellaOberta = eventCasellaOberta;
    }

    public void setEventPartidaGuanyada(Consumer<Casella[]> eventPartidaGuanyada) {
        this.eventPartidaGuanyada = eventPartidaGuanyada;
    }


}
