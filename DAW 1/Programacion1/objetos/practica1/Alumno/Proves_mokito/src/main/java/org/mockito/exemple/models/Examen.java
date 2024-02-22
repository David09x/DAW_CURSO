package org.mockito.exemple.models;

import java.util.ArrayList;
import java.util.List;

public class Examen {

    private Long id;
    private String nom;
    private List<String> preguntes;

    public Examen(Long id, String nom) {
        this.id = id;
        this.nom = nom;
        this.preguntes = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
