public class tiempo {

    private int horas;
    private int minutos;
    private int segundos;
    private int centesimas;


    public tiempo(int horas, int minutos, int segundos, int centesimas) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.centesimas = centesimas;
    }

    public tiempo() {
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getCentesimas() {
        return centesimas;
    }

    public void setCentesimas(int centesimas) {
        this.centesimas = centesimas;
    }
    
    public void imprimirTiempo(){

        System.out.println(this.getHoras()+":"+this.getMinutos()+":"+this.getSegundos()+":"+this.getCentesimas());

    }
}
