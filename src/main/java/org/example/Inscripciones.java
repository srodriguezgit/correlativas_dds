package org.example;

import java.util.List;

public class Inscripciones {

    private List<Materias> materias;
    private Alumno alumno;

    public boolean aprobado(){
        return materias.stream().allMatch( materia -> materia.cumpleCorrelativas(alumno));
    }

}
