

public class Main{

    public static void main(String[] args) {
        
        fecha a = new fecha();
        a.setAño(12);
        a.setMes(02);
        a.setDia(43);

        a.imprimirFecha();
        
        tiempo b = new tiempo();
        
        b.setHoras(2);
        b.setMinutos(4);
        b.setSegundos(5);
        b.setCentesimas(8);

        b.imprimirTiempo();

        concurso c  = new concurso();

        c.setTitulo("John Wick");
        c.setFecha("24/03/2023");
        c.setTiempo(128);

        c.imprimirConcurso();

        persona d = new persona();

        d.setNombre("Fernando");
        d.setPrimer_apellido("Alonso");
        d.setSegundo_apellido("Díaz");

        d.imprimirPersona();

        domicilio e = new domicilio();

        e.setCalle("Rafelcofer");
        e.setNumero(4);
        e.setPiso(2);
        e.setPuerta("4B");
        e.setCodigo_postal(46702);
        e.setPoblacion("Gandia");
        e.setProvincia("Valencia");

        e.imprimirDomicilio();

        concursante f = new concursante();

        f.setNombre_completo("Manolo Trujillo Garcia");
        f.setNombre_artistico("Manolo el Butanero");
        f.setDomicilio("Valencia");
        f.setAño_de_nacimiento("18/06/1975");
        f.setConcurso("Pasapalabra");
        

        f.imprimirConcursante();

        concurso g = new concurso();

        g.setTitulo("Benito");
        g.setFecha("24/05/2019");
        g.setTiempo(0);
        g.setConcursante1(f);

        g.imprimirConcurso2();

        domicilio n = new domicilio();

        n.setCalle("asdasada");
        n.setCodigo_postal(76434);
        n.setNumero(6);
        n.setPiso(0);
        n.setPoblacion("Gandia");
        n.setProvincia("Valencia");
        n.setPuerta("4B");

        n.imprimirDomicilio();
    }
}
