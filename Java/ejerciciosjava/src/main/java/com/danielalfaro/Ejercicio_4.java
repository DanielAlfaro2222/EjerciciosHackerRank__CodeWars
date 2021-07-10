package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_4 {
    
    public static void main(String[] args) {
        
        // Objetivo

        // En este reto, vamos a utilizar bucles para ayudarnos a hacer algunas matemáticas sencillas.

        // Tarea

        // Dado un número entero,N, imprime sus 10 primeros múltiplos. Cada múltiplo N X i (donde 1 <= i <= 10) debe imprimirse en una nueva línea de la forma N x i = resultado.

        // Formato de entrada

        // Un único número entero, N.

        // Formato de salida

        // Imprime líneas de salida; cada línea i (donde 1 <= i <= 10) contiene el resultado de N X i en la forma:

        // N x i = resultado.

        Scanner ingreso = new Scanner(System.in);

        int N = 0;

        System.out.println("Ingrese un numero: ");
        N = ingreso.nextInt();

        for (int j = 1; j < 11; j++) {
            System.out.println(N + " x " + j + " = " + N * j);
        }
    }
}
