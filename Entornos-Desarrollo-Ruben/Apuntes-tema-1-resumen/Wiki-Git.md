# **COMO USAR GIT DESDE 0**
- [**COMO USAR GIT DESDE 0**](#como-usar-git-desde-0)
  - [**1. ¿QUE ES GIT?**](#1-que-es-git)
  - [**1.1.Instalacion de GIT**](#11instalacion-de-git)
  - [**1.2 Configuracion de GIT**](#12-configuracion-de-git)
  - [**2.FUNDAMENTOS AVANZADOS DE GIT**](#2fundamentos-avanzados-de-git)
    - [**2.1 REPOSITORIOS**](#21-repositorios)
    - [2.2 Los archivos pasan por distintos estados:](#22-los-archivos-pasan-por-distintos-estados)
    - [2.3 🌐 Conexión con GitHub](#23--conexión-con-github)
    - [2.3 🌳 Trabajo con ramas](#23--trabajo-con-ramas)
    - [2.4 Deshacer y guardar cambios](#24-deshacer-y-guardar-cambios)


## **1. ¿QUE ES GIT?**
Git es una herramienta que guarda el historial de cambios en los proyectos, permitiendo volver atrás si es necesario.
Cada persona tiene una copia completa del proyecto, lo que da más seguridad y libertad para trabajar sin internet.
Favorece la colaboración entre varios desarrolladores, permitiendo unir cambios y resolver conflictos.
Además, registra quién hizo cada modificación y cuándo, lo que ayuda a revisar el trabajo.
Con las ramas, se pueden probar ideas nuevas sin afectar el proyecto principal.

## **1.1.Instalacion de GIT**
Git es compatible tanto en Linux,macOS y Windows. 
 - **Instalación en Linux**

La forma mas sencilla desde el propio instalador de paquetes en terminal:

  ```bash
  sudo apt update
  sudo apt install git
  ```
 - **Instalacion en Windows**

Descargar desde la pagina de GIT [página oficial de Git](https://git-scm.com/download/win).

## **1.2 Configuracion de GIT**

Los dos parametros básicos son **nombre** y **correo electronico**
```bash
git config --global user. name "Añades tu nombre aqui"
git config --global user. emanil "correo"
```
Añadir `--global` hace que se configure para todos los proyectos que tengas en ese pc.

Para verificar que todo este perfecto 
```bash
git --version
```

Si aparece nº de version esta todo correcto.

## **2.FUNDAMENTOS AVANZADOS DE GIT**

### **2.1 REPOSITORIOS** 

Un repositorio en Git es donde se guardan los archivos y todo su historial de cambios.

El repositorio local está en tu computadora y te permite trabajar sin internet.

Para crear un repositorio
  ```bash
  git init
  ```

Para clonar un repositorio
```bash
git clone https://github.com/usuario/repo.git
```

El repositorio remoto está en un servidor (como GitHub) y sirve para colaborar con otros.
Ambos se conectan para sincronizar y mantener el proyecto actualizado entre todos los desarrolladores.

### 2.2 Los archivos pasan por distintos estados:

* Untracked: Git no los sigue aún.

* Modified: Cambiados después del último commit.

* Staged: Preparados para el próximo commit.

* Committed: Guardados en el historial

### 2.3 🌐 Conexión con GitHub

Subir cambios: 
```bash
git push origin main
```

Bajar cambios: 
```bash
git pull origin main
```
Clonar repositorio: 
```bash
git clone URL.
```

### 2.3 🌳 Trabajo con ramas

Crear nueva rama: 

```bash
git branch nombre_rama
```
Cambiar de rama: 

```bash
git checkout nombre_rama
```

Crear y cambiar en un paso: 

```bash
git checkout -b nombre_rama
```

Fusiona una rama con la actual.

```bash
git merge nombre_rama 
```
### 2.4 Deshacer y guardar cambios

→ Quita el último commit pero guarda cambios.
```bash
git reset --soft HEAD^
```
→ Borra commit y cambios (cuidado).

```bash
git reset --hard HEAD^ 
```

→ Revierte un commit sin borrar historial.
```bash
git revert ID
```

→ Guarda cambios temporales.
```bash
git stash
```

→ Recupera cambios guardados.
```bash
git stash pop 
```
