import java.util.ArrayList;

public interface SistemasCompras {

    void agregarProducto(Producto producto);
    void eliminarProducto(Producto producto);
    void realizarCompra(Usuario usuario);
    double calcularTotal(Usuario usuario);
    default void mostrarProductosDisponibles(ArrayList<Producto> arrayList) {
        for (Producto elem:arrayList) {
            System.out.println("Producto");
            String s = elem.toString();
            System.out.println(s);
            System.out.println("----------------------------");
        }
    }
    default boolean validarExistenciaProducto(Producto producto,ArrayList<Producto> array) {
        for (Producto elem:
             array) {
            if(producto.getNombre().toLowerCase().trim().equals(elem.getNombre().toLowerCase().trim())){
                return true;
            }
        }
        return false;
    }

}
