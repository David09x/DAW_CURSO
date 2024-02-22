import java.util.ArrayList;
import java.util.Scanner;

public class SistemaComprasImpl implements SistemasCompras{

    ArrayList<Producto> almacen = new ArrayList<>();

    @Override
    public void agregarProducto(Producto producto) {
        almacen.add(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        int tamaño = almacen.size();
        /*for (Producto elem:almacen) {
            if(elem.getNombre().toLowerCase().trim().equals(producto.getNombre().toLowerCase().trim())){
                almacen.remove(elem);
            }
        }*/
        almacen.remove(producto);
        
        if(tamaño > almacen.size()){
            System.out.println("se elimino");
        }else{
            System.out.println("no se elimino");
        }
    }

    @Override
    public void realizarCompra(Usuario usuario) {
        Scanner s = new Scanner(System.in);
        System.out.println("dime producto que quieres comprar");
        int compraSiOno= usuario.getCarrito().size();
        String s1  = s.nextLine();
        for (Producto elem: almacen) {
            if(s1.toLowerCase().trim().equals(elem.getNombre().toLowerCase().trim())){
                if(usuario.getSaldo() >= elem.getPrecio()){
                    usuario.setCarrito(elem);
                    System.out.println("ha realizado la compra");
                }else{
                    System.out.println("saldo insuficiente");
                }
            }
        }
        if(compraSiOno == usuario.getCarrito().size()){
            System.out.println("no se agrego al carrito no existe o saldo insuficiente");
        }
    }

    @Override
    public double calcularTotal(Usuario usuario) {
        double suma = 0;
        for (Producto elem:
             usuario.getCarrito()) {
            suma += elem.getPrecio();
        }
        return suma;
    }

    public ArrayList<Producto> getAlmacen() {
        return almacen;
    }

    public void crearProductos(){
        Producto uno = new Producto("manzanas",1.44);
        agregarProducto(uno);
        Producto dos =  new Producto("melon",  5.33);
        agregarProducto(dos);
        Producto tres =  new Producto("Sandia",  7.33);
        agregarProducto(tres);
        Producto cuatro =  new Producto("ensalada Primavera" , 2.99);
        agregarProducto(cuatro);
        Producto cinco =  new Producto("cocacola", 1.78);
        agregarProducto(cinco);
    }
}
