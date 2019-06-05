# Twitter-processing

El proyecto consigue en un flujo de ingesta mediante NIFI desde la API de Twitter, almacenando los datos en kafka y almacenándolos en un fichero mediante kafka stream.
Una vez tenemos esto, junto con spark se realizar el tratamiento de los datos en Zeppelin.

La arquitectura es la siguiente:



