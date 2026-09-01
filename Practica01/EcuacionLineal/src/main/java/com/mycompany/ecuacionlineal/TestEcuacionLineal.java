/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecuacionlineal;
/**
 * Clase principal. Cuyo objetivo es probar la ejecucion de la clase EcuacionLineal.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
import java.util.Scanner;

public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar los valores al usuario
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        double e = entrada.nextDouble();
        double f = entrada.nextDouble();

        // Crear el objeto EcuacionLineal
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

        // Verificar si tiene solución y mostrar resultados
        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX() + ", y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
        
        entrada.close();
    }
}