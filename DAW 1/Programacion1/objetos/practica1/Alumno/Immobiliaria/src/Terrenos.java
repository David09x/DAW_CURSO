import java.math.BigDecimal;

public class Terrenos extends Immobiliaria implements  Immueble{

    enum tipoTerreno {regadio,secano};

    public tipoTerreno asfalto;

    enum tipoEdificacion {si,no};
    public tipoEdificacion edificado;

    public Terrenos(String regCatastral, double superM2, BigDecimal precio, tipoTerreno asfalto, tipoEdificacion edificado) {
        super(regCatastral, superM2, precio);
        this.asfalto = asfalto;
        this.edificado = edificado;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + " tipo de terreno: " + asfalto + " ¿esta edificado?: " + edificado;
    }
}
