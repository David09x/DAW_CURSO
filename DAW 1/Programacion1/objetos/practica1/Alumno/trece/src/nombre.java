public class nombre {

    private  int numero;

    public nombre(int numero) {
        this.numero = numero;
    }

    public nombre() {
        this.numero = 0;
    }

    public int suma(int numeroDado){
        return this.numero =  numeroDado+this.numero;
    }

    public int resta(int numeroDado){
        return  this.numero = this.numero-numeroDado;
    }

    public int  getValor(){
        return this.numero;
    }

    public int getDoble(){
        return this.numero =  this.numero*2;
    }

    public int getTriple(){
        return this.numero = this.numero*3;
    }

    public void setNumero(int numeroDado){
        this.numero = numeroDado;
    }
}
