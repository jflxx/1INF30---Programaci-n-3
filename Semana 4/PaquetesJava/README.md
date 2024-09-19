# Resumen de comandos de compilación y ejecución en Java

## Compilar varios archivos .java
> El comando "javac" compila todos los archivos .java y el bytecode generado los ubica en la carpeta "classes".

* javac -d classes  .\src\com\pucp\*.java

## Ejecutar la clase principal
> El comando "java" ejecuta la clase principal "com.pucp.Main" referenciado la carpeta "classes" como classpath (-cp).

* java -cp classes com.pucp.Main

--------------------
## Crear un jar desde la carpeta classes
> Ubicarse en la carpeta de compilados "classes".
* cd classes

> Y generar el archivo jar con todos los archivos .class. 

* jar cfv Ejemplo.jar .\com\pucp\*.class
> - c: para indicar la creación del jar
> - f: para indicar el nombre del jar
> - v: para mostrar mensajes de salida por consola

## Crear un jar agregando toda la carpeta classes
> La opción "-C" sirve para indicar la carpeta en donde se alojan todos los archivos .class

* jar cvf Ejemplo.jar -C .\classes .

> Podemos ejecutar un jar especificando la clase principal en la linea de comandos

* java -cp Ejemplo.jar com.pucp.Main

--------------------
## Crear un jar ejecutable indicando la clase principal
> Para crear un jar ejecutable, agregamos a las opciones del jar la opcion "e" para indicar la clase principal. Esto agregar el main class al archivo Manifest.mf generado automaticamente dentro del jar.

* jar cvfe Ejemplo.jar com.pucp.Main  -C .\classes .

> Si el jar tiene un main class se puede ejecutar directamente. 
* java -jar Ejemplo.jar

--------------------
## Crear un jar con archivo Manifest
> Crear un archivo de texto indicando todas las opciones de creación del jar. Por ejemplo, Main-class para especificar la clase principal, o Class-Path para agregar librerías externas. 
```
Manifest.txt
------------
Main-Class: com.pucp.Main

```
> Crear el jar agregando la opción "m" para indicar el nombre del archivo manifest personalizado. 

* jar cvfm  Ejemplo.jar .\Manifest.txt -C .\classes .

> Ejecutar el jar
* java -jar .\Ejemplo.jar
 
--------------------
## Compilar otros codigos usando un jar
> Para compilar codigo externo usando un jar, primero debemos copiar o mover el jar a dicha carpeta para compilar desde esa ubicación.

* mv .\Ejemplo.jar app
* cd app

> Compilamos el código referenciando al jar en el classpath (-cp)

* javac -cp .\Ejemplo.jar App.java

> De la misma forma, para ejecutar le tenemos que indicar el jar en el classpath. No olvidar el ";" para separar las clases externas del jar. 

* java -cp Ejemplo.jar; App 


## Compilar otros codigos usando un jar y carpeta classes
> Podemos extender las opciones del proceso anterior, utilizando una carpeta en donde alojar los archivos .class.

* javac -d classes -cp Ejemplo.jar .\src\com\pucpapp\*.java
* java -cp classes; Ejemplo.jar; com.pucpapp.App
 
## Crear un jar utilizando librerías externas
> Podemos crear un jar que a su vez incluya referencias a librerías externas. 
> Para ello, debemos indicar en el manifest las librerias externas que va usar el ejecutable con la opción Class-Path: 
```
ManifestApp.txt
------------
Main-Class: App
Class-Path: Ejemplo.jar

```
> Luego, compilamos el código,

* javac -cp Ejemplo.jar App.java
> y generamos el jar con el manifest personalizado.

* jar cvfm App.jar ManifestApp.txt App.class

> Finalmente, ejecutamos el jar. 

* java -jar App.jar

> Asegúrese que en la misma carpeta se encuentre la librería externa, o en la ubicación que se indicó en el manifest. 
