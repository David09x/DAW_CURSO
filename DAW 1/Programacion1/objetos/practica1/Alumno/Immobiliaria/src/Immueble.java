import java.math.BigDecimal;

public interface Immueble {

    String getRegCatastral();
    double getSuperM2();
    BigDecimal getPrecio();
    void setSuperM2(double superM2);
    void setPrecio(BigDecimal precio);
    void setRegCatastral(String regCatastral);
    String imprimir();

    default double comision(BigDecimal precio){

        return precio.multiply(new BigDecimal("0.03")).doubleValue();
    }
    default double impuesto(BigDecimal precio){
        return precio.multiply(new BigDecimal (0.1)).doubleValue();
    }


}
