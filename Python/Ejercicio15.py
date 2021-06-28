"""
-----------------------------------------------------------------------------------------------------------------
Problema

El stub de código proporcionado leerá un diccionario que contiene pares clave/valor de nombre:[notas] para una lista de estudiantes. Imprime la media de la matriz de marcas para el nombre del estudiante proporcionado, mostrando 2 lugares después del decimal.

Ejemplo
'alfa': [ 20, 30, 40 ]
'beta': [ 30, 50, 70 ]

query_name = "beta"

El nombre de la consulta es "beta". La puntuación media de beta es (30 + 50 + 70) / 3 = 50,0.

Formato de entrada

La primera línea contiene el número entero , el número de registros de los estudiantes. Las siguientes n líneas contienen los nombres y las notas obtenidas por un alumno, cada valor separado por un espacio. La última línea contiene query_name, el nombre de un estudiante a consultar.

Formato de salida

Imprime una línea: La media de las notas obtenidas por el alumno en cuestión, corregida con 2 decimales.
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

n = int(input())
student_marks = {}
for _ in range(n):
    name, *line = input().split()
    scores = list(map(float, line))
    student_marks[name] = scores
query_name = input()

print(format(round(sum(student_marks[query_name]) / 3, 2), ".2f"))
