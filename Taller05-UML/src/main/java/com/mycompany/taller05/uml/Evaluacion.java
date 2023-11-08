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
public class Evaluacion extends ActividadSumativa {

    private int limiteDeTiempo;

    public Evaluacion(int limiteDeTiempo, String titulo, LocalTime fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    public int getLimiteDeTiempo() {
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }

}
