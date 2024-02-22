import java.math.BigDecimal;

public class terrenos extends Inmueble implements Inmmobiliaria{
    enum tipoTiempo {regadio,secano};
    private tipoTiempo tipo;
    private boolean edificacion;

    public terrenos(String regCatastral, double m2, BigDecimal precio, tipoTiempo tipo, boolean edificacion) {
        super(regCatastral, m2, precio);
        this.tipo = tipo;
        this.edificacion = edificacion;
    }
}
