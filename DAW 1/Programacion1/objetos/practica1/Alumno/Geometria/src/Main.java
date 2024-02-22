public class Main {
    public static void main(String[] args) {

       Punto a = new Punto();
       Punto b = new Punto();
       Punto e= new Punto();
       Punto f = new Punto();

       Rectangulo c = new Rectangulo();
       Rectangulo d = new Rectangulo();
       a.setX(1);
       a.setY(5);
       b.setX(5);
       b.setY(1);
       e.setX(6);
       e.setY(3);
       f.setX(2);
       f.setY(5);

       c.setPuntoX(a);
       c.setPuntoY(b);
       d.setPuntoX(e);
       d.setPuntoY(f);

        System.out.println("distancia es " + a.Distancia(b));

        double area1 = c.areaRectangulo();
        System.out.println("el area total es " + area1);
        double area2 = d.areaRectangulo();
        System.out.println("el area total es " + area2);

        int s = c.mayorAreaRectangulo(d);
        if(s == 1){
            System.out.println("el mayor es el c");
        } else if (s==-1) {
            System.out.println("el mayor es el d");
        }else {
            System.out.println("son iguales");
        }
    }
}