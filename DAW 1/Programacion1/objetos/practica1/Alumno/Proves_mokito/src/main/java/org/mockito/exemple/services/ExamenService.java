package org.mockito.exemple.services;

import org.mockito.exemple.models.Examen;

public interface ExamenService {

    Examen findExamenPerNom(String nom);

}
