/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Cronometro;
/**
 * Clase Cronometro.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
public class Cronometro {

    /* Tiempo de inicio en milisegundos */
    private long inicia;

    /* Tiempo de finalizacion en milisegundos */
    private long finaliza;

    /* Construye un objeto cronometro inicializado a la hora actual */
    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }

    /* Retorna el tiempo de inicio */
    public long getInicia() {
        return this.inicia;
    }

    /* Retorna el tiempo de finalizacion */
    public long getFinaliza() {
        return this.finaliza;
    }

    /* Restablece el tiempo de inicio a la hora actual */
    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }

    /* Establece el tiempo de finalizacion a la hora actual */
    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }

    /* Retorna el tiempo transcurrido en milisegundos */
    public long lapsoDeTiempo() {
        return this.finaliza - this.inicia;
    }
}