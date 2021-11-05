// Dos amigos, Anna y Brian, están decidiendo cómo repartir la cuenta en una cena. Cada uno pagará sólo lo que consuma. Brian recibe la cuenta y calcula la parte de Anna. Debes determinar si su cálculo es correcto.

// Por ejemplo, supón que la cuenta tiene los siguientes precios: Cuenta =[2, 4, 6]. Ana se niega a comer el artículo K = Factura[2] que cuesta 6. Si Brian calcula la factura correctamente, Ana pagará (2 + 4) / 2 = 3. Si incluye el coste de la factura[2], calculará (2 + 4 + 6) / 2 = 6. En el segundo caso, deberá devolver 3 a Ana.

// Descripción de la función

// Complete la función bonAppetit en el editor de abajo. Debería imprimir BonAppetit si la cuenta está bastante dividida. En caso contrario, debería imprimir la cantidad entera de dinero que Brian le debe a Ana.

// bonAppetit tiene los siguientes parámetros

// * factura: una matriz de enteros que representa el coste de cada artículo pedido
// * k: un entero que representa el índice de base cero del artículo que Anna no come
// * b: la cantidad de dinero que Anna ha aportado a la cuenta

// Formato de entrada

// La primera línea contiene dos enteros separados por espacios N y K, el número de artículos pedidos y el índice basado en 0 del artículo que Ana no comió. 

// La segunda línea contiene N enteros separados por espacios Bill[i] donde 0 <= i < n.

// La tercera línea contiene un entero, b, la cantidad de dinero que Brian cobró a Ana por su parte de la cuenta.

// Formato de salida

// Si Brian no cobró de más a Anna, imprime Bon Appetit en una nueva línea; en caso contrario, imprime la diferencia (es decir, Bcharged, - Bactual) que Brian debe devolver a Anna. Esto siempre será un número entero.

// Ejemplo de entrada 0

// 4 1
// 3 10 2 9
// 12

// Muestra de salida 0

// 5

// Explicación 0

// Anna no comió el artículo Bill[1] = 10, pero compartió el resto de los artículos con Brian. El coste total de los artículos compartidos es 3 + 2 + 9 = 14 y, dividido por la mitad, el coste por persona es Bactual = 7. Brian le cobró Bcharged = 12 por su parte de la cuenta. Imprimimos la cantidad que se le cobró de más a Ana, Bcharged - Bactual = 12 - 7 = 5, en una nueva línea.

// Ejemplo de entrada 1

// 4 1
// 3 10 2 9
// 7

// Ejemplo de salida 1

// Buen provecho

// Explicación 1

// Anna no comió el artículo Bill[1] = 10, pero compartió el resto de los artículos con Brian. El coste total de los artículos compartidos es 3 + 2 + 9 = 14 y, dividido por la mitad, el coste por persona es Bactual = 7. Como Bactual = Bcharged = 7, imprimimos Bon Appetit en una nueva línea.

function bonAppetit(bill, k, b) {
    let totalCuenta = 0;
    bill[k] = 0;
    bill.forEach(elemento => totalCuenta += elemento);

    totalCuenta = totalCuenta / 2;

    if (totalCuenta - b === 0) {
        return 'Bon Appetit';
    } else {
        return Math.abs(totalCuenta - b);
    }
    // return (totalCuenta - b === 0) ? 'Bon Appetit' : Math.abs(totalCuenta - b);
}

// Caso de prueba 1

let bill1 = [3, 10, 2, 9];
let k1 = 1;
let b1 = 12;

console.log(bonAppetit(bill1, 1, k1, b1));

// Caso de prueba 2

let bill2 = [3, 10, 2, 9];
let k2 = 1;
let b2 = 7;

console.log(bonAppetit(bill2, k2, b2));

