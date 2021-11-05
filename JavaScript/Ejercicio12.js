// Una persona quiere determinar el teclado de ordenador y la unidad USB más caros que se pueden comprar con un presupuesto determinado.Dadas las listas de precios de los teclados y las unidades USB y un presupuesto, halle el coste de comprarlos.Si no es posible comprar ambos artículos, devuelva - 1.

// Ejemplo

// b = 60
// teclados = [40, 50, 60]
// unidades = [5, 8, 12]

// La persona puede comprar un teclado de 40 + 12 unidades = 52, o un teclado de 50 + 8 unidades = 58 Elija esta última opción como la más cara y devuelva 58.

// Descripción de la función

// Complete la función getMoneySpent en el editor de abajo.

// getMoneySpent tiene los siguientes parámetros:

// * int teclados[n]: los precios de los teclados
// * int discos[m]: los precios de los discos
// * int b: el presupuesto

// Devuelve

// int: el máximo que se puede gastar, o - 1 si no es posible comprar ambos artículos.

// Formato de entrada

// La primera línea contiene tres enteros separados por espacios B, N y M, el presupuesto, el número de modelos de teclado y el número de modelos de unidades USB.

// La segunda línea contiene N enteros separados por espacios Teclado[i], los precios de cada modelo de teclado.

// La tercera línea contiene M enteros separados por espacios unidades, los precios de las unidades USB.

// Ejemplo de entrada 0

// 10 2 3
// 3 1
// 5 2 8

// Muestra de salida 0

// 9

// Explicación 0

// Compra el segundo teclado y la tercera unidad USB por un coste total de 8 + 1 = 9.

// Ejemplo de entrada 1

// 5 1 1
// 4
// 5

// Muestra de salida 1

// -1

// Explicación 1

// No es posible comprar un teclado y una unidad USB porque 4 + 5 > 5, por lo que devuelve - 1.

function getMoneySpent(keyboards, drives, b) {

    // La funcion recibe los siguientes parametros:
    // * int teclados[n]: los precios de los teclados
    // * int discos[m]: los precios de los discos
    // * int b: el presupuesto

    let compraMasAlta = -1;

    for (let i = 0; i < keyboards.length; i++) {
        for (let j = 0; j < drives.length; j++) {
            if ((keyboards[i] + drives[j]) > compraMasAlta && (keyboards[i] + drives[j]) <= b) {
                compraMasAlta = keyboards[i] + drives[j];
            }
        }
    }

    return compraMasAlta;
}

// Caso de prueba 1
let b = 60;
let teclados = [40, 50, 60];
let unidades = [5, 8, 12];

console.log(getMoneySpent(teclados, unidades, b));

// Caso de prueba 2
b = 10;
teclados = [3, 1];
unidades = [5, 2, 8];

console.log(getMoneySpent(teclados, unidades, b));

// Caso de prueba 3
b = 5;
teclados = [4];
unidades = [5];

console.log(getMoneySpent(teclados, unidades, b));