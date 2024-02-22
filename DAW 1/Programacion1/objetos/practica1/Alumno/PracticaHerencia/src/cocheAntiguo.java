public class cocheAntiguo extends Coche2aMa{

    private String año;

    private int numeroRuedas;

    public cocheAntiguo() {
    }

    public cocheAntiguo(int numBastidor, String matricula, String marca, String model, String color, double precio, boolean revisiones, int kms, String año, int numeroRuedas) {
        super(numBastidor, matricula, marca, model, color, precio, revisiones, kms);
        this.año = año;
        this.numeroRuedas = numeroRuedas;
    }



    public String imprimirCocheAntiguo(){
        return super.imprimirCoche2aMa() +  " año: " + año + "numero de ruedas que lleva: " + numeroRuedas;
    }
}
