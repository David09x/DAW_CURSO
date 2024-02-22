public class medidas {

    private double milla;

    public medidas() {
    }

    public double getMilla() {
        return milla;
    }

    public void setMilla(double milla) {
        this.milla = milla;
    }

    public double millasAmetros(double a){

        return a *1852;
    }

    public double millasAquilometros(double a){

        return (a *1852)/1000;
    }
}
