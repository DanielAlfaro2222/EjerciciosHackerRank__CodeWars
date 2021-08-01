package com.danielalfaro;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio_15 {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        // ArraList que va a retonar la funcion, con las notas finales de cada
        // estudiante
        List<Integer> notasFinales = new ArrayList<Integer>();

        // Variable en donde se almacenara el siguiente multiplo
        int siguienteMultiplo = 0;

        // Recorrer la lista con las notas iniciales, para realizar el redondeo
        for (Integer integer : grades) {

            // Bucle que recorre desde la nota hasta 10 unidades mas, para encontrar le
            // multiplo de 5 mas cercano
            for (int i = integer + 1; i < (integer + 10); i++) {
                if (i % 5 == 0) {
                    siguienteMultiplo = i;
                    break;
                }
            }

            if (integer >= 38) {
                if (Math.abs(siguienteMultiplo - integer) < 3) {
                    notasFinales.add(siguienteMultiplo);
                } else {
                    notasFinales.add(integer);
                }
            } else {
                notasFinales.add(integer);
            }
        }

        return notasFinales;
    }

    public static void main(String[] args) {

        // La Universidad HackerLand tiene la siguiente política de calificaciones:

        // * Cada estudiante recibe una calificación en el rango inclusivo de 0 a 100.
        // * Cualquier nota inferior a 40 es una nota de suspenso.

        // Sam es un profesor de la universidad y le gusta redondear la nota de cada
        // estudiante según estas reglas:

        // * Si la diferencia entre la nota y el siguiente múltiplo de 5 es inferior a
        // 3, redondea la nota al siguiente múltiplo de 5.

        // * Si el valor de la nota es inferior a 38, no se redondea, ya que el
        // resultado seguirá siendo una nota de suspenso

        // Ejemplos

        // * Calificación = 84 redondear a 85 (85 - 84 es menos de 3)
        // * nota = 29 no redondear (el resultado es menor que 40)
        // * nota = 57 no redondear (60 - 57 es 3 o más)

        // Dado el valor inicial de la calificación para cada uno de los n estudiantes
        // de Sam, escriba un código para automatizar el proceso de redondeo.

        // Descripción de la función

        // Complete la función gradingStudents en el editor de abajo.

        // gradingStudents tiene los siguientes parámetros:

        // * int calificaciones[n]: las calificaciones antes del redondeo

        // Devuelve

        // * int[n]: las calificaciones después del redondeo según corresponda

        // Formato de entrada

        // La primera línea contiene un único número entero,n , el número de
        // estudiantes.
        // Cada línea i de las n siguientes contiene un único entero, grades[i].

        // Ejemplo de entrada 0

        // 73
        // 67
        // 38
        // 33

        // Muestra de salida 0

        // 75
        // 67
        // 40
        // 33

        // Explicación

        // 1). El alumno 1 ha obtenido un 73, y el siguiente múltiplo de 5 a partir de
        // 73 es 75. Como 75 - 73 < 3, la nota del alumno se redondea a 75.

        // 2). El estudiante 2 recibió un 67, y el siguiente múltiplo de 5 de 67 es 70.
        // Como 70 - 67 = 3 , la calificación no se modifica y la nota final del alumno
        // es 67.

        // 3). El alumno 3 recibió un 38, y el siguiente múltiplo de 5 de 38 es 40. Como
        // 40 - 38 < 3, la nota del alumno se redondeará a 40.

        // 4). El alumno 4 recibió una nota inferior a 33, por lo que la nota no se
        // modificará y la nota final del alumno es 33.

        List<Integer> grades = new ArrayList<Integer>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(gradingStudents(grades));
    }
}
