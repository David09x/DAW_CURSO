import java.math.BigDecimal;

public class viviendas extends Immobiliaria implements Immueble{

    private int numHabitaciones;
    private int numBaños;

    public viviendas(String regCatastral, double superM2, BigDecimal precio, int numHabitaciones, int numBaños) {
        super(regCatastral, superM2, precio);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }

    @Override
    public double comision(BigDecimal precio) {
       if(this.getPrecio().compareTo(new BigDecimal("100000")) >= 1){
           return precio.multiply(new BigDecimal("0.07")).doubleValue();
       }else{
           return Immueble.super.comision(precio);
       }
    }

    @Override
    public String imprimir() {
        return super.imprimir() + " numero de habitaciones: " + numHabitaciones + "\n" + " numero de baños: " + numBaños + "\n";
    }
}
