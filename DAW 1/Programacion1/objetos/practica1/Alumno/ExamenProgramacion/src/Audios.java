import java.util.ArrayList;

public class Audios {
    private String autor;
    private String titulo;
    private int id;
    private int duracion;
    private String imagen;
    private int audioEscuchadoTotal;


    public Audios() {
    }

    public Audios(String autor, String titulo, int id, int duracion, String imagen) {
        this.autor = autor;
        this.titulo = titulo;
        this.id = id;
        this.duracion = duracion;
        this.imagen = imagen;
    }

    public Audios(String autor, String titulo, int id, int duracion, String imagen, int audioEscuchadoTotal) {
        this.autor = autor;
        this.titulo = titulo;
        this.id = id;
        this.duracion = duracion;
        this.imagen = imagen;
        this.audioEscuchadoTotal = audioEscuchadoTotal;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getAudioEscuchadoTotal() {
        return audioEscuchadoTotal;
    }

    public void setAudioEscuchadoTotal(int audioEscuchadoTotal) {
        this.audioEscuchadoTotal += audioEscuchadoTotal;
    }

    public void imprimirLibro(){
        System.out.println("Autor: " + this.autor + " " + "Titulo: " +this.titulo + " " + "Imagen: " +this.imagen + " " +"Duracion en minutos: "
                +this.duracion + " " +"ID: " +this.id);
    }


}
