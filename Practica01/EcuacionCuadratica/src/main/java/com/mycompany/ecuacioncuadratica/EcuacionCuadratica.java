/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecuacioncuadratica;
/**
 * Clase EcuacionCuadratica para la ecuacion ax^2 + bx + c = 0.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
public class EcuacionCuadratica {
    // a) Atributos privados para los coeficientes
    private double a;
    private double b;
    private double c;

    // b) Constructor
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // c) Método para obtener el discriminante
    public double getDiscriminante() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    // d) Métodos para obtener las raíces
    public double getRaiz1() {
        if (this.getDiscriminante() < 0) {
            return 0;
        }
        return (-this.b + Math.sqrt(this.getDiscriminante())) / (2 * this.a);
    }

    public double getRaiz2() {
        if (this.getDiscriminante() < 0) {
            return 0;
        }
        return (-this.b - Math.sqrt(this.getDiscriminante())) / (2 * this.a);
    }
}
