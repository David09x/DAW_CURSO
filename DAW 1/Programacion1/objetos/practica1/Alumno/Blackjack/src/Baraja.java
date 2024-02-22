import java.util.*;

public class Baraja {

    private ArrayList<Carta> baraja = new ArrayList<>();



    public Baraja() {
        String numero[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        String palos[] =  {"♠","♣","♦","♥"};
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                baraja.add(new Carta(numero[j],palos[i]));
            }

        }
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public void imprimirBaraja(){
        for (int i = 0; i < baraja.size(); i++) {
            System.out.print(baraja.get(i).getNumero() + baraja.get(i).getPalo() + " ");
        }
        System.out.println("");
    }

    public void Barajar(){
        Collections.shuffle(baraja);
    }

    public Carta darCarta(){
        Carta sacar = new Carta();

        sacar.setNumero(baraja.get(0).getNumero());
        sacar.setPalo(baraja.get(0).getPalo());
        baraja.remove(0);

        return sacar;
    }



}
