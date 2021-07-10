package com.danielalfaro;

import java.util.Scanner;

public class Ejercicio_8 {

        static Scanner ingreso = new Scanner(System.in);

        static int B = ingreso.nextInt();

        static int H = ingreso.nextInt();
        
        static int P = B * H;

        static boolean Bandera = true;

        static{
            try{
                if(B < 0 || H < 0){
                    Bandera = false;
                    throw new Exception("Breadth and height must be positive");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }

    public static void main(String[] args) {
        
        // Los bloques de inicialización estáticos se ejecutan cuando se carga la clase, y puedes inicializar variables estáticas en esos bloques.

        // Es hora de poner a prueba tus conocimientos sobre los bloques de inicialización estáticos. Puedes leer sobre ello aquí.

        // Se te da una clase Solución con un método main. Completa el código dado para que dé como resultado el área de un paralelogramo de anchura B y altura H. Debes leer las variables de la entrada estándar.

        // Si B <= 0 o H <= 0, la salida debe ser "java.lang.Exception: La anchura y la altura deben ser positivas" sin comillas.

        // Formato de la entrada

        // Hay dos líneas de entrada. La primera línea contiene B: la anchura del paralelogramo. La siguiente línea contiene H: la altura del paralelogramo.

        // Formato de salida

        // Si ambos valores son mayores que cero, el método principal debe mostrar el área del paralelogramo. En caso contrario, imprime "java.lang.Exception: La anchura y la altura deben ser positivas" sin comillas.

        // Ejemplo de entrada 1

        // 1
        // 3

        // Ejemplo de salida 1

        // 3

        // Entrada de muestra 2

        // -1
        // 2

        // Ejemplo de salida 2

        // java.lang.Exception: La anchura y la altura deben ser positivas

        if(Bandera){
            System.out.println(P);
        }
    }
}
