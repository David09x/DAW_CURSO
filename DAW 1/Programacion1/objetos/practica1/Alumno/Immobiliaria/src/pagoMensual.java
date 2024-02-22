import java.math.BigDecimal;

public class pagoMensual{

    private String mes;
    private BigDecimal valor;

    public pagoMensual(String mes, BigDecimal valor) {
        this.mes = mes;
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
