package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    Materia materia1 = new Materia("Algoritmos y Estructuras de Datos", Set.of());
    Materia materia2 = new Materia("Paradigmas de Programación", Set.of(materia1));
    Materia materia3 = new Materia("Diseño de Sistemas", Set.of(materia2));
    Materia materia4 = new Materia("Mátematica 1", Set.of());
    Alumno matias = new Alumno("Matias", Set.of(materia1, materia2));
    Inscripcion unaInscripcion = new Inscripcion(matias, Set.of(materia3));


    @Test
    @DisplayName("Prueba se acepta la inscripción (1 materia)")
    public void aceptarInscripcion1() {
        Assertions.assertTrue(unaInscripcion.Aprobada());
    }

    @Test
    @DisplayName("Prueba se acepta la inscripción (2 materias) ")
    public void aceptarInscripcion2() {
        unaInscripcion.setMateriasInscritas(Set.of(materia3, materia4));

        Assertions.assertEquals(true, unaInscripcion.Aprobada());
    }

    @Test
    @DisplayName("Prueba falla la inscripción por falta de correlativas ")
    public void noAceptarInscripcion() {

        matias.setMateriasAprobadas(Set.of());

        Assertions.assertEquals(false, unaInscripcion.Aprobada());

    }

}
