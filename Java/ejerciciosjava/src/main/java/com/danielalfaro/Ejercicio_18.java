package com.danielalfaro;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio_18 {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        List<Integer> divisionUniforme = new ArrayList<Integer>();

        int resultado = 0;

        // Calcular y almacenar los primeros cuatro numeros que se puedan dividir
        // uniformemente entre los numeros del array a
        for (int i = 1; i < 1000; i++) {

            List<Integer> resultadoDivisiones = new ArrayList<Integer>();

            for (Integer integer : a) {
                resultadoDivisiones.add(i / integer);
            }

            int cantidadNumerosDivisonUniforme = 0;

            for (int j = 0; j < a.size(); j++) {
                if (resultadoDivisiones.get(j) * a.get(j) == i) {
                    cantidadNumerosDivisonUniforme++;
                }
            }

            if (cantidadNumerosDivisonUniforme == a.size()) {
                divisionUniforme.add(i);
            }
        }

        // Calcular el total de numeros que son divisibles entre los numeros del array b

        for (Integer integer : divisionUniforme) {

            List<Integer> resultadoModulos = new ArrayList<Integer>();
            int total = 0;

            for (Integer numero : b) {
                resultadoModulos.add(numero % integer);
            }

            for (Integer numero : resultadoModulos) {
                if (numero == 0) {
                    total++;
                }
            }

            if (total == resultadoModulos.size()) {
                resultado++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        // Habrá dos matrices de enteros. Determine todos los enteros que satisfacen las
        // dos condiciones siguientes:

        // 1.Los elementos de la primera matriz son todos factores del entero que se
        // está considerando.

        // 2.El entero que se está considerando es un factor de todos los elementos de
        // la segunda matriz.

        // Se dice que estos números están entre las dos matrices. Determina cuántos
        // números de este tipo existen.

        // Ejemplo

        // a = [2, 6]
        // b = [24,36]

        // Hay dos números entre las matrices: 6 y 12

        // 6 % 2 = 0, 6 % 6 = 0, 24 % 6 = 0, 36 % 6 = 0 para el primer valor

        // 12 % 2 = 0, 12 % 6 = 0, 24 % 12 = 0, 36 % 12 = 0 para el segundo valor.
        // Retorno 2

        // Descripción de la función

        // Complete la función getTotalX en el editor de abajo. Debe devolver el número
        // de enteros que hay entre los conjuntos.

        // getTotalX tiene los siguientes parámetros:

        // * int a[n]: un array de enteros
        // * int b[m]: una matriz de enteros

        // Devuelve

        // * int: el número de enteros que hay entre los conjuntos

        // Formato de entrada

        // La primera línea contiene dos enteros separados por espacios, N y M, el
        // número de elementos de las matrices A y B.

        // La segunda línea contiene N enteros distintos separados por espacios A[i]
        // donde 0 <= I < N.

        // La tercera línea contiene M enteros distintos separados por espacios B[j]
        // donde 0 <= J < M.

        // Ejemplo de entrada

        // 2 3
        // 2 4
        // 16 32 96

        // Ejemplo de salida

        // 3

        // Explicación

        // * 2 y 4 se dividen uniformemente en 4, 8, 12 y 16.
        // * 4, 8 y 16 se dividen uniformemente en 16, 32 y 96.
        // * 4, 8 y 16 son los únicos tres números para los que cada elemento de a es un
        // factor y cada uno es un factor de todos los elementos de b.

        // List<Integer> a = new ArrayList<Integer>();
        // a.add(2);
        // a.add(4);

        // List<Integer> b = new ArrayList<Integer>();
        // b.add(16);
        // b.add(32);
        // b.add(96);

        // List<Integer> a = new ArrayList<Integer>();
        // a.add(2);
        // a.add(6);

        // List<Integer> b = new ArrayList<Integer>();
        // b.add(24);
        // b.add(36);

        List<Integer> a = new ArrayList<Integer>();
        a.add(1);

        List<Integer> b = new ArrayList<Integer>();
        b.add(100);

        System.out.println(getTotalX(a, b));
    }
}