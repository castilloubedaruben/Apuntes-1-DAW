## Resolucion ejercicio:
### EJ 1 prueba

dentro de docs, crea dos carpetas documentacion y documentacion2

```bash

mkdir documentacion; mkdir documentacion2
```

dos archivos, archivo .txt y archivo2.txt

```bash
touch archivo.txt archivo2.txt
```

dos programas, programa1.sh y programa2.sh

```bash
touch programa1.sh programa2.sh
```

crea un scrip dentro de docs que haga lo siguiente:
crear 3 archivos que se llamen carpetas, programas y archivos

```bash
touch script.sh
nano script.sh 
("dentro del nano":
#!/bin/bash
mkdir carpetas programas archivos
mv ./documentacion ./carpetas)
mv ./documentacion2 ./carpetas
mv *.txt ./archivos
mv *sh ./programas)

./script.sh ("lo ejecutas")
```

quiero que almacenes en "carpetas" los nombre de las carpetas que esten en docs, en programas los nombre de los programas (.sh) y en arvhivos lños nombres de los archivos (.txt)

```bash


```

### EJ 2 prueba:
rellena archivo.txt y archivo2.txt con algo de texto que tu quieras

```bash
nano archivo.txt
nano archivo2.txt
```

escribe un script que almacene dentro de archivo2.txt el cotenido de archivo2.txt y detras el contenido de archivo1.txt


```bash
touch script2.sh
("nano y escribo lo de abajo")
#!/bin/bash
cat archivo.txt archivo2.txt > archivo_nuevo.txt

("ejecutas luego")

```