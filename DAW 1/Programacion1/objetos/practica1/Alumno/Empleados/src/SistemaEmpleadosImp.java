import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEmpleadosImp implements SistemaEmpleados{
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    @Override
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    @Override
    public void asignarTarea(Empleado empleado, String tarea) {
        Tarea nueva = new Tarea(tarea, false );
      empleado.setTareas(nueva);
    }

    @Override
    public void completarTarea(Empleado empleado) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tarea a compleado?");
        String tareaBuscada  = sc.nextLine().toLowerCase().trim();

        for (Tarea elem:
             empleado.getTareas()) {
           if(elem.getNombreTarea().toLowerCase().trim().equals(tareaBuscada)){
               if(elem.isTareaTerminada() == false){
                   elem.setTareaTerminada(true);
               }else{
                   System.out.println("esa tarea ya la termino");
               }
           }
        }
    }

    @Override
    public void listarEmpleados() {
        for (Empleado elem: listaEmpleados) {
            System.out.println(elem.toString());
        }
    }
    public void crearEmpleados(){
        Empleado uno = new Empleado("Jose", 23,1500.00);
        Empleado dos = new Empleado("Manolo", 33,1800.00);
        Empleado tres = new Empleado("Pepe", 43,2100.00);
        agregarEmpleado(uno);
        agregarEmpleado(dos);
        agregarEmpleado(tres);

    }

    public Empleado escogerEmpleado(ArrayList<Empleado> a){
        System.out.println("dime el nombre de usuario");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine().toLowerCase().trim();
        for (Empleado elem:
             a) {
            if(elem.getNombre().toLowerCase().trim().equals(nombre)){
                return elem;
            }
        }

        return null;
    }




}
