public class Apuesta {
    private int tipo;
    private String valor;
    private int cantidad;

    public Apuesta(int tipo, String valor, int cantidad) {
        this.tipo = tipo;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public Apuesta() {
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public int getCantidad() {
        return cantidad;
    }
}
