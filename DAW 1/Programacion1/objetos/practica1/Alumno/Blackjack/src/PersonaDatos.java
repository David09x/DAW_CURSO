import java.util.ArrayList;

public class PersonaDatos {

    private String Nombre;
    private String Apellido1;
    private int puntuacion;
    private ArrayList<Carta> manosJugador = new ArrayList<>();
    public PersonaDatos(String nombre, String apellido1) {
        Nombre = nombre;
        Apellido1 = apellido1;
    }
    public PersonaDatos() {
    }
    public PersonaDatos(String nombre, String apellido1, int puntuacion, ArrayList<Carta> manosJugador) {
        Nombre = nombre;
        Apellido1 = apellido1;
        this.puntuacion = puntuacion;
        this.manosJugador = manosJugador;

    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


    public void setManosJugador(ArrayList<Carta> manosJugador) {
        this.manosJugador = manosJugador;

    }


    public void agregarCartaMano(Carta a){
        manosJugador.add(a);
    }
    public void imprimirUsuario(){

        System.out.println("El jugador " + this.Nombre + " " +
                " tiene una puntuacion de " + this.puntuacion);

    }
    public void imprimirGanadorOganadores(){

        System.out.println("El jugador " + this.Nombre + " " + this.Apellido1+ " " +
                " tiene una puntuacion de " + this.puntuacion);
    }
}
