/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecuacioncuadratica;
import java.util.Scanner;
/**
 * Clase principal. Cuyo objetivo es probar la ejecucion de la clase EcuacionCuadratica.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 30/08/2026
 *
 */
public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar los valores al usuario
        System.out.print("Ingrese a, b, c: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        // Crear el objeto EcuacionCuadratica
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        double discriminante = ecuacion.getDiscriminante();

        // Evaluar el discriminante para mostrar las raíces correspondientes
        if (discriminante > 0) {
            // Usamos printf para redondear a 5 o 6 decimales como en el ejemplo del PDF
            System.out.printf("La ecuacion tiene dos raices %f y %f\n", ecuacion.getRaiz1(), ecuacion.getRaiz2());
        } else if (discriminante == 0) {
            // Casteamos a int si queremos que se vea exactamente como el ejemplo (ej: -1 en lugar de -1.0)
            // o simplemente mostramos el valor flotante formateado.
            System.out.println("La ecuacion tiene una raiz " + (int) ecuacion.getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
        
        entrada.close();
    }
}