public class concursante {

    private String nombre_completo;
    private String nombre_artistico;
    private String domicilio;
    private String año_de_nacimiento;
    private String concurso;


    public concursante() {
    }


    public concursante(String nombre_completo, String nombre_artistico, String domicilio, String año_de_nacimiento,
            String concurso) {
        this.nombre_completo = nombre_completo;
        this.nombre_artistico = nombre_artistico;
        this.domicilio = domicilio;
        this.año_de_nacimiento = año_de_nacimiento;
        this.concurso = concurso;
    }


    public String getNombre_completo() {
        return nombre_completo;
    }


    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }


    public String getNombre_artistico() {
        return nombre_artistico;
    }


    public void setNombre_artistico(String nombre_artistico) {
        this.nombre_artistico = nombre_artistico;
    }


    public String getDomicilio() {
        return domicilio;
    }


    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public String getAño_de_nacimiento() {
        return año_de_nacimiento;
    }


    public void setAño_de_nacimiento(String año_de_nacimiento) {
        this.año_de_nacimiento = año_de_nacimiento;
    }


    public String getConcurso() {
        return concurso;
    }


    public void setConcurso(String concurso) {
        this.concurso = concurso;
    }

    public void imprimirConcursante(){

        System.out.println(this.getNombre_completo() + " " + this.getNombre_artistico() + " " + this.getDomicilio() + " " + this.getAño_de_nacimiento() + " " + this.getConcurso());
    }

  
    
    
}
