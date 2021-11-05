// Un videojugador juega a un juego en el que el personaje compite en una carrera de vallas.Las vallas son de diferentes alturas y los personajes tienen una altura máxima que pueden saltar.Hay una poción mágica que pueden tomar y que aumentará su altura máxima de salto en 1 unidad por cada dosis. ¿Cuántas dosis de la poción debe tomar el personaje para poder saltar todos los obstáculos ? Si el personaje ya puede saltar todos los obstáculos, devuelve 0.

// Ejemplo

// alto = [1, 2, 3, 3, 2]
// k = 1

// El personaje puede saltar 1 unidad de altura inicialmente y debe tomar 3 - 1 = 2 dosis de poción para poder saltar todos los obstáculos.

// Descripción de la función

// Completa la función hurdleRace en el editor de abajo.

// hurdleRace tiene los siguientes parámetros

//     * int k: la altura que puede saltar el personaje de forma natural
//     * int altura[n]: la altura de cada obstáculo

// Devuelve

//     * int: el número mínimo de dosis requeridas, siempre 0 o más.

// Formato de entrada

// La primera línea contiene dos enteros separados por espacios N y K, el número de vallas y la altura máxima que el personaje puede saltar de forma natural.

// La segunda línea contiene N enteros separados por espacios alto[i] donde 0 <= i < n

// Ejemplo de entrada 0

// 5 4
// 1 6 3 5 2

// Muestra de salida 0

// 2

// Explicación 0

// El personaje de Dan puede saltar un máximo de k = 4 unidades, pero el obstáculo más alto tiene una altura de h1 = 6.

// Para poder saltar todos los obstáculos, Dan debe tomar 6 - 4 = 2 dosis.

// Ejemplo de entrada 1

// 5 7
// 2 5 4 5 2

// Muestra de salida 1

// 0

// Explicación 1

// El personaje de Dan puede saltar un máximo de k = 7 unidades, lo que es suficiente para cruzar todos los obstáculos:

// Como ya puede saltar todos los obstáculos, Dan necesita beber 0 dosis.

function hurdleRace(k, height) {

    // La funcion recibe dos parametros
    // 1). La altura maxima que puede saltar el personaje
    // 2). Un arreglo con las alturas de las vallas del juego

    let vallaMasAlta = 0;
    for (let altura of height) {
        if (altura > vallaMasAlta) {
            vallaMasAlta = altura;
        }
    }

    return (k > vallaMasAlta) ? 0 : Math.abs(k - vallaMasAlta);
}

// Caso de prueba 1
let k = 1;
let height = [1, 2, 3, 3, 2];

console.log(hurdleRace(k, height));

// Caso de prueba 2
let k1 = 4;
let height1 = [1, 6, 3, 5, 2];

console.log(hurdleRace(k1, height1));

// Caso de prueba 3
let k2 = 7;
let height2 = [2, 5, 4, 5, 2];

console.log(hurdleRace(k2, height2));