package com.danielalfaro;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_21 {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        // La funcion debe retornar un array de tipo entero con dos posiciones, la
        // primer posicion es para la cantidad de veces que rompio su mayor record, y la
        // segunda posicion es para la cantidad de veces que rompio su menor record

        List<Integer> resultado = new ArrayList<Integer>();

        int mayorRecord = scores.get(0);
        int menorRecord = scores.get(0);

        int conteoMayorRecord = 0;
        int conteoMenorRecord = 0;

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < menorRecord) {
                conteoMenorRecord++;
                menorRecord = scores.get(i);
            }
            if (scores.get(i) > mayorRecord) {
                conteoMayorRecord++;
                mayorRecord = scores.get(i);
            }
        }

        resultado.add(conteoMayorRecord);
        resultado.add(conteoMenorRecord);

        return resultado;
    }

    public static void main(String[] args) {

        // María juega al baloncesto universitario y quiere ser profesional. Cada
        // temporada lleva un registro de su juego. Cuenta el número de veces que rompe
        // su récord de temporada de más puntos y menos puntos en un partido. Los puntos
        // anotados en el primer partido establecen su récord de la temporada, y a
        // partir de ahí empieza a contar.

        // Ejemplo:

        // puntos = [12,24, 10, 24]

        // Las puntuaciones están en el mismo orden que los partidos jugados. Ella
        // tabula sus resultados de la siguiente manera:

        // Cuenta
        // Puntuación de la partida Mínimo Máximo Mínimo Máximo
        // 0 12 12 12 0 0
        // 1 24 12 24 0 1
        // 2 10 10 24 1 1
        // 3 24 10 24 1 1

        // Dados los resultados de una temporada, determina el número de veces que María
        // rompe sus récords de mayor y menor puntuación durante la temporada.

        // Descripción de la función

        // Completa la función breakingRecords en el editor de abajo.

        // breakingRecords tiene los siguientes parámetros:

        // * int scores[n]: puntos anotados por partido

        // Devuelve

        // int[2]: Un array con los números de veces que ha roto sus récords. El índice
        // 0 es para romper la mayoría de los récords de puntos, y el índice 1 es para
        // romper los récords de menos puntos.

        // Formato de entrada

        // La primera línea contiene un número entero N, el número de juegos.

        // La segunda línea contiene N enteros separados por espacios que describen los
        // valores respectivos de puntuación sub 0, puntuación sub 1,........,
        // puntuación sub n-1

        // Ejemplo de entrada 0

        // 9
        // 10 5 20 20 4 5 2 25 1

        // Muestra de salida 0

        // 2 4

        // Explicación 0

        // El siguiente diagrama muestra el número de veces que María batió sus mejores
        // y peores récords a lo largo de la temporada:

        // Rompió su mejor récord dos veces (después de los partidos 2 y 7) y su peor
        // récord cuatro veces (después de los partidos 1, 4, 6 y 8), por lo que
        // imprimimos 2 4 como respuesta. Ten en cuenta que no batió su récord de mejor
        // puntuación durante el partido 3, ya que su puntuación durante ese partido no
        // era estrictamente mayor que su mejor récord en ese momento.

        // Ejemplo de entrada 1

        // 10
        // 3 4 21 36 10 28 35 5 24 42

        // Muestra de salida 1

        // 4 0

        // Explicación 1

        // El siguiente diagrama muestra el número de veces que María batió sus mejores
        // y peores récords a lo largo de la temporada:

        // Rompió su mejor récord cuatro veces (después de los partidos 1,2,3 y 9) y su
        // peor récord cero veces (ninguna puntuación durante la temporada fue inferior
        // a la que obtuvo durante su primer partido), por lo que imprimimos 4 0 como
        // respuesta.

        List<Integer> scores = new ArrayList<Integer>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        System.out.println(breakingRecords(scores));
    }
}
