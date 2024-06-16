Analizador Semántico
Grupo:
Jordan Escarraga
Santiago Acosta
Jonathan Ochoa
Julián Huertas

Configuración del proyecto:
Se hizo la configuración en el IDE Intellij como se mostró durante las clases:
    *Agregar la carpeta de gen al las carpetas source
    *Añadir la dependencia de ANTLR (.jar) al modulo

Recibe inputs por consola
Imprime la traducción en el archivo de texto LatinoToPythonTranslation.txt

* Para los condicionales de Desde y Repetir, se asume que la forma de las expresiones son como ID OPREL (INT|ID),
es decir, con formas como i = 1, i+=1, o incluso i = a+1, pero para los casos en que la expresión sea del tipo i = 1+verdadero
esta no se traducira correctamente, esto debido a que la sintaxis en Python difiere bastante de la de Latino para estos condicionales,
se toma la expresión de manera completa cuando llega al no terminal de Desde y Repetir, provocando que el tipo booleano no quede
correctamente traducido en estos casos.

*Para la condición Repetir, se excluyen casos cuando la expresión pueda ser compleja, tipo i>1 || j<2, ya que debido a la diferencia de
sintaxis se está recuperando la expresión asumiendo que es una expresión sencilla.

* La traducción no soporta la conversión de strings a números en este tipo de entradas:
x = "100"
y = "10"

escribir(x + y)     //Devolverá 110
escribir(x - y)     //Devolverá 90
escribir(x * y)     //Devolverá 1000
escribir(x / y)     //Devolverá 10

* La traducción no replica el comportamiento de algunos de los carácteres especiales con la barra invertida

* La traducción no cubre la introducción de un nuevo índice en una lista, este tipo de entradas:
carro = [
   "Toyota",           //Este sería el índice #0
   "Camry",            //Este sería el índice #1
]

carro[2] = 2011        //Creamos un nuevo índice #2 y le asignamos el valor de "2011"
escribir(carro[2])     //Devolverá 2011




