import java.util.Scanner;

public class Leer {

    public static int leerEntero(String mensaje){
        Scanner teclado = new Scanner(System.in);

        System.out.println(mensaje);
        int numero = teclado.nextInt();

        return numero;
    }

    public static String leerString(String mensaje){
        Scanner teclado = new Scanner(System.in);

        System.out.println(mensaje);
        String nombre = teclado.nextLine();

        return nombre;
    }

}
