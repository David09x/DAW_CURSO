public class examen {


    public static void imprimirMatrix(int [][] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " "); 
            }  
            System.out.println("");
        }
    }

    public static int[] mejorCorredor(int [][] array){
        
        int mejortiempo=9999999;
        int contadorSuma= 0;
        int dorsal=0;
        int resultado[] = new int[3];
        int horas= 0;
        int minutos = 0;
        int segundos = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[0].length; j++) {
                contadorSuma+=array[i][j];
            }
            if(contadorSuma<mejortiempo){
                mejortiempo=contadorSuma;
                contadorSuma = 0;
                dorsal = array[i][0];
               
            }
            else
            {
                contadorSuma= 0;
            }
        }
        System.out.println("el mas rapido es el dorsal " + dorsal);

        horas = mejortiempo/3600;
        resultado[0] = horas;
        minutos = (mejortiempo-(3600*horas))/60;
        resultado[1] = minutos;
        segundos = mejortiempo-((horas*3600)+(minutos*60));
        resultado[2] = segundos;

        return resultado;
    }

    public static int [] mejoresTiempos(int [][] array,int columna) {
    
        int resultado[] = new int[3];
        int mejortiempo=9999999;
        int contadorSuma= 0;
        int dorsal=0;
        int horas= 0;
        int minutos = 0;
        int segundos = 0;

        for (int i = 0; i < array.length; i++) {
             contadorSuma+=array[i][columna];
            if(contadorSuma<mejortiempo){
                mejortiempo=contadorSuma;
                contadorSuma = 0;
                dorsal = array[i][0];
               
            }
            else
            {
                contadorSuma= 0;
            }
        }

        System.out.println("el mas rapido  es el dorsal " + dorsal);

        horas = mejortiempo/3600;
        resultado[0] = horas;
        minutos = (mejortiempo-(3600*horas))/60;
        resultado[1] = minutos;
        segundos = mejortiempo-((horas*3600)+(minutos*60));
        resultado[2] = segundos;

        return resultado;
    }

    public static int[] elMasLentoEnArreglarse(int [][] array,int columna,int columna2){
        int mejortiempo=0;
        int contadorSuma= 0;
        int dorsal=0;
        int resultado[] = new int[3];
        int horas= 0;
        int minutos = 0;
        int segundos = 0;

        for (int i = 0; i < array.length; i++) {
            contadorSuma+=array[i][columna] + array[i][columna2];
            if(contadorSuma>mejortiempo){
                mejortiempo=contadorSuma;
                contadorSuma = 0;
                dorsal = array[i][0];
               
            }
            else
            {
                contadorSuma= 0;
            }
        }
        System.out.println("el mas lento en cambiarse es el dorsal " + dorsal);

        horas = mejortiempo/3600;
        resultado[0] = horas;
        minutos = (mejortiempo-(3600*horas))/60;
        resultado[1] = minutos;
        segundos = mejortiempo-((horas*3600)+(minutos*60));
        resultado[2] = segundos;


        return resultado;
    }



    public static void main(String[] args) {
        int[][] corredores = {
            {1,1595,88,8106,113,5444},
            {34,1980,94,8186,88,5647},
            {70,1973,92,8558,121,5294},
            {12,1865,102,8536,108,5616},
            {267,1881,103,8576,114,5648},
            {2,1879,103,8627,115,5675}};

            int s [] = mejorCorredor(corredores);
            System.out.println("tardo en hacerlo  el mejor corredor " + s[0] +":" + s[1] +":" +s[2]);
            int mejorNadador [] = mejoresTiempos(corredores, 1);
            System.out.println("tardo en hacerlo el mejor nanador " + mejorNadador[0] +":" + mejorNadador[1] +":" +mejorNadador[2]);
            int mejorCiclista [] = mejoresTiempos(corredores, 3);
            System.out.println("tardo en hacerlo mejorciclista " + mejorCiclista[0] +":" + mejorCiclista[1] +":" +mejorCiclista[2]);
            int mejorCarrerista [] = mejoresTiempos(corredores, 5);
            System.out.println("tardo en hacerlo mejor Carrerista " + mejorCarrerista[0] +":" + mejorCarrerista[1] +":" +mejorCarrerista[2]);
            int masLentoEncambiarse [] = elMasLentoEnArreglarse(corredores, 2,4);
            System.out.println("tardo en hacerlo el mas lento en cambiarse " + masLentoEncambiarse[0] +":" + masLentoEncambiarse[1] +":" +masLentoEncambiarse[2]);
            
    }

    
    
}
