package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionesTest {

    Materia aga = new Materia(List.of());
    Materia fisicai = new Materia(List.of());
    Materia ami = new Materia(List.of());
    Materia amii = new Materia(List.of(ami, aga));
    Materia ssoo = new Materia(List.of());
    Materia fisicaii = new Materia(List.of(fisicai));

    @Test
    void pruebaTrue(){
        Alumno pepe = new Alumno(List.of(fisicai, ami, aga));

        Inscripcion inscripcion = new Inscripcion(pepe, List.of(amii, fisicaii));
        assertTrue(inscripcion.aprobada());
    }

    @Test
    void pruebaFalse(){
        Alumno pepeII = new Alumno(List.of(fisicai, ssoo, aga));

        Inscripcion inscripcion = new Inscripcion(pepe, List.of(amii, fisicaii));
        assertFalse(inscripcion.aprobada());
    }

}