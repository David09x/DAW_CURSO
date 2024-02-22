import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Audios> audiosYlibrosTotales = new ArrayList<>();

        Audios primero = new Audios();
        primero.setId(1);
        primero.setAutor("Jose Manuel Cabezon Perez");
        primero.setDuracion(27);
        primero.setImagen("www.librodecasas.com/img/21312128238");
        primero.setTitulo("Como viaje a china con mi amigo Pepe");
        primero.setAudioEscuchadoTotal(0);

        Audios segundo = new Audios();
        segundo.setId(2);
        segundo.setAutor("Carmen Lomana Carbo");
        segundo.setDuracion(20);
        segundo.setImagen("www.librodecasas.com/img/3249234998");
        segundo.setTitulo("Dos borrachos de fiesta por Cancun");
        segundo.setAudioEscuchadoTotal(0);

        Audios tercero = new Audios();
        tercero.setId(3);
        tercero.setAutor("Klalislav  Protenov");
        tercero.setDuracion(20);
        tercero.setImagen("www.librodecasas.com/img/mkjd8812301");
        tercero.setTitulo("Mi experiencia en España");
        tercero.setAudioEscuchadoTotal(0);

        audiosYlibrosTotales.add(primero);
        audiosYlibrosTotales.add(segundo);
        audiosYlibrosTotales.add(tercero);

        System.out.println("Libros Disponibles");
        System.out.println(" ");
        for (int i = 0; i < audiosYlibrosTotales.size(); i++) {
           audiosYlibrosTotales.get(i).imprimirLibro();
        }

        Subcripcion basica = new Subcripcion("basica", "50",600);
        Subcripcion gratuita = new Subcripcion("gratuita", "gratis",200);
        Subcripcion Premium = new Subcripcion("premium", "80",0);

        Usuario uno = new Usuario("Manolo","ManoloEsGrande@gmail.com",basica,0);
        Usuario dos = new Usuario("Jose","JoseMayustePerez@gmail.com",gratuita,0);
        Usuario tres = new Usuario("Paula","Paula@gmail.com",Premium,0);

       uno.escuchar(40);

       uno.setEscuchando(primero);
       uno.agregarAudioArray();
       uno.setEscuchando(segundo);
       uno.agregarAudioArray();

       uno.audiosEscuchadosPorUsuario();

       uno.escuchandoLibro(primero,10);
       uno.escuchandoLibro(segundo,13);

       dos.escuchandoLibro(segundo,20);

       audiosMasEscuchados(audiosYlibrosTotales);

    }

    public static void audiosMasEscuchados(ArrayList<Audios> a) {

        ArrayList<Audios> s  = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if(a.get(i).getAudioEscuchadoTotal() > a.get(j).getAudioEscuchadoTotal()){
                    s.add(a.get(i));
                }else{
                    if(a.size() == 1){
                        for (int k = 0; k < a.size(); k++) {
                            s.add(a.get(k));
                        }
                    }
                }
            }
        }
        System.out.println("los libros mas escuchados por el usuario en orden son ");
        for (int i = 0; i < s.size(); i++) {
            s.get(i).imprimirLibro();
        }
    }


}