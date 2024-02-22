import java.math.BigDecimal;

public class viviendas extends Inmueble implements Inmmobiliaria{
    private int numHabitaciones;
    private int numBaños;
    enum estadoVivienda {obranueva,buenestado,parareformar}
    private estadoVivienda estado;

    public viviendas(String regCatastral, double m2, BigDecimal precio, int numHabitaciones, int numBaños, estadoVivienda estado) {
        super(regCatastral, m2, precio);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
        this.estado = estado;
    }

    @Override
    public double comisiones(BigDecimal dinero) {
        if(this.getPrecio().compareTo(new BigDecimal(100000)) >=1){
            return dinero.multiply(new BigDecimal("0.05")).doubleValue();
        }
        return Inmmobiliaria.super.comisiones(dinero);
    }
}
