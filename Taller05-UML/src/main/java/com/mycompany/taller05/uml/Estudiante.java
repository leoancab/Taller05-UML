package com.mycompany.taller05.uml;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leoan
 */
public class Estudiante extends PersonalAcademico {

    public Estudiante(String usuario, String contraseña, String nombre, String apellido, ArrayList<Incidente> incidentes) {
        super(usuario, contraseña, nombre, apellido, incidentes);
    }

    public void solicitarInscripcionCurso(Curso curso) {

    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {

    }

}
