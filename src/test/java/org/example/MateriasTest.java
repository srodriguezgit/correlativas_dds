package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MateriasTest {

    @Test

    public void cumpleCorrelativasTrue() {
        Materia ami = new Materia(List.of());
        Materia amii = new Materia(List.of(ami));

        Alumno pepeVI = new Alumno(List.of(ami));
        assertTrue(amii.cumpleCorrelativas(pepeVI));
    }

    @Test

    public void cumpleCorrelativasFalse() {
        Materia ami = new Materia(List.of());
        Materia amii = new Materia(List.of(ami));

        Alumno pepeVII = new Alumno(List.of());
        assertFalse(amii.cumpleCorrelativas(pepeVII));
    }

}