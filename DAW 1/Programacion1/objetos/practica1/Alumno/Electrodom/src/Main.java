import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static ArrayList<Electrodomestico> almacen = new ArrayList<>();
    public static void main(String[] args) {

        Frigo neveraAEG = new Frigo("AEGNevera","AEG",
                "AEGFrost",540.44,
                "Nevera americana",220,330, Frigo.tipo.frost);
        Lavadora lavadoraAEG = new Lavadora("AEGLavadora","AEG",
                "AEGLavamat",800.44,
                "Lavadora automática",220,8, 1200);

        neveraAEG.agregar(almacen);
        lavadoraAEG.agregar(almacen);


        programaUsuario();
    }

    public static void agregarElectrodomestico(){
        Scanner sc = new Scanner(System.in);
        int variableTamaño = almacen.size();
        boolean cubierto = false;
        while(!cubierto)
        {
            try
            {
                System.out.println("dime su nombre");
                String nombre = sc.nextLine();
                System.out.println("dime su marca");
                String marca = sc.nextLine();
                System.out.println("dime el modelo");
                String modelo = sc.nextLine();
                System.out.println("dime el precio");
                int precio = sc.nextInt();
                System.out.println("dame una decripcion");
                String descripcion =  sc.nextLine();
                System.out.println("dime que electrodomestico quieres agregar Televisor/Frigorifico/Lavadora");
                String Electrodomestico = sc.nextLine();
                switch (Electrodomestico.toLowerCase())
                {
                    case "televisor":
                        System.out.println("dime pulgadas");
                        double pulgadasTV= sc.nextDouble();
                        System.out.println("dime la resolucion");
                        sc.nextLine();
                        String resolucionTV = sc.nextLine();
                        Televisor nuevoTV = new Televisor(nombre,marca,modelo,precio,descripcion,pulgadasTV,resolucionTV);
                        nuevoTV.agregar(almacen);
                        break;
                    case "frigorifico":
                        System.out.println("dime cuentas voltaje");
                        int voltajeFrigo = sc.nextInt();
                        System.out.println("dime la capacidad");
                        int capacidadFrigo = sc.nextInt();
                        System.out.println("dime si es frost o nofrost");
                        sc.nextLine();
                        String tipoFoNF = sc.nextLine();
                        if(tipoFoNF.toLowerCase().equals("frost")){
                            Frigo nuevoFrigo = new Frigo(nombre,marca,modelo,precio,descripcion,voltajeFrigo,capacidadFrigo, Frigo.tipo.frost);
                            nuevoFrigo.agregar(almacen);
                        }else if (tipoFoNF.toLowerCase().equals("nofrost")){
                            Frigo nuevoFrigo = new Frigo(nombre,marca,modelo,precio,descripcion,voltajeFrigo,capacidadFrigo, Frigo.tipo.nofrost);
                            nuevoFrigo.agregar(almacen);
                        }
                        break;
                    case "lavadora":
                        System.out.println("dime cuentas voltaje");
                        int voltajeLavardora= sc.nextInt();
                        System.out.println("dime la capacidad");
                        int capacidadLavadora = sc.nextInt();
                        System.out.println("dime los rpm que tiene");
                        sc.nextLine();
                        int rpmLava = sc.nextInt();
                        Lavadora nuevoLavadora = new Lavadora(nombre,marca,modelo,precio,descripcion,voltajeLavardora,capacidadLavadora,rpmLava);
                        nuevoLavadora.agregar(almacen);
                        break;
                    default:
                        System.out.println("no existe el electrodomestico que me has marcado");
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("Te has equivocado");
                sc.nextLine();
            }
            if(almacen.size() > variableTamaño)
                cubierto = true;
            else{
                System.out.println("vuelve a intentarlo");
            }
        }
    }
    public static void eliminarElectrodomestico(){
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el nombre del Electrodomestico");
        String electro = sc.nextLine();
        int variableTamaño = almacen.size();
        for (Electrodomestico elec: almacen) {
            if (elec.getNombre().toLowerCase().equals(electro.toLowerCase())){
                almacen.remove(elec);
            }
        }
        if(almacen.size() < variableTamaño){
            System.out.println("se elimino");
        }else{
            System.out.println("no se elimino porque no existe ese nombre");
        }
    }
    public static void buscarElectrodomestico(){
        Scanner sc = new Scanner(System.in);
        System.out.println("buscas  por ¿modelo,nombre,marca o todos?");
        String electro = sc.nextLine();
        switch (electro.toLowerCase()){
            case "modelo":
                System.out.println("dime el modelo");
                String modelo = sc.nextLine();
                for (Electrodomestico elect: almacen) {
                    if(elect.getModelo().toLowerCase().equals(modelo))
                        elect.imprimir();
                }
                break;
            case "nombre":
                System.out.println("dime el nombre");
                String nombre = sc.nextLine();
                for (Electrodomestico elect: almacen) {
                    if(elect.getNombre().toLowerCase().equals(nombre))
                        elect.imprimir();
                }
                break;
            case "marca":
                System.out.println("dime la marca");
                String marca = sc.nextLine();
                for (Electrodomestico elect: almacen) {
                    if(elect.getMarca().toLowerCase().equals(marca))
                        elect.imprimir();
                }
                break;
            case "todos":
                for (Electrodomestico elect: almacen) {
                    elect.imprimir();
                }
                break;
            default:
                System.out.println("no existe lo que me has escrito");
                break;
        }
    }

    public static void programaUsuario(){
        Scanner sc = new Scanner(System.in);
        boolean terminado = false;
        while(!terminado){
            System.out.println("Dime que desea realizar \n 1- Agregar electrodomestico " +
                    "\n 2- eliminar electrodomestico \n 3- buscar electrodomestico \n 4- salir");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    agregarElectrodomestico();
                    break;
                case 2:
                    eliminarElectrodomestico();
                    break;
                case 3:
                    buscarElectrodomestico();
                    break;
                case 4:
                    terminado = true;
                    break;
            }
        }
    }
}