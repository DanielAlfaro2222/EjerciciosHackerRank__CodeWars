package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_1 
{
    public static void main( String[] args )
    {

        /*
            Problema

            En este reto, debes leer 3 enteros desde stdin y luego imprimirlos en stdout. Cada entero debe imprimirse en una nueva línea. Para hacer el problema un poco más fácil, una parte del código se proporciona para usted en el editor de abajo.

            Formato de entrada

            Hay 3 líneas de entrada, y cada línea contiene un solo entero.
        */

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        num3 = entrada.nextInt();

        System.out.println(num1 + "\n" + num2 + "\n" + num3);
        
    }
}
