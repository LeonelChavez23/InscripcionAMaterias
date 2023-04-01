package clases;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Alumno {

    private String nombre;
    private String apellido;
    // lista de materias firmadas y aprobadas que tiene un alumno
    private List<Materia> materiasFirmadas = new ArrayList<Materia>();
    private List<Materia> materiasAprobadas = new ArrayList<Materia>();

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //metodo que verifica si el alumno tiene una materia firmada en su lista
    public boolean tieneMateriaFirmada(Materia materia) {
            return materiasFirmadas.stream().anyMatch(m -> m.getNombre().equals(materia.getNombre()));
    }
    //metodo que verifica si el alumno tiene una materia aprobada en su lista
    public boolean tieneMateriaAprobada(Materia materia){
            return materiasAprobadas.stream().anyMatch(m->m.getNombre().equals(materia.getNombre()));
    }

    public boolean agregarMateriaAListaFirmada(Materia materia){
        return materiasFirmadas.add(materia);
    }

    public boolean agregarMateriaAListaFirmada(List <Materia> materias){
        return materiasFirmadas.addAll(materias);
    }

    public boolean agregarMateriaAListaAprobada(Materia materia){
        return materiasAprobadas.add(materia);
    }

    public boolean agregarMateriaAListaAprobada(List <Materia> materias){
        return materiasAprobadas.addAll(materias);
    }

    public void mostrarDatosAlumno(){
        System.out.println("Nombre : " + nombre + ", Apellido : " + apellido);
        System.out.println("**************************************************************");
        System.out.println("Materias que tiene firmadas : ");
        materiasFirmadas.stream().forEach(m-> System.out.println(m));
        System.out.println("**************************************************************");
        System.out.println("Materias que tiene aprobadas ");
        materiasAprobadas.stream().forEach(m-> System.out.println(m));
        System.out.println("**************************************************************");

    }



}
