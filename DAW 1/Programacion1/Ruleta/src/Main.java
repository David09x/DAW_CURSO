import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Numeros[] ruleta = new Numeros[37];
    static ArrayList<Jugador> jugadores = new ArrayList<>();
    static ArrayList<Apuesta> apuestas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean seguir =true;
        crear_ruleta();
        crear_jugadores();
        do {
            hagan_susApuestas();
            Numeros num = iniciar_partida();
            num.imprimir();
            mostrar_resultados(num);
            System.out.println("Quieres seguir jugando?");
            seguir = scan.next().toLowerCase().equals("si") || scan.next().toLowerCase().equals("sí");
        }while (seguir);
    }

    private static void mostrar_resultados(Numeros num) {
        String parImpar ="";
        boolean haGanado = false;
        for (int i = 0; i < jugadores.size(); i++) {
            switch (apuestas.get(i).getTipo()) {
                case 1:
                    if (apuestas.get(i).getValor().equals(num.getValor())) {
                        jugadores.get(i).setDinero(apuestas.get(i).getCantidad() * 30);
                        haGanado = true;
                    }else {
                        int dineroRestante = jugadores.get(i).getDinero() - apuestas.get(i).getCantidad();
                        jugadores.get(i).setDinero(dineroRestante);
                        haGanado = false;
                    }
                    break;
                case 2:
                    if (apuestas.get(i).getValor().equals(num.getColor())) {
                        jugadores.get(i).setDinero(apuestas.get(i).getCantidad()*2);
                        haGanado = true;
                    }else {
                        int dineroRestante = jugadores.get(i).getDinero() - apuestas.get(i).getCantidad();
                        jugadores.get(i).setDinero(dineroRestante);
                        haGanado = false;
                    }
                    break;
                case 3:
                    parImpar = num.getValor()%2==0?"Par":"Impar";
                    if (apuestas.get(i).getValor().equals(parImpar)) {
                        jugadores.get(i).setDinero(apuestas.get(i).getCantidad() * 2);
                        haGanado = true;
                    }else {
                        int dineroRestante = jugadores.get(i).getDinero() - apuestas.get(i).getCantidad();
                        jugadores.get(i).setDinero(dineroRestante);
                        haGanado = false;
                    }
                    break;
            }
            imprimir_resultado (jugadores.get(i), apuestas.get(i), haGanado);
        }

    }

    private static void imprimir_resultado(Jugador jugador, Apuesta apuesta, boolean haGanado) {
        String cadena = "";
        int ganancias = 0;
        switch (apuesta.getTipo()){
            case 1:
                cadena = "Numero";
                if (haGanado)
                    ganancias = apuesta.getCantidad()*30;
                break;
            case 2:
                cadena = "Color";
                if (haGanado)
                    ganancias = apuesta.getCantidad()*2;
                break;
            case 3:
                cadena = "Par/Impar";
                if (haGanado)
                    ganancias = apuesta.getCantidad()*2;
                break;
        }

        System.out.println("El jugador " + jugador.getNombre());
        System.out.println("Apostó " + apuesta.getCantidad() + " a " + cadena + (haGanado?" y gano":" y perdio") );
        if (haGanado)
            System.out.println("Ganó "+ ganancias);
        else
            System.out.println("Perdió " + apuesta.getCantidad());
    }

    private static Numeros iniciar_partida() {
        int valor = (int) (Math.random()*(37));
        return new Numeros(valor);
    }

    private static void hagan_susApuestas() {
        int opcion;
        Integer numero;
        int apuesta;
        String color;
        String parImpar;
        Scanner scan = new Scanner(System.in);

        for (Jugador j:jugadores) {
            Apuesta apuestaAux = new Apuesta();
            System.out.println("Juega " + j.getNombre());
            System.out.println("1 para apostar a número");
            System.out.println("2 para apostar a color Negro/Rojo");
            System.out.println("3 para apostar a Par/Impar");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Numero del 0-36 al que quiere apostar");
                    numero = scan.nextInt();
                    apuestaAux.setTipo(opcion);
                    apuestaAux.setValor(numero.toString());
                    break;
                case 2:
                    System.out.println("A que color quiere apostar Negro/Rojo");
                    color = scan.next();
                    apuestaAux.setTipo(opcion);
                    apuestaAux.setValor(color);
                    break;
                case 3:
                    System.out.println("Seleccione Par/Impar");
                    parImpar = scan.next();
                    apuestaAux.setTipo(opcion);
                    apuestaAux.setValor(parImpar);
                    break;
                default:
            }
            do {
                System.out.println("Cuanto dinero quiere apostar?");
                apuesta = scan.nextInt();
                apuestaAux.setCantidad(apuesta);
            }while(apuesta>j.getDinero() || apuesta<=0);

            apuestas.add(apuestaAux);

        }


    }

    private static void crear_jugadores() {
        String nombre = "";
        int saldo = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Cuantos jugaran?");
        int numJugadores = scan.nextInt();
        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Nombre del jugador " + (int)i+1 );
            nombre = scan.next();
            System.out.println("Saldo del jugador " + (int)i+1 );
            saldo = scan.nextInt();
            jugadores.add(new Jugador(nombre,saldo));
        }
    }

    private static void crear_ruleta() {
        for (int i = 0; i < ruleta.length; i++) {
            ruleta[i] = new Numeros(i);
        }
    }


}
