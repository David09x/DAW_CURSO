import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class reinasatacadas {
    
    public static String[][] creartablero(int dimension){

        String [][] array = new String[dimension][dimension];

        for(int i = 0 ; i < array.length;i++){
            for(int j = 0; j < array[0].length;j++){
                array[i][j] = "*"; 
               
            }
        }
        return array;
        
    }

    public static void imprimirTablero(String[][] array){

        for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array[i]));            
        }
    }

    public static  String[][] reinasEstablecidas(String[][] tablero,int [] arrayrReinas){

        for (int i = 0; i < arrayrReinas.length; i+=2) {
            tablero[arrayrReinas[i]-1][arrayrReinas[i+1]-1]= "R";
        }
        
        return tablero;
    }

    public static boolean reinasAtacadasH(String [][] arrayReinas,int columna,int fila){

        for (int i = 0; i < arrayReinas[0].length; i++) {
            if(fila!=i){
                if(arrayReinas[columna][i].equals("R")){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean reinasAtacadasV(String [][] arrayReinas,int columna,int fila){

        for (int i = 0; i < arrayReinas[0].length; i++) {
            if(columna!=i){
                if(arrayReinas[i][fila].equals("R")){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean comprobarDiagonalP(int i, int j,String[][] arrayTablero){
        int minFila =i;
        int minCol =j;
        int maxFila =i;
        int maxCol =j;
        int contCol =0;
        while (minFila!=0 && minCol !=0){
            minFila--;
            minCol--;
        }
        contCol=minCol;
        while (maxFila != arrayTablero.length-1 && maxCol != arrayTablero[0].length-1){
            maxFila++;
            maxCol++;
        }

        for (int k = minFila; k < maxFila; k++) {
            if (k!=i && contCol!=j){ // if(k!=i)
                    if (arrayTablero[k][contCol]=="R")
                        return true;
                
            }
            if (contCol<=maxCol)
                contCol++;
        }

        return false;
    }

    public static boolean comprobarDiagonalInv (int i , int j, String [][] arrayTablero)
    {
        int minFila =i;
        int minCol =j;
        int maxFila =i;
        int maxCol =j;
        int contCol =0;
        while(minCol!=7 && minFila !=7)
        {
            minCol++;
            minFila++;
        }
        contCol=minCol;
        while(minCol != 0 && maxFila != arrayTablero.length)
        {
            minCol--;
            maxFila++;
        }
        while(minFila != 0 && maxCol != arrayTablero.length){
            maxCol++;
            minFila--;
        }

        for (int k =minFila ; k < maxFila; k++) {
            if (k!=i && contCol!=j){ // if(k!=i)
                if (arrayTablero[k][contCol]=="R")
                    return true;
            
        }
        if (contCol<=maxCol)
            contCol++;
        }
        return false;
    }
 
    

    public static void main(String[] args) {
    
        int [] posicionesReinas = {1,2,2,8,3,6,4,1,5,3,6,5,7,7,8,4};
        int dimesiones = 8;
        String [] [] tablero = creartablero(dimesiones);
        String [] [] tablerolleno = reinasEstablecidas(tablero, posicionesReinas);
        imprimirTablero(tablerolleno);
        /*for (int i = 0; i < posicionesReinas.length-1; i+=2) {
            boolean atacadas = reinasAtacadasH(tablerolleno, posicionesReinas[i]-1, posicionesReinas[i+1]-1);
            if (atacadas){
                System.out.println("esta atacada por una reina");
            }
            else
            {
                System.out.println("no esta atacada por otra reina");
                
            }
        }
        for (int i = 0; i < posicionesReinas.length-1; i+=2) {
            boolean atacadas2 = reinasAtacadasV(tablerolleno, posicionesReinas[i]-1, posicionesReinas[i+1]-1);
            if (atacadas2){
                System.out.println("esta atacada por una reina");
            }
            else
            {
                
                System.out.println("no esta atacada por otra reina");
                
            }
        }*/

        for (int i = 0; i < posicionesReinas.length-1 ; i+=2){
            boolean atacadas3 = comprobarDiagonalP(posicionesReinas[i]-1, posicionesReinas[i+1]-1, tablerolleno);
            if(atacadas3)
            {   
                System.out.println("esta atacada por una reina");
            }
            else
            {
                System.out.println("no esta atacada por otra reina");
            }
        }

      
    }
}
