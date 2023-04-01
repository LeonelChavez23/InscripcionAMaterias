package clases;

import lombok.Data;

@Data
public class Inscripcion {

    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    //metodo que indica si dado un alumno y una materia, se aprueba o no la inscripcion
    public boolean aprobada(){
        return verificarMateriasFirmadas() && verificarMateriasAprobadas();
    }

    //metodo que indica si el alumno tiene firmadas las materias que correlativas a la materia que quiere inscribirse
    private boolean verificarMateriasFirmadas(){
        return materia.getMateriasCorrelativasFirmadas().stream().allMatch(m->alumno.tieneMateriaFirmada(m)||alumno.tieneMateriaAprobada(m));
    }
    //metodo que indica si el alumno tiene aprobadas las materias que correlativas a la materia que quiere inscribirse
    private boolean verificarMateriasAprobadas(){
        return materia.getMateriasCorrelativasAprobadas().stream().allMatch(m->alumno.tieneMateriaAprobada(m));
    }

}
