"""
-----------------------------------------------------------------------------------------------------------------
Problema

Dados los nombres y las calificaciones de cada estudiante en una clase de N estudiantes, almacénelos en una lista anidada e imprima el nombre de cualquier estudiante que tenga la segunda calificación más baja.

Nota: Si hay varios estudiantes con la segunda calificación más baja, ordene sus nombres alfabéticamente e imprima cada nombre en una nueva línea.

Hay estudiantes en esta clase cuyos nombres y calificaciones se reúnen para construir la siguiente lista:

python alumnos = [['Harry', 37,21], ['Berry', 37,21], ['Tina', 37,2], ['Akriti', 41], ['Harsh', 39]]

La nota más baja de 37,2 pertenece a Tina. La segunda nota más baja de 37,21 pertenece tanto a Harry como a Berry, así que ordenamos sus nombres alfabéticamente e imprimimos cada nombre en una nueva línea

Traducción realizada con la versión gratuita del traductor www.DeepL.com/Translator
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

Lista = [[input(), float(input())] for _ in range(int(input()))]

NotaMenor = Lista[-1]

for elemento in Lista:
    if elemento[-1] < NotaMenor[-1]:
        NotaMenor = elemento

ListaNotasMenores = list(filter(lambda x: x[-1] != NotaMenor[-1], Lista))

SegundaNotaMenor = [Lista[-1]]
for elemento in ListaNotasMenores:
    if elemento[-1] < SegundaNotaMenor[0][-1]:
        SegundaNotaMenor = [elemento]

ListaNotasMenores = list(
    filter(lambda x: x[-1] == SegundaNotaMenor[0][-1], ListaNotasMenores))

ListadoNombres = list()
for elemento in ListaNotasMenores:
    ListadoNombres.append(elemento[0])

ListadoNombres.sort()

for estudiante in ListadoNombres:
    print(estudiante)
