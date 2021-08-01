package com.danielalfaro;

public class Ejercicio_17 {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        // X1 = posicion del primer canguro
        // V1 = velocidad en la que salta el primer canguro
        // X2 = posicion del segundo canguro
        // V2 = velocidad en la que salta el segundo canguro

        boolean mismaUbicacion = false;

        // Comprobar si los saltos del segundo canguro son menores a los saltos del
        // primer canguro
        if (v2 < v1) {
            int ecuacion = (x1 - x2) % (v1 - v2);
            if (ecuacion == 0) {
                mismaUbicacion = true;
            }
        }

        String respuesta = (mismaUbicacion) ? "YES" : "NO";

        return respuesta;
    }

    public static void main(String[] args) {

        // Estás coreografiando un espectáculo de circo con varios animales. Para un
        // acto, le dan dos canguros en una recta numérica dispuestos a saltar en
        // dirección positiva (es decir, hacia el infinito positivo).

        // * El primer canguro comienza en el lugar X1 y se mueve a una velocidad de V1
        // metros por salto.

        // * El segundo canguro comienza en la posición X2 y se mueve a una velocidad de
        // V2 metros por salto.

        // Tienes que encontrar la manera de que ambos canguros estén en la misma
        // ubicación al mismo tiempo como parte del espectáculo. Si es posible, devuelve
        // SÍ, de lo contrario devuelve NO

        // Ejemplo

        // X1 = 2
        // V1 = 1
        // X2 = 1
        // V2 = 2

        // Después de un salto, ambos están en X = 3, (X1 + V1 = 2 + 1, X2 + V2 = 1 +
        // 2), por lo que la respuesta es SÍ.

        // Descripción de la función

        // Completa la función canguro en el editor de abajo.

        // kangaroo tiene los siguientes parámetros

        // * int x1, int v1: posición inicial y distancia de salto para el canguro 1
        // * int x2, int v2: posición inicial y distancia de salto para el canguro 2

        // Devuelve

        // * Cadena: SÍ o NO

        // Formato de entrada

        // Una sola línea de cuatro enteros separados por espacios que denotan los
        // valores respectivos de X1, V1, X2 y V2.

        // Ejemplo de entrada 0

        // 0 3 4 2

        // Ejemplo de salida 0

        // SÍ

        System.out.println(kangaroo(0, 3, 4, 2));// YES
        System.out.println(kangaroo(0, 2, 5, 3));// NO
        System.out.println(kangaroo(14, 4, 98, 2));// YES
    }
}
