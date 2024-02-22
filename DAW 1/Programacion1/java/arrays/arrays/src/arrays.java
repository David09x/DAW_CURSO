import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.xml.namespace.QName;

class  numero_no_valido extends Exception{
    public numero_no_valido(String message){
        super(message);
    }
}

public class arrays {


    //los 100 primeros numeros de un vector y sumara los 30 ultimos
    public static void ejercicio1(){
        int suma = 0;
        int numeros []= new int[100];
        for(int i = 1 ; i <=100; i++){
            numeros[i-1] = i*2;
        }
    System.out.println(Arrays.toString(numeros));
        for(int j = 70 ; j <numeros.length; j++){
            suma += numeros[j];
        }
    System.out.println(suma);
    }

    //las notas de los almunos en un array y buscar la mayor nota, la menor nota, si hay algun 10 ,si hay algun 0 y la media
    public static void ejercicio2(){
        int numero = 0;
        int notas [] = new int[20];
        int numeroMax=0;
        int numeroMin=10;
        int suma = 0;
        int contador10= 0;
        int contador0 = 0;
        double media = 0;
        for(int i = 0; i < notas.length; i++){
            numero = (int) (Math.random()*10+1);
            notas[i] = numero;
            if(notas[i]>numeroMax){
                numeroMax=notas[i];
            }
            if(notas[i]<numeroMin){
                numeroMin=notas[i];
            }
            if(notas[i]==10){
                contador10++;
            }
            if(notas[i]==0){
                contador0++;
            }
            suma+= notas[i];
        }
        media = (double)suma/notas.length;
        System.out.println(Arrays.toString(notas));

        System.out.println("el numero mayor de nota es " + numeroMax);
        System.out.println("el numero menor de nota es " + numeroMin);
        System.out.println("las notas medias son " + media);
        System.out.println("las notas que son 10 " + contador10);
        System.out.println("las notas que son 0 " + contador0);
    }

    //dar un numero comprendido entre 5 y 10 cifras
    public static void ejercicio3() throws numero_no_valido
    {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean numero_dado_bueno = false;
        String numeroDado = " ";
        char numeroGuardado [] = new char[10];
        int cont = 0;
        do
        {
            try{
                System.out.println("dame un numero entero mayor de 4 cifras y menor de 11 ");
                num = teclado.nextInt();
                numeroDado = String.valueOf(num);
                if(numeroDado.length() <=4 || numeroDado.length() >=11) throw new numero_no_valido("numero dado no valido");
                if( numeroDado.length() >= 5  && numeroDado.length() <= 10 )
                {
                    numero_dado_bueno = true;
                }
                
            }
            catch(InputMismatchException e)
            {
                System.out.println("dame algo que sea correcto");
                teclado.nextLine();
            }
            catch(numero_no_valido e)
            {
                System.out.println(e.getMessage());
            }
        }while(!numero_dado_bueno);
        System.out.println("numero valido " + num);

        for(int i = 0; i < numeroDado.length();i++){
            numeroGuardado[i] = numeroDado.charAt(i);
        }
        System.out.println(Arrays.toString(numeroGuardado));
        for(int j = 0 ; j < numeroGuardado.length;j++)
        {
            if(Character.compare(numeroGuardado[j], '\0') != 0){
                cont+=1;
            }
        }
        for(int i = 0; i <cont/2; i++){
            if(numeroGuardado[i] == numeroGuardado[cont-1]){
                cont-=1;
            }
            else
            {
                System.out.println("no es palindromo");
                break;
            }
        }
        System.out.println("es palindromo");
        
    }


    //pide datos y dependiendo si es mujer o hombre saca una frase
    public static void ejercicio4() throws numero_no_valido
    {
        Scanner teclado = new Scanner(System.in);
        boolean todoDado = false;
        int num= 0;
        String nombre = " ";
        String ciudad = " ";
        char sexo = ' ';
        do
        {
            
            try
            {
            System.out.println("dime tu nombre ");
            nombre = teclado.nextLine();
            System.out.println("donde vives ");
            ciudad = teclado.nextLine();
            System.out.println("dime tu sexo H o D ");
            sexo = teclado.next().charAt(0);
            System.out.println("telefono ");
            num = teclado.nextInt();
                
                if(sexo ==  'H' || sexo == 'M')
                {
                    todoDado = true;
                }
                else
                {
                if(sexo!= 'H' || sexo != 'M') throw new numero_no_valido("tienes que decirme si eres Hombre(H) o Mujer(M)");
                }
                
            }
            catch (numero_no_valido e) 
            {
                System.out.println(e.getMessage());
                teclado.nextLine();
            }
            catch(InputMismatchException e)
            {
                System.out.println("dame un dato valido");
                teclado.nextLine();
            }

        }while(!todoDado);
            if(sexo == 'H'){
            System.out.println("Hola soy el " + nombre + ". Has llamado al telefono " + num + " y ahora no estoy en casa porque estoy en " + ciudad + "  de vacaciones!!!");
            }
            if(sexo == 'M'){
                System.out.println("Hola soy la " + nombre + ". Has llamado al telefono " + num + " y ahora no estoy en casa porque estoy en " + ciudad + "  de vacaciones!!!");
            } 
    }


    //utilizando reemplaze para cambiar la letra dentro de una frase
    public static void ejercicio5() throws numero_no_valido
    {
        Scanner teclado = new Scanner(System.in);
        String frase = " ";
        char vocal1 = ' ';
        char vocal2 = ' ';
        String fraseCambiada = " ";
        boolean correcto = false;
        System.out.println("dame una frase");
        frase =  teclado.nextLine();
        do{
          
            try
            {
                
                System.out.println("dame una vocal que quieras que sea sustituida");
                vocal1 = teclado.next().charAt(0);
                System.out.println("dame otra vocal para sustituir la anterior");
                vocal2 = teclado.next().charAt(0);
                if((vocal1 == 'a' || vocal1== 'e' || vocal1 == 'o' || vocal1 == 'i' || vocal1== 'u') 
                && (vocal2 == 'a' || vocal2 == 'e' || vocal2 == 'o' || vocal2 == 'i' || vocal2 == 'u'))
                {
                    correcto = true;
                }
                else
                {
                if((vocal1 != 'a' || vocal1!= 'e' || vocal1!= 'o' || vocal1!= 'i' || vocal1!= 'u') 
                && (vocal2 != 'a' || vocal2 != 'e' || vocal2 != 'o' || vocal2 != 'i' || vocal2 != 'u')) 
                throw new numero_no_valido("me tienes que dar una vocal valida");
                }
                
            }
            catch(numero_no_valido e)
            {
                System.out.println(e.getMessage());
                teclado.nextLine();
            }


        }while(!correcto);
            fraseCambiada= frase.replace(vocal1,vocal2);
            System.out.println(fraseCambiada);  
        

    }

    //cambiar la letra en una frase sin utilizar reemplaze y usando lenght()

    public static void ejercicio5b() throws numero_no_valido{
        Scanner teclado = new Scanner(System.in);
        String frase = " ";
        char vocal1 = ' ';
        char vocal2 = ' ';
        String fraseCambiada = " ";
        String fraseFinal = " ";
        boolean correcto = false;
        System.out.println("dame una frase");
        frase =  teclado.nextLine();
        do{
          
            try
            {
                
                System.out.println("dame una vocal que quieras que sea sustituida");
                vocal1 = teclado.next().charAt(0);
                System.out.println("dame otra vocal para sustituir la anterior");
                vocal2 = teclado.next().charAt(0);
                if((vocal1 != 'a' || vocal1!= 'e' || vocal1!= 'o' || vocal1!= 'i' || vocal1!= 'u') 
                && (vocal2 != 'a' || vocal2 != 'e' || vocal2 != 'o' || vocal2 != 'i' || vocal2 != 'u')) 
                throw new numero_no_valido("me tienes que dar una vocal valida");
                
                for(int i =  0 ; i < frase.length();i++)
                {
                   if(frase.charAt(i) == vocal1){
                    fraseCambiada = frase.substring(0, i);
                    fraseCambiada =  fraseCambiada + vocal2;
                    fraseFinal = frase.substring(i+1, frase.length());
                    frase = fraseCambiada.concat(fraseFinal);
                   } 
                }
                
                correcto = true;
                
            }
            catch(InputMismatchException e)
            {
                System.out.println("dame un dato valido");
                teclado.nextLine();

            }
            catch(numero_no_valido e){
                System.out.println(e.getMessage());
                teclado.nextLine();
            }


        }while(!correcto);
            
            System.out.println(frase);  

    }

    //Decir si una frase es palindroma o no
    public static boolean ejercicio6()
    {
        Scanner teclado = new Scanner(System.in);
        String frase = " ";
        String fraseGirada = " ";
        System.out.println("dame una frase");
        frase = teclado.nextLine();

        for(int i = frase.length()-1 ; i >= 0 ;i--){
            fraseGirada += frase.charAt(i); 
        }
        System.out.println( "frase dandole la vuelta:" + fraseGirada);
        fraseGirada = fraseGirada.replace(" ", "");
        frase = frase.replace(" ", "");

        return frase.equalsIgnoreCase(fraseGirada);
        
    }

    //dando una frase que cuente si estan todas las vocales
    public static boolean ejercicio7()
    {
        Scanner teclado = new Scanner(System.in);
        String frase = " ";
        int contA = 0;
        int contE = 0;
        int contO = 0;
        int contI = 0;
        int contU = 0;
        System.out.println("dame una frase");
        frase = teclado.nextLine();
        for(int i = 0; i < frase.length();i++){
        if(frase.charAt(i)=='a' || frase.charAt(i)=='A'){
            contA+=1;
        }
        if(frase.charAt(i)=='e' || frase.charAt(i)=='E'){
            contE+=1;
        }
        if(frase.charAt(i)=='o' || frase.charAt(i)=='O'){
            contO+=1;
        }
        if(frase.charAt(i)=='i' || frase.charAt(i)=='I'){
            contI+=1;
        }
        if(frase.charAt(i)=='u' || frase.charAt(i)=='U'){
            contU+=1;
        }
        }

        if(contA >= 1 && contE >= 1 && contO >= 1 && contI >= 1 && contU >= 1){
            return true;
        }
        return false;
    }

    //dando un String si todos los elementos son numeros devolvera True si no son numeros devolvera false
    public static boolean ejercicio8()
    {
        Scanner teclado = new Scanner(System.in);
        String frase = " ";
        frase = teclado.nextLine();
        char ArrayNumero[] =  frase.toCharArray();

        for(char i : ArrayNumero){
            if(!Character.isDigit(i)){
                return false;
            }
        }
        return true;
    }
    


    public static void ejercicio9(){
        
        System.out.println("en que idioma lo quieres: ¿Castellano, Valenciano o Ingles?");
        int temperaturaMax;
        int opcion = opcionElegida();
        int temperatura [] = {12,14,13,15,17,21,24,26,22,17,15,14};
        String[][] criptograma = {
            {"enero:      ", "febrero:    ", "marzo:      ", "abril:    ", "mayo:       ", 
            "junio:      ", "julio:      ", "agosto:     ", "septiembre: ", "octubre:    ", "noviembre:  ", "diciembre:  "},
            {"gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"},
            {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}};
        boolean datoValido = false;
        do
        {
            try
            {
                
                if((opcion != 0) && (opcion!=1) && (opcion != 2)) throw new numero_no_valido("Tienes que indicarme en que idioma lo quieres");
               
                datoValido = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("dato incorrecto");
                opcion = opcionElegida();
            }
            catch(numero_no_valido e)
            {
                System.out.println(e.getMessage());
                opcion = opcionElegida();
             
            }
        }while(!datoValido);
        temperaturaMax = numeroMax(temperatura);
        if(opcion == 0)
        {
            System.out.print("temperatura: ");
            for(int i = 1;  i <= temperaturaMax ;i++){
                System.out.print(i + "  ");
            }
            System.out.println(" ");
            arrayElegir(opcion,criptograma,temperatura);
        }
        if(opcion == 1)
        {
            System.out.print("temperatura: ");
            for(int i = 1;  i <= temperaturaMax ;i++){
                System.out.print(i + " " + " ");
            }
            System.out.println(" ");
            arrayElegir(opcion,criptograma,temperatura);
        }
        if(opcion == 2)
        {
            System.out.print("temperatura: ");
            for(int i = 1;  i <= temperaturaMax ;i++){
                System.out.print(i + " " + " ");
            }
            System.out.println(" ");
            arrayElegir(opcion,criptograma,temperatura);
        }

    }

    public static void ordenarArray(int[] array){
        int aux = 0;
        for(int i = 1; i < array.length;i++){
            for(int j = 0 ; j < array.length-1; j++){
                if(array[i]<array[j]){
                    aux = array[i];
                    array[i]= array[j];
                    array[j] = aux;
                }
            }
        }
        
    }    

    public static int numeroMax(int [] array){
        int max = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int opcionElegida(){
        Scanner teclado = new Scanner(System.in);
        String frase = " ";
        frase = teclado.nextLine();
        frase = frase.toLowerCase();
       if(frase.equals("castellano")){
        return 0;
       }
       if(frase.equals("valenciano")){
        return 1;
       }
       if(frase.equals("ingles")){
       return 2;
       }
       return 3;
    }

    public static void arrayElegir(int numero , String[][]array,int[] array2){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[numero][j]+ "    ");
                System.out.println(imprimeAsteriscos(array2, j));
                }     
    }

    public static String imprimeAsteriscos(int[] arrayT,int valor){
        String asteriscos = "    ";
        for(int i  = 0 ; i < arrayT[valor];i++){
            asteriscos+="*" + "  ";
        }
        return asteriscos;
    }

    //yoda y leie no baja a 0 por alguna razon que desconozco
    public static void ejercicio10(){
        String[] fans= {"Luke","Han","Leia","Yoda","Kylo","Qui-Gon","Mando"};
        int [] elements={4,2,2,5,1,3,2};
        int [] elements2={4,2,2,5,1,3,2};
        String mensaje= "";
        int contadorGlobal= 0;
        
        while(!todo0(elements)){
            if(elements[0]!=0){
                contadorGlobal+=2;
                elemento1(elements);
                elemento2(fans);
                elemento3(elements2);
                if(elements[elements.length-1]==0){
                    mensaje += "Acaba " + fans[elements.length-1] + " i a tardat " + contadorGlobal+ "." +
                        "A ell realment l`han atès " + elements2[elements2.length-1]*2 + " minutos.\n";
                }                    
            }
            else
            {
                elemento2(fans);
                elemento3(elements);
                elemento3(elements2);
            }
        
        }
        System.out.println(mensaje);
    }

    

    
    public static void elemento1(int [] array){
        int aux = array[0];
        for(int i = 1; i < array.length;i++){
            array[i-1]=array[i];
            
        }
        
        array[array.length-1]=(aux==0?aux:aux-1);
    }

    public static void elemento3(int [] array){
        int aux = array[0];
        for(int i = 1; i < array.length;i++){
            array[i-1]=array[i];
            
        }
        array[array.length-1]=aux;
    }

    public static void elemento2(String [] array){
        String aux = array[0];
        for(int i = 1; i < array.length;i++){
            array[i-1]=array[i];
           
        }
        array[array.length-1]=aux;
           
    }

    public static boolean todo0(int [] array){
        
           for(int i = 0 ; i < array.length;i++){
            if(array[i]!=0){
                return false;
            }
           }
        return true;
    }
 

    public static void main(String[] args) throws numero_no_valido {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio5b();
        /*boolean s  = ejercicio6();
        if(s)
        {
            System.out.println("la frase es palindroma");
        }
        else
        {
            System.out.println("no es palindroma");
        }*/

        /*boolean d = ejercicio7();
        if(d)
        {
            System.out.println("estan todas las vocales");
        }
        else
        {
            System.out.println("no estan todas las vocales");
        }*/
        /*boolean s  = ejercicio8();
        if(s)
        {
            System.out.println("todo son numeros");
        }
        else
        {
            System.out.println("no son numeros");
        }*/

        //ejercicio9();
        //ejercicio10();

        

    }
    
}
