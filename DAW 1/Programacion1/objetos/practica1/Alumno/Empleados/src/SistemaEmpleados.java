import java.util.ArrayList;

public interface SistemaEmpleados {

    void agregarEmpleado(Empleado empleado);
    void eliminarEmpleado(Empleado empleado);
    void asignarTarea(Empleado empleado, String tarea);
    void completarTarea(Empleado empleado);
    void listarEmpleados();
    default  void mostrarEstadisticas(ArrayList<Empleado> empleado) {

        for (Empleado elem:
             empleado) {
            System.out.println("-------------------------------------------------------\n");
            System.out.println("Empleado:"+ "\n" + elem.toString() + "\n" + "Tareas: " + elem.getTareas().toString());
            System.out.println("-------------------------------------------------------\n");

        }
    }
    default   double calcularSueldoPromedio(ArrayList<Empleado> empleados) {
        double total = 0;
        double media;
        for (Empleado elem:empleados) {
            total += elem.getSueldo();
        }
        media = Math.round((total/empleados.size())*100)/100;

        return media;
    }
}
