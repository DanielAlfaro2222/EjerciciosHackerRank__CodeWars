package com.danielalfaro;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio_22 {

    public static int birthday(List<Integer> s, int d, int m) {

        // Condiciones a cumplir
        // 1).la suma de los segmentos debe ser igual al valor de la variable d
        // 2).la longitud del segmento debe ser igual al valor de la variable m

        int cantidad = 0;

        for (int i = 0; i < s.size(); i++) {

            List<Integer> segmento = new ArrayList<Integer>();

            segmento.add(s.get(i));

            int total = 0;

            for (int j = i + 1; j < s.size(); j++) {
                if (segmento.size() < m) {
                    segmento.add(s.get(j));
                } else {
                    break;
                }
            }

            for (Integer integer : segmento) {
                total += integer;
            }

            if (total == d) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public static void main(String[] args) {
        /*
         * Dos niños, Lily y Ron, quieren compartir una barra de chocolate. Cada uno de
         * los cuadrados tiene un número entero.
         * 
         * Lily decide compartir un segmento contiguo de la barra seleccionado de forma
         * que
         * 
         * La longitud del segmento coincida con el mes de nacimiento de Ron, y, La suma
         * de los enteros de los cuadrados sea igual a su día de nacimiento.
         * 
         * Determina de cuántas maneras puede dividir el chocolate
         * 
         * Ejemplo
         * 
         * s = [2,2,1,3,2]
         * 
         * d = 4
         * 
         * m = 2
         * 
         * Lily quiere encontrar segmentos que sumen el día de nacimiento de Ron, d = 4,
         * con una longitud igual a su mes de nacimiento, m = 2. En este caso, hay dos
         * segmentos que cumplen sus criterios: [2,2] y [1,3].
         * 
         * Descripción de la función
         * 
         * Complete la función cumpleaños en el editor de abajo.
         * 
         * birthday tiene los siguientes parámetros
         * 
         * int s[n]: los números de cada uno de los cuadrados de chocolate int d: El día
         * de nacimiento de Ron int m: El mes de nacimiento de Ron
         * 
         * Devuelve
         * 
         * int: el número de formas en que se puede dividir la barra
         * 
         * Formato de entrada
         * 
         * La primera línea contiene un número entero n, el número de cuadrados de la
         * barra de chocolate.
         * 
         * La segunda línea contiene n enteros separados por espacios s[i], los números
         * de los cuadrados de chocolate donde 0 <= i < n.
         * 
         * La tercera línea contiene dos enteros separados por espacios, d y m, el día y
         * el mes de nacimiento de Ron.
         * 
         * Ejemplo de entrada 0
         * 
         * 5 1 2 1 3 2 3 2
         * 
         * Ejemplo de salida 0
         * 
         * 2
         * 
         * Explicación 0
         * 
         * Lily quiere dar a Ron m = 2 cuadrados que sumen d = 3. Los dos segmentos
         * siguientes cumplen los criterios:
         * 
         * Muestra de entrada 1
         * 
         * 6 1 1 1 1 1 1 3 2
         * 
         * Muestra de salida 1
         * 
         * 0
         * 
         * Explicación 1
         * 
         * Lily sólo quiere dar a Ron m = 2 cuadrados consecutivos de chocolate cuyos
         * enteros sumen d = 3. No hay trozos posibles que satisfagan estas
         * restricciones:
         * 
         * Por lo tanto, imprimimos 0 como respuesta.
         * 
         * Ejemplo de entrada 2
         * 
         * 1 4 4 1
         * 
         * Ejemplo de salida 2
         * 
         * 1
         * 
         * Explicación 2
         * 
         * Lily sólo quiere dar a Ron m = 1 cuadrado de chocolate con un valor entero de
         * d = 4. Como el único cuadrado de chocolate de la barra satisface esta
         * restricción, imprimimos 1 como respuesta.
         */

        // Caso de prueba 1
        // List<Integer> s = new ArrayList<Integer>();
        // s.add(2);
        // s.add(2);
        // s.add(1);
        // s.add(3);
        // s.add(2);

        // System.out.println(birthday(s, 4, 2));

        // Caso de prueba 2
        // List<Integer> s = new ArrayList<Integer>();
        // s.add(1);
        // s.add(2);
        // s.add(1);
        // s.add(3);
        // s.add(2);

        // System.out.println(birthday(s, 3, 2));

        // Caso de prueba 3
        // List<Integer> s = new ArrayList<Integer>();
        // s.add(1);
        // s.add(1);
        // s.add(1);
        // s.add(1);
        // s.add(1);
        // s.add(1);

        // System.out.println(birthday(s, 3, 2));

        // Caso de prueba 4
        // List<Integer> s = new ArrayList<Integer>();
        // s.add(4);

        // System.out.println(birthday(s, 4, 1));

        // Caso de prueba 5
        List<Integer> s = new ArrayList<Integer>();
        s.add(2);
        s.add(5);
        s.add(1);
        s.add(3);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(5);
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(4);
        s.add(1);
        s.add(3);
        s.add(3);
        s.add(4);
        s.add(2);
        s.add(1);

        System.out.println(birthday(s, 18, 7));

        ArrayList<Integer> nombre = new ArrayList<Integer>();
        nombre.add(1);
        nombre.add(2);
        nombre.add(2);

        nombre.isEmpty();

    }
}