import java.math.BigDecimal;

public class Solar extends Immobiliaria implements Immueble{

    enum tipoSuelo {residencial, industrial};
    private tipoSuelo suelo;
    private int anyoCatastral;
    enum cargasPen {si,no};
    private cargasPen cargasPendientes;

    public Solar(String regCatastral, double superM2, BigDecimal precio, tipoSuelo suelo, int anyoCatastral, cargasPen cargasPendientes) {
        super(regCatastral, superM2, precio);
        this.suelo = suelo;
        this.anyoCatastral = anyoCatastral;
        this.cargasPendientes = cargasPendientes;
    }

    @Override
    public double comision(BigDecimal precio) {
        if(this.getSuperM2() >= 300){
            return precio.multiply(new BigDecimal("0.07")).doubleValue();
        }else{
            return Immueble.super.comision(precio);
        }
    }

    @Override
    public String imprimir() {
        return super.imprimir() + " tipo de suelo: " + suelo + " año catastral: " + anyoCatastral + " tiene cargas pendiend: " + cargasPendientes;
    }
}
