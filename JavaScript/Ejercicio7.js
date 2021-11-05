// Marie ha inventado una Máquina del Tiempo y quiere probarla viajando en el tiempo para visitar Rusia en el Día del Programador (el 256º día del año) durante un año en el rango inclusivo de 1700 a 2700.

// Desde 1700 hasta 1917, el calendario oficial de Rusia fue el calendario juliano; desde 1919 utilizaron el sistema de calendario gregoriano. La transición del sistema de calendario juliano al gregoriano se produjo en 1918, cuando el día siguiente al 31 de enero fue el 14 de febrero. Esto significa que en 1918, el 14 de febrero era el 32º día del año en Rusia.

// En ambos sistemas de calendario, febrero es el único mes con una cantidad variable de días; tiene 29 días durante un año bisiesto, y 28 días durante todos los demás años. En el calendario juliano, los años bisiestos son divisibles por 4; en el calendario gregoriano, los años bisiestos son

// * Divisible por 400.
// * Divisible por 4 y no divisible por 100.

// Dado un año, Y, encuentra la fecha del 256º día de ese año según el calendario oficial ruso durante ese año. A continuación, imprímelo en el formato dd.mm.aaaa, donde dd es el día de dos dígitos, mm es el mes de dos dígitos y aaaa es Y.

// Por ejemplo, el Año dado = 1984. 1984 es divisible por 4, por lo que es un año bisiesto. El 256º día de un año bisiesto después de 1918 es el 12 de septiembre, por lo que la respuesta es 12.09.1984.

// Descripción de la función

// Complete la función dayOfProgrammer en el editor de abajo. Debe devolver una cadena que representa la fecha del 256º día del año dado.

// dayOfProgrammer tiene los siguientes parámetros

// * año: un número entero

// Formato de entrada

// Un solo entero que denota el año Y.

// Restricciones

// * 1700 \le y \le 2700

// Formato de salida

// Imprime la fecha completa del Día del Programador durante el año Y en el formato dd.mm.aaaa, donde dd es el día de dos dígitos, mm es el mes de dos dígitos y aaaa es Y.

// Ejemplo de entrada 0

// 2017

// Muestra de salida 0

// 13.09.2017

// Explicación 0

// En el año Y = 2017, enero tiene 31 días, febrero tiene 28 días, marzo tiene 31 días, abril tiene 30 días, mayo tiene 31 días, junio tiene 30 días, julio tiene 31 días y agosto tiene 31 días. Si sumamos el número total de días de los ocho primeros meses, obtenemos 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243. El Día del Programador es el día 256, así que calculamos 256 - 243 = 13 para determinar que cae en el día 13 del noveno mes (septiembre). A continuación, imprimimos la fecha completa en el formato especificado, que es 13.09.2017.

// Ejemplo de entrada 1

// 2016

// Ejemplo de salida 1

// 12.09.2016

// Explicación 1

// El año Y = 2016 es bisiesto, por lo que febrero tiene 29 días, pero todos los demás meses tienen el mismo número de días que en 2017. Si sumamos el número total de días de los ocho primeros meses, obtenemos 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 = 244. El Día del Programador es el día 256, así que entonces calculamos 256 - 244 = 12 para determinar que cae en el día 12 del noveno mes (septiembre). A continuación, imprimimos la fecha completa en el formato especificado, que es 12.09.2016.

// Ejemplo de entrada 2

// 1800

// Muestra de salida 2

// 12.09.1800

// Explicación 2

// Dado que 1800 es un año bisiesto según el calendario juliano. El día coincide con el 12 de septiembre.

/*
-----------------------------------------------------------------------------------------------------------------
Cosas a tener en cuenta

    * La funcion acepta un valor de 1700 a 2700 en el rango inclusivo.
    * Desde 1700 hasta 1917, el calendario oficial de Rusia fue el calendario juliano.
    * En Rusia desde 1919 utilizaron el sistema de calendario gregoriano.
    * En ambos sistemas de calendario, febrero es el único mes con una cantidad variable de días; tiene 29 días durante un año bisiesto, y 28 días durante todos los demás años.
    * En el calendario juliano, los años bisiestos son divisibles por 4.
    * En el calendario gregoriano, los años bisiestos son:

        * Divisible por 400.
        * Divisible por 4 y no divisible por 100.

    * La funcion debe imprímir el resultado en el formato dd.mm.aaaa.
*/

/* 
-----------------------------------------------------------------------------------------------------------------
Pasos para resolver el problema 

1).Revisar mediante un condicional que tipo de calendario se le aplica al año recibido en la funcion.
2).Revisar y calcular si el año dependiendo del tipo de calendario es bisiesto o no
3).Recorrer desde el 1 hasta el 12, e ir sumando los dias hasta que la suma sea mayor a 256.
4).Para el dia se resta el total de los dias del paso anterior menos 256.
5).Para el mes se debe almacenar hasta donde llego el for.
6).Retornar el resultado.
*/

function dayOfProgrammer(year) {

    let totalDias = 0;
    let mes = 0;
    let anioBisiesto = false; // Suponemos que el año no es bisiesto
    let dia = 0;

    if (year >= 1919) { // Revisar si en ese año se aplica el calendario gregoriano

        if (year % 4 === 0 && year % 400 === 0 && year % 100 === 0) {
            anioBisiesto = true;
        }

        for (let i = 1; i <= 12; i++) {
            if (i === 2) { // Verificar si el mes es febrero
                totalDias += anioBisiesto ? 29 : 28;
            }
            else if (i === 4 || i === 6 || i === 9 || i === 11) { // Verificar si el mes tiene 30 dias
                if (totalDias + 30 < 256) {
                    totalDias += 30;
                } else {
                    mes = i;
                    dia = Math.abs(totalDias - 256);
                    break;
                }
            } else {
                if (totalDias + 31 < 256) {
                    totalDias += 31;
                } else {
                    mes = i;
                    dia = Math.abs(totalDias - 256);
                    break;
                }
            }
        }
    } else { // Se aplica el calendario juliano

        if (year % 4 == 0) { // Revisar si el año es bisiesto
            anioBisiesto = true;
        }

        for (let j = 1; j <= 12; j++) {
            if (j === 2) { // Verificar si el mes es febrero
                totalDias += anioBisiesto ? 30 : 29;
            }
            else if (i === 4 || i === 6 || i === 8 || i === 10 || i === 12) { // Verificar si el mes tiene 30 dias
                if (totalDias + 30 < 256) {
                    totalDias += 30;
                } else {
                    mes = j;
                    dia = Math.abs(totalDias - 256);
                    break;
                }
            } else {
                if (totalDias + 31 < 256) {
                    totalDias += 31;
                } else {
                    mes = j;
                    dia = Math.abs(totalDias - 256);
                    break;
                }
            }
        }
    }

    dia = (dia < 10) ? "0" + dia : dia;
    mes = (mes < 10) ? "0" + mes : mes;

    return dia + "." + mes + "." + year;
}

console.log(dayOfProgrammer(2016)); //No
console.log(dayOfProgrammer(1900)); //No
console.log(dayOfProgrammer(2000)); //Si
console.log(dayOfProgrammer(2100)); //No
console.log(dayOfProgrammer(2200)); //No
console.log(dayOfProgrammer(2300)); //No
console.log(dayOfProgrammer(2500)); //No
console.log(dayOfProgrammer(2400)); //Si