/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller05.uml;

import java.util.ArrayList;

/**
 *
 * @author leoan
 */
public class Profesor extends PersonalAcademico {

    private ArrayList<Curso> cursosACargo;

    public Profesor(ArrayList<Curso> cursosACargo, String usuario, String contraseña, String nombre, String apellido, ArrayList<Incidente> incidentes) {
        super(usuario, contraseña, nombre, apellido, incidentes);
        this.cursosACargo = cursosACargo;
    }

    public ArrayList<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(ArrayList<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {

    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {

    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {

    }

    public void crearNuevoForo(Foro foro) {

    }

}
