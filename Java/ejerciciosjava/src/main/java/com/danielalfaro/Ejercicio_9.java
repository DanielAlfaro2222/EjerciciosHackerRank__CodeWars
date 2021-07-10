package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_9 {
    
    public static void main(String[] args) {
        
        // Algoritmo para resolver el problema

        // 1.Pedirle al usuario el numero de filas y columnas que tendra la matriz.
        // 2.Crear y definir la matriz de tipo entero con la cantidad de filas y columnas ingresadas por el usuario
        // 3.Crear un bucle for anidado para llenar la matriz con numeros enteros que ingrese el usuario
        // 4.Imprimir como esta compuesta la matriz
        // 5.Calcular la suma de la primer diagonal
        // 6.Calcular la suma de la diagonal contraria
        // 7.Calcular y mostrar la diferencia 

        Scanner ingreso = new Scanner(System.in);

        int N = 0;
        int Numero = 0;

        System.out.print("Ingrese el valor del tamaño de la matriz: ");
        N = ingreso.nextInt();

        int Matriz[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            System.out.println("****************Fila " + (i + 1) + "****************");
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese un numero: ");
                Numero = ingreso.nextInt();
                Matriz[i][j] = Numero;
            }
        }

        System.out.println("\n*****************Matriz******************");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }

        int SumaDiagonal = 0;
        int SumaDiagonalContraria = 0;
        int Columna = N - 1;

        for (int i = 0; i < N; i++) {
            SumaDiagonal += Matriz[i][i];
            SumaDiagonalContraria += Matriz[i][Columna];
            Columna -= 1;
        }
        int DiferenciaDiagonales = Math.abs(SumaDiagonal - SumaDiagonalContraria);

        System.out.println("\nResulado suma de la diagonal: " + SumaDiagonal);
        System.out.println("Resulado suma de la diagonal contraria: " + SumaDiagonalContraria);
        System.out.println("Resultado diferencia de los dos diagonales: " + DiferenciaDiagonales);
    }
}
