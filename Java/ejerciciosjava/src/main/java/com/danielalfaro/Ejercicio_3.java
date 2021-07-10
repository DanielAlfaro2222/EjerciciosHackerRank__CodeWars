package com.danielalfaro;

public class Ejercicio_3 {
    
    public static String SongDecoder (String song){
        String[] Array = song.split("WUB");
        String Cadena = Array[0];;

        for (int i = 1; i < Array.length; i++) {
            if(i == (Array.length - 1)){
                Cadena += Array[i];
            }else{
                Cadena += Array[i] + " "; 
            }
        }
        return Cadena;
    }

    public static void main(String[] args) {
        
        // Polycarpus trabaja como DJ en la mejor discoteca de Berland, y suele utilizar música dubstep en sus actuaciones. Recientemente, ha decidido tomar un par de canciones antiguas y hacer remezclas de dubstep a partir de ellas.

        // Supongamos que una canción consta de un cierto número de palabras (que no contienen WUB). Para hacer la remezcla dubstep de esta canción, Polycarpus inserta un cierto número de palabras "WUB" antes de la primera palabra de la canción (el número puede ser cero), después de la última palabra (el número puede ser cero), y entre las palabras (al menos una entre cualquier par de palabras vecinas), y luego el chico pega todas las palabras, incluyendo "WUB", en una cadena y toca la canción en el club.

        // Por ejemplo, una canción con las palabras "I AM X" puede transformarse en una remezcla de dubstep como "WUBWUBIWUBAMWUBWUBX" y no puede transformarse en "WUBWUBIAMWUBX".

        // Recientemente, Jonny ha escuchado el nuevo tema de dubstep de Polycarpus, pero como no le gusta la música moderna, decidió averiguar cuál era la canción inicial que Polycarpus remezcló. Ayuda a Jonny a recuperar la canción original.

        // Entrada

        // La entrada consiste en una sola cadena no vacía, compuesta sólo por letras inglesas en mayúsculas, la longitud de la cadena no excede los 200 caracteres

        // Salida

        // Devuelve la letra de la canción inicial que Polycarpus utilizó para hacer una remezcla dubsteb. Separe las palabras con un espacio.

        /*
            Ejemplo

            songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB")
            =>  WE ARE THE CHAMPIONS MY FRIEND
        */

        System.out.println(SongDecoder("WUBWUBABCWUB"));
        System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
    }
}
