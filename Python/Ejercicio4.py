"""
-----------------------------------------------------------------------------------------------------------------
Problema

El stub de código proporcionado lee un entero,n, desde STDIN. Para todos los enteros no negativos i < n, imprime i ** 2.

La lista de enteros no negativos que son menores que n = 3 es [0, 1, 2]. Imprime el cuadrado de cada número en una línea separada.
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

n = int(input())

for i in range(n):
    if n > 0:
        print(i ** 2)
