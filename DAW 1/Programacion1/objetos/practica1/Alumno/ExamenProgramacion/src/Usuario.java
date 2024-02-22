import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Usuario {

    private String nombre;
    private String correo;
    private Subcripcion suscripcion;
    private int minutosTotales;
    private int minutosEscuchados;
    private ArrayList<Audios> pendientes = new ArrayList<>();
    private Audios escuchando;


    public Usuario() {
    }

    public Usuario(String nombre, String correo, Subcripcion suscripcion, int minutosTotales) {
        this.nombre = nombre;
        this.correo = correo;
        this.suscripcion = suscripcion;
        this.minutosTotales = minutosTotales;
    }


    public Usuario(String nombre, String correo, Subcripcion suscripcion, int minutosTotales, int minutosEscuchados) {
        this.nombre = nombre;
        this.correo = correo;
        this.suscripcion = suscripcion;
        this.minutosTotales = minutosTotales;
        this.minutosEscuchados = minutosEscuchados;
    }

    public Usuario(String nombre, String correo, Subcripcion suscripcion, int minutosTotales, int minutosEscuchados, ArrayList<Audios> pendientes) {
        this.nombre = nombre;
        this.correo = correo;
        this.suscripcion = suscripcion;
        this.minutosTotales = minutosTotales;
        this.minutosEscuchados = minutosEscuchados;
        this.pendientes = pendientes;
    }

    public Usuario(String nombre, String correo, Subcripcion suscripcion, int minutosTotales, int minutosEscuchados, ArrayList<Audios> pendientes, Audios escuchando) {
        this.nombre = nombre;
        this.correo = correo;
        this.suscripcion = suscripcion;
        this.minutosTotales = minutosTotales;
        this.minutosEscuchados = minutosEscuchados;
        this.pendientes = pendientes;
        this.escuchando = escuchando;
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Subcripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Subcripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public int getMinutosTotales() {
        return minutosTotales;
    }

    public void setMinutosTotales(int minutosTotales) {
        this.minutosTotales = minutosTotales;
    }


    public int getMinutosEscuchados() {
        return minutosEscuchados;
    }

    public void setMinutosEscuchados(int minutosEscuchados) {
        this.minutosEscuchados = minutosEscuchados;
    }

    public ArrayList<Audios> getPendientes() {
        return pendientes;
    }

    public void setPendientes(ArrayList<Audios> pendientes) {
        this.pendientes = pendientes;
    }

    public Audios getEscuchando() {
        return escuchando;
    }

    public void setEscuchando(Audios escuchando) {
        this.escuchando = escuchando;
    }



     public void escuchar(int minutos){

        this.setMinutosEscuchados(minutos);
        if(!this.getSuscripcion().getTipo().equals("Premium")){
            if(this.getSuscripcion().getMinutosUsables() > 0){
                this.getSuscripcion().setMinutosUsables(this.getSuscripcion().getMinutosUsables() - minutos);
            }else{
                System.out.println("Has agotado el tiempo machimo de escucha con tu subscripcion");
            }
        }else{
            System.out.println("Al ser premium escucha cuanto quiera");
        }
    }

    public void agregarAudioArray(){
        pendientes.add(escuchando);
    }
    public void audiosEscuchadosPorUsuario(){

        System.out.println("el usuario " + this.nombre + " ha escuchado");
        for (int i =   0; i < pendientes.size(); i++) {
            pendientes.get(i).imprimirLibro();
        }
    }
    
    public void escuchandoLibro(Audios a,int total){
       a.setAudioEscuchadoTotal(total);
    }
    public void audiosMasEscuchados(){
            ArrayList<Audios> a  = new ArrayList<>();
        for (int i = 0; i < pendientes.size(); i++) {
            for (int j = 0; j < pendientes.size(); j++) {
                if(pendientes.get(i).getAudioEscuchadoTotal() > pendientes.get(j).getAudioEscuchadoTotal()){
                    a.add(pendientes.get(i));
                }else{
                    if(a.size() == 1){
                        for (int k = 0; k < pendientes.size(); k++) {
                            a.add(pendientes.get(k));
                        }
                    }
                }
            }
        }
        System.out.println("los libros mas escuchados por el usuario en orden son " + nombre);
        for (int i = 0; i < a.size(); i++) {
            a.get(i).imprimirLibro();
        }
    }
}
