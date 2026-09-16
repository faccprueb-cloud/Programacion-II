package com.mycompany.algebravectorial;

/**
 * Clase principal para probar la sobrecarga de funciones de Álgebra Vectorial.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 15/09/2026
 */
public class TestAlgebraVectorial {

    public static void main(String[] args) {
        AlgebraVectorial v1 = new AlgebraVectorial(1, 0, 0); 
        AlgebraVectorial v2 = new AlgebraVectorial(0, 1, 0); 
        AlgebraVectorial v3 = new AlgebraVectorial(2, 0, 0); 

        System.out.println("Vector 1 (v1): " + v1);
        System.out.println("Vector 2 (v2): " + v2);
        System.out.println("Vector 3 (v3): " + v3);
        
        System.out.println("--------------------------------------------------");
        System.out.println("Pruebas de Perpendicularidad (v1 y v2):");
        System.out.println("Regla C (a.b = 0): " + v1.esPerpendicular(v2));
        System.out.println("Regla A (|a+b|=|a-b|): " + AlgebraVectorial.esPerpendicular(v1, v2));
        System.out.println("Regla B (|a-b|=|b-a|): " + v1.esPerpendicular(new double[]{0, 1, 0}));
        System.out.println("Regla D (|a+b|^2 = |a|^2+|b|^2): " + v1.esPerpendicular(0, 1, 0));
        
        System.out.println("--------------------------------------------------");
        System.out.println("Pruebas de Paralelismo (v1 y v3):");
        System.out.println("Regla F (a x b = 0): " + v1.esParalela(v3));
        System.out.println("Regla E (a = rb) con r=0.5: " + v1.esParalela(v3, 0.5));

        System.out.println("--------------------------------------------------");
        AlgebraVectorial v4 = new AlgebraVectorial(3, 4, 0);
        AlgebraVectorial v5 = new AlgebraVectorial(5, 0, 0);
        
        System.out.println("Proyección de " + v4 + " sobre " + v5 + ": " + v4.proyeccion(v5));
        System.out.printf("Componente de " + v4 + " en " + v5 + ": %.2f\n", v4.componente(v5));
    }
}