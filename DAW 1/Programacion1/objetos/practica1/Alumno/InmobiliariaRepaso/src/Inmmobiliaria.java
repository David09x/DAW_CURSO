import java.math.BigDecimal;

public interface Inmmobiliaria {


    default double comisiones (BigDecimal dinero){
        return dinero.multiply(new BigDecimal("0.03")).doubleValue();
    }

    default double impuestos(BigDecimal dinero){
        return dinero.multiply(new BigDecimal("0.1")).doubleValue();
    }
}
