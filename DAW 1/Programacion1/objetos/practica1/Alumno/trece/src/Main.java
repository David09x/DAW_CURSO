public class Main {
    public static void main(String[] args) {

        Temperatura nueva = new Temperatura();
        nueva.setTemperatura(24.8);

        double  a = nueva.celsiusAFahrenheit();
        double b = nueva.farenheitACelsius();

        System.out.println(a);
        System.out.println(b);

        Coche velocidad = new Coche();
        System.out.println(velocidad.velocidadActual());;
        velocidad.accelera(30);
        System.out.println(velocidad.velocidadActual());
        velocidad.frena(10);
        System.out.println(velocidad.velocidadActual());

        //-----------------------------------------------------------
        Conversor dinerito = new Conversor();

        double s = dinerito.dolaresAeuros(30);
        double j =  dinerito.eurosAdolares(30);

        System.out.println(s + " euros " + j + " dolares ");
        //-----------------------------------------------------------
        nombre nuevo1 = new nombre();

        int numeroretorno = nuevo1.getValor();
        System.out.println(numeroretorno);
        int numeroSumando = nuevo1.suma(9);
        System.out.println(numeroSumando);
        int numeroRestando = nuevo1.resta(3);
        System.out.println(numeroRestando);
        int numeroDoble = nuevo1.getDoble();
        System.out.println(numeroDoble);
        int numeroTriple = nuevo1.getTriple();
        System.out.println(numeroTriple);
        nuevo1.setNumero(99);
        System.out.println(nuevo1.getValor());
        //---------------------------------------------------------
        pes prueba1 = new pes();
        pes prueba2 = new pes();

        prueba1.setPeso(33.33);
        prueba1.setTipo("kg");

        double s1 = prueba1.getLliures();
        double s2 = prueba1.getLingotes();


        prueba2.setPeso(33.33);

        double s3 = prueba2.getPes("Oz");
        System.out.println("en libras son " +  Math.round(s1 * 100.0) /100.0);

        System.out.println("en lingotes son " +  Math.round(s2 * 100.0) /100.0);

        System.out.println("el peso es " + Math.round(s3 * 100.0) /100.0);

        //------------------------------------------------------------------------

        medidas prueba3 =  new medidas();

        double s4 = prueba3.millasAmetros(33.33);

        System.out.println("de millas a metros " + Math.round(s4 * 100.0) /100.0);

        double s5 = prueba3.millasAquilometros(33.33);
        System.out.println("de millas a metros " + Math.round(s5 * 100.0) /100.0);

        //------------------------------------------------------------------------

        coche2 prueba4 = new coche2();

        prueba4.setMarca("Nissan");
        prueba4.setModelo("Skyline");

        System.out.println("la marca es " + prueba4.getMarca() + " ,el modelo es " + prueba4.getModelo());

        //-----------------------------------------------------------------------

        consum prueba5 = new consum();

        prueba5.setKms(450);
        prueba5.setVmed(110);
        prueba5.setLitres(20);
        double s6 = prueba5.getTemps();
        prueba5.setTiempoSegundos(s6);
        prueba5.pasarDeSegundosaHMS();
        double s7 =  prueba5.consumoMedio();
        System.out.println(s7);
        double s8 =  prueba5.eurosConsumidos();
        System.out.println(s8);

        //------------------------------------------------------------------------------


    }


}