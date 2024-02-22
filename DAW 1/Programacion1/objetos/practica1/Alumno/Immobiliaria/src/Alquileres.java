import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

public  class Alquileres  {

    private BigDecimal precioAlquiler;
    private String fechaInicioContrato;
    private String fechaAcabadoContrato;
    enum gestionPropia {si,no};
    private gestionPropia gestionProp;
    private pagoMensual abonado;
    private ArrayList<pagoMensual> pagosRealizados =  new ArrayList<>();

    public Alquileres(BigDecimal precioAlquiler, String fechaInicioContrato, String fechaAcabadoContrato, gestionPropia gestionProp, pagoMensual abonado) {
        this.precioAlquiler = precioAlquiler;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaAcabadoContrato = fechaAcabadoContrato;
        this.gestionProp = gestionProp;
        this.abonado = abonado;
    }


    public ArrayList<pagoMensual> getPagosRealizados() {
        return pagosRealizados;
    }

    public void imprimirPagosUnAnyo(){
        for (pagoMensual element: pagosRealizados) {
            System.out.println("mes: " + element.getMes() + " precio: " + element.getValor());
        }
    }

    public String imprimir() {
        return  " PrecioAlquieler: " + precioAlquiler + "\n fecha de inicio: " + fechaInicioContrato + "\n fecha de finalizacion: " + fechaAcabadoContrato
                + "\n gestion propia: " + gestionProp  + "\n pago mensual: " +  abonado.getValor() + "\n mes: " + abonado.getMes();
    }

    public void setPagosRealizados(pagoMensual a) {
        if(pagosRealizados.size() != 12){
            pagosRealizados.add(a);
        }
    }


    public double comision(BigDecimal precio) {
        if(precio.compareTo(new BigDecimal("500"))>= 1){
            return precio.multiply(new BigDecimal("0.05")).doubleValue();
        }else{
            return precio.multiply(new BigDecimal("0.07")).doubleValue();
        }
    }
}
