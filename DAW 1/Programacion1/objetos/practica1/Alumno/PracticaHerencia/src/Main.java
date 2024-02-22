public class Main {
    public static void main(String[] args) {
        cocheAntiguo prueba = new cocheAntiguo(43,"45793 DRK","Citroen","Palmera","Rojo",30000.00,true,337,"1987",5);

        String imprimir = prueba.imprimirCocheAntiguo();

        imprimir(imprimir);
    }

    public static void imprimir(String s){
        System.out.println(s);
    }
}