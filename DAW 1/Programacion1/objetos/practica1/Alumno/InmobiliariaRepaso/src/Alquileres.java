import java.math.BigDecimal;
import java.util.ArrayList;

public class Alquileres implements Inmmobiliaria{
    ArrayList<Pagos> pagosCadaMes = new ArrayList<>();

    private double precioAlquiler;
    private double rentaCadaMes;
    private String fecha_inicio_contrato;
    private String fecha_finalizacion_contrato;

    public Alquileres(double precioAlquiler, double rentaCadaMes, String fecha_inicio_contrato, String fecha_finalizacion_contrato) {
        this.precioAlquiler = precioAlquiler;
        this.rentaCadaMes = rentaCadaMes;
        this.fecha_inicio_contrato = fecha_inicio_contrato;
        this.fecha_finalizacion_contrato = fecha_finalizacion_contrato;
    }

    @Override
    public double comisiones(BigDecimal dinero) {
        if(precioAlquiler > 500){
            return dinero.multiply(new BigDecimal("0.05")).doubleValue();
        }
        return Inmmobiliaria.super.comisiones(dinero);
    }
}
