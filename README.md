# Twitter-processing

El proyecto consigue en un flujo de ingesta mediante NIFI desde la API de Twitter, almacenando los datos en kafka y posteriormente guardándolos en un fichero mediante kafka stream.
Una vez tenemos esto, junto con spark se realizó el tratamiento de los datos en Zeppelin.

La arquitectura es la siguiente:

![Captura de pantalla de 2019-06-05 22-41-03](https://user-images.githubusercontent.com/51421186/58989105-829a7f80-87e3-11e9-89fa-bde398b42d4b.png)


La ingesta con NIFI se realizó de la siguiente forma:

![Captura de pantalla de 2019-06-05 22-45-47](https://user-images.githubusercontent.com/51421186/58989199-be354980-87e3-11e9-9419-aef0ffdd7c36.png)


Para la parte de kafka stream el código cuenta con un objecto Consumerstream que es el encargado de volcar los datos de kafka a fichero. Se usaron las librerías de kafka-stream de sbt para realizar la compilación. 

