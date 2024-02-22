import java.util.ArrayList;

public abstract  class Biblioteca implements Material {

    private String titulo;
    private String autor;
    private int numPaginas;
    private String fechaPublicacion;
    private String descripcion;
    private ArrayList<Usuario> totalUsuarios = new ArrayList<>();



    public Biblioteca(String titulo, String autor, int numPaginas, String fechaPublicacion, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
    }

    public Biblioteca(String titulo, String autor, int numPaginas, String fechaPublicacion, String descripcion, ArrayList<Usuario> totalUsuarios) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.totalUsuarios = totalUsuarios;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setTotalUsuarios(Usuario a) {
        totalUsuarios.add(a);
    }

   @Override
    public ArrayList<Usuario> getTotalUsuarios() {
        return totalUsuarios;
    }

    public String imprimir(){
        String a =  "titulo: " + getTitulo() + " autor: " + getAutor() + " numPaginas: " + getNumPaginas() + " fechaPublicacion: " + getFechaPublicacion()
                + " descripcion: " + getDescripcion()+ "\n";

        return a;
    }
}
