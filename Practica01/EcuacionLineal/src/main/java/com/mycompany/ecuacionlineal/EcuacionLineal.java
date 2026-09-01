/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecuacionlineal;
/**
 * Clase EcuacionLineal para un sistema de ecuaciones de 2x2.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
public class EcuacionLineal {
    // a) Atributos privados
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // b) Constructor con argumentos
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // c) Método que verifica si el denominador no es cero
    public boolean tieneSolucion() {
        return (this.a * this.d - this.b * this.c) != 0;
    }

    // d) Métodos para obtener X y Y usando la regla de Cramer
    public double getX() {
        return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
    }

    public double getY() {
        return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
    }
}
