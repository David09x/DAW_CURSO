public class Conversor {

    private double dinero;

    public Conversor(double dinero) {
        this.dinero = dinero;
    }

    public Conversor() {
        this.dinero = 1.2732;
    }

    public double dolaresAeuros(double dolares){

        return dolares/dinero;
    }

    public double eurosAdolares(double euros){
        return dinero*euros;
    }
}
