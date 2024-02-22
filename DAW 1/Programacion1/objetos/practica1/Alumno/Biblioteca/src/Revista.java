import java.util.ArrayList;

public class Revista extends Publicacion{

    private String edicion;
    private String tema;


    public Revista(String titulo, String autor, int numPaginas, String fechaPublicacion, String descripcion, String tipoPublicacion, String edicion, String tema) {
        super(titulo, autor, numPaginas, fechaPublicacion, descripcion, tipoPublicacion);
        this.edicion = edicion;
        this.tema = tema;
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
       return  super.imprimir()  + " edicion: " + edicion + " tema: " + tema + "\n" +
               "Los usuararios que han adquerido esta revista son: " + b;
    }
}
