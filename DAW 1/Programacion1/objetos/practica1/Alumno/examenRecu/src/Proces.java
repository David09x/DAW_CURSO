import java.util.ArrayList;

public class Proces implements ProcesInterface{
    enum estat{preparat,execucio,finalitzat}
    private String id;
    private int cpu_us_total;
    private int cpu_us;
    private int instant_arribada;
    private int tiempo_de_espera;
    private estat estat_actual;


    //Pregunta 3 de l'examen
    public Proces(int cpu_us_total, int instant_arribada) {
        id = generaID();
        estat_actual = estat.preparat;
        this.instant_arribada = instant_arribada;
        this.cpu_us_total = cpu_us_total;
        this.cpu_us = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCpu_us_total() {
        return cpu_us_total;
    }

    public void setCpu_us_total(int cpu_us_total) {
        this.cpu_us_total = cpu_us_total;
    }

    public int getCpu_us() {
        return cpu_us;
    }

    public void setCpu_us(int cpu_us) {
        this.cpu_us = cpu_us;
    }

    public int getInstant_arribada() {
        return instant_arribada;
    }

    public void setInstant_arribada(int instant_arribada) {
        this.instant_arribada = instant_arribada;
    }

    public estat getEstat_actual() {
        return estat_actual;
    }

    public void setEstat_actual(estat estat_actual) {
        this.estat_actual = estat_actual;
    }

    public int getTiempo_de_espera() {
        return tiempo_de_espera;
    }

    public void setTiempo_de_espera(int tiempo_de_espera) {
        this.tiempo_de_espera = tiempo_de_espera;
    }

    //pregunta 5 de el examen
    public void tiempoDeEspera(ArrayList<Proces> array){

        for (Proces elem:
                array) {
            if (elem.estat_actual.equals(estat.preparat)){
                elem.setTiempo_de_espera(elem.getTiempo_de_espera()+1);
            }
        }
    }


    @Override
    public String toString() {
        return id + "  " +  estat_actual + "   " + cpu_us_total + "     " +cpu_us + "               " +instant_arribada + "                 " + tiempo_de_espera;
    }

}
