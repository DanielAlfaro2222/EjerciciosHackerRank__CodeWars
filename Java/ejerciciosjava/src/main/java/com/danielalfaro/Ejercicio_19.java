package com.danielalfaro;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_19 {

    public static int beautifulTriplets(int d, List<Integer> arr) {

        // Cantidad de tripletas perfectas que cumplen la condicion
        int cantidadBellosTriples = 0;

        for (int i = 0; i < arr.size(); i++) {

            List<Integer> Tripleta = new ArrayList<Integer>();

            Tripleta.add(arr.get(i));

            for (int j = i + 1; j < arr.size(); j++) {

                int resultado = Tripleta.get(Tripleta.size() - 1) - arr.get(j);

                if (Tripleta.size() < 3 && Math.abs(resultado) == d) {
                    Tripleta.add(arr.get(j));
                }
            }

            if (Tripleta.size() == 3) {

                int num1 = Tripleta.get(0);
                int num2 = Tripleta.get(1);
                int num3 = Tripleta.get(2);

                if (Math.abs(num3 - num2) == d && Math.abs(num2 - num1) == d) {
                    cantidadBellosTriples++;
                }
            }
        }

        return cantidadBellosTriples;
    }

    public static void main(String[] args) {

        // Dada una secuencia de enteros A, un triplete (A[I], A[J], A[K]) es bello si:

        // * I < J < K
        // * A[J] - A[I] = A[K] - A[J] = D

        // Dada una secuencia creciente de enteros y el valor de D, cuente el número de
        // tripletas bellas en la secuencia.

        // Ejemplo

        // arr = [2,2,3,4,5]

        // d = 1

        // Hay tres tripletes hermosos, por índice: [I,J,K] = [0,2,3], [1,2,3],[2,3,4].
        // Para probar el primer triplete, arr[J] - arr[I] = 3 - 2 = 1 y arr[K] - arr[J]
        // = 4 - 3 = 1.

        // Descripción de la función

        // Completa la función beautifulTriplets en el editor de abajo.

        // beautifulTriplets tiene los siguientes parámetros:

        // * int d: el valor a igualar
        // * int arr[n]: la secuencia, ordenada de forma ascendente

        // Devuelve

        // * int: el número de hermosas tripletas

        // Formato de entrada

        // La primera línea contiene 2 enteros separados por espacios, N y D, la
        // longitud de la secuencia y la diferencia de belleza.

        // La segunda línea contiene N enteros separados por espacios arr[I]

        // Ejemplo de entrada

        // STDIN | Function
        // ----- | --------
        // 7 3 | arr[] size n = 7, d = 3
        // 1 2 4 5 7 8 10 | arr = [1, 2, 4, 5, 7, 8, 10]

        // Ejemplo de salida

        // 3

        // Explicación

        // Hay muchas tripletas posibles (A[I], A[J], A[K]), pero nuestras únicas
        // tripletas bonitas son (1,4,7), (4, 7, 10) y (2,5,8) por valor, no por índice.
        // Consulte las ecuaciones que aparecen a continuación:

        // 7 - 4 = 4 - 1 = 3 = d
        // 10 - 7 = 7 - 4 = 3 = d
        // 8 - 5 = 5 - 2 = 3 = d

        // Recordemos que un triplete bello satisface la siguiente relación de
        // equivalencia: arr[J] - arr[I] = arr[K] - arr[J] = d donde I < J < K

        // Caso de prueba 1
        // List<Integer> arr = new ArrayList<Integer>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(4);
        // arr.add(5);
        // arr.add(7);
        // arr.add(8);
        // arr.add(10);

        // System.out.println(beautifulTriplets(3, arr));

        // Caso de prueba 2
        // List<Integer> arr = new ArrayList<Integer>();
        // arr.add(2);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);

        // System.out.println(beautifulTriplets(1, arr));

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(6);
        arr.add(7);
        arr.add(7);
        arr.add(8);
        arr.add(10);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(19);

        System.out.println(beautifulTriplets(3, arr));
    }
}
