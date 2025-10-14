# Ejercicios comandos Linux/UNIX

## Órdenes Linux relacionadas con archivos y directorios

### 1. Crea un archivo de tamaño 0

```bash
touch archivoprueba.txt

```

### 2. Listar todos los archivos del directorio `bin`.

```bash
ls /bin
```
  
### 3. Listar todos los archivos del directorio `etc` que empiecen por *t* en orden inverso.

```bash
ls -R /etc/t*
```

### 4. Listar todos los archivos del directorio `dev` que empiecen por *tty* y tengan 5 caracteres.

```bash
ls /dev/tty??
```

### 5. Listar todos los archivos del directorio `dev` que empiecen por *tty* y acaben en *1,2,3 ó 4*.

```bash
ls /dev/tty*[1-4] o ls /dev/tty*[1,2,3,4]
```



### 6. Listar todos los archivos, incluidos los ocultos, del directorio raíz.

```bash
ls -a /
```


### 8. Listar todos los archivos del directorio `usr` y sus subdirectorios.

```bash
tree - R /usr
```

### 9. Cambiarse al directorio tmp y verificarlo.

```bash
cd /tmp; pwd 
```

### 10. Mostrar el día y la hora actual.

```bash
date
```

### 11. Con un solo comando posicionarse en el directorio $HOME y verificarlo.

```bash
cd /home; pwd
```

### 12. Crear los directorios `dir1`, `dir2` y `dir3` en el directorio `PRUEBA`. Dentro de `dir1` crear el directorio `dir11`. Dentro del directorio `dir3` crear el directorio `dir31` Dentro del directorio `dir31`, crear los directorios `dir311` y `dir312`.

```bash
mkdir dir1 dir2 dir3
mkdir -p dir1/dir11 dir2/dir31/dir311
```

### 13. Copiar un archivo `/etc/magic` a un archivo llamado `mensaje` de vuestro directorio `PRUEBA`.

```bash
cp -r /etc/magic ./mensaje.txt
```

### 14. Copiar mensaje en `dir1` y `dir2`, y verificarlo.

```bash
mkdir dir1 dir2
cp mensaje.txt ./dir1
cp mensaje.txt ./dir2
```

### 15. Copiar en el directorio `dir311` los archivos de `/bin` que tengan una *a* como segunda letra y su nombre tenga cuatro letras.

```bash
pwd /home/alumnoT/Documentos/prueba
mkdir dir311
cp -r /bin/?a?? ./dir3/dir31/dir311
```

### 16. Mover el directorio `dir31` y sus subdirectorios debajo de `dir2`.

```bash
mv ./dir3/dir31 ./dir2
```

### 17. Mostrar por pantalla los archivos ordinarios del directorio `HOME` y sus subdirectorios.

```bash
tree ~
ó
ls -R ~
```

### 18. Ocultar el archivo mensaje del directorio dir2.

```bash
cd dir3/dir31
mv mensaje.txt .mensaje.txt
```

### PT8.1.- Sitúate en tu `HOME`.

```bash
pwd (veo donde estoy)
cd ../(me muevo hacia atras todas las veces que necesite)
pwd /home/alumnoM
```

### PT8.2.- Crea un directorio `examen`.

```bash

mkdir examen
```

### PT8.3.- Dentro de `examen`, crea los directorios `ejercicios1` y `ejercicios2`.

```bash
mkdir ejercicios1 ejercicios2
```

### PT8.4.- Crea un fichero de texto llamado `file1.dat` en `ejercicios1`.

```bash
cd ejercicios2
touch file1.dat
```

### PT8.5.- Haz una copia del fichero `file1.dat` dentro de `ejercicios2`.

```bash
pwd /home/alumnoM/examen/ejercicios2
cp file1.dat ../ejercicios1
```

### PT8.6.- Sitúate en `ejercicios2`.

```bash
pwd /home/alumnoM/examen
cd ./ejercicios1

```

### PT8.7.- Mueve el archivo `file1.dat` hasta `ejercicios2/mover`, poniendo como nombre de destino `file1_movido.dat`. Ten en cuenta que, posiblemente, tendrás que crear antes el directorio.

```bash
pwd /home/alumnoM/examen/ejercicios2
mkdir ./mover
mv file1.dat ./mover
cd mover
mv file1.dat file1_movido.da


```

### PT8.8.- Copia el archivo `/etc/crontab` a un archivo llamado `copia_crontab` de tu directorio `examen`.

```bash

```

### PT8.9.- Copiar en el directorio `ejercicios1` los archivos de `/bin` que tengan una *"a"* como segunda letra y su nombre termine en *"o"* ó en *"e"*.

```bash

```

### PT8.10.- Sitúate en tu *HOME* y elimina el directorio `examen`.

```bash

```


### 19.Borrar los archivos y directorios de `dir1`, incluido el propio directorio.

```bash

```

### 20. Copiar al directorio `dir312` los ficheros del directorio `/dev` que empiecen por *t*, acaben en un número del *5* al *8* y tengan cinco letras en su nombre.

```bash

```

### 21. Mover el directorio `dir312` debajo de `dir3`.

```bash

```

### 22. Borrar todos los archivos y directorios creados en el directorio `PRUEBA`.

```bash
```

### 23. Crear el directorio `dir2` y `dir3` en el directorio `PRUEBA`.

```bash

```



### 25. Cambiar el directorio actual al directorio `dir3`, y crear cuatro nuevos directorios llamados `dira`, `dirb`, `dirc`, y `dird` bajo el directorio actual.

```bash

```

### 26. Comprobar los permisos de acceso de los directorios recién creados.

```bash
```

