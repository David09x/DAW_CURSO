public class Subcripcion {

    private String tipo;
    private String precio;
    private int minutosUsables;

    public Subcripcion() {
    }

    public Subcripcion(String tipo, String precio,int minutosUsables) {
        this.tipo = tipo;
        this.precio = precio;
        this.minutosUsables = minutosUsables;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getMinutosUsables() {
        return minutosUsables;
    }

    public void setMinutosUsables(int minutosUsables) {
        this.minutosUsables = minutosUsables;
    }
}
