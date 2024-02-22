public class Main {
    public static void main(String[] args) {

        Alumno alu_1 = new Alumno();
        Alumno alu_2 = new Alumno();

        alu_1.setEdad(22);
        alu_1.setNum(332);
        alu_1.setCurso(4);
        alu_1.setNombre("Manolo");
        alu_2.setEdad(22);
        alu_2.setNum(33);
        alu_2.setCurso(4);
        alu_2.setNombre("Manolo");
        //Pasamos la dirección del objeto
        alu_1.imprimirAlumne();
        System.out.println(alu_1.igualAlumno(alu_2));
    }

}