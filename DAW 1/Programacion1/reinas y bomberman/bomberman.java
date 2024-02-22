import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


class numeroValido extends Exception{
    
    public numeroValido(String message)
    {
        super(message);
    }
}

public class bomberman {

    public static String[][] crearTablero (int dimensiones){

        String[][] array =  new String[dimensiones][dimensiones];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "*";
            }
        }

        return array;
    }

    public static void imprimirTablero(String[][] array)
    {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j] + " ");

                }
                System.out.println("");
            }
            
    }

    public static String[][] colocarEnemigos(String[][]array,int[]arrayEnemigos)
    {
        for (int i = 0; i < arrayEnemigos.length; i+=2) {
            array[arrayEnemigos[i]][arrayEnemigos[i+1]] = "M";
        }
        return array;
    }

    public static String [][] ponerBombas (String [][] array,int [] arrayPosicionbomba1,int [] arrayPosicionbomba2){

        for (int i = 0; i < arrayPosicionbomba1.length; i+=2) {
            array[arrayPosicionbomba1[i]][arrayPosicionbomba1[i+1]] ="B1";
            array[arrayPosicionbomba2[i]][arrayPosicionbomba2[i+1]]="B2";
        }
        return array;
    }

    public static String [][] posicionarJugador (String [][] array)throws numeroValido{

        Scanner teclado = new Scanner(System.in);
        System.out.println("dame una fila");
        int fila = teclado.nextInt();
        System.out.println("dime una columna dentro de la fila");
        int columna = teclado.nextInt();
        boolean posicionCogida= false;
        
        do{
            try{
                
                if(array[fila][columna].equals("B2") || array[fila][columna].equals("B1") 
                || array[fila][columna].equals("M"))throw new numeroValido("dime otra posicion");

                if(array[fila][columna].equals("*")){
                    array[fila][columna] = "J";
                    posicionCogida = true;
                }
            }
            catch(numeroValido e)
            {
                System.out.println(e.getMessage());
                System.out.println("dime una fila");
                fila = teclado.nextInt();
                System.out.println("dime una columna");
                columna = teclado.nextInt();
            }
            catch(InputMismatchException e){
                
                System.out.println("dime una fila");
                fila = teclado.nextInt();
                System.out.println("dime una columna");
                columna = teclado.nextInt();
            }
        }while(!posicionCogida);

        System.out.println("");
        return array;
    }


    /**
     * la funcion hace la partida y posicionas al jugador. recorre todo el array y busca las bombas si el jugador no muere devolvera un contador
     * con el total de bajas realizas.
     * 
     * Si el jugador muere el codigo automaticamente devolvera -1 y significara que el jugador ha perdido la partida
     * @param array
     * @return
     */
    public static int partida(String [][] array){
        int contadorEnemigos = 0;
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    int filaComprobanteB2 = comprobarPosicionFila(array,i,j, "B2", "M","J",2);
                    if(filaComprobanteB2 == -1)
                        return -1;
                    if(filaComprobanteB2 !=0)
                        contadorEnemigos += filaComprobanteB2;
                    int columnaComprobanteB2 = comprobarPosicionColumna(array,i,j, "B2", "M","J",2);
                    if(columnaComprobanteB2 == -1)
                        return -1;
                    if(columnaComprobanteB2!=0)
                        contadorEnemigos += columnaComprobanteB2;
                    int filaComprobanteB1 = comprobarPosicionFila(array,i, j, "B1", "M","J", 1);
                    if(filaComprobanteB1 == -1)
                        return -1;
                    if(filaComprobanteB1!=0)
                        contadorEnemigos += filaComprobanteB1;
                    int columnaComprobanteB1 = comprobarPosicionColumna(array, i,j, "B1", "M","J", 1);
                    if(columnaComprobanteB1 == -1)
                        return -1;
                    if(columnaComprobanteB1!=0)
                        contadorEnemigos += columnaComprobanteB1;
            }   
                         
        }
        return contadorEnemigos;
    }
        
    public static int comprobarPosicionFila(String [][] array,int fila,int columna,String posicion,String posicion2,String jugador,int numero)
    {   
        int contador = 0;
        if(array[fila][columna].equals(posicion)){
            for(int i = fila-numero ; i <= fila+numero ; i++){
                if(i >= 0 && i<= array.length-1f){
                    if(i!=fila){
                        if(array[i][columna].equals(posicion2)){
                            contador++;
                        }
                        if((array[i][columna].equals(jugador))){
                            return -1;
                        }
                    }
                }
            }
        }
        return contador;
    }

    public static int comprobarPosicionColumna(String [][] array,int fila,int columna,String posicion,String posicion2,String jugador,int numero)
    {
        int contador = 0;
        if(array[fila][columna].equals(posicion)){
            for(int i = columna-numero ; i <= columna+numero ; i++){
                if(i >= 0 && i<= array.length-1){
                    if(i!=columna){
                        if(array[fila][i].equals(posicion2)){
                            contador++;
                        }
                        if(array[fila][i].equals(jugador)){
                            return -1;
                        }
                    }
                }
            }
        }

        return contador;
    }

   
    public static void main(String[] args)  throws numeroValido {


        int [] enemigos = {0,3,3,4,5,2};
        int [] bombas1 = {1,4,4,2};
        int [] bombas2 = {0,5,3,0};
        int dimemensionesTablero = 6;
        String [][] tablero = crearTablero(dimemensionesTablero);
        String [][] tableroEnemigos = colocarEnemigos(tablero, enemigos);
        String [][] tableroBombasyEnemigos = ponerBombas(tableroEnemigos, bombas1, bombas2);
        String [][] tableroConJugador = posicionarJugador(tableroBombasyEnemigos);
        imprimirTablero(tableroConJugador);
        int enemyDowns = partida(tableroConJugador);
        if(enemyDowns == -1){
            System.out.println("el jugador ha perdido");
        }
        else
        {
            System.out.println("el jugador ha ganado y ha eleminado ha " + enemyDowns + " enemigos");
        }
    }
    
}
