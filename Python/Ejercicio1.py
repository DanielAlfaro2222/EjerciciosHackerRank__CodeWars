"""
----------------------------------------------------------------------------------------------------------------
Problema

Dado un número entero, n, realice las siguientes acciones condicionales:

* Si n es impar, imprimir Weird
* Si n es par y está en el rango inclusivo de 2 a 5, imprime Not Weird
* Si n es par y está en el rango inclusivo de 6 a 20, imprime Weird
* Si n es par y mayor que 20, imprime Not Weird

"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

n = int(input())

if n % 2 != 0:
    print("Weird")
else:
    if n % 2 == 0 and (n >= 2 and n <= 5):
        print("Not Weird")
    elif n % 2 == 0 and (n >= 6 and n <= 20):
        print("Weird")
    elif n % 2 == 0 and n > 20:
        print("Not Weird")
