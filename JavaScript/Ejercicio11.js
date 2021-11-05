// Dos gatos y un ratón están en varias posiciones en una línea.Se te darán sus posiciones iniciales.Tu tarea consiste en determinar qué gato llegará primero al ratón, suponiendo que el ratón no se mueva y que los gatos viajen a la misma velocidad.Si los gatos llegan al mismo tiempo, el ratón podrá moverse y escapará mientras ellos luchan.

// Se le dan consultas Q en forma de X, Y y Z que representan las posiciones respectivas para los gatos A y B, y para el ratón C.Complete la función catAndMouse para devolver la respuesta apropiada a cada consulta, que se imprimirá en una nueva línea.

// * Si el gato A atrapa el ratón primero, imprime Cat A.
// * Si el gato B atrapa el ratón primero, imprime Cat B.
// * Si ambos gatos alcanzan al ratón al mismo tiempo, imprime Ratón C mientras los dos gatos se pelean y el ratón se escapa.

// Ejemplo

// X = 2
// Y = 5
// Z = 4

// Los gatos están en las posiciones 2(Gato A) y 5(Gato B), y el ratón está en la posición 4. El gato B, en la posición 5, llegará primero ya que está a sólo 1 unidad mientras que el otro está a 2 unidades.Devuelve "Gato B".

// Descripción de la función

// Complete la función catAndMouse en el editor de abajo.

// catAndMouse tiene los siguientes parámetros:

// * int x: Posición del gato A.
// * int y: Posición del gato B.
// * int z: Posición del ratón C

// Devuelve

// cadena: O bien 'Gato A', 'Gato B', o 'Ratón C'

// Formato de entrada

// La primera línea contiene un único número entero, Q, que denota el número de consultas.

// Cada una de las Q líneas siguientes contiene tres enteros separados por espacios que describen los valores respectivos de X(ubicación del gato A), Y(ubicación del gato B) y Z(ubicación del ratón C),

// Ejemplo de entrada 0

// 2
// 1 2 3
// 1 3 2

// Muestra de salida 0

// Gato B
// Ratón C

// Explicación 0

// Consulta 0: Las posiciones de los gatos y el ratón se muestran a continuación:
// El gato B atrapará al ratón primero, por lo que imprimimos el gato B en una nueva línea.

// Consulta 1: En esta consulta, los gatos A y B alcanzan al ratón C exactamente al mismo tiempo: 
// Como el ratón se escapa, imprimimos el ratón C en una nueva línea.

function catAndMouse(x, y, z) {
    // La funcion recibe tres parametros:
    // 1). El numero de consultas.
    // 2). Un arreglo con la posicion del gato A, gato B y el raton C
    // 3). Un arreglo con la posicion del gato A, gato B y el raton C
    let a = Math.abs(x - z);
    let b = Math.abs(y - z);

    if (a == b) {
        return "Mouse C";
    } else if (a < b) {
        return "Cat A";
    } else {
        return "Cat B";
    }

}

let x = 1;
let y = 2;
let z = 3;

console.log(catAndMouse(x, y, z));