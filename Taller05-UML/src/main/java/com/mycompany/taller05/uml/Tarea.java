/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller05.uml;

import java.time.LocalTime;

/**
 *
 * @author leoan
 */
public class Tarea extends ActividadSumativa {

    private LocalTime fechaDePublicacion;

    public Tarea(LocalTime fechaDePublicacion, String titulo, LocalTime fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public LocalTime getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalTime fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

}
