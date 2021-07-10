package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_6 {
    
    public static void main(String[] args) {
        
        // Formato de entrada

        // La primera línea contiene un número entero, T, que indica el número de casos de prueba.

        // Cada caso de prueba,T, se compone de una sola línea con un número entero,N, que puede ser arbitrariamente grande o pequeño.

        // Formato de salida

        // Para cada variable de entrada N y tipo de dato primitivo apropiado, debe determinar si las primitivas dadas son capaces de almacenarlo. En caso afirmativo, entonces imprime:

        // n puede ser almacenado en:
        // * dataType

        // Si hay más de un tipo de datos apropiado, imprima cada uno en su propia línea y ordénelos por tamaño (es decir

        // byte < short < int < long 

        // Si el número no puede almacenarse en una de las cuatro primitivas mencionadas, imprime la línea

        // n no cabe en ningún sitio.

        // Ejemplo de entrada

        // 5
        // -150
        // 150000
        // 1500000000
        // 213333333333333333333333333333333333
        // -100000000000000

        // Muestra de salida

        // -150 se puede encajar en:
        // * short
        // * int
        // * long
        // 150000 se puede encajar en:
        // * int
        // * long
        // 1500000000 se puede encajar en:
        // * int
        // * long
        // 21333333333333333333333333333333 no puede encajar en ningún sitio.
        // -100000000000000 puede encajar en:
        // * long

        // Explicación

        // -150 puede ser almacenado en un short, un int o un long.

        // 213333333333333333333333 es muy grande y está fuera del rango de valores permitido para los tipos de datos primitivos discutidos en este problema.

        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de veces que va a ingresar un numero: ");
        int T = ingreso.nextInt();

        for (int i = 0; i < T; i++) {

            try{
                System.out.print("\nIngrese un numero: ");
                long N = ingreso.nextLong();

                System.out.println("can be fitted in: ");
                if(N > Byte.MIN_VALUE && N <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(N > Short.MIN_VALUE && N <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(N > Integer.MIN_VALUE && N < Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(N > Long.MIN_VALUE || N <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }catch(Exception ex){
                System.out.println(ingreso.nextLine() + " can't be fitted anywhere");
            }
        }
    }
}
