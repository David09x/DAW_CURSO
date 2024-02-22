import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        SistemaEmpleadosImp a = new SistemaEmpleadosImp();
        a.crearEmpleados();
        String TareaNueva = "Limpiar almacen";
        Empleado buscado =  a.escogerEmpleado(a.listaEmpleados);
        a.listarEmpleados();
        if(Objects.nonNull(buscado)){
            a.asignarTarea(buscado,TareaNueva);
            a.completarTarea(buscado);
            a.mostrarEstadisticas(a.listaEmpleados);
            double s = a.calcularSueldoPromedio(a.listaEmpleados);
            System.out.println("sueldo medio de  los empleados  son : " + s);
        }else{
            System.out.println("no se encontro el usuario");
        }

    }
}
