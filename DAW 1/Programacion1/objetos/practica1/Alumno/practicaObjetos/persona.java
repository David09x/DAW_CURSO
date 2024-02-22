public class persona {

    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;

    public persona() {
    }

    public persona(String nombre, String primer_apellido, String segundo_apellido) {
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public void imprimirPersona(){

        System.out.println(this.getNombre()+ " " + this.getPrimer_apellido() + " " + this.getSegundo_apellido());
    }
    
}
