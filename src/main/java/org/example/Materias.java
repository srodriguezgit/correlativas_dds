package org.example;
import java.util.List;

public class Materias {

    private List<Materias> correlativas;

    public boolean cumpleCorrelativas(Alumno alumno){
        return alumno.aprobadas().containsAll(correlativas);
    }
}
