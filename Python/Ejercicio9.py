"""
-----------------------------------------------------------------------------------------------------------------
Problema

En este reto, se requiere que calcule e imprima la suma de los elementos de un array, teniendo en cuenta que algunos de esos enteros pueden ser bastante grandes.

Descripción de la función

Complete la función aVeryBigSum en el editor de abajo. Debe devolver la suma de todos los elementos del array.

aVeryBigSum tiene los siguientes parámetros:

int ar[n]: un array de enteros n.

Devuelve

long: la suma de todos los elementos del array

Formato de entrada

La primera línea de la entrada consiste en un número entero n.

La siguiente línea contiene n enteros separados por espacios contenidos en el array.

Formato de salida

Devuelve la suma de enteros de los elementos de la matriz.
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""
ar = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]


def aVeryBigSum(ar):
    return sum(ar)


print(aVeryBigSum(ar))
