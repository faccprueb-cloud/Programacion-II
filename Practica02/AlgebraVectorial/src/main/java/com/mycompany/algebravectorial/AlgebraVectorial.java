package com.mycompany.algebravectorial;
/**
 * Clase AlgebraVectorial para representar operaciones con vectores 3D
 * utilizando sobrecarga de funciones.
 *
 * @author Franz Alan Crespo Cussi
 * @version 1.0 15/09/2026
 */
public class AlgebraVectorial {

    private double a1;
    private double a2;
    private double a3;

    public AlgebraVectorial() {
        this.a1 = 0.0;
        this.a2 = 0.0;
        this.a3 = 0.0;
    }

    public AlgebraVectorial(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public AlgebraVectorial suma(AlgebraVectorial b) {
        return new AlgebraVectorial(this.a1 + b.a1, this.a2 + b.a2, this.a3 + b.a3);
    }

    public AlgebraVectorial resta(AlgebraVectorial b) {
        return new AlgebraVectorial(this.a1 - b.a1, this.a2 - b.a2, this.a3 - b.a3);
    }

    public AlgebraVectorial multiplicacion(double r) {
        return new AlgebraVectorial(r * this.a1, r * this.a2, r * this.a3);
    }

    public double longitud() {
        return Math.sqrt(Math.pow(this.a1, 2) + Math.pow(this.a2, 2) + Math.pow(this.a3, 2));
    }

    public double productoEscalar(AlgebraVectorial b) {
        return (this.a1 * b.a1) + (this.a2 * b.a2) + (this.a3 * b.a3);
    }

    public AlgebraVectorial productoVectorial(AlgebraVectorial b) {
        return new AlgebraVectorial(
            (this.a2 * b.a3) - (this.a3 * b.a2),
            (this.a3 * b.a1) - (this.a1 * b.a3),
            (this.a1 * b.a2) - (this.a2 * b.a1)
        );
    }

    public boolean esPerpendicular(AlgebraVectorial b) {
        return Math.abs(this.productoEscalar(b)) < 0.0001;
    }

    public static boolean esPerpendicular(AlgebraVectorial a, AlgebraVectorial b) {
        double longitudSuma = a.suma(b).longitud();
        double longitudResta = a.resta(b).longitud();
        return Math.abs(longitudSuma - longitudResta) < 0.0001;
    }

    public boolean esPerpendicular(double[] bArray) {
        AlgebraVectorial b = new AlgebraVectorial(bArray[0], bArray[1], bArray[2]);
        double longitudAB = this.resta(b).longitud();
        double longitudBA = b.resta(this).longitud();
        return Math.abs(longitudAB - longitudBA) < 0.0001;
    }

    public boolean esPerpendicular(double bx, double by, double bz) {
        AlgebraVectorial b = new AlgebraVectorial(bx, by, bz);
        double ladoIzquierdo = Math.pow(this.suma(b).longitud(), 2);
        double ladoDerecho = Math.pow(this.longitud(), 2) + Math.pow(b.longitud(), 2);
        return Math.abs(ladoIzquierdo - ladoDerecho) < 0.0001;
    }

    public boolean esParalela(AlgebraVectorial b) {
        AlgebraVectorial cruz = this.productoVectorial(b);
        return cruz.longitud() < 0.0001;
    }

    public boolean esParalela(AlgebraVectorial b, double r) {
        AlgebraVectorial rb = b.multiplicacion(r);
        return Math.abs(this.a1 - rb.a1) < 0.0001 && 
               Math.abs(this.a2 - rb.a2) < 0.0001 && 
               Math.abs(this.a3 - rb.a3) < 0.0001;
    }

    public AlgebraVectorial proyeccion(AlgebraVectorial b) {
        double escalar = this.productoEscalar(b) / Math.pow(b.longitud(), 2);
        return b.multiplicacion(escalar);
    }

    public double componente(AlgebraVectorial b) {
        return this.productoEscalar(b) / b.longitud();
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", this.a1, this.a2, this.a3);
    }
}
