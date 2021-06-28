"""
-----------------------------------------------------------------------------------------------------------------
Problema

Dada una matriz cuadrada, calcula la diferencia absoluta entre las sumas de sus diagonales.

Por ejemplo, la matriz cuadrada arr se muestra a continuación:

1 2 3
4 5 6
9 8 9 

Suma diagonal opuesta => 3 + 5 + 9 = 17
Suma diagonal => 1 + 5 + 9 = 15

Diferencia absoluta de ambas diagonales = abs(diagonal - diagonal opuesta)
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

arr = [1, 2, 3, 4, 5, 6, 9, 8, 9]


def diagonalDifference(arr):
    Diagonal = []
    DiagonalContraria = []
    a = 0
    for i in range(0, len(arr), 3):
        Diagonal.append(arr[i + a])
        a += 1
    for i in range(2, len(arr) - 2, 2):
        DiagonalContraria.append(arr[i])
    return abs(sum(Diagonal) - sum(DiagonalContraria))


print(diagonalDifference(arr))
