import java.util.ArrayList;

public class Main {

    static ArrayList<Proces> processos = new ArrayList<>();

    public static void main(String[] args) {
        int instant = 0;
        int quantum = 2;

        processos.add(new Proces(20,10));
        processos.add(new Proces(10,0));
        processos.add(new Proces(12,3));
        processos.add(new Proces(14,5));
        processos.add(new Proces(16,20));
        processos.add(new Proces(0,-1));

        String strProces = "  ID    Estat     Ús CPU    Executat    Instant Arribada    Tiempo de espera" + "\n";
        strProces +=       "============================================================================" + "\n";

        System.out.print(strProces);

        while (hi_ha_processos_vius(instant)) {
            for (Proces p : processos) {
                if (p.getEstat_actual() == Proces.estat.preparat && p.getInstant_arribada() <= instant){
                    //processos.remove(p);
                    p.cambiaEstado(p);

                    while (instant != quantum){
                        p.setCpu_us(p.getCpu_us()+1);
                        p.tiempoDeEspera(processos);
                        instant++;
                        quantum++;
                        if (p.getCpu_us()==p.getCpu_us_total()) {
                            p.setEstat_actual(Proces.estat.finalitzat);
                            processos.set(processos.size()-1,p);
                            p.setTiempo_de_espera(p.getTiempo_de_espera()-p.getInstant_arribada());
                            System.out.println(p.toString());

                            break;
                        }
                    }
                    if (p.getEstat_actual()!= Proces.estat.finalitzat) {
                        p.cambiaEstado(p);
                        processos.set(processos.size() - 1, p);
                    }
                }
            }
        }

    }

    private static boolean hi_ha_processos_vius(int instant) {
        //Pregunta 4 de l'examen
        for (Proces elem: processos) {
            if(elem.getEstat_actual().equals(Proces.estat.preparat) || elem.getEstat_actual().equals(Proces.estat.execucio)){
                return true;
            }
            if(elem.getInstant_arribada() >= instant){
                return true;
            }
        }
        return false;
    }


}