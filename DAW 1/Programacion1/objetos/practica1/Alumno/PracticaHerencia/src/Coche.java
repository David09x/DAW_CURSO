public class Coche {

    private int numBastidor;
    private String matricula;
    private String marca;
    private String model;
    private String color;
    private double precio;
    private boolean revisiones;

    public Coche(int numBastidor, String matricula, String marca, String model, String color, double precio, boolean revisiones) {
        this.numBastidor = numBastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.color = color;
        this.precio = precio;
        this.revisiones = revisiones;
    }

    public Coche() {
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isRevisiones() {
        return revisiones;
    }

    public void setRevisiones(boolean revisiones) {
        this.revisiones = revisiones;
    }
}
