package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Alumno {
    private String nombre;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new HashSet<>();
    }

    public boolean puedeCursar(Materia unaMateria) {
        //return (unaMateria.getCorrelativas().containsAll(this.getMateriasAprobadas()) || unaMateria.noTieneCorrelativas());
        return (this.getMateriasAprobadas().containsAll(unaMateria.getCorrelativas()) || unaMateria.noTieneCorrelativas());
    }
}
