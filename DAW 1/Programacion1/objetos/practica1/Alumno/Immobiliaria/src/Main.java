import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        Immobiliaria s = new Immobiliaria("jadada2asd",200.00,new BigDecimal("1200.00"));
        Solar a =  new Solar("jadada2asd",200.00,new BigDecimal("88000.00"), Solar.tipoSuelo.residencial,1983, Solar.cargasPen.no);
        Terrenos b =  new Terrenos("jadsjasdsjaks",120.00,new BigDecimal("200000.00"), Terrenos.tipoTerreno.secano, Terrenos.tipoEdificacion.si);
        viviendas c = new viviendas("ajsdjksajkdaskjdqweq", 85.00,new BigDecimal("55.000"),35,12);
        pagoMensual e = new pagoMensual("marzo",new BigDecimal("230.00"));
        pagoMensual l = new pagoMensual("abril",new BigDecimal("430.00"));
        Alquileres d =  new Alquileres(new BigDecimal("300.00"),"12/03/2023","18/03/2023", Alquileres.gestionPropia.si,
                e);
        double j =d.comision(e.getValor());
        BigDecimal m = new BigDecimal(j).add(e.getValor()).setScale(2, RoundingMode.HALF_UP) ;
        e.setValor(m);
        d.setPagosRealizados(e);
        double y =d.comision(l.getValor());
        BigDecimal m2 = new BigDecimal(y).add(l.getValor()).setScale(2,RoundingMode.HALF_UP) ;
        e.setValor(m2);
        d.setPagosRealizados(l);


        String kk = c.imprimir();
        String kkk = d.imprimir();



        System.out.println(kk);
        System.out.println("------------------------------");
        System.out.println(kkk);
        System.out.println("------------------------------ \n");
        System.out.println("pagos mensuales Usuario \n");
        d.imprimirPagosUnAnyo();

    }


}