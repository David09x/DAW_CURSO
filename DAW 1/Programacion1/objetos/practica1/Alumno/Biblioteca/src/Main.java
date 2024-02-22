import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Material> librosDados = new ArrayList<>();
    public static void main(String[] args) {

        generarBiblioteca();
        //Usuarios
        Usuario primero = new Usuario("Manolo","Perez");
        Usuario segundo = new Usuario("Jose","Garcia");
        Usuario tercero = new Usuario("Emilio","Puertas");
        Usuario cuarto = new Usuario("Maria","Pomares");

        librosDados.get(0).setTotalUsuarios(segundo);

        prestamoLibros(librosDados,primero);

        librosDados.get(0).setTotalUsuarios(cuarto);
        librosDados.get(3).setTotalUsuarios(tercero);

        for (int i = 0; i < librosDados.size(); i++) {
            String s =  librosDados.get(i).imprimir();
            System.out.println(s);
        }
    }

    public static void prestamoLibros (ArrayList<Material> almacen,Usuario a){

        System.out.println("¿Que libro desea recoger?");
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        String libroPedido = sc.nextLine();

        for (Material elem:almacen) {
            if(elem.getTitulo().toLowerCase().trim().equals(libroPedido.toLowerCase().trim())){
                encontrado = true;
                 switch(elem.getClass().toString().toLowerCase()){
                     case "class revista":
                         a.setTiene(elem);
                         a.setHistorialRecogidas(elem);
                         elem.setTotalUsuarios(a);
                         System.out.println("se le entrego una revista");
                         break;
                     case "class periodico":
                         a.setTiene(elem);
                         a.setHistorialRecogidas(elem);
                         elem.setTotalUsuarios(a);
                         System.out.println("se le entrego un periodico");
                         break;
                     case "class libro":
                         a.setTiene(elem);
                         a.setHistorialRecogidas(elem);
                         elem.setTotalUsuarios(a);
                         System.out.println("se le entrego un libro");
                         break;
                 }
            }
        }
        if(!encontrado){
            System.out.println("no esta en la biblioteca");
        }

    }

    public static void dejarMaterial(Boolean a,Usuario f){
        if(a){
            f.setTiene(null);
        }
    }

    public static void generarBiblioteca(){


        //Biblioteca
        Libro nuevo = new Libro("¿Porque no cobro 10k al mes?","Adrian Cougil",40,"22-12-2019",
                "Mi dura vida consiguiendo 10k al mes", "nose","10290jajsdj","Aldaya");
        nuevo.agregar(librosDados);
        Revista nuevo1 = new Revista("Interview","Sergio Marenda",21,
                "18-08-2022","Cotilleos Varios","Entretenimiento","44","tias");
        nuevo1.agregar(librosDados);
        Periodico nuevo2 = new Periodico("¿Porque España va mal?","Pepe Consulao",22,
                "22-12-2019","Es la verdad mas absoluta","Lineal" ,12,"45141454JSD");
        nuevo2.agregar(librosDados);
        Periodico nuevo3 = new Periodico("Peter Vete YA!","Manolo Moltant",33,"14-04-2023",
                "Han arruinado el Valencia C.F", "Critica",15,"1982KSAJH2983");
        nuevo3.agregar(librosDados);


    }

}