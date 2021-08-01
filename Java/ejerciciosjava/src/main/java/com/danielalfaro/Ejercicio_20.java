package com.danielalfaro;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_20 {

    public static int minimumDistances(List<Integer> a) {

        List<Integer> diferenciaIndices = new ArrayList<Integer>();

        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) == a.get(j)) {
                    diferenciaIndices.add(Math.abs(i - j));
                }
            }
        }

        if (diferenciaIndices.size() == 0) {
            return -1;
        } else {

            int distanciaMinima = diferenciaIndices.get(0);

            for (Integer integer : diferenciaIndices) {
                if (integer < distanciaMinima) {
                    distanciaMinima = integer;
                }
            }

            return distanciaMinima;
        }
    }

    public static void main(String[] args) {

        // La distancia entre dos valores del array es el número de índices que los
        // separan. Dado A, encontrar la distancia mínima entre cualquier par de
        // elementos iguales en el array. Si no existe tal valor, devuelve -1.

        // Ejemplo

        // a = [3, 2, 1, 2, 3]

        // Hay dos pares de valores iguales: 3 y 2. Los índices de los 3 son I = 0 y J =
        // 4, por lo que su distancia es D[I,J] = |J - I| = 4. Los índices de los 2 son
        // I = 1 y J = 3, por lo que su distancia es D[I,J] = |J - I| = 2 La distancia
        // mínima es 2.

        // Descripción de la función

        // Completa la función minimumDistances en el editor de abajo.

        // minimumDistances tiene los siguientes parámetros:

        // * int a[n]: un array de enteros

        // Devuelve

        // * int: la distancia mínima encontrada o -1 si no hay elementos coincidentes

        // Formato de entrada

        // La primera línea contiene un número entero N, el tamaño de la matriz A.

        // La segunda línea contiene N enteros separados por espacios A[I].

        // Formato de salida

        // Imprime un único entero que denota el mínimo D[I,J] en A. Si no existe tal
        // valor, imprime -1.

        // Ejemplo de entrada

        // Función STDIN
        // ----- --------
        // 6 arr[] tamaño n = 6
        // 7 1 3 4 1 7 arr = [7, 1, 3, 4, 1, 7]

        // Ejemplo de salida

        // 3

        // Explicación

        // Hay que tener en cuenta dos pares:

        // * A[1] y A[4] son ambos 1, por lo que D[1,4] = |1-4| = 3.

        // * A[0] y A[5] son ambos 7, por lo que D[0,5] = |0-5| = 5.

        List<Integer> a = new ArrayList<Integer>();
        a.add(7);
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(7);

        System.out.println(minimumDistances(a));
    }
}
