public class Alumno {

    private String nombre;
    private int num ;
    private int edad;
    private int curso;

    public Alumno() {
    }

    public Alumno(String nombre, int num, int edad, int curso) {
        this.nombre = nombre;
        this.num = num;
        this.edad = edad;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public  void copiarAlumno(Alumno a2){
        a2.setNombre(this.getNombre());
        a2.setCurso(this.getCurso());
        a2.setEdad(this.getEdad());
        a2.setNum(this.getNum());
    }

    public  void leerAlumno() {
        // Leemos de teclado 3 valores y lo ponemos en el objeto:
        this.num = Leer.leerEntero("Dame el número del alumno: ");
        this.edad = Leer.leerEntero("Dame la edad del alumno: ");
        this.curso = Leer.leerEntero("Dame el curso del alumno: ");
        this.nombre = Leer.leerString("Dame el nombre del alumno");
    }

    public  void imprimirAlumne() {
        // Imprimimos los valores que tiene el objeto
        System.out.println("-- DATOS DEL ALUMNO --");
        System.out.println("Número: " + this.getNum());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Nombre: " + this.getNombre() );
    }

    public boolean igualAlumno(Alumno a2){
        if(this.getNombre().equals(a2.getNombre()) && this.getCurso() ==  a2.getCurso() && this.getEdad() ==  a2.getEdad()
                && this.getNum() == a2.getNum()){
            return true;
        }
        return false;
    }
}
