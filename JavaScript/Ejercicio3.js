// El profesor pide a la clase que abra sus libros en un número de página. Los alumnos pueden empezar a pasar las páginas por la parte delantera del libro o por la trasera. Siempre pasan las páginas de una en una. Cuando abren el libro, la página 1 está siempre a la derecha:

// Cuando pasan la página 1, ven las páginas 2 y 3. Todas las páginas, excepto la última, se imprimen siempre por las dos caras. La última página sólo puede estar impresa en el anverso, dada la longitud del libro. Si el libro tiene N páginas y un alumno quiere pasar a la página P, ¿cuál es el número mínimo de páginas que debe pasar? Pueden empezar por el principio o por el final del libro.

// Dados N y P, encuentra e imprime el número mínimo de páginas que hay que pasar para llegar a la página P.

// Ejemplo

// n = 5
// p = 3

// Utilizando el diagrama anterior, si el alumno quiere llegar a la página 3, abre el libro por la página 1, pasa 1 página y está en la página correcta. Si abren el libro por la última página, la 5, pasan 1 página y están en la página correcta. Vuelve 1.

// Descripción de la función

// Complete la función pageCount en el editor de abajo.

// pageCount tiene los siguientes parámetros:

//     * int n: el número de páginas del libro
//     * int p: el número de página a pasar

// Devuelve

// int: el número mínimo de páginas a pasar

// Formato de entrada

// La primera línea contiene un número entero N, el número de páginas del libro.

// La segunda línea contiene un entero, P, la página a la que hay que pasar.

// Ejemplo de entrada 0

// 6
// 2

// Ejemplo de salida 0

// 1

// Explicación 0

// Si el alumno empieza a pasar por la página 1, sólo tiene que pasar 1 página.

// Si el estudiante comienza a pasar desde la página 6, necesita pasar 2 páginas.

// Devuelve el valor mínimo, 1.

function pageCount(n, p) {

    var izquierdaADerecha = parseInt(p / 2);
    var derechaAIzquierda = Math.abs(parseInt((n / 2) - izquierdaADerecha));

    // Retornar el menor valor

    return Math.min(izquierdaADerecha, derechaAIzquierda);
}

// Caso de prueba 1
// var n = 6;
// var p = 2;

// console.log(pageCount(n, p));

// Caso de prueba 2
// var n = 5;
// var p = 3;

// console.log(pageCount(n, p));

// Caso de prueba 3
// var n = 5;
// var p = 4;

// console.log(pageCount(n, p));

// Caso de prueba 3
// var n = 5;
// var p = 1;

// console.log(pageCount(n, p));

// Caso de prueba 4
var n = 4;
var p = 4;

console.log(pageCount(n, p));