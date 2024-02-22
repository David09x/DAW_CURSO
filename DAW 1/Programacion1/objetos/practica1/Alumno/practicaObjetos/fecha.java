public class fecha {

    private int dia;
    private int mes;
    private int año;


    

    public fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    
    public fecha() {
    }


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    

    public void imprimirFecha(){

        System.out.println(this.getAño()+" año "+this.getMes()+" mes "+this.getDia()+" dia ");

    }
    
    
    
}
