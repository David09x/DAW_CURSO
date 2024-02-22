import java.math.BigDecimal;

public   class Immobiliaria {

    private String regCatastral;
    private double superM2;
    private BigDecimal precio;


    public Immobiliaria(String regCatastral, double superM2, BigDecimal precio) {
        this.regCatastral = regCatastral;
        this.superM2 = superM2;
        this.precio = precio;
    }


    public String getRegCatastral() {
        return regCatastral;
    }

    public void setRegCatastral(String regCatastral) {
        this.regCatastral = regCatastral;
    }

    public double getSuperM2() {
        return superM2;
    }

    public void setSuperM2(double superM2) {
        this.superM2 = superM2;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String imprimir(){
        return  "registro Catastral: " + regCatastral + "\n" + " metros del edificio: " + superM2 +"\n" +
                " precio de la vivienda: " + precio + "\n";
    }

}
