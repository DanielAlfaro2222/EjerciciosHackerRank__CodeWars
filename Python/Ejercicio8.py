"""
-----------------------------------------------------------------------------------------------------------------
Problema

Alice y Bob crearon cada uno un problema para HackerRank. Un revisor califica los dos retos, otorgando puntos en una escala de 1 a 100 para tres categorías: claridad del problema, originalidad y dificultad.

La puntuación del reto de Alice es el triplete a = (a[0], a[1], a[2]), y la del reto de Bob es el triplete b = (b[0], b[1], b[2]).

La tarea consiste en encontrar sus puntos de comparación comparando a[0] con b[0], a[1] con b[1] y a[2] con b[2].

Si a[i] > b[i], Alice recibe 1 punto.
Si a[i] < b[i], Bob recibe 1 punto.
Si a[i] = b[i], ninguna de las dos personas recibe un punto.

La comparación de puntos es el total de puntos que ha ganado una persona.

Dados a y b, determina sus respectivos puntos de comparación.

Ejemplo

a = [1, 2, 3]
b = [3, 2, 1]

 * Para los elementos *0*, Bob recibe un punto porque a[0].
 * Para los elementos iguales a[1] y b[1], no se ganan puntos.
 * Finalmente, para los elementos 2, a[2] > b[2] por lo que Alice recibe un punto.

El array de retorno es [1, 1] con la puntuación de Alicia primero y la de Bob después.

Descripción de la función

Completa la función compareTriplets en el editor de abajo.

compareTriplets tiene los siguientes parámetros:

int a[3]: La puntuación del reto de Alice
int b[3]: La puntuación del reto de Bob

Devuelve

int[2]: La puntuación de Alice está en la primera posición y la de Bob en la segunda.
Formato de entrada

La primera línea contiene 3 enteros separados por espacios, a[0], a[1] y a[2], los respectivos valores del triplete a.
La segunda línea contiene 3 enteros separados por espacios, b[0], b[1] y b[2], los respectivos valores del triplete b.
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

a = [17, 28, 30]
b = [99, 16, 8]


def compareTriplets(a, b):
    alice = 0
    bob = 0
    for i in range(3):
        if a[i] > b[i]:
            alice += 1
        elif b[i] > a[i]:
            bob += 1
    return [alice, bob]


print(compareTriplets(a, b))
