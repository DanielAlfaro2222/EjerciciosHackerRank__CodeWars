// Dos amigos, Anna y Brian, están decidiendo cómo repartir la cuenta en una cena. Cada uno pagará sólo lo que consuma. Brian recibe la cuenta y calcula la parte de Anna. Debes determinar si su cálculo es correcto.

// Por ejemplo, supongamos que la cuenta tiene los siguientes precios: cuenta = [2,4,6]. Ana rechaza comer el artículo k = factura[2], que cuesta k = 6. Si Brian calcula la factura correctamente, Ana pagará (2 + 4)/2 = 3. Si incluye el coste de la factura[2], calculará (2 + 4 + 6) / 2 = 6. En el segundo caso, deberá devolver 3 a Ana.

// Formato de entrada

// * La primera línea contiene dos enteros separados por espacios N y K, el número de artículos pedidos y el    índice basado en 0 del artículo que Ana no comió.

// * La segunda línea contiene N enteros separados por espacios bill[ ]

// * La tercera línea contiene un entero, B, la cantidad de dinero que Brian cobró a Ana por su parte de la cuenta.

// Descripción de la función

// Complete la función bonAppetit en el editor de abajo. Debería imprimir Bon Appetit si la cuenta está bastante dividida. De lo contrario, debería imprimir la cantidad entera de dinero que Brian le debe a Ana.

// bonAppetit tiene los siguientes parámetros

// factura: una matriz de enteros que representa el coste de cada artículo pedido
// k: un entero que representa el índice de base cero del artículo que Anna no come
// b: la cantidad de dinero que Anna ha aportado a la cuenta

function bonAppetit(bill, k, b) {

    bill[k] = 0;
    var dineroDevuelto = 0;
    var total = 0;

    for (var i = 0; i < bill.length; i++) {
        var subtotal = bill[i];
        total += subtotal;
    }

    dineroDevuelto = Math.abs((total / 2) - b);

    if (dineroDevuelto === 0) {
        return "Bon Appetit";
    } else {
        return dineroDevuelto;
    }
}

// Caso de prueba 1
var k = 1;
var bill = [3, 10, 2, 9];
var b = 12;
console.log("Resultado de el caso de prueba 1: " + bonAppetit(bill, k, b));

// Caso de prueba 2
var k = 1;
var bill = [3, 10, 2, 9];
var b = 7;
console.log("Resultado de el caso de prueba 2: " + bonAppetit(bill, k, b));