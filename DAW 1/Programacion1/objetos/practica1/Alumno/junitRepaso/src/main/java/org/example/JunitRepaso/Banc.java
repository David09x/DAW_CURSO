package org.example.JunitRepaso;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banc {
    private String nom;
    private ArrayList<Compte> listaComptes;



    public Banc() {
        listaComptes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Compte> getComptes() {
        return listaComptes;
    }

    public void setComptes(ArrayList<Compte> comptes) {
        this.listaComptes = comptes;
    }

    public void setCompte_lista(Compte compte){
        listaComptes.add(compte);
        compte.setBanc(this);
    }

    public void transferir(Compte origen, Compte destino, BigDecimal cantidad){
        origen.carrec(cantidad);
        destino.abonament(cantidad);
    }
}
