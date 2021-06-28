"""
-----------------------------------------------------------------------------------------------------------------
Problema

Casi cada cuatro años se añade un día más al calendario, el 29 de febrero, que se denomina bisiesto. Este día corrige el calendario por el hecho de que nuestro planeta tarda aproximadamente 365,25 días en orbitar alrededor del sol. Un año bisiesto contiene un día bisiesto.

En el calendario gregoriano se dan tres condiciones para identificar los años bisiestos:

El año puede dividirse uniformemente por 4, es un año bisiesto, a menos que:
El año puede ser dividido uniformemente por 100, NO es un año bisiesto, a menos que:
El año también es divisible uniformemente por 400. Entonces es un año bisiesto.

Dado un año, determine si es bisiesto. Si es un año bisiesto, devuelve el booleano True, en caso contrario devuelve False.

Tenga en cuenta que el stub de código proporcionado lee de STDIN y pasa los argumentos a la función is_leap. Sólo es necesario completar la función is_leap
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""


def is_leap(year):
    leap = False

    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                leap = True
        else:
            leap = True

    return leap


year = int(input())
print(is_leap(year))
