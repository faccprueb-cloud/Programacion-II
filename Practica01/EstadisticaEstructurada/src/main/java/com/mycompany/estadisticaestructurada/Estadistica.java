/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticaestructurada;
/**
 * Clase Estadistica.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
public class Estadistica {
    // Atributo privado
    private double[] datos;

    // Constructor
    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    // Método para obtener el promedio
    public double promedio() {
        double suma = 0;
        for (int i = 0; i < this.datos.length; i++) {
            suma += this.datos[i];
        }
        return suma / this.datos.length;
    }

    // Método para obtener la desviación estándar
    public double desviacion() {
        double prom = this.promedio(); // Llamamos al método interno
        double sumaDiferenciasCuadrado = 0;
        int n = this.datos.length;
        
        for (int i = 0; i < n; i++) {
            sumaDiferenciasCuadrado += Math.pow(this.datos[i] - prom, 2);
        }
        return Math.sqrt(sumaDiferenciasCuadrado / (n - 1));
    }
}
