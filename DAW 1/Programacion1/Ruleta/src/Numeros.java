public class Numeros {
    private int valor;
    private String color;


    public Numeros(int valor) {
        this.valor = valor;
        if (this.valor==10 || this.valor==28)
            this.color = "Negro";
        else if (this.valor==0) {
            this.color ="Verde";
        }else
            this.color = calculaColor(this.valor);
    }

    private String calculaColor(int valor) {
        //sí, por ejemplo, el 29 es negro (2 + 9 = 11, 1 + 1 = 2
        int decenas = valor / 10;
        int unidades = valor % 10;

        int suma = decenas + unidades;
        decenas = suma / 10;
        unidades = suma % 10;

        if (decenas + unidades % 2 == 0)
            return "Negro";
        else
            return "Rojo";
    }

    public int getValor() {
        return valor;
    }

    public String getColor() {
        return color;
    }

    public void imprimir() {
        System.out.println(this.valor + "-" + this.color + "-" + (this.valor%2==0?"Par":"Impar"));
    }
}


