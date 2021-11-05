// Dada una matriz de enteros, encuentra la submatriz más larga en la que la diferencia absoluta entre dos elementos cualesquiera sea menor o igual que 1.

// Ejemplo:

// a = [1,1,2,2,4,4,5,5,5]

// Hay dos submatrices que cumplen el criterio: [1,1,2,2] y [4,4,5,5,5]. La submatriz de longitud máxima tiene 5 elementos.

// Descripción de la función

// Complete la función pickingNumbers en el editor de abajo.

// pickingNumbers tiene los siguientes parámetros:

//      * int a[n]: un array de enteros

// Devuelve

// int: la longitud de la submatriz más larga que cumple el criterio.

// Formato de entrada

// La primera línea contiene un único número entero N, el tamaño de la matriz A.

// La segunda línea contiene N enteros separados por espacios, cada uno de los cuales es un A[i].

// Ejemplo de entrada 0

// 6
// 4 6 5 3 3 1

// Ejemplo de salida 0

// 3

// Explicación 0

// Elegimos el siguiente conjunto de enteros de la matriz: {4,3,3} Cada par del multiconjunto tiene una diferencia absoluta <= 1 ( [4 - 3] = 1 y [3 - 3] = 0 ), por lo que imprimimos el número de enteros elegidos, 3, como respuesta.

// Muestra de entrada 1

// 6
// 1 2 2 3 1 2

// Muestra de salida 1

// 5

// Explicación 1

// Elegimos el siguiente conjunto de enteros de la matriz: {1,2,2,1,2}. Cada par del multiconjunto tiene una diferencia absoluta <= 1 ( [1 - 2] = 1, [1 - 1] = 0, y [2 - 2] = 0 ), por lo que imprimimos el número de enteros elegidos, 5, como respuesta.

//---------------------------------------------------------------------------------------------------------------
// Paso a paso para solucionar el problema

//1).Crear una variable para almacenar la cantidad del arreglo mas largo que cumple la condicion.

//2).Crear segmentos o subarreglos que cumplan la siguiente condicion la diferencia entre cada elemento con otro debe ser menor o igual a 1.

//2.1).Crear un for que itere cada elemento en el arreglo a.
//2.2).Crear una variable que almacenara el subarreglo creado.
//2.3).Crear un for anidado al for del paso anterior que itere cada elemento del arreglo a.
//2.4).Comprobar si la diferencia absoluta del elemento del segundo for y el elemento del primer for es menor o igual a 1 y comprobar que la variable que itera el segundo for sea distinta a la variable que itera el primer for, si esta condicion se cumple agregar el elemento a la variable del paso 2.2.
//2.5).Una vez creado el segmento que cumple la condicion, verificar si su ancho es mayor a lo que hay en la variable creada en el paso 1, si es asi actualizar su valor.

//3).Retornar el valor almacenado en la variable del paso 1.

// Solucion A
function pickingNumbers1(a) {
    let resultado = 0; // Solucion paso 1

    // Solucion paso 2
    for (let i = 1; i < a.length; i++) { // Solucion paso 2.1
        let arreglo = [a[i]]; // Solucion paso 2.2
        for (let j = 0; j < a.length; j++) { // Solucion paso 2.3
            let agregar = true;
            for (let x = 0; x < arreglo.length; x++) {
                if (!(Math.abs(arreglo[x] - a[j]) <= 1)) {
                    agregar = false;
                    break;
                }
            }

            if (Math.abs(a[i] - a[j]) <= 1 && j !== i && agregar) { // Solucion paso 2.4
                arreglo.push(a[j]);
            }
        }

        if (arreglo.length > resultado) { //Solucion paso 2.3
            resultado = arreglo.length;
        }
    }
    return resultado; // Solucion paso 3
}

// Solucion B
function pickingNumbers(a) {

    let arregloSinRepeticiones = [];

    for (let i = 1; i < a.length; i++) {
        if (arregloSinRepeticiones.indexOf(a[i]) === -1) {
            arregloSinRepeticiones.push(a[i]);
        }
    }

    let resultado = 0;

    for (let i = 0; i < arregloSinRepeticiones.length; i++) {
        let arreglo = [arregloSinRepeticiones[i]];
        for (let j = 0; j < a.length; j++) {
            let agregar = true;
            for (let x = 0; x < arreglo.length; x++) {
                if (!(Math.abs(arreglo[x] - a[j]) <= 1)) {
                    agregar = false;
                    break;
                }
            }

            if (Math.abs(arregloSinRepeticiones[i] - a[j]) <= 1 && agregar) {
                arreglo.push(a[j]);
            }
        }

        if (arreglo.length > resultado) {
            resultado = arreglo.length;
        }
    }
    return resultado - 1;
}

// Caso de prueba 1
// let a = [1, 2, 2, 3, 1, 2];

// console.log(pickingNumbers(a)); // 5

// Caso de prueba 2
// let a = [4, 6, 5, 3, 3, 1];

// console.log(pickingNumbers(a)); // 3

// Caso de prueba 3
// let a = [1, 1, 2, 2, 4, 4, 5, 5, 5];

// console.log(pickingNumbers(a)); // 5

let a = [4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4];

console.log(pickingNumbers(a));