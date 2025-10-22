# 🧭 Resumen General: Cómo usar Git y GitHub

## ¿Qué es Git?
**Git** es un sistema de control de versiones distribuido que permite registrar y gestionar los cambios de un proyecto a lo largo del tiempo.  
Cada desarrollador tiene una copia completa del repositorio, lo que permite trabajar sin conexión, fusionar ramas y volver a versiones anteriores fácilmente.

## ¿Qué es GitHub?
**GitHub** es una plataforma online basada en Git que facilita la colaboración:  
permite alojar repositorios, revisar código mediante *pull requests*, seguir incidencias y automatizar pruebas y despliegues.

---

## 🔹 Flujo de trabajo básico con Git y GitHub

### 1. Instalación y configuración
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```
2. Iniciar un repositorio
```bash
git init
```
3. Ciclo de vida de los archivos

    Untracked: archivos nuevos que Git aún no sigue.

    Staged: archivos listos para confirmarse.

    Committed: cambios guardados en el historial del proyecto.

4. Control de cambios
```bash

git add <archivo>      # Añade archivo al área de preparación
git commit -m "mensaje" # Confirma los cambios
git status              # Verifica el estado actual
git log                 # Muestra el historial de commits

```
5. Conexión con GitHub

```bash
git remote add origin https://github.com/usuario/repo.git
git push origin main
git pull origin main
git clone https://github.com/usuario/repo.git
```

6. Trabajo con ramas
```bash
git branch nombre_rama          # Crea una nueva rama
git checkout nombre_rama        # Cambia de rama
git checkout -b nombre_rama     # Crea y cambia en un solo paso
git merge nombre_rama           # Fusiona ramas
```

7. Colaboración y Pull Requests

    Usa ramas para nuevas funciones o correcciones.

    Envía los cambios con git push.

    Crea una Pull Request en GitHub para que tus compañeros revisen tu código.

    Una vez aprobada, se fusiona con la rama principal (main o master).

8. Funciones avanzadas
```bash
git reset --soft HEAD^   # Deshace el último commit sin borrar cambios
git reset --hard HEAD^   # Deshace el commit y elimina los cambios
git revert <id_commit>   # Revierte un commit creando uno nuevo
git stash                # Guarda cambios temporalmente
git stash pop            # Recupera cambios guardados
git tag v1.0.0           # Crea una etiqueta (versión)
git push origin v1.0.0   # Sube la etiqueta al remoto
```

🧩 Resumen de Comandos Esenciales de Git
Comando	Descripción breve
```bash
git --version	Muestra la versión instalada de Git.

git config --global user.name "Tu Nombre"	Configura tu nombre para los commits.

git config --global user.email "tuemail@ejemplo.com"	Configura tu correo.

git config --list	Muestra la configuración actual.

git init	Crea un nuevo repositorio en la carpeta actual.

git clone <url>	Clona un repositorio remoto.

git status	Muestra el estado de los archivos.

git add <archivo>	Añade un archivo al área de preparación.

git add .	Añade todos los cambios al área de preparación.

git commit -m "mensaje"	Guarda los cambios con un mensaje.

git log	Muestra el historial completo de commits.

git log --oneline	Muestra un historial resumido.

git branch	Lista las ramas existentes.

git branch <nombre>	Crea una nueva rama.

git checkout <nombre>	Cambia a otra rama.

git checkout -b <nombre>	Crea y cambia a una nueva rama.

git merge <rama>	Fusiona una rama con la actual.

git remote add origin <url>	Conecta el repo local con el remoto.

git push origin <rama>	Sube los commits al repositorio remoto.

git pull origin <rama>	Descarga y fusiona los cambios del remoto.

git reset --soft HEAD^	Deshace el último commit (mantiene cambios).

git reset --hard HEAD^	Deshace el commit y elimina los cambios.

git revert <id_commit>	Crea un commit que deshace otro.

git stash	Guarda temporalmente los cambios.

git stash pop	Recupera los cambios guardados.

git tag v1.0.0	Crea una etiqueta (versión).

git push origin v1.0.0	Sube la etiqueta al remoto.
```
💡 Consejos finales

    Haz commits frecuentes y descriptivos.

    Usa ramas para mantener el trabajo organizado.

    Sincroniza a menudo con el remoto (git pull).

    No temas usar git status constantemente.

    Revisa el historial con git log antes de hacer merges o pushes.