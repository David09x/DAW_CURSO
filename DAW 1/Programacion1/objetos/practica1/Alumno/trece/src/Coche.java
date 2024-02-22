public class Coche {

    private int velocitat;
    Coche (){velocitat=0;}

    public Coche(int velocitat) {
        this.velocitat = velocitat;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public int velocidadActual(){
        return this.getVelocitat();
    }

    public void accelera(int mes){

        this.velocitat = this.getVelocitat() + mes;
    }

    public void frena(int menos){
        this.velocitat = this.getVelocitat() - menos;
    }
}
