package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materiasInscritas;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasInscritas = new HashSet<>();
    }


    public Boolean Aprobada(){
        return this.getMateriasInscritas().stream().allMatch(unaMateria -> this.getAlumno().puedeCursar(unaMateria));
    }
}
