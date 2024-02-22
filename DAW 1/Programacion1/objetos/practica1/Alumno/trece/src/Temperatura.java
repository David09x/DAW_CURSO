public class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Temperatura() {
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double celsiusAFahrenheit(){

        return (this.temperatura-32)/1.8;

    }

    public double farenheitACelsius(){

        return (1.8*this.temperatura) +32;
    }
}
