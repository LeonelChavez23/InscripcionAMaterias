package clases;

import lombok.Data;

import java.util.*;

@Data
public class Materia {

    private String nombre;
    // listas de materias que debe tener firmadas un alumno para poder cursar una materia
    private List<Materia> materiasCorrelativasFirmadas = new ArrayList<Materia>();
    // listas de materias que debe tener aprobada un alumno para poder cursar una materia
    private List<Materia> materiasCorrelativasAprobadas = new ArrayList<Materia>();

    public Materia(String nombre) {
        this.nombre = nombre;
    }


    public boolean agregarMateriaAListaFirmada(Materia materia) {
        return materiasCorrelativasFirmadas.add(materia);
    }

    public boolean agregarMateriaAListaFirmada(List<Materia> materias) {
        return materiasCorrelativasFirmadas.addAll(materias);
    }


    public boolean agregarMateriaAListaAprobada(Materia materia) {
        return materiasCorrelativasAprobadas.add(materia);
    }

    public boolean agregarMateriaAListaAprobada(List<Materia> materias) {
        return materiasCorrelativasAprobadas.addAll(materias);
    }


    @Override
    public String toString() {
        return "Materia : " + this.nombre;
    }

    public void mostrarMateriasCorrelativas() {
        System.out.println("**************************************************************");
        System.out.println("Materias que debe tener firmada para cursar " + this.nombre);
        materiasCorrelativasFirmadas.stream().forEach(m -> System.out.println(m));
        System.out.println("**************************************************************");
        System.out.println("Materias que debe tener aprobadas para cursar " + this.nombre);
        materiasCorrelativasAprobadas.stream().forEach(m -> System.out.println(m));
        System.out.println("**************************************************************");
    }
}
