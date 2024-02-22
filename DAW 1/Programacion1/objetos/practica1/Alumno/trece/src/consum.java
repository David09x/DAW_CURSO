public class consum {

    private double kms;
    private double litres;
    private double vmed;
    private double pcom;
    private double tiempoSegundos;

    public consum(double kms, double litres, double vmed, double pcom) {
        this.kms = kms;
        this.litres = litres;
        this.vmed = vmed;
        this.pcom = pcom;
    }

    public consum() {
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    public double getVmed() {
        return vmed;
    }

    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public double getPcom() {
        return pcom;
    }

    public double getTiempoSegundos() {
        return tiempoSegundos;
    }

    public void setTiempoSegundos(double tiempoSegundos) {
        this.tiempoSegundos = tiempoSegundos;
    }

    public void setPcom(double pcom) {
        this.pcom = pcom;
    }

    public double getTemps(){

       double tiempo = this.kms/this.vmed;
        return tiempo*3600;
    }

    public void pasarDeSegundosaHMS(){

        int hor = 0;
        int min = 0;
        int seg = 0;

        hor=(int) tiempoSegundos/3600;
        min=(int) (this.tiempoSegundos-(3600*hor))/60;
        seg=(int)this.tiempoSegundos-((hor*3600)+(min*60));
        System.out.println(hor+"h "+min+"m "+seg+"s");
    }

    public double consumoMedio(){

        return (litres/kms)*100;
    }


    public double eurosConsumidos(){

        return ((litres/kms)*100)*1.42;
    }
}
