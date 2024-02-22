import java.util.Random;

public interface ProcesInterface {
    static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    default String generaID(){
        // Pregunta 1 del examen
        String cadena = "";
        int numero;
        while(cadena.length() != 5){
            numero = (int)(Math.random()*CHARACTERS.length());
            cadena += CHARACTERS.charAt(numero);
        }
        return cadena;
    }

    default void cambiaEstado(Proces p){
        // Pregunta 2 del examen
            switch (p.getEstat_actual()){
                case preparat:
                    p.setEstat_actual(Proces.estat.execucio);
                    break;
                case execucio:
                    if(p.getCpu_us_total()-p.getCpu_us() == 0){
                        p.setEstat_actual(Proces.estat.finalitzat);
                        break;
                    }else{
                        p.setEstat_actual(Proces.estat.preparat);
                        break;
                    }
            }
    }
    String toString ();

}
