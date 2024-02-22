import java.util.ArrayList;

public class Libro extends Publicacion{

    private String ISBN;
    private String editorial;


    public Libro(String titulo, String autor, int numPaginas, String fechaPublicacion, String descripcion, String tipoPublicacion, String ISBN, String editorial) {
        super(titulo, autor, numPaginas, fechaPublicacion, descripcion, tipoPublicacion);
        this.ISBN = ISBN;
        this.editorial = editorial;
    }

    @Override
    public String imprimir() {
        String b = "";
        for (Usuario elem:getTotalUsuarios()) {
            if(!elem.equals(getTotalUsuarios().get(getTotalUsuarios().size()-1))){
                b = b.concat(elem.getNom() + " " + elem.getApellidos() + ",");
            }else{
                b = b.concat(elem.getNom() + " " + elem.getApellidos());
            }
        }

        return super.imprimir() + " ISBN: " + ISBN + " editorial: " + editorial + "\n"+
                "Los usuararios que han adquerido esta revista son: " + b;
    }
}
