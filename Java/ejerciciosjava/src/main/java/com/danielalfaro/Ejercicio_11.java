package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {

        // Detalle de la escalera

        // Se trata de una escalera de tamaño n = 4:

        // #
        // ##
        // ###
        // ####

        // Su base y su altura son ambas iguales a n. Se dibuja utilizando # símbolos y
        // espacios. La última línea no está precedida por ningún espacio.

        // Escribe un programa que imprima una escalera de tamaño n.

        // Descripción de la función

        // Completa la función staircase en el editor de abajo.

        // staircase tiene los siguientes parámetros

        // * int n: un número entero

        // Imprime una escalera como la descrita anteriormente.

        // Formato de entrada

        // Un solo entero,n, que denota el tamaño de la escalera.

        // Formato de salida

        // Imprime una escalera de tamaño n utilizando símbolos # y espacios.

        // Nota: La última línea debe tener 0 espacios.

        // Ejemplo de entrada

        // 6

        // Ejemplo de salida

        // #
        // ##
        // ###
        // ####
        // #####
        // ######

        // Explicación

        // La escalera está alineada a la derecha, compuesta por símbolos # y espacios,
        // y tiene una altura y una anchura de n = 6.

        /*
         * Solucion
         * 
         * 1. Definir una variable con la cantidad de espacios que debera tener, el
         * total va a ser proporcional al valor ingresado por el usuario.
         * 
         * 2.Crear un bucle for para imprimir la cantidad de espacios
         * 
         * 3.Crear un bucle for para imprimir la cantidad de asteriscos.
         * 
         * 4.Iterar los pasos anteriores hasta el numero ingresado por el usuario.
         */

        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int N = ingreso.nextInt();

        int Espacios = N - 1;
        int Asteriscos = 1;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < Espacios; j++) {
                System.out.print(" ");
            }

            Espacios -= 1;

            for (int j = 0; j < Asteriscos; j++) {
                System.out.print("#");
            }

            Asteriscos += 1;
            System.out.println("");
        }
    }
}
