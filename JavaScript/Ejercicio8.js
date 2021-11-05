// Un ávido excursionista lleva un registro meticuloso de sus caminatas.Durante la última caminata en la que se dieron exactamente pasos, se anotó para cada paso si era una subida, U, o una bajada, D.Las caminatas siempre comienzan y terminan a nivel del mar, y cada paso hacia arriba o hacia abajo representa un cambio de altitud de 1 unidad.Definimos los siguientes términos:

// * Una montaña es una secuencia de pasos consecutivos sobre el nivel del mar, que comienza con un paso hacia arriba desde el nivel del mar y termina con un paso hacia abajo al nivel del mar.

// * Un valle es una secuencia de escalones consecutivos por debajo del nivel del mar, que comienza con un escalón hacia abajo desde el nivel del mar y termina con un escalón hacia arriba hasta el nivel del mar.

// Dada la secuencia de pasos hacia arriba y hacia abajo durante una caminata, encuentra e imprime el número de valles recorridos.

// Ejemplo

// pasos = [DDUUUUDD]

// El excursionista entra primero en un valle de 2 unidades de profundidad.A continuación, sale y sube a una montaña de 2 unidades de altura.Finalmente, el excursionista regresa al nivel del mar y termina la caminata.

// Descripción de la función

// Complete la función countingValleys en el editor de abajo.

// countingValleys tiene los siguientes parámetros:

// * int pasos: el número de pasos de la caminata
// * string camino: una cadena que describe el camino

// Devuelve

// * int: el número de valles atravesados

// Formato de entrada

// La primera línea contiene un entero steps, el número de pasos de la caminata.

// La segunda línea contiene una sola cadena path, de caracteres steps que describen el camino.

// Ejemplo de entrada

// 8
// UDDDUDUU

// Ejemplo de salida

// 1
// Explicación

// Si representamos _ como el nivel del mar, un escalón hacia arriba como /, y un escalón hacia abajo como \, la subida se puede dibujar como:

/* _/\      _
      \    /
       \/\/
*/

// El excursionista entra y sale de un valle.

/* 
    Pasos para solucionar el problema

    1). Crear un array para almacenar la caminata del excursionsita en forma de numeros
    2). Crear una variable que ira almacenando los cambios en el recorrido
    3). Recorrer la cadena de caracteres.
    4). Si la palabra es U la variable del paso 2 aumenta en 1, si es D la variable del paso 2 disminuye 1.
    5). Almacenar lo que hay en la variable del paso 2 en el array del paso 1 por cada iteracion de la cadena.
    6). Crear una variable para almacenar la cantidad de valles que recorrio el excurisonista
    7). Recorrer el array del paso 1 desde la segunda posicion.
    8). Si la posicion anterior del array es mayor o igual a cero y la actual posicion es menor a cero, agregar uno al contador de el paso 6.

*/

function countingValleys(steps, path) {

    // La funcion recibe dos parametros, el primero es la cantidad de pasos (number) y el segundo es una cadena con los pasos que da el excursionista

    // El nivel del mar es cuando se esta en 0
    // El excursionista empieza a subir una montaña cuando es superior a 0 y termina cuando es menor a 0
    // El excursionista empieza a subir un valle cuando es menor a 0 y termina cuando es superior a 0

    let caminata = [];
    let recorrido = 0;

    for (let cadena of path) {
        cadena === 'U' ? recorrido += 1 : recorrido -= 1;
        caminata.push(recorrido);
    }

    let cantidadValles = (caminata[0] < 0) ? 1 : 0;

    for (let i = 1; i <= caminata.length; i++) {
        if (caminata[i - 1] >= 0 && caminata[i] < 0) {
            cantidadValles++;
        }
    }

    return cantidadValles;
}

console.log(countingValleys(8, "UDDDUDUU"));
console.log(countingValleys(12, "DDUUDDUDUUUD"));