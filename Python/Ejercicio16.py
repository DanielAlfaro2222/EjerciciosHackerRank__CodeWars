"""
-----------------------------------------------------------------------------------------------------------------
Problema

Python tiene métodos de validación de cadenas incorporados para los datos básicos. Puede comprobar si una cadena está compuesta por caracteres alfabéticos, alfanuméricos, dígitos, etc.

* str.isalnum()

    Este método comprueba si todos los caracteres de una cadena son alfanuméricos (a-z, A-Z y 0-9).

    >>> print 'ab123'.isalnum()
    True
    >>> print 'ab123#'.isalnum()
    False

* str.isalpha()

    Este método comprueba si todos los caracteres de una cadena son alfabéticos (a-z y A-Z).

    >>> print 'abcD'.isalpha()
    True
    >>> print 'abcd1'.isalpha()
    False

* str.isdigit()

    Este método comprueba si todos los caracteres de una cadena son dígitos (0-9).

    >>> print '1234'.isdigit()
    True
    >>> print '123edsd'.isdigit()
    False

* str.islower()

    Este método comprueba si todos los caracteres de una cadena son minúsculas (a-z).

    >>> print 'abcd123#'.islower()
    True
    >>> print 'Abcd123#'.islower()
    False

* str.isupper()

    Este método comprueba si todos los caracteres de una cadena son mayúsculas (A-Z).

    >>> print 'ABCD123#'.isupper()
    True
    >>> print 'Abcd123#'.isupper()
    False

Tarea

    * Se le da una cadena S.
    * Su tarea consiste en averiguar si la cadena S contiene: caracteres alfanuméricos, caracteres alfabéticos, dígitos, minúsculas y mayúsculas.

Formato de entrada

Una sola línea que contenga la cadena S.

Formato de salida

* En la primera línea, imprima True si S tiene algún carácter alfanumérico. En caso contrario, imprime False.
* En la segunda línea, imprima True si S tiene algún carácter alfabético. En caso contrario, imprima False.
* En la tercera línea, imprima True si S tiene algún dígito. En caso contrario, imprima False.
* En la cuarta línea, imprima True si S tiene caracteres en minúscula. En caso contrario, imprima False.
* En la quinta línea, imprima True si S tiene caracteres en mayúscula. En caso contrario, imprime False.

Ejemplo

    Entrada

    * qA2

    Salida

    * True
    * True
    * True
    * True
    * True
"""

"""
-----------------------------------------------------------------------------------------------------------------
Solucion
"""

s = input()
Alfanumerico = False
Alfabetico = False
Numerico = False
Minuscula = False
Mayuscula = False

for letra in s:
    if letra.isalnum():
        Alfanumerico = True
    if letra.isalpha():
        Alfabetico = True
    if letra.isdigit():
        Numerico = True
    if letra.islower():
        Minuscula = True
    if letra.isupper():
        Mayuscula = True

print(f"{Alfanumerico}\n{Alfabetico}\n{Numerico}\n{Minuscula}\n{Mayuscula}")
