import java.util.ArrayList;

public interface Material{

     String getTitulo();
     String getAutor();
     int getNumPaginas();
     String getFechaPublicacion();
     String getDescripcion();
     void setTotalUsuarios(Usuario a);
     ArrayList<Usuario> getTotalUsuarios();
     String imprimir();
}
