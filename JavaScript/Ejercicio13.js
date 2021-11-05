// Una cárcel tiene un número de presos y un número de golosinas para repartir entre ellos. El carcelero decide que la forma más justa de repartir las golosinas es sentar a los presos alrededor de una mesa circular en sillas numeradas secuencialmente. Se sacará un número de silla de un sombrero. Empezando por el preso que ocupe esa silla, se entregará un caramelo a cada uno de los presos de forma secuencial alrededor de la mesa hasta que se hayan distribuido todos.

// Sin embargo, el carcelero hace una pequeña broma. El último caramelo se parece a todos los demás, pero tiene un sabor horrible. Determina el número de silla que ocupa el preso que recibirá ese caramelo.

// Ejemplo: 

// n = 4
// m = 6
// s = 2

// Hay 4 presos, 6 caramelos y la distribución comienza en la silla 2. Los presos se colocan en los asientos numerados del 1 al 4. Los presos reciben los caramelos en las posiciones 2,3,4,1,2,3. El preso al que hay que avisar se sienta en la silla número 3.

// Descripción de la función

// Complete la función guardarElPrisionero en el editor de abajo. Debe devolver un número entero que representa el número de silla del preso a avisar.

// saveThePrisoner tiene los siguientes parámetros:

// * int n: el número de prisioneros
// * int m: el número de caramelos
// * int s: el número de silla desde el que se empiezan a repartir los caramelos

// Devuelve

// int: el número de silla del prisionero a avisar

// Formato de entrada

// La primera línea contiene un número entero, T, el número de casos de prueba.

// Las siguientes líneas T contienen cada una 3 enteros separados por espacios:

// * n = el número de prisioneros
// * m = el número de caramelos
// * s = el número de silla para empezar a repartir caramelos

// Ejemplo de entrada 0

// 2
// 5 2 1
// 5 2 2

// Muestra de salida 0

// 2
// 3

// Explicación 0

// En la primera consulta, hay n = 5 presos y m = 2 caramelos. La distribución comienza en el asiento número s = 1. Los prisioneros de los asientos 1 y 2 reciben caramelos. Avisa al prisionero 2.

// En la segunda consulta, la distribución comienza en el asiento 2, por lo que los prisioneros de los asientos 2 y 3 reciben caramelos. Adviértase al prisionero 3.

// Ejemplo de entrada 1

// 2
// 7 19 2
// 3 7 3

// Ejemplo de salida 1

// 6
// 3

// Explicación 1

// En el primer caso de prueba, hay n = 7 presos, m = 19 caramelos y se reparten empezando por la silla s = 2. Los caramelos dan dos vueltas y se pasan 5 caramelos más a cada preso desde el asiento 2 al 6.

// En el segundo caso de prueba, hay n = 3 prisioneros, m = 7 caramelos y se reparten empezando por el asiento s = 3. Dan dos vueltas y hay uno más para repartir al prisionero del asiento 3.

function saveThePrisoner(n, m, s) {
}