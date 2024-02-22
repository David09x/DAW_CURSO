public class Main {
    public static void main(String[] args) {
        SistemaComprasImpl a =  new SistemaComprasImpl();
        Producto uno = new Producto("manzanas",1.44);
        a.agregarProducto(uno);
        Producto dos =  new Producto("melon",  5.33);
        a.agregarProducto(dos);
        Producto tres =  new Producto("Sandia",  7.33);
        a.agregarProducto(tres);
        Producto cuatro =  new Producto("ensalada Primavera" , 2.99);
        a.agregarProducto(cuatro);
        Producto cinco =  new Producto("cocacola", 1.78);
        a.agregarProducto(cinco);

        a.mostrarProductosDisponibles(a.getAlmacen());
        Usuario persona = new Usuario("nerko","galicia 23",11.12);
       // a.realizarCompra(persona);
        //a.realizarCompra(persona);
        //a.realizarCompra(persona);
        Producto l = new Producto("sandia",33);
        //double b  = a.calcularTotal(persona);
       // System.out.println("total de la compra " +  b);
       /* boolean y =a.validarExistenciaProducto(l,a.getAlmacen());
        if (y){
            System.out.println("si esta en el almacen");
        }else{
            System.out.println("no esta en el almacen");
        }*/
        a.eliminarProducto(l);
    }




}