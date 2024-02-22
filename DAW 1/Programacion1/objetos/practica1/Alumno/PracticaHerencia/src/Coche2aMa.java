public class Coche2aMa extends Coche{

    private int kms;

    public Coche2aMa(int numBastidor, String matricula, String marca, String model, String color, double precio, boolean revisiones, int kms) {
        super(numBastidor, matricula, marca, model, color, precio, revisiones);
        this.kms = kms;
    }

    public Coche2aMa(int numBastidor, String matricula, String marca, String model, String color, double precio, boolean revisiones) {
        super(numBastidor, matricula, marca, model, color, precio, revisiones);
    }

    public Coche2aMa() {

    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String imprimirCoche2aMa(){
        return "numero de bastidor: " + super.getNumBastidor() +  " matricula: " + super.getMatricula() + " marca: "+ super.getMarca() + " modelo: "+ super.getModel()
                + " color: " + super.getColor() + " precio: "+ super.getPrecio() + " revisiones: " + super.isRevisiones()  + " kilometros: "+ kms;
    }

}
