import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class noEstaProducto extends Exception{
    public noEstaProducto(String message)
    {
        super(message);
    }
}
public class SistemaComprasImpl  implements SistemaCompras{

    private ArrayList<Producto> warehouse = new ArrayList<>();


    @Override
    public void agregarProducto(Producto producto){
        warehouse.add(producto);

    }
    @Override
    public void eliminarProducto(Producto producto){
        warehouse.remove(producto);

    }
    @Override
    public void realizarCompra(Usuario usuario){
        boolean compraRealizada = false;
        Scanner teclado = new Scanner(System.in);
        int tamanyoArray = usuario.getCartera().size();

            System.out.println("Productos para comprar");
            mostrarProductos(warehouse);
        while(!compraRealizada){

            try{
                System.out.println("¿Que desea comprar?");
                String compra = teclado.nextLine().toLowerCase().trim();
                for (Producto elem2: warehouse) {
                    if(compra.equals(elem2.getNombre().toLowerCase().trim())){
                        usuario.getCartera().add(elem2);
                        System.out.println("se agrego el producto correctamente");
                    }
                }
                if(usuario.getCartera().size() ==  tamanyoArray) throw new noEstaProducto("el producto " +
                        "seleccionado no esta");
                System.out.println("¿Desea realizar otra compra? s/n");
                compra = teclado.nextLine().toLowerCase().trim();
                if(!compra.equals("s") && !compra.equals("n")) throw new noEstaProducto("tiene que decir s o n");
                if(compra.equals("n")){
                    double total = usuario.saldoTotal();
                    if(total > usuario.getSaldo()){
                        System.out.println("No se puede realiza la compra por no tener suficiente saldo");
                        compraRealizada = true;
                    }else{

                        total = usuario.getSaldo() - calcularTotal(usuario);
                        usuario.setSaldo((double) Math.round(total*100d)/100d);
                        String s = usuario.toString();
                        System.out.println(s);
                        usuario.borrarCarteraUsuario();
                        compraRealizada = true;
                    }
                }

                if(compra.equals("s")){
                    System.out.println("Productos para comprar");
                   mostrarProductos(warehouse);
                }

            }catch (noEstaProducto e){
                System.out.println(e.getMessage());
                teclado.nextLine();
            }
        }
    }
    @Override
    public double calcularTotal(Usuario usuario){

        return usuario.saldoTotal();
    }

    public void mostrarProductos(ArrayList<Producto> a){
        for (Producto elem:
                a) {
            System.out.println(elem.toString());
        }
    }

    public void crearProductos(){
        Producto uno = new Producto("Manzanas" , 0.24);
        Producto dos = new Producto("Cola",  1.10);
        Producto tres = new Producto("Pechuga el Kilo", 0.88);
        Producto cuatro = new Producto("Pan de molde" ,  1.20);
        agregarProducto(uno);
        agregarProducto(dos);
        agregarProducto(tres);
        agregarProducto(cuatro);

    }

    
}
