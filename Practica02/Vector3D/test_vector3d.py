"""
Programa de prueba de Álgebra Vectorial.

@author Franz Alan Crespo Cussi
@version 1.0 15/09/2026
"""
from vector3d import Vector3D

if __name__ == "__main__":
    a = Vector3D(2, 0, 1)
    b = Vector3D(1, -1, 3)

    print("Vector a =", a)
    print("Vector b =", b)

    print("Suma (a + b) =", a + b)

    print("Multiplicación escalar (3 * a) =", 3 * a)

    print("Longitud de a (|a|) = {:.2f}".format(abs(a)))

    print("Normal del vector a =", a.normal())

    print("Producto escalar (a * b) =", a * b)

    print("Producto vectorial (a ^ b) =", a ^ b)