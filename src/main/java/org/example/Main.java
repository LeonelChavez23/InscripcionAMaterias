package org.example;

import clases.Alumno;
import clases.Inscripcion;
import clases.Materia;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //creo dos alumnos
        Alumno a1 = new Alumno("Juan","Garcia");
        //Alumno a2  = new Alumno("Pepe","Diaz");
        //Creo las materias AM1,AM2,AGA Y MS
        Materia m1 = new Materia("Analisis Matematico 1");
        Materia m2 = new Materia("Algebra y Geometria");
        Materia m3 = new Materia("Analisis Matematico 2");
        Materia m4 = new Materia("Matematica Superior");

        //para AM2 se pide que se tenga firmada/cursada las materias de AM1 y AGA
        m3.agregarMateriaAListaFirmada(List.of(m1,m2));
        //para MS se pide que se tenga firmada/cursada AM2
        //para MS se pide que se tenga aprobada AM1 y AGA
        m4.agregarMateriaAListaFirmada(m3);
        m4.agregarMateriaAListaAprobada(List.of(m1,m2));

        //Al alumno a1 se le añade como materias aprobadas AM1 y AGA
        // tambien AM2 como materia firmada
        a1.agregarMateriaAListaAprobada(List.of(m1,m2));
        a1.agregarMateriaAListaFirmada(m3);
        a1.mostrarDatosAlumno();

        Inscripcion i = new Inscripcion(a1,m4);
        if(i.aprobada()){
            System.out.println("El alumno puede cursar " + i.getMateria());
        }else{
            System.out.println("El alumno no puede cursar " + i.getMateria());
        }

    }
}