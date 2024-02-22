public class Punto {

    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double Distancia(Punto a){

        double resultado = 0;
        resultado = Math.sqrt(Math.pow(this.y-a.getY(),2)+Math.pow(this.x-a.getX(),2));
        return resultado;
    }
}
