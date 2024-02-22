public class satelit {

    private double meridia;
    private double paral_lel;
    private double distancia_terra;
    satelit (double m, double p, double d){
        meridia=m;
        paral_lel=p;
        distancia_terra=d;
    }
    satelit (){
        meridia=paral_lel=distancia_terra=0;
    }
    public void setPosicio(double m ,double p ,double d){
        meridia=m;
        paral_lel=p;
        distancia_terra=d;
    }
    public void printPosicio(){
        System.out.println("El satèlit es troba en el paral·lel " +
                paral_lel+" Meridià " + meridia + " a una distància de la terra de " +
                        distancia_terra + " Quilòmetres");
    }

    public void variaAlsada(double desplazamiento){
        distancia_terra = distancia_terra + desplazamiento;
    }

    public boolean enOrbita(){
        return distancia_terra < 15000;
    }

    public void variaPosicio(double variap,double variam){
        meridia = variam;
        paral_lel = variap;
    }
}
