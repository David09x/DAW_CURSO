import java.util.ArrayList;

public abstract class Publicacion extends Biblioteca{

    private String tipoPublicacion;


    public Publicacion(String titulo, String autor, int numPaginas, String fechaPublicacion, String descripcion, String tipoPublicacion) {
        super(titulo, autor, numPaginas, fechaPublicacion, descripcion);
        this.tipoPublicacion = tipoPublicacion;
    }

    public void agregar(ArrayList<Material> materiales){
        materiales.add(this);
    }

    public void eliminar(ArrayList<Material> materiales){
        materiales.remove(this);
    }

    public Material buscar(ArrayList<Material> materiales){
        for (Material biblio: materiales) {
            if(biblio.equals(this)){
                return biblio;
            }
        }
        return null;
    }


}
