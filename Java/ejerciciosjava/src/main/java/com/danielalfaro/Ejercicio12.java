package com.danielalfaro;

import java.security.SecureRandom;

public class Ejercicio12 {

    // Luisa se inscribe en una red social para estar en contacto con sus amigos. La
    // página de registro le pedía que introdujera un nombre y una contraseña. Sin
    // embargo, la contraseña debe ser segura. El sitio web considera que una
    // contraseña es segura si cumple los siguientes criterios:

    // * Su longitud es de al menos 6.
    // * Contiene al menos un dígito.
    // * Contiene al menos un carácter inglés en minúscula.
    // * Contiene al menos un carácter inglés en mayúscula.
    // * Contiene al menos un carácter especial. Los caracteres especiales son:
    // !@#$%^&*()-+

    // Ha escrito una cadena aleatoria de longitud n en el campo de la contraseña,
    // pero no estaba segura de que fuera segura. Teniendo en cuenta la cadena que
    // escribió, ¿puedes encontrar el número mínimo de caracteres que debe añadir
    // para que su contraseña sea segura?

    // Descripción de la función

    // Complete la función minimumNumber en el editor de abajo.

    // minimumNumber tiene los siguientes parámetros:

    // * int n: la longitud de la contraseña
    // * string password: la contraseña a probar

    // Devuelve

    // * int: el número mínimo de caracteres a añadir

    // Formato de entrada

    // La primera línea contiene un número entero, la longitud de la contraseña.

    // La segunda línea contiene la cadena de la contraseña. Cada carácter es un
    // alfabeto inglés en minúsculas o mayúsculas, un dígito o un carácter especial.

    public static int minimumNumber(int n, String password) {

        // * Su longitud es de al menos 6.
        // * Contiene al menos un dígito.
        // * Contiene al menos un carácter inglés en minúscula.
        // * Contiene al menos un carácter inglés en mayúscula.
        // * Contiene al menos un carácter especial. Los caracteres especiales son:
        // * !@#$%^&*()-+

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        int longitud = password.length();
        int cantidadDigitos = 0;
        int cantidadMinusculas = 0;
        int cantidadMayusculas = 0;
        int cantidadCaracteres = 0;
        int caracteresFaltantes = 0;

        for (int i = 0; i < password.length(); i++) {

            String caracter = String.valueOf(password.charAt(i));

            if (numbers.contains(caracter)) {
                cantidadDigitos++;
            } else if (lower_case.contains(caracter)) {
                cantidadMinusculas++;
            } else if (upper_case.contains(caracter)) {
                cantidadMayusculas++;
            } else if (special_characters.contains(caracter)) {
                cantidadCaracteres++;
            }
        }

        if (cantidadDigitos < 1) {
            caracteresFaltantes++;
        }
        if (cantidadMinusculas < 1) {
            caracteresFaltantes++;
        }
        if (cantidadMayusculas < 1) {
            caracteresFaltantes++;
        }
        if (cantidadCaracteres < 1) {
            caracteresFaltantes++;
        }

        caracteresFaltantes = ((longitud + caracteresFaltantes) < 6)
                ? Math.abs((longitud + caracteresFaltantes) - 6) + caracteresFaltantes
                : caracteresFaltantes;

        return caracteresFaltantes;
    }

    public static void main(String[] args) {
        // System.out.println(minimumNumber(3, "Ab1"));
        // System.out.println(minimumNumber(11, "#HackerRank"));

        SecureRandom numaleatorio = new SecureRandom();

        int num = numaleatorio.nextInt(3);

        System.out.println(num);
    }
}