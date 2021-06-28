"""
-----------------------------------------------------------------------------------------------------------------
Problema

El stub de código incluido leerá un entero,n , desde STDIN.

Sin utilizar ningún método de cadena, intente imprimir lo siguiente:

123....n

Ejemplo:

n = 5

12345
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

n = int(input())

for i in range(1, n + 1):
    print(i, end='')
