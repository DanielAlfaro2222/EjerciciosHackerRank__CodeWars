package com.danielalfaro;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio_13 {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int cantidad = 0;
        int Mayor = candles.get(0);

        for (Integer integer : candles) {
            if (integer > Mayor) {
                Mayor = integer;
            }
        }

        for (Integer integer : candles) {
            if (integer == Mayor) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public static void main(String[] args) {

        // Te encargas de la tarta del cumpleaños de un niño. Has decidido que la tarta
        // tendrá una vela por cada año de su edad total. Sólo podrán soplar la más alta
        // de las velas. Cuenta cuántas velas son las más altas.

        // Ejemplo:

        // velas = [4,4,1,3]

        // Las velas de máxima altura tienen 4 unidades de altura. Hay 2 de ellas, así
        // que devuelve 2.

        // Descripción de la función

        // Completa la función birthdayCakeCandles en el editor de abajo.

        // birthdayCakeCandles tiene los siguientes parámetros:

        // * int velas[n]: la altura de las velas

        // Devuelve

        // * int: el número de velas más altas

        // Formato de entrada

        // La primera línea contiene un único número entero, n, el tamaño de las
        // velas[].

        // La segunda línea contiene n enteros separados por espacios, donde cada entero
        // i describe la altura de las velas[i].

        List<Integer> candles = new ArrayList<Integer>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        System.out.println(birthdayCakeCandles(candles));
    }
}
