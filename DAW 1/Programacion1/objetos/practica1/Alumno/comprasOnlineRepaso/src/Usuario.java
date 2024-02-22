import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String direccion;
    private double saldo;
    ArrayList<Producto> carrito = new ArrayList<>();

    public Usuario(String nombre, String direccion, double saldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(Producto product) {
        carrito.add(product);
    }
}
