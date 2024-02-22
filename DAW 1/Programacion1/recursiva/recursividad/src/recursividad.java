import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class recursividad {

    public static void a_binario(int n) {
        if (n<=1)
     System.out.printf(" %d", n);
        else
        {
        a_binario(n/2);
        System.out.printf(" %d", n %2);
        }
    }

    public static void inverso(int n){

            if( n != 0){
                String numero  = String.valueOf(n);
                System.out.print(numero.charAt(numero.length()-1));
                inverso(n/10);
                
            } 
        
    }

    public static int productoMultiplicar(int a,int b){

        int multiplicar = 0;

        if(b>0){
            if(a != 0 && b >1 ){
                
               return  a+productoMultiplicar(a, b-1);
            }
            if(b==1){
                return a;
            }

        }
        if(b<0)
        {
            if(a != 0 && b <-1 ){
                return a-productoMultiplicar(a, b+1);
            }
           
            if(b==-1){
                return a;
            }
        }
        
        return multiplicar;     
       
    }

    public static boolean palindromo(int [] array,int numero)
    {
        for (int i = 0; i < array.length/numero; i++) {
            if(array[i]!=array[array.length -i -1]){
                System.out.println("aun no es palindromo");
                palindromo(array, numero+1);
            }
        }
        return true;
    }

    public static void mostrarVectorIntRec(int [] array,int length){

        if(length!= array.length-1){
            System.out.print(array[length] + " ");
            mostrarVectorIntRec(array, length+1);
        }
        else
        {
            System.out.print(array[length]);
        }

    }

    public static int fibonacci(int num){
        
        if(num==0){
            return 0;
        }  
        if(num==1){
            return 1;
        }  
        if(num>1){
           

          return fibonacci(num-1) + fibonacci(num-2);

        }
        else
        {
            return -1;
        }
        
    }


    public static double [] ultimoEjercicio(int numeroElementos){

           double array[] =  new double[numeroElementos];
           double resultado = 0;

           for(int i = 0 ; i < array.length ;i++){
                resultado = fibonacci(i);
                array[i] = resultado;
           
           }
        return array;
    } 


    public static void divisionFibonacci(double [] array){
        
        BigDecimal resultado = new BigDecimal("0");

        
        for (int i = 1; i < array.length; i++) {
            resultado = new BigDecimal(array[i-1]/array[i]);
            resultado = resultado.setScale(12,RoundingMode.UP);
            System.out.print(resultado + " ");
        }
    }
    
    
        
    public static void main(String[] args) throws Exception {
        int numero= 266;
        int num1 =3;
        int num2 = -6;
        int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,4,3,2,1};
        int longitud = 0;
        //a_binario(numero);
        //inverso(numero);
        //productoMultiplicar(num1, num2);
        /*boolean s = palindromo (numeros,2);
       if(s){
            System.out.println("ya es palindromo");
       }*/
       //mostrarVectorIntRec(numeros, longitud);
        //System.out.println(fibonacci(8)); 
        /*double prueba[] =  ultimoEjercicio(20);

        for (int i = 0; i < prueba.length; i++) {
            System.out.println(prueba[i]);
        }
        divisionFibonacci(prueba);*/
    }
}
