package org.mockito.exemple.repositories;

import org.mockito.exemple.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findALl();
}
