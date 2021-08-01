package com.danielalfaro;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio_12 {

    public static void miniMaxSum(List<Integer> arr) {

        long SumaMaxima = 0;
        long SumaMinima = 0;

        for (int i = 0; i < 5; i++) {
            long suma = (long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4);
            suma -= (long) arr.get(i);

            if (i == 0) {
                SumaMaxima = suma;
                SumaMinima = suma;
            } else {
                if (suma < SumaMinima) {
                    SumaMinima = suma;
                }
                if (suma > SumaMaxima) {
                    SumaMaxima = suma;
                }
            }
        }

        System.out.println(SumaMinima + " " + SumaMaxima);
    }

    public static void main(String[] args) {

        // Dados cinco enteros positivos, encuentre los valores mínimo y máximo que se
        // pueden calcular sumando exactamente cuatro de los cinco enteros. A
        // continuación, imprima los respectivos valores mínimos y máximos como una sola
        // línea de dos enteros largos separados por espacios.

        // arr = [1,3,5,7,9]

        // La suma mínima es 1 + 3 + 5 + 7 + 9 = 16 y la suma máxima es 3 + 5 + 7 + 9.
        // La función imprime 16 24

        // Imprimir

        // Imprime dos enteros separados por espacios en una línea: la suma mínima y la
        // suma máxima de 4 de 5 elementos

        // Formato de entrada

        // Una sola línea con cinco enteros separados por espacios.

        // Formato de salida

        // Imprime dos enteros largos separados por espacios que denotan los respectivos
        // valores mínimo y máximo que se pueden calcular sumando exactamente cuatro de
        // los cinco enteros. (La salida puede ser mayor que un entero de 32 bits).

        // Ejemplo de entrada

        // 1 2 3 4 5

        // Ejemplo de salida

        // 10 14

        // List<Integer> arr = [ 1, 2, 3, 4, 5 ];
        List<Integer> arr = new ArrayList<Integer>();
        // arr.add(1);
        // arr.add(3);
        // arr.add(5);
        // arr.add(7);
        // arr.add(9);

        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

        miniMaxSum(arr);
    }
}
