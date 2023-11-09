/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller05.uml;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author leoan
 */
public class Curso {

    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private ArrayList<Estudiante> estudiantesInscritos;
    private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion;
    private Profesor responsable;
    private ArrayList<Foro> foros;
    private java.util.Collection actividadesSumativas = new java.util.TreeSet();

    public Curso(String id, String nombre, boolean estadoDisponible, ArrayList<Estudiante> estudiantesInscritos, ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion, Profesor responsable, ArrayList<Foro> foros) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.estudiantesInscritos = estudiantesInscritos;
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
        this.responsable = responsable;
        this.foros = foros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public ArrayList<Estudiante> getEstudiantesEnEsperaDeInscripcion() {
        return estudiantesEnEsperaDeInscripcion;
    }

    public void setEstudiantesEnEsperaDeInscripcion(ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }

    public Profesor getResponsable() {
        return responsable;
    }

    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }

    public ArrayList<Foro> getForos() {
        return foros;
    }

    public void setForos(ArrayList<Foro> foros) {
        this.foros = foros;
    }

    public Collection getActividadesSumativas() {
        return actividadesSumativas;
    }

    public void setActividadesSumativas(Collection actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }

}
