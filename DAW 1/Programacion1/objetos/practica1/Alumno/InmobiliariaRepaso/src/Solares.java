import java.math.BigDecimal;

public class Solares extends Inmueble implements Inmmobiliaria{
   enum tipoSuelo {residencial,industrial};
   private String anyoCatastral;
   private boolean cargasPen;

   private tipoSuelo tipo;


    public Solares(String regCatastral, double m2, BigDecimal precio, String anyoCatastral, boolean cargasPen, tipoSuelo tipo) {
        super(regCatastral, m2, precio);
        this.anyoCatastral = anyoCatastral;
        this.cargasPen = cargasPen;
        this.tipo = tipo;
    }

    @Override
    public double comisiones(BigDecimal dinero) {
        if(this.getM2() >= 300){
            return dinero.multiply(new BigDecimal("0.07")).doubleValue();
        }
        return Inmmobiliaria.super.comisiones(dinero);
    }
}
