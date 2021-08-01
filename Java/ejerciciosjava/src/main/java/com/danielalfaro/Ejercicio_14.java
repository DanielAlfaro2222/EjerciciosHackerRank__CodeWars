package com.danielalfaro;

public class Ejercicio_14 {

    public static String timeConversion(String s) {

        // Tomar y almacenar los minutos y segundos
        String subcadena = s.substring(2, 8);

        // Convertir la hora en un entero, para poder realizar la conversion a formato
        // 24 horas
        int hora = Integer.parseInt(s.substring(0, 2));
        String resultado = "";

        if (s.contains("PM")) {

            hora = Math.abs(hora - 12) - 24;

            if (hora == -24 || hora == 24) {
                resultado = "12" + subcadena;
            } else {
                resultado = Math.abs(hora) + subcadena;
            }
        } else {
            if (hora == 12) {
                resultado = "00" + subcadena;
            } else {
                if (hora < 10) {
                    resultado = "0" + hora + subcadena;
                } else {
                    resultado = hora + subcadena;
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        String a = "07:05:45PM";

        System.out.println(a.substring(2, 8));
        System.out.println(timeConversion("12:45:54PM"));
    }
}
