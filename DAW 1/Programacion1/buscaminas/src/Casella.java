public class Casella {

    public int fila;
   

    public int col;

    boolean mina;
    boolean oberta;

    int num_mines;
        
    
    public int getNum_mines() {
        return num_mines;
    }

    public void setNum_mines(int num_mines) {
        this.num_mines = num_mines;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }


    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    
    public Casella(int posFila, int posColumna) {
        fila = posFila;
        col = posColumna;
    }
    

    public void posarMina(){
        mina = true;
    }

    public void numMines(int num){
        num_mines = num;
    }
    public int getNumMinesAlVoltant() {

        return num_mines;
    }
    public void setNumMinesAlVoltant(int numMinesAlVoltant) {

        num_mines = numMinesAlVoltant;
    }



    public boolean esMina() {
        return mina;
    }
    public void ponMina(boolean minaIn) {
        mina = minaIn;
    }

    public boolean estaOberta(){
        return oberta;
    }
    
    public void setOberta(boolean obertaIn)
    {
        oberta=obertaIn;
    }

}
