import java.util.ArrayList;

public class Empleado {

    private String nombre;
    private int edad;
    private double sueldo;
    private ArrayList<Tarea> tareas = new ArrayList<>();
    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(Tarea tarea) {
        tareas.add(tarea);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" + "edad: " + edad + "\n" + "sueldo: " + sueldo;
    }

    public String toTareasImprimir(){ return "Tarea: " + tareas.toString();}
}
