public class Producto  {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString(){
        return " nombre del producto: " + nombre + "\n" + "precio del producto: " + precio + "\n";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
