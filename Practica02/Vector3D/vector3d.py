"""
Clase Vector3D para operaciones de Álgebra Vectorial con Sobrecarga de Operadores.

@author Franz Alan Crespo Cussi
@version 1.0 15/09/2026
"""
import math

class Vector3D:
    def __init__(self, a1=0.0, a2=0.0, a3=0.0):
        self.__a1 = float(a1)
        self.__a2 = float(a2)
        self.__a3 = float(a3)

    def __add__(self, b):
        return Vector3D(self.__a1 + b.__a1, self.__a2 + b.__a2, self.__a3 + b.__a3)

    def __mul__(self, b):
        if isinstance(b, (int, float)):
            return Vector3D(self.__a1 * b, self.__a2 * b, self.__a3 * b)
        elif isinstance(b, Vector3D):
            return (self.__a1 * b.__a1) + (self.__a2 * b.__a2) + (self.__a3 * b.__a3)
            
    def __rmul__(self, r):
        return self.__mul__(r)

    def __abs__(self):
        return math.sqrt(self.__a1**2 + self.__a2**2 + self.__a3**2)

    def normal(self):
        longitud = abs(self)
        if longitud == 0:
            return Vector3D(0, 0, 0)
        return Vector3D(self.__a1 / longitud, self.__a2 / longitud, self.__a3 / longitud)

    def __xor__(self, b):
        return Vector3D(
            (self.__a2 * b.__a3) - (self.__a3 * b.__a2),
            (self.__a3 * b.__a1) - (self.__a1 * b.__a3),
            (self.__a1 * b.__a2) - (self.__a2 * b.__a1)
        )

    def __str__(self):
        return "({:.2f}, {:.2f}, {:.2f})".format(self.__a1, self.__a2, self.__a3)