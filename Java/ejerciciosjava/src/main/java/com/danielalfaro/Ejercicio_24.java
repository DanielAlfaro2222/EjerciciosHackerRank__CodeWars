package com.danielalfaro;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Ejercicio_24 {

    public static int migratoryBirds(List<Integer> arr) {

        // Crear e instanciar un conjunto en el cual almacenaramos todos los elementos
        // que no esten repetidos, estos elementos quedaran almacenados de menor a
        // mayor.
        HashSet<Integer> Conjunto = new HashSet<>();

        // Recorrer el array que llega por parametro e ir añadiendo cada elemento en el
        // Conjunto
        for (Integer integer : arr) {
            Conjunto.add(integer);
        }

        // Array en donde almacenaramos en orden la cantidad de veces que aparece cada
        // elemento en el array que recibe por parametro la funcion.
        ArrayList<Integer> CantidadVecesNumero = new ArrayList<Integer>();

        // Array en donde almacenaramos los numeros presentes en el conjunto, como no
        // podremos acceder a un solo elemento del conjunto, tendremos que almacenar lo
        // que hay en el conjunto en un array
        ArrayList<Integer> Numero = new ArrayList<Integer>();

        // Este bucle realiza dos cosas:

        // 1).Recorrer el conjunto y almacenar cada elemento del conjunto en el array
        // Numero para despues poder sacar o retornar que numero es el que mas veces
        // aparece.

        // 2).Cuenta el numero de veces que aparece cada elemento del conjunto y luego
        // lo almacena en el array CantidadVecesNumero.
        for (Integer integer : Conjunto) {

            int Conteo = 0;
            Numero.add(integer);

            for (int j = 0; j < arr.size(); j++) {
                if (integer == arr.get(j)) {
                    Conteo++;
                }
            }

            CantidadVecesNumero.add(Conteo);
        }

        // Supondremos que la cantidad de veces que es mayor es la posicion 0 del array
        // CantidadVecesNumero
        int MayorNumero = CantidadVecesNumero.get(0);

        // Posicion del elemento que mas veces aparece, por ahora supondremos que es la
        // posicion 0
        int Posicion = 0;

        // Este bucle for recorre el array CantidadVecesNumero y va mirando si lo que
        // hay en la posicion j del array CantidadVecesNumero es mayor a lo que hay en
        // la variable MayorNumero, si esto se cumple cambia el valor de la variable
        // MayorNumero y cambia la posicion la cual la usaremos para conocer que numero
        // es el que mas veces se repite.
        for (int i = 0; i < CantidadVecesNumero.size(); i++) {
            if (CantidadVecesNumero.get(i) > MayorNumero) {
                MayorNumero = CantidadVecesNumero.get(i);
                Posicion = i;
            }
        }

        // Retornamos el numero que mas veces se repite
        return Numero.get(Posicion);
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
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // arr.add(1);
        // arr.add(4);
        // arr.add(4);
        // arr.add(4);
        // arr.add(5);
        // arr.add(3);

        // System.out.println(migratoryBirds(arr));

        // Caso de prueba 2
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);

        System.out.println(migratoryBirds(arr));
    }
}
