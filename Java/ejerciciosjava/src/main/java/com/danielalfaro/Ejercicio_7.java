package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_7 {
    
    public static void main(String[] args) {
        
        // "En informática, el Fin de Archivo (comúnmente abreviado EOF) es una condición en un sistema operativo de computadora donde no se pueden leer más datos de una fuente de datos". 

        // El reto aquí es leer las líneas de entrada hasta llegar al EOF, luego numerar e imprimir todas las líneas de contenido.

        // Sugerencia: El método Scanner.hasNext() de Java es útil para este problema.

        // Formato de entrada

        // Lea algunas líneas desconocidas de entrada desde stdin(System.in) hasta llegar a EOF; cada línea de entrada contiene una cadena no vacía.

        // Formato de salida

        // Para cada línea, imprime el número de línea, seguido de un solo espacio, y luego el contenido de la línea recibida como entrada.

        // Ejemplo de entrada

        // Hola mundo
        // Soy un archivo
        // Léame hasta el final del archivo.

        // Ejemplo de salida

        // 1 Hola mundo
        // 2 Soy un archivo
        // 3 Léame hasta el final del archivo.

        Scanner ingreso = new Scanner(System.in);

        int i = 1;
        String cadena = "";

        while(ingreso.hasNext()){
            System.out.println("Ingrese un valor: ");
            cadena = ingreso.nextLine();
            System.out.println(i + " " + cadena);
            i++;
        }

    }
}
