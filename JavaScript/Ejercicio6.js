// La casa de Sam tiene un manzano y un naranjo que dan abundante fruta.
// Utilizando la información dada a continuación, determina el número de
// manzanas y naranjas que caen en la casa de Sam en el diagrama de abajo:

// * La región roja denota la casa, donde S es el punto inicial y T es el punto
// final. El manzano está a la izquierda de la casa y el naranjo está a su
// derecha.

// * Supongamos que los árboles están situados en un único punto, donde el
// manzano está en el punto A, y el naranjo está en el punto B.

// * Cuando una fruta cae de su árbol, cae a D unidades de distancia de su árbol
// de origen a lo largo del eje X. * Un valor negativo de D significa que la
// fruta cayó D unidades a la izquierda del árbol, y un valor positivo de D
// significa que cae D unidades a la derecha del árbol. *

// Dado el valor de D para M manzanas y N naranjas, determina cuántas manzanas y
// naranjas caerán en la casa de Sam (es decir, en el rango inclusivo [S,T]).

// Por ejemplo, la casa de Sam está entre S = 7 y T = 10. El manzano está
// situado en A = 4 y la naranja en B = 12. Hay M = 3 manzanas y N = 3 naranjas.
// Las manzanas se tiran MANZANAS = [2,3,-4] unidades de distancia de A, y
// NARANJAS = [3, -2, -4] unidades de distancia. Sumando cada distancia de las
// manzanas a la posición del árbol, caen en [4 + 2,4 + 3,4 + -4] = [6,7,0]. Las
// naranjas aterrizan en [12 + 3,12 + -2,12 + -3] = [15,10,8]. Una manzana y dos
// naranjas aterrizan en el rango inclusivo 7 - 10 por lo que imprimimos

// 1
// 2

// Descripción de la función

// Complete la función countApplesAndOranges en el editor de abajo. Debe
// imprimir el número de manzanas y naranjas que caen en la casa de Sam, cada
// una en una línea separada.

// countApplesAndOranges tiene los siguientes parámetros

// * s: entero, punto inicial de la ubicación de la casa de Sam.
// * t: entero, punto final de la ubicación de la casa de Sam.
// * a: entero, ubicación del manzano.
// * b: entero, ubicación del Naranjo.
// * Manzanas: matriz de enteros, distancia a la que cae cada manzana del árbol.
// * Naranjas: matriz de enteros, distancia a la que cae cada naranja del árbol.

// Formato de entrada

// * La primera línea contiene dos enteros separados por espacios que indican
// los valores respectivos de S y T.

// * La segunda línea contiene dos enteros separados por espacios que denotan
// los valores respectivos de A y B.

// * La tercera línea contiene dos enteros separados por espacios que denotan
// los valores respectivos de M y N.

// * La cuarta línea contiene M enteros separados por espacios que denotan las
// respectivas distancias a las que cae cada manzana desde el punto A.

// * La quinta línea contiene N enteros separados por espacios que denotan las
// distancias respectivas a las que cae cada naranja desde el punto B.

// Formato de salida

// Imprime dos enteros en dos líneas diferentes:

// 1.El primer entero: el número de manzanas que caen en la casa de Sam.
// 2.El segundo entero: el número de naranjas que caen en la casa de Sam.

// Ejemplo de entrada 0

// 7 11
// 5 15
// 3 2
// -2 2 1
// 5 -6

// Muestra de salida 0

// 1
// 1

// Explicación 0

// La primera manzana cae en la posición 5 - 2 = 3.

// La segunda manzana cae en la posición 5 + 2 = 7

// La tercera manzana cae en la posición 5 + 1 = 6

// La primera naranja cae en la posición 15 + 5 = 20

// La segunda naranja cae en la posición 15 - 6 = 9

// Sólo una fruta (la segunda manzana) cae dentro de la región entre 7 y 11, así
// que imprimimos 1 como nuestra primera línea de salida.

// Sólo la segunda naranja cae dentro de la región entre 7 y 11, por lo que
// imprimimos 1 como nuestra segunda línea de salida.



function countApplesAndOranges(s, t, a, b, apples, oranges) {
    // S = Es el punto inicial de la casa
    // T = Es el punto final de la casa
    // A = Punto donde se encuentra el manzano
    // B = Punto donde se encuentra el naranjo
    // apples = Es la lista en donde cayeron las manzanas
    // oranges = Es la lista en donde cayeron las naranjas
    // Si el valor es negativo significa que la fruta cayo a la izquierda del arbol,
    // si el valor es negativo significa que cayo a la derecha del arbol

    let contadorManzanas = 0;
    let contadorNaranjas = 0;

    for (let i = 0; i < apples.length; i++) {
        apples[i] = apples[i] + a;
    }

    for (let j = 0; j < oranges.length; j++) {
        oranges[j] = oranges[j] + b;
    }

    for (let i = 0; i < apples.length; i++) {
        if (apples[i] >= s && apples[i] <= t) {
            contadorManzanas++;
        }
    }

    for (let j = 0; j < oranges.length; j++) {
        if (oranges[j] >= s && oranges[j] <= t) {
            contadorNaranjas++;
        }
    }

    return console.log(contadorManzanas + "\n" + contadorNaranjas);
}

let s = 7;
let t = 11;
let a = 5;
let b = 15;
let apples = [-2, 2, 1];
let oranges = [5, -6];

countApplesAndOranges(s, t, a, b, apples, oranges);