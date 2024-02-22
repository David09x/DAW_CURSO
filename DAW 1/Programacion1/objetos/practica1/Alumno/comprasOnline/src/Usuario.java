import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String direccion;
    private double saldo;
    private ArrayList<Producto> cartera = new ArrayList<>();

    public Usuario(String nombre, String direccion, double saldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "nombre del usuario: " + nombre + "\n" + "direccion del usuario: " +  direccion + "\n" +
                "saldo del usuario: " + saldo;
    }

    public ArrayList<Producto> getCartera() {
        return cartera;
    }

    public void setCartera(ArrayList<Producto> cartera) {
        this.cartera = cartera;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void borrarCarteraUsuario()
    {
        cartera.clear();
    }

    public double saldoTotal(){

        double total = 0;

        for (Producto elem: cartera) {
            total += elem.getPrecio();
        }

        return total;
    }
}
