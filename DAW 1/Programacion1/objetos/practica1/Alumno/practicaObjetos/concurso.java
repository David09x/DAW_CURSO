import java.sql.Date;

public class concurso {

    private String titulo;
    private String fecha;
    private int tiempo;
    private concursante concursante1;

    public concurso() {
    }

    public concurso(String titulo, String fecha, int tiempo) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.tiempo = tiempo;
    }

    

    public concurso(String titulo, String fecha, int tiempo, concursante concursante1) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.concursante1 = concursante1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public concursante getConcursante1() {
        return concursante1;
    }

    public void setConcursante1(concursante concursante1) {
        this.concursante1 = concursante1;
    }
    
    public void imprimirConcurso(){

        System.out.println("Pelicula " + this.getTitulo()+ " fecha estreno "+ this.getFecha() + " Duracion " + this.getTiempo() + " minutos");
    }

    public void imprimirConcurso2(){

        System.out.println("Pelicula " + this.getTitulo()+ " fecha estreno "+ this.getFecha() + " Duracion " + this.getTiempo() + " minutos" + this.concursante1.getNombre_completo());
    }

    
    
}
