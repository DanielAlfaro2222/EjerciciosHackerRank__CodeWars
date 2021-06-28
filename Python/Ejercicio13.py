"""
-----------------------------------------------------------------------------------------------------------------
Problema

Dada la hoja de puntuaciones de los participantes en el Día del Deporte de su Universidad, se le pide que encuentre la puntuación del segundo clasificado. Se te dan las puntuaciones. Guárdalas en una lista y encuentra la puntuación del subcampeón.

Formato de entrada

La primera línea contiene n. La segunda línea contiene una matriz A[ ] de n enteros separados por un espacio.

Formato de salida

Imprime la puntuación del subcampeón.

Ejemplo:

La lista dada es [2,3,6,6,5]. La puntuación máxima es 6, la segunda máxima es 5. Por lo tanto, imprimimos 5 como la puntuación del subcampeón.

"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

# Solucion que no funciona en la pagina
n = int(input())
arr = list(map(int, input().split()))
NumeroMayor = max(arr)
ListaNumeros = list(filter(lambda x: x < NumeroMayor, arr))
SubCampeon = max(ListaNumeros)
print(SubCampeon)

# Solucion alternativa
n = int(input())
arr = list(map(int, input().split()))
arr = set(arr)
arr = list(arr)
arr.pop(arr.index(max(arr)))
print(max(arr))
