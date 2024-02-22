import java.math.BigDecimal;

public abstract class Inmueble {
    private String regCatastral;
    private double m2;
    private BigDecimal precio;

    public Inmueble(String regCatastral, double m2, BigDecimal precio) {
        this.regCatastral = regCatastral;
        this.m2 = m2;
        this.precio = precio;
    }

    public String getRegCatastral() {
        return regCatastral;
    }

    public void setRegCatastral(String regCatastral) {
        this.regCatastral = regCatastral;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
