public class pes {

    private double peso;
    private String tipo;

    public pes(double peso,String tipo) {
        this.peso = peso;
        this.tipo = tipo;
    }

    public pes(){

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLliures(){
        double resultado = 0;
        switch (tipo){
            case "lb":
                return peso;
            case "kg":
                resultado = (1000*peso)/453;
                return resultado;
            case "li":
                return peso * 32.17;
            case "Oz":
                return peso* 0.0625;
            case "P":
                resultado = peso*1.55;
                return resultado/453;
            case "G":
                resultado = peso/453;
                return resultado;
            case "Q":
                return peso*100;
        }

        return -1;
    }

    public double getLingotes(){
        double resultado = 0;
        switch (tipo){
            case "lb":
                return peso*32.17;
            case "kg":
                return peso/14.59;
            case "li":
                return peso;
            case "Oz":
                resultado = (peso*28.35)/1000;
                return resultado/14.59;
            case "P":
                resultado = (peso*1.55)/1000;
                return resultado/14.59;
            case "G":
               return peso/28.35;
            case "Q":
                resultado = (peso*43.3)*1000;
                return resultado/28.35;
        }

        return -1;
    }

    public double getPes(String s){
        switch (s){
            case "lb":
                 return ((peso*16)*453)/1000;
            case "kg":
                return peso;
            case "li":
                return ((peso*32.17)*14.59);
            case "Oz":
                return ((peso*0.0625)*28.35)/1000;
            case "P":
                return ((peso*0.05)*1.55)/1000;
            case "G":
                return peso*1000;
            case "Q":
                return ((peso*100)*43.3);
        }
        return -1;
    }

}
