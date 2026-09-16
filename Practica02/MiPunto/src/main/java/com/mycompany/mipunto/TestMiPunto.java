package com.mycompany.mipunto;
/**
 * Clase principal. Cuyo objetivo es probar la ejecución de la clase MiPunto.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 15/09/2026
 */
public class TestMiPunto {

    public static void main(String[] args) {
        
        MiPunto p1 = new MiPunto();
        MiPunto p2 = new MiPunto(10.0, 30.5);

        System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");

        double dist = p1.distancia(p2);
        System.out.printf("La distancia entre Punto 1 y Punto 2 es: %.4f\n", dist);
    }
}
