package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_2 {
    
    public static void main(String[] args) {
        
        /*
            Problema

            Dado un número entero,n, realizar las siguientes acciones condicionales:

            * Si n es impar, imprime Weird
            * Si n es par y está en el rango inclusivo de 2 a 5, imprime No Raro
            * Si n es par y está en el rango inclusivo de 6 a 20, imprime Weird
            * Si n es par y mayor que 20, imprime No Raro

            Completa el código del stub proporcionado en tu editor para imprimir si es raro o no.

            Formato de entrada

            Una sola línea que contenga un número entero positivo, n.

            Formato de salida

            Imprime Weird si el número es raro; en caso contrario, imprime Not Weird.

            Traducción realizada con la versión gratuita del traductor www.DeepL.com/Translator
        */

        Scanner ingreso = new Scanner(System.in);

        int num = 0;

        System.out.println("Ingrese un numero: ");
        num = ingreso.nextInt();

        if (num % 2 == 0){
            if (num > 2 && num < 6){
                System.out.println("Not Weird");
            } else if(num > 5 && num < 21){
                System.out.println("Weird");
            }else if(num > 20){
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}
