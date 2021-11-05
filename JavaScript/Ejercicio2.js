// Hay una gran pila de calcetines que deben ser emparejados por colores. Dada una matriz de enteros que representan el color de cada calcetín, determinar cuántos pares de calcetines con colores iguales hay.

// Ejemplo

// n = 7
// ar = [1, 2, 1, 2, 1, 3, 2]

// Hay un par del color 1 y otro del color 2. Quedan tres calcetines impares, uno de cada color. El número de pares es 2

// Descripción de la función

// Complete la función sockMerchant en el editor de abajo.

// sockMerchant tiene los siguientes parámetros:

//     * int n: el número de calcetines en la pila
//     * int ar[n]: los colores de cada calcetín

// Formato de entrada

// La primera línea contiene un número entero N, el número de calcetines representados en AR.

// La segunda línea contiene N, enteros separados por espacios, AR[I], los colores de los calcetines en la pila.

// Ejemplo

// n = 9

// ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

// Salida 

// 3

function sockMerchant(n, ar) {

    var arreglo = [];

    for (var i = 0; i < ar.length; i++) {
        if (arreglo.indexOf(ar[i]) === -1) {
            arreglo.push(ar[i]);
        }
    }

    for (var j = 0; j < arreglo.length; j++) {
        var suma = 0;
        for (var x = 0; x < ar.length; x++) {
            if (arreglo[j] === ar[x]) {
                suma++;
            }
        }

        arreglo[j] = suma;
    }

    var resultado = 0;
    for (var j = 0; j < arreglo.length; j++) {
        if (arreglo[j] > 1) {
            resultado += parseInt(arreglo[j] / 2);
        }
    }

    return resultado;
}

n = 9
ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

console.log(sockMerchant(n, ar));