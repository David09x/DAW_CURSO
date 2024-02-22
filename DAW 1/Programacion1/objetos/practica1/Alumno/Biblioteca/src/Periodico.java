import java.util.ArrayList;

public class Periodico extends Publicacion{

    private int volumen;
    private String seccion;


    public Periodico(String titulo, String autor, int numPaginas, String fechaPublicacion, String descripcion, String tipoPublicacion, int volumen, String seccion) {
        super(titulo, autor, numPaginas, fechaPublicacion, descripcion, tipoPublicacion);
        this.volumen = volumen;
        this.seccion = seccion;
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
        return super.imprimir() + " volumen : " + volumen + " seccion: " + seccion + "\n"
                + "Los usuararios que han adquerido esta revista son: " + b;
    }
}
