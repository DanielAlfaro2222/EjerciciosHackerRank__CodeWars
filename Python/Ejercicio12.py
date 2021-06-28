"""
-----------------------------------------------------------------------------------------------------------------
Problema

Aprendamos a comprender las listas. Se te dan tres enteros X,Y y Z que representan las dimensiones de un cuboide junto con un entero N, Imprime una lista de todas las coordenadas posibles dadas por (I,J,K) en una cuadrícula 3D donde la suma de I + J + K no es igual a N, Aquí, 0 <= I <= X; 0 <= J <= Y; 0 <= K <= Z. Por favor, utiliza comprensiones de lista en lugar de bucles múltiples, como ejercicio de aprendizaje.

Ejemplo

X = 1
Y = 1
Z = 2
N = 3

Todas las permutaciones de [I, J, K] son:

[ [0,0,0], [0,0,1], [0,0,2], [0,1,0], [0,1,1], [0,1,2], [1,0,0], [1,0,1], [1,0,2], [1,1,0], [1,1,1], [1,1,2] ]

Imprime un array con los elementos que no suman N = 3.

[ [0,0,0], [0,0,1], [0,0,2], [0,1,0], [0,1,1], [1,0,0], [1,0,1], [1,1,0], [1,1,2] ]

Formato de entrada

Cuatro enteros X,Y,Z y N, cada uno en una línea distinta.

Restricciones

Imprimir la lista en orden lexicográfico creciente.

Traducción realizada con la versión gratuita del traductor www.DeepL.com/Translator
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion

1.Cada numero presente en la lista compuesta, debe ser menor a n.
"""

x = int(input())
y = int(input())
z = int(input())
n = int(input())

# Solucion usando comprension de listas(usando programacion funcional)
a = [[i, c, b] for i in range(x + 1) for c in range(y + 1)
     for b in range(z + 1) if i + c + b != n]
print(a)

# Solucion usando bucles anidados y una lista(usando programacion estructural o imperativa)
lista = []
for a in range(x + 1):
    for b in range(y + 1):
        for c in range(z + 1):
            if a + b + c != n:
                lista.append([a, b, c])
print(lista)
