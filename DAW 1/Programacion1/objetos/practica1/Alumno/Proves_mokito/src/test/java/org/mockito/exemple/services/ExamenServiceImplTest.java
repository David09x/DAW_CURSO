package org.mockito.exemple.services;

import org.junit.jupiter.api.Test;
import org.mockito.exemple.models.Examen;
import org.mockito.exemple.repositories.ExamenRepository;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ExamenServiceImplTest {

    @Test
    void findExamenPerNom() {
        //ExamenRepository examenRepository = new ExamenRepositoryImpl();

        ExamenRepository examenRepository = mock(ExamenRepository.class);
        List<Examen>  dades = Arrays.asList(new Examen(1L,"Programació"),
        new Examen(2L,"Entorns de Desenvolupament"),
                new Examen (3L, "Bases de dades"),
                new Examen(4L, "Sistemes Informatics"),
                new Examen(5L, "Llenguatge de Marques"));

        when(examenRepository.findALl()).thenReturn(dades);
        ExamenService examenService = new ExamenServiceImpl(examenRepository);
        Examen examen = examenService.findExamenPerNom("Programació");

        assertNotNull(examen);
        assertEquals(1L, examen.getId());
        assertEquals("Programació", examen.getNom());

    }
}