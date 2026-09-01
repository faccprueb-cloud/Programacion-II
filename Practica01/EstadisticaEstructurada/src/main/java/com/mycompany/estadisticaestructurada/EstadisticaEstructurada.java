/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticaestructurada;
/**
 * Solucion Modular-Estructurada para calcular promedio y desviacion estandar.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
import java.util.Scanner;

public class EstadisticaEstructurada {

    // Método estático para calcular el promedio
    public static double promedio(double[] x) {
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
        }
        return suma / x.length;
    }

    // Método estático para calcular la desviación estándar
    public static double desviacion(double[] x) {
        double prom = promedio(x);
        double sumaDiferenciasCuadrado = 0;
        int n = x.length;
        
        for (int i = 0; i < n; i++) {
            sumaDiferenciasCuadrado += Math.pow(x[i] - prom, 2);
        }
        return Math.sqrt(sumaDiferenciasCuadrado / (n - 1));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextDouble();
        }

        // Formateamos a 2 y 5 decimales como en el ejemplo del PDF
        System.out.printf("El promedio es %.2f\n", promedio(numeros));
        System.out.printf("La desviacion estandard es %.5f\n", desviacion(numeros));
        
        entrada.close();
    }
}
