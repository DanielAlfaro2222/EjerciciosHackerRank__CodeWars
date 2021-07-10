package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_5 {
    
    public static void main(String[] args) {
        
    // Utilizamos los enteros a,b y n para crear la siguiente serie:

    // Se le dan q consultas en forma de a,b y n. Para cada consulta, imprima la serie correspondiente a los valores a,b y n dados como una sola línea de n enteros separados por espacios.

    // Formato de entrada

    // La primera línea contiene un entero,q, que denota el número de consultas.

    // Cada línea i de las q siguientes contiene tres enteros separados por espacios que describen los respectivos valores ai,bi y ni para esa consulta.

    // Formato de salida

    // Para cada consulta, imprima la serie correspondiente en una nueva línea. Cada serie debe imprimirse en orden como una sola línea de n enteros separados por espacios.

    // Ejemplo de entrada

    //     2
    //     0 2 10
    //     5 3 5

    // Ejemplo de salida

    //     2 6 14 30 62 126 254 510 1022 2046
    //     8 14 26 50 98

    Scanner ingreso = new Scanner(System.in);

    int a, b, n, resultado, x, CantidadVeces;

    System.out.print("Ingrese la cantidad de veces que desea realizar el proceso: ");
    CantidadVeces = ingreso.nextInt();
    
    
    for (int i = 0; i < CantidadVeces; i++) {
        System.out.print("Ingrese el valor de a: ");
        a = ingreso.nextInt();
        
        System.out.print("Ingrese el valor de b: ");
        b = ingreso.nextInt();
        
        System.out.print("Ingrese el valor de n: ");
        n = ingreso.nextInt();
        
        x = 1;
        resultado = a;

        for (int j = 0; j < n; j++) {
            resultado += x * b;
            System.out.print(resultado + " ");
            x *= 2;
            }
            System.out.println("");
        }
    }
}
