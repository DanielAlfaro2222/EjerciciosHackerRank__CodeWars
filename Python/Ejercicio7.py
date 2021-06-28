"""
-----------------------------------------------------------------------------------------------------------------
Problema

Dada una matriz de enteros, halla la suma de sus elementos.

Por ejemplo, si la matriz ar = [1,2,3], 1 + 2 + 3 = 6, entonces devuelve 6.

Descripción de la función

Complete la función simpleArraySum en el editor de abajo. Debe devolver la suma de los elementos del array como un entero.

simpleArraySum tiene los siguientes parámetros:

ar: un array de enteros

La primera línea contiene un entero,n, que denota el tamaño del array.

La segunda línea contiene n enteros separados por espacios que representan los elementos de la matriz.

"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

cantidad = int(input("Ingrese la cantidad de elementos del array: "))

Array = [int(input("Ingrese un numero: ")) for i in range(cantidad)]


def simpleArraySum(ar):
    return sum(ar)


print(simpleArraySum(Array))
