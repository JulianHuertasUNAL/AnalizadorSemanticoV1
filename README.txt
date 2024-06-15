Analizador Semántico
Grupo:
Jordan
Santiago
Jonathan
Julián

Configuración del proyecto:
Se hizo la configuración en el IDE Intellij como se mostró durante las clases:
    *Agregar la carpeta de gen al las carpetas source
    *Añadir la dependencia de ANTLR (.jar) al modulo

Recibe inputs por consola
Imprime la traducción en el archivo de texto LatinoToPythonTranslation.txt

*Hubo problemas para la traducción de las concatenaciones, ya que en Python, a diferencia de Latino, no se pueden
concatenar dos expresiones si son de diferente tipo. Se intentó implementar una traducción de cada vez que encontrará
una concatenación hiciera el cambio del tipo de dato con el str() para cada expresión, pero no se logró que funcionara
correctamente (Se deja comentado en enterExp y exitExp lo que se intentó hacer).



