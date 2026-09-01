/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.Cronometro;
/**
 * Clase principal. Cuyo objetivo es probar la ejecucion de la clase Cronometro.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
import java.util.Random;

public class TestCronometro {
    
    // Método de ordenación por selección
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Intercambiar el elemento mínimo encontrado con el primer elemento
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // 1. Crear arreglo de 100,000 números
        int[] numeros = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(1000000); // Números aleatorios hasta 1,000,000
        }

        // 2. Instanciar el cronómetro
        Cronometro cronometro = new Cronometro();
        System.out.println("Ordenando 100,000 numeros... Esto puede tardar unos segundos.");

        // 3. Iniciar el cronómetro, ordenar y detener
        cronometro.inicia();
        selectionSort(numeros);
        cronometro.detener();

        // 4. Mostrar el resultado
        System.out.println("Tiempo de ejecucion: " + cronometro.lapsoDeTiempo() + " milisegundos.");
    }
}
