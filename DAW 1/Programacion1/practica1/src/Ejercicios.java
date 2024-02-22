import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


class numeroValido extends Exception{
    
    public numeroValido(String message)
    {
        super(message);
    }
}


public class Ejercicios{


    public static void ejercicio1(){
    for(int i = 0; i <= 20; i++){
        System.out.println(i);
    }
    }

    public static void ejercicio2(){
        
        for(int i = 0; i <= 200; i=i+2){
            System.out.print(i+",");
        }
    }

    public static void ejercicio3(){
        
        for(int i = 1; i <= 200; i=i+2){
            System.out.print(i+",");
        }
    }
    public static int ejercicio4A(){
        Scanner teclado = new Scanner(System.in);
        int num;
        int suma = 0;
        System.out.println("dame un numero (Que sea entero por favor :D)");
        num = teclado.nextInt();
        for(int i = 0; i <= num; i++){
            suma += i;
        }
        return suma;
    }

    public static int ejercicio4B(){
        Scanner teclado = new Scanner(System.in);
        int num;
        int multiplicacion = 1;
        System.out.println("dame un numero (Que sea entero por favor :D)");
        num = teclado.nextInt();
        for(int i = 1; i <= num ;i++)
        {
            multiplicacion *= i;
        }
        return multiplicacion;
    }
    
    public static long ejercicio5(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("dame un numero (Que sea entero por favor :D)");
        int num = 0;
        long factorial = 1;
        boolean error = true;
        do{  
            try
            {
                num = teclado.nextInt();
                if(num<0) throw new InputMismatchException();
                {
                    
                    error = false;
                }
            } 
            catch(InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("dame un numero positivo");
                
            }
           
        }
        while(error);
        for(int i = 1; i <= num ;i++)
                factorial *= i;
        return factorial;
    }

    public static void ejercicio6()
    {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        boolean llego = true;
        do
        {
            for(int i = 0; i <=10 ; i++)
            {
                try
                {
                System.out.println("dame un numero (Que sea entero por favor :D)");
                int num = teclado.nextInt();
                if(num<=0)
                {
                    cont+=1;
                }
                }
                catch(InputMismatchException e)
                {
                    teclado.nextLine();
                    System.out.println("dame un numero no letra");
                }
            }

            llego = false;
      
        }
        while(llego);
        if(cont!=0)
        {
            System.out.println("hay numero negativo");
        }
        else
        {
            System.out.println("no hay numero negativos");
        }
    }
    public static void ejercicio7()
        {
            Scanner teclado = new Scanner(System.in);
            int cont = 0;
            int cont2 = 0;
            boolean llego = true;
            do
            {
                for(int i = 0; i <10 ; i++)
                {
                    try
                    {
                    System.out.println("dame un numero (Que sea entero por favor :D)");
                    int num = teclado.nextInt();
                    if(num<0)
                    {
                        cont+=1;
                    }
                    else
                    {
                        cont2+=1;
                    }
                    }
                    catch(InputMismatchException e)
                    {
                        teclado.nextLine();
                        System.out.println("dame un numero no letra");
                    }
                }
    
                llego = false;
          
            }
            while(llego);
            System.out.println("numeros negativos " + cont);
            System.out.println("numeros positivos " +  cont2);
        
    }    

    public static void ejercicio8()
    {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int cont2 = 0;
        boolean llego = true;
        do
        {
            while(llego)
            {
                try
                {
                System.out.println("dame un numero (Que sea entero por favor :D)");
                int num = teclado.nextInt();
                if(num<0)
                {
                    cont+=1;
                }
                else
                {
                    cont2+=1;
                }
                if(num==0)
                {
                    llego = false;
                }
                }
                catch(InputMismatchException e)
                {
                    teclado.nextLine();
                    System.out.println("dame un numero no letra");
                }
            }   
      
        }
        while(llego);
        System.out.println("numeros negativos " + cont);
        System.out.println("numeros positivos " +  cont2);

    }

    public static void ejercicio9()
    {
        int cont = 0;
        long cont2 = 1;
       for(int i = 1; i <=10;i++)
       {
        cont += i;
        cont2 *= i;
       }
        System.out.println("la suma de los 10 primeros numeros es " + cont);
        System.out.println("la multiplicacion de los 10 primeros numeros es " + cont2);
    }

    public static void ejercicio10() throws numeroValido
    {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int num = 0;
        do
        {
            try
            {
            System.out.println("dame un numero (Que sea entero por favor :D)");
            num = teclado.nextInt();
            if(num<-1 || num>=11) throw new numeroValido("tienes que dar una nota mayor o igual que 0 y menor o igual que 10");  
            if(num>=0 && num<=10)
            {
                System.out.println("la nota se agrego");
                    if(num==10)
                    {   
                    cont+=1;
                    }
            }
           
            }
            catch(InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("dame un numero entre 1-10 o no des una letra");
            }
            catch(numeroValido e)
            {
                System.out.println(e.getMessage());
                teclado.nextLine();
            }
              
        }
        while(num!=-1);
        if(cont != 0){
        System.out.println("hay alguna nota que es un 10");
        }
        else 
        {
            System.out.println("no hay ningun 10");
        }
    }

    public static void ejercicio11()
    {
        int contPares = 0;
        int contImpartes = 0;

        for(int i = 100; i< 200;i++){
            if(i%2==0)
            {
                contPares+=i;
            }
            else
            {
                contImpartes+=i;
            }
        }
        System.out.println("suma de numeros de pares " + contPares);
        System.out.println("suma de numeros de impares " + contImpartes);

    }

    public static int ejercicio12()
    {  
        Scanner teclado = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int total = 1;
        boolean dado= true;
        do
        {
            try
            {
                System.out.println("dame un numero (Que sea entero por favor :D)");
                a=teclado.nextInt();
                System.out.println("a que lo quieres elevar");
                b=teclado.nextInt();
                dado=false;
            }
            catch(InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("dame un numero y no des una letra");
            } 
        }
        while(dado);
        for(int i = 0; i < b ; i++)
        {
            total = total * a;
        }
        

        return total;
    }

    public static void ejercicio13() throws numeroValido
    {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int min = 1;
        int max = 100;
        num = max/2;
        String respuesta;
        String noEs = "no";
        String esMenor= "menor";
        String esMayor= "mayor";
        String acertastes= "si";
        boolean acertado = false;
        System.out.println("numero dado " + num);
        do
        {
            try
            {
            System.out.println("¿he acertado el numero?");
            respuesta = teclado.nextLine();
            if (!respuesta.equals(noEs) && !respuesta.equals(acertastes)) throw new numeroValido("me tienes que dar si o no");
            {   
                if(respuesta.equals(noEs))
                {
                    System.out.println("¿es mayor o menor?");
                    respuesta = teclado.nextLine();
                    if(respuesta.equals(esMenor))
                    {
                        max = num;
                        num = max/2;

                        System.out.println("siguiente numero dado " + num);
                    }
                    if(respuesta.equals(esMayor))
                    {
                        min = num;
                        num = (max + num)/2;
                        
                        System.out.println("siguiente numero dado " + num);
                    } 
                }
                if(respuesta.equals(acertastes))
                {
                    acertado=true;
                }
            } 
            }
            catch(InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("dame un numero entre 1-10 o no des una letra");
            }
            catch(numeroValido e)
            {
                System.out.println(e.getMessage());
            }
              
        }
        while(!acertado);
        System.out.println("acertastes el numero");

    }

    public static void ejercicio14()
    {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int cont500= 0;
        int cont200 = 0;
        int cont100 = 0;
        int cont50 = 0;
        int cont20 = 0;
        int cont10 = 0;
        int cont5 = 0;
        boolean dividido = false;
        System.out.println("dame una cantidad y que sea divisible entre 5");
        num = teclado.nextInt();
        do
        {
            try
            {
               
                if(num%5!=0) throw new numeroValido("me tienes que dar un numero divisible entre 5");
                {
                    if((num-500)>=0)
                    {

                        cont500 += 1;
                        num= num-500;
                        continue;
                    }
                    if((num-200)>=0)
                    {
                        
                        cont200 += 1;
                        num= num-200;
                        continue;
                    }
                    if((num-100)>=0)
                    {
                        cont100 += 1;
                        num= num-100;
                        continue;
                    }
                    if((num-50)>=0)
                    {
                        cont50 += 1;
                        num= num-50;
                        continue;
                    }
                    if((num-20)>=0)
                    {
                        cont20 +=1;
                        num= num-20;
                        continue;
                    }
                    if((num-10)>=0)
                    {
                        cont10 +=1;
                        num= num-10;
                        continue;
                    }
                    if((num-5)>=0)
                    {
                        cont5 += 1;
                        num= num-5;
                        continue;
                    }
                    if(num==0)
                    {
                        dividido = true;
                    }
                }
            }
            catch(InputMismatchException e)
            {   
                teclado.nextLine();
                System.out.println("me tienes que dar un numero no una letra");
            }
            catch(numeroValido e)
            {
                System.out.println(e.getMessage());
            }
        }
        while(!dividido);
        System.out.println("numero de billetes de 500 " + cont500);
        System.out.println("numero de billetes de 200 " + cont200);
        System.out.println("numero de billetes de 100 " + cont100);
        System.out.println("numero de billetes de 50 " + cont50);
        System.out.println("numero de billetes de 20 " + cont20);
        System.out.println("numero de billetes de 10 " + cont500);
        System.out.println("numero de billetes de 5 " + cont5);
    }
    public static void main(String[] args) throws numeroValido{
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        /*int e = ejercicio4A();
        System.out.println(e);*/
        //int d = ejercicio4B();
        //System.out.println(d);
        //long s = ejercicio5();
        //System.out.println(s);
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //System.out.println(ejercicio12());
        //ejercicio13();
        //ejercicio14();
    }

    
}

