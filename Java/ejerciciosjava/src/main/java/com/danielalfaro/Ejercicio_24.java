package com.danielalfaro;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Ejercicio_24 {

    public static int migratoryBirds(List<Integer> arr) {

        // Crear e instanciar un conjunto en el cual almacenaramos todos los elementos
        // que no esten repetidos
        HashSet<Integer> Conjunto = new HashSet<>();

        // Recorrer el array que llega
        for (Integer integer : arr) {
            Conjunto.add(integer);
        }

        int Tipo = 0;
        int CantidadTipo = 0;

        for (Integer integer : Conjunto) {

            int Conteo = 0;

            for (int j = 0; j < arr.size(); j++) {
                if (integer == arr.get(j)) {
                    Conteo++;
                }
            }

        }

        return Tipo;
    }

    public static void main(String[] args) {

        // Dado un array de avistamientos de aves donde cada elemento representa un id
        // de tipo de ave, determinar el id del tipo más frecuentemente avistado. Si más
        // de un tipo ha sido visto esa cantidad máxima, devuelve el menor de sus ids.

        // Ejemplo

        // arr = [1,1,2,2,3]

        // Hay dos de los tipos 1 y 2, y un avistamiento del tipo 3. Elige el menor de
        // los dos tipos vistos dos veces: el tipo 1.

        // Descripción de la función

        // Complete la función migratoryBirds en el editor de abajo.

        // migratoryBirds tiene los siguientes parámetros

        // * int arr[n]: los tipos de aves avistadas

        // Devuelve

        // * int: el id de tipo más bajo de las aves más frecuentemente avistadas

        // Formato de entrada

        // La primera línea contiene un número entero, N, el tamaño de arr.

        // La segunda línea describe arr como n enteros separados por espacios, cada uno
        // de los cuales es un número de tipo del ave avistada.

        // Ejemplo de entrada 0

        // 6
        // 1 4 4 4 5 3

        // Ejemplo de salida 0

        // 4

        // Explicación 0

        // Los diferentes tipos de pájaros aparecen en las siguientes frecuencias:

        // * Tipo 1:1 pájaro
        // * Tipo 2:0 pájaros
        // * Tipo 3:1 pájaros
        // * Tipo 4:3 pájaros
        // * Tipo 5:1 pájaro

        // El número de tipo que aparece con mayor frecuencia es el tipo 4, por lo que
        // imprimimos el 4 como respuesta.

        // Ejemplo de entrada 1

        // 11
        // 1 2 3 4 5 4 3 2 1 3 4

        // Ejemplo de salida 1

        // 3

        // Explicación 1

        // Los diferentes tipos de pájaros se dan en las siguientes frecuencias:

        // * Tipo 1: 2
        // * Tipo 2: 2
        // * Tipo 3: 3
        // * Tipo 4: 3
        // * Tipo 5: 1

        // Dos tipos tienen una frecuencia de 3, y el menor de ellos es el tipo 3.

        // Caso de prueba 1
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        System.out.println(migratoryBirds(arr));

        // Caso de prueba 2
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);
        // arr.add(4);
        // arr.add(3);
        // arr.add(2);
        // arr.add(1);
        // arr.add(3);
        // arr.add(4);

        // System.out.println(migratoryBirds(arr));
    }
}
