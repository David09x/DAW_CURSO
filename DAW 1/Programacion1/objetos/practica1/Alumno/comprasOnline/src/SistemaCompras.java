import java.util.ArrayList;

public interface SistemaCompras {

    void agregarProducto(Producto producto);
    void eliminarProducto(Producto producto);
    void realizarCompra(Usuario usuario);
    double calcularTotal(Usuario usuario);
    default void mostrarProductosDisponibles(ArrayList<Producto> a) {
        String impr = "";
        for (Producto elem:a) {
            impr = elem.toString();
            System.out.println(impr);
        }
    }
    default boolean validarExistenciaProducto(Producto producto,ArrayList<Producto> a) {

        for (Producto elem:a) {
            if(producto.getNombre().equals(elem.getNombre())){
                return true;
            }
        }
        return false;
    }


}
