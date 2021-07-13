package com.danielalfaro;

import java.util.*;

public class Ejercicio_10 {
    
    public static void plusMinus(List<Integer> arr){
        double Positivos = 0;
        double Negativos = 0;
        double Cero = 0;

        for (Integer num: arr) {
            if(num > 0){
                Positivos += 1;
            }else if(num < 0){
                Negativos += 1;
            }else if(num == 0){
                Cero += 1;
            }
        }

        Positivos =  Positivos / arr.size();
        Negativos = Negativos / arr.size();
        Cero = Cero / arr.size();

        System.out.printf("%.6f %n",Positivos);
        System.out.printf("%.6f %n",Negativos);
        System.out.printf("%.6f %n",Cero);
        // System.out.println((double)Math.round(Positivos * 1000000) / 1000000);
        // System.out.println((double)Math.round(Negativos * 1000000) / 1000000);
        // System.out.println((double)Math.round(Cero * 1000000) / 1000000);
    }

    public static void main(String[] args) {

        // Dada una matriz de enteros, calcula los cocientes de sus elementos que son positivos, negativos y cero. Imprime el valor decimal de cada fracción en una nueva línea con 6 posiciones después del decimal.

        // Nota: Este reto introduce problemas de precisión. Los casos de prueba están escalados a seis decimales, aunque se aceptan respuestas con un error absoluto de hasta 10**4

        // Ejemplo

        // Matriz = [1,1,0,-1,-1]

        // Hay n = 5 elementos, dos positivos, dos negativos y un cero. Sus relaciones son 2/5 = 0,400000, 2/5 = 0,400000 y 1/5 = 0,200000. Los resultados se imprimen como

        // 0.400000
        // 0.400000
        // 0.200000

        // Descripción de la función

        // Complete la función plusMinus en el editor de abajo.

        // plusMinus tiene los siguientes parámetros:

        //     * int arr[n]: una matriz de enteros

        // Imprimir

        // Imprime las proporciones de los valores positivos, negativos y cero en el array. Cada valor debe imprimirse en una línea separada con 6 dígitos después del decimal. La función no debe devolver ningún valor.

        // Formato de entrada

        //     * La primera línea contiene un número entero,n, el tamaño del array.
        //     * La segunda línea contiene n enteros separados por espacios que describen arr[n].

        // Formato de salida

        // Imprime las siguientes 3 líneas, cada una con 6 decimales:

        // 1.proporción de valores positivos
        // 2.proporción de valores negativos
        // 3.proporción de ceros

        // Ejemplo de salida

        // 0.500000
        // 0.333333
        // 0.166667

        // Explicación

        // Hay 3 números positivos, 2 números negativos y 1 cero en la matriz.
        // Las proporciones de aparición son positivas: 3/6 = 0,500000, negativas: 2/6 = 0,333333 y ceros: 1/6 = 0,166667.

        //Scanner ingreso = new Scanner(System.in);

        // double resultado = 3.0 / 6.0;

        // System.out.println((double)Math.round(resultado * 100000) / 100000);

        List<Integer> arr = new ArrayList<>();

        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        plusMinus(arr);
    }
}
