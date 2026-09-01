/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticaestructurada;
/**
 * Clase principal. Cuyo objetivo es probar la ejecucion de la clase Estadistica.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
import java.util.Scanner;

public class TestEstadistica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextDouble();
        }

        // Instanciamos el objeto Estadistica pasándole los datos
        Estadistica estadistica = new Estadistica(numeros);

        System.out.printf("El promedio es %.2f\n", estadistica.promedio());
        System.out.printf("La desviacion estandard es %.5f\n", estadistica.desviacion());
        
        entrada.close();
    }
}
