import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
class numeroValido extends Exception{
    public numeroValido(String message)
    {
            super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        partidaJugar();
    }
    public static ArrayList<PersonaDatos>  datosDelasPersonas() {
        boolean numeroAdecudo = false;

        System.out.println("¿Cuantos jugadores?");
        Scanner sc = new Scanner(System.in);
        int numeroParticipantes = sc.nextInt();
        ArrayList<PersonaDatos> personaCreada = new ArrayList<>();

        while (!numeroAdecudo) {
            try {

                if (numeroParticipantes == -1) {
                    return personaCreada;

                } else {
                    if (numeroParticipantes < 3) {
                        for (int i = 0; i < numeroParticipantes; i++) {
                            System.out.println("nombre");
                            String nombre1 = sc.nextLine();
                            nombre1 = sc.nextLine();
                            System.out.println("Apellidos");
                            String Apellido2 = sc.nextLine();
                            personaCreada.add(new PersonaDatos(nombre1, Apellido2));
                        }
                        numeroAdecudo = true;

                    } else {
                        System.out.println("Dime un numero entre 1-3");
                        numeroParticipantes = sc.nextInt();
                    }
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();

                System.out.println("¿Cuantos jugadores?");
                numeroParticipantes = sc.nextInt();

            }
        }
        return personaCreada;
    }
    public static int comprobarCarta(Carta a,int puntuacion){
        if(a.getNumero().equals("J") || a.getNumero().equals("Q") || a.getNumero().equals("K")){
            return 10;
        } else if (a.getNumero().equals("A") && (puntuacion +11) <=21) {
            return 11;
        } else if (a.getNumero().equals("A") && (puntuacion +11) >21) {
            return 1;
        }
        return Integer.parseInt(a.getNumero());
    }

    public static void repartirPrimerasCartas(PersonaDatos s, Baraja a,int ronda){
        Carta manoJugador =  new Carta();;
        int acumulador=0;
        if(!s.getNombre().equals("Banca") ){
            manoJugador = a.darCarta();
            acumulador += comprobarCarta(manoJugador,s.getPuntuacion());
            s.setPuntuacion(acumulador);
            s.imprimirUsuario();
        } else if (ronda==0 && s.getNombre().equals("Banca")) {
            manoJugador = a.darCarta();
            acumulador += comprobarCarta(manoJugador,s.getPuntuacion());
            s.setPuntuacion(acumulador);
            s.imprimirUsuario();
        }else{
            manoJugador = a.darCarta();
            acumulador += comprobarCarta(manoJugador,s.getPuntuacion());
            s.setPuntuacion(acumulador);
            s.imprimirUsuario();
        }
    }
    public static String juegaOno(String a){
        boolean pregunta = false;
        Scanner sc = new Scanner(System.in);
        a = a.toLowerCase();
        while(!pregunta){
            try{
                if(!a.equals("si") && !a.equals("no"))throw  new numeroValido("Dime si o no") ;
                if(a.equals("si") || a.equals("no") ){
                    pregunta = true;
                }
            } catch (numeroValido e) {
                System.out.println(e.getMessage());
                a = sc.nextLine();
            }
        }
        return a;
    }
    public static void quiereJugar(String a,PersonaDatos s,Baraja n){
        boolean jugar= false;
        Carta manoJugador =  new Carta();;
        int acumulador = s.getPuntuacion();
        Scanner sc = new Scanner(System.in);
            while(!jugar) {
                    if (a.equals("no")) {
                        jugar = true;
                    }
                    if (a.equals("si")) {
                        manoJugador = n.darCarta();
                        acumulador += comprobarCarta(manoJugador,s.getPuntuacion());
                        s.agregarCartaMano(manoJugador);
                        s.setPuntuacion(acumulador);
                        s.imprimirUsuario();
                        if(s.getPuntuacion() <22){
                            System.out.println(s.getNombre() + " ¿Quiere más cartas?");
                            a = sc.nextLine();
                            a = juegaOno(a);
                            if(a.equals("no")){
                                jugar= true;
                            }else{
                                jugar = false;
                            }
                        }else{
                            s.setPuntuacion(-1);
                            jugar = true;
                        }
                    }
            }
    }
    public static void juegaLaBanca(PersonaDatos a,Baraja s){
        boolean juegaLaBanca = false;
        Carta manoJugador =  new Carta();;
        int acumulador = a.getPuntuacion();
        while (!juegaLaBanca){
                if(a.getPuntuacion() >= 17){
                    juegaLaBanca = true;
                }else{
                    manoJugador = s.darCarta();
                    acumulador += comprobarCarta(manoJugador,a.getPuntuacion());
                    a.agregarCartaMano(manoJugador);
                    a.setPuntuacion(acumulador);
                    a.imprimirUsuario();
                    if(a.getPuntuacion() >= 17 && a.getPuntuacion() <=21){
                        juegaLaBanca = true;
                    }
                    if(a.getPuntuacion() > 21){
                        a.setPuntuacion(-1);
                        System.out.println("se ha pasado");
                        juegaLaBanca = true;
                    }
                }
        }
    }
    public static ArrayList<PersonaDatos> comprobandoResultados(ArrayList<PersonaDatos> a){
        ArrayList<PersonaDatos> mejores = new ArrayList<>();
        int max = 0;
        PersonaDatos personaMayor = new PersonaDatos();
        for (int i = 0; i < a.size(); i++) {
           if(a.get(i).getPuntuacion() > max){
               max = a.get(i).getPuntuacion();
               personaMayor = a.get(i);
           }
        }
        mejores.add(personaMayor);
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPuntuacion() == personaMayor.getPuntuacion() && !personaMayor.getNombre().equals(a.get(i).getNombre())){
                mejores.add(a.get(i));
            }
        }
        return mejores;
    }

    public static void partidaJugar(){
        boolean decisionFinal = false;
        Baraja juega = new Baraja();
        juega.Barajar();
        Scanner sc = new Scanner(System.in);
        String siOno = "";
        PersonaDatos banca = new PersonaDatos();
        banca.setNombre("Banca");
        ArrayList<PersonaDatos> Personas = datosDelasPersonas();
        Personas.add(banca);
        while(!decisionFinal){
            if(juega.getBaraja().size() > 10){
                for (int i = 0; i < Personas.size(); i++) {
                    repartirPrimerasCartas(Personas.get(i),juega,i);
                }
            }else{
                juega = new Baraja();
                juega.Barajar();
            }
            for (int i = 0; i < Personas.size()-1; i++) {
                if(juega.getBaraja().size() > 10){
                System.out.println(Personas.get(i).getNombre() + " ¿Quiere más cartas?");
                siOno = sc.nextLine();
                String devueltoSiOno  = juegaOno(siOno);
                quiereJugar(devueltoSiOno,Personas.get(i),juega);
                }else{
                    juega = new Baraja();
                    juega.Barajar();
                }
            }
            if(juega.getBaraja().size() >10){
                int Banca = Personas.size()-1;
                PersonaDatos Banca2 = Personas.get(Banca);
                juegaLaBanca(Banca2,juega);
            }else{
                juega = new Baraja();
                juega.Barajar();
            }
            ArrayList<PersonaDatos> ganadorOganadores = comprobandoResultados(Personas);
            System.out.println(" ");
            System.out.println("El jugador o jugadores que han ganado son");
            for (int i = 0; i < ganadorOganadores.size(); i++) {
                ganadorOganadores.get(i).imprimirGanadorOganadores();
            }
            System.out.println(" ");
            System.out.println("¿Quieres volver a jugar?");
            siOno = sc.nextLine();
            String decision = juegaOno(siOno);
            if(decision.equals("si")){
                for (int i = 0; i < Personas.size(); i++) {
                    Personas.get(i).setPuntuacion(0);
                    Personas.get(i).setManosJugador(new ArrayList<>());
                    ganadorOganadores.removeAll(ganadorOganadores);
                }
            }
            else if (decision.equals("no")) {
                decisionFinal = true;
            }
        }
    }
}