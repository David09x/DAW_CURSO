package org.mockito.exemple.services;

import org.mockito.exemple.models.Examen;
import org.mockito.exemple.repositories.ExamenRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ExamenServiceImpl implements ExamenService{

    private ExamenRepository examenRepository;
    public ExamenServiceImpl(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findExamenPerNom(String nom) {

        Examen examen = null;
        Optional<Examen> examenTrobat =
        examenRepository.findALl().stream().filter(e -> e.getNom().equals(nom)).findFirst();
        if(examenTrobat.isPresent())
            examen = examenTrobat.orElseThrow();

        return examen;
    }


}
