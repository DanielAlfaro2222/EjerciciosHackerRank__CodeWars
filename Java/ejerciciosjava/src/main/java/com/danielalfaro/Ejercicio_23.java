package com.danielalfaro;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_23 {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        // Contador del total de parejas que cumplen las siguientes dos condiciones
        // 1).De la pareja de numeros, el primer valor debe ser menor al segundo valor.
        // 2). La suma de la pareja debe ser divisible por k.
        int CantidadPares = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int num1 = ar.get(i); // Numero que vamos a comparar con el numero del segundo for
                int num2 = ar.get(j);

                if (i < j) {

                    int resultado = (num1 + num2) % k;

                    if (resultado == 0) {
                        CantidadPares++;
                    }
                }
            }
        }

        return CantidadPares;
    }

    public static void main(String[] args) {

        // Dada una matriz de enteros y un entero positivo K, determinar el número de
        // pares (I,J) en los que I < J y ar[I] + ar[J] es divisible por K.

        // Ejemplo

        // ar = [1,2,3,4,5,6]

        // k = 5

        // Tres pares cumplen los criterios: [1,4], [2,3] y [4, 6].

        // Descripción de la función

        // Complete la función divisibleSumPairs en el editor de abajo.

        // divisibleSumPairs tiene los siguientes parámetros:

        // * int n: la longitud del array ar
        // * int ar[n]: una matriz de enteros
        // * int k: el divisor de enteros

        // Devuelve
        // - int: el número de pares

        // Formato de entrada

        // La primera línea contiene 2 enteros separados por espacios, N y K.
        // La segunda línea contiene N enteros separados por espacios, cada uno de los
        // cuales es un valor de arr[I]

        // Ejemplo de entrada

        // Función STDIN
        // ----- --------
        // 6 3 n = 6, k = 3
        // 1 3 2 6 1 2 ar = [1, 3, 2, 6, 1, 2]

        // Ejemplo de salida

        // 5

        // Explicación

        // Aquí están los 5 pares válidos cuando K = 3.

        // * (0,2) -> ar[0] + ar[2] = 1 + 2 = 3.
        // * (0,5) -> ar[0] + ar[5] = 1 + 2 = 3.
        // * (1,3) -> ar[1] + ar[3] = 3 + 6 = 9.
        // * (2,4) -> ar[2] + ar[4] = 2 + 1 = 3.
        // * (4,5) -> ar[4] + ar[5] = 1 + 2 = 3.

        // Caso de prueba 1
        // ArrayList<Integer> ar = new ArrayList<Integer>();
        // ar.add(1);
        // ar.add(2);
        // ar.add(3);
        // ar.add(4);
        // ar.add(5);
        // ar.add(6);

        // System.out.println(divisibleSumPairs(6, 5, ar));

        // Caso de prueba 2
        // ArrayList<Integer> ar = new ArrayList<Integer>();
        // ar.add(1);
        // ar.add(3);
        // ar.add(2);
        // ar.add(6);
        // ar.add(1);
        // ar.add(2);

        // System.out.println(divisibleSumPairs(6, 3, ar));

        // Caso de prueba 3
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(43);
        ar.add(95);
        ar.add(51);
        ar.add(55);
        ar.add(40);
        ar.add(86);
        ar.add(65);
        ar.add(81);
        ar.add(51);
        ar.add(20);
        ar.add(47);
        ar.add(50);
        ar.add(65);
        ar.add(53);
        ar.add(23);
        ar.add(78);
        ar.add(75);
        ar.add(75);
        ar.add(47);
        ar.add(73);
        ar.add(25);
        ar.add(27);
        ar.add(14);
        ar.add(8);
        ar.add(26);
        ar.add(58);
        ar.add(95);
        ar.add(28);
        ar.add(3);
        ar.add(23);
        ar.add(48);
        ar.add(69);
        ar.add(26);
        ar.add(3);
        ar.add(73);
        ar.add(52);
        ar.add(34);
        ar.add(7);
        ar.add(40);
        ar.add(33);
        ar.add(56);
        ar.add(98);
        ar.add(71);
        ar.add(29);
        ar.add(70);
        ar.add(71);
        ar.add(28);
        ar.add(12);
        ar.add(18);
        ar.add(49);
        ar.add(19);
        ar.add(25);
        ar.add(2);
        ar.add(18);
        ar.add(15);
        ar.add(41);
        ar.add(51);
        ar.add(42);
        ar.add(46);
        ar.add(19);
        ar.add(98);
        ar.add(56);
        ar.add(54);
        ar.add(98);
        ar.add(72);
        ar.add(25);
        ar.add(16);
        ar.add(49);
        ar.add(34);
        ar.add(99);
        ar.add(48);
        ar.add(93);
        ar.add(64);
        ar.add(44);
        ar.add(50);
        ar.add(91);
        ar.add(44);
        ar.add(17);
        ar.add(63);
        ar.add(27);
        ar.add(3);
        ar.add(65);
        ar.add(75);
        ar.add(19);
        ar.add(68);
        ar.add(30);
        ar.add(43);
        ar.add(37);
        ar.add(72);
        ar.add(54);
        ar.add(82);
        ar.add(92);
        ar.add(37);
        ar.add(52);
        ar.add(72);
        ar.add(62);
        ar.add(3);
        ar.add(88);
        ar.add(82);
        ar.add(71);

        System.out.println(divisibleSumPairs(100, 22, ar));
    }
}