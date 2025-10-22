# 🧠 Guía Práctica de Git en Terminal Linux (Bash)

Aprende a usar **Git desde la terminal de Linux (Bash)** paso a paso, con los comandos más usados y ejemplos reales para una prueba técnica o trabajo profesional.

---
## 🪄 Estructura básica de un comando Git

```bash
git <acción> [opciones] [archivos]

Ejemplo:

git add index.html
git commit -m "Añadí la página principal"
```

### 🥇 1. Verificar instalación de Git

Comprueba si tienes Git instalado:
```bash
git --version
```
👉 Si no aparece una versión, instálalo con:
```bash
sudo apt install git
```

### ⚙️ 2. Configurar Git por primera vez

Configura tu nombre y correo (se mostrarán en los commits):
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```
Verifica la configuración:
```bash
git config --list
```

### 📂 3. Crear o iniciar un repositorio

Entra a la carpeta de tu proyecto:
```bash
cd /home/usuario/proyecto
```
Inicializa Git:
```bash
git init
```

🧩 Esto crea una carpeta oculta .git donde Git guardará el historial del proyecto.

### 🧾 4. Ver el estado del proyecto
```bash
git status
```

Muestra los archivos:

    🟥 Untracked: nuevos, no añadidos a Git

    🟡 Modified: modificados pero no listos para commit

    🟢 Staged: listos para confirmarse

### ➕ 5. Añadir archivos al área de preparación (staging)

```bash
Añadir un archivo:

git add nombre_archivo

Añadir todos los archivos:

git add .
```

### 💾 6. Guardar cambios (commit)

Guarda los cambios con un mensaje descriptivo:
```bash
git commit -m "Mensaje descriptivo del cambio"
```

📝 Ejemplo:

```bash
git commit -m "Agrego función de login"
```

### 🧭 7. Ver historial de commits

Historial completo:

```bash
git log
```
Versión corta y limpia:

```bash
git log --oneline
```

### 🌿 8. Trabajar con ramas (branches)

Listar ramas:
```bash
git branch
```
Crear una nueva rama:
```bash
git branch nueva-rama
```
Cambiar a otra rama:
```bash
git checkout nueva-rama
```
Crear y cambiar en un solo paso:
```bash
git checkout -b nueva-rama
```
Volver a la principal:
```bash
git checkout main
```

### 🔀 9. Fusionar ramas (merge)

Primero, ve a la rama principal:
```bash
git checkout main
```

Luego fusiona otra rama con ella:

```bash
git merge nueva-rama
```

⚠️ Si hay conflictos, edita los archivos afectados, resuélvelos y haz un nuevo commit.

### 🌍 10. Conectar el repositorio con GitHub

Crea un repositorio vacío en GitHub.

Copia su URL (por ejemplo: https://github.com/usuario/proyecto.git).

Conéctalo a tu repositorio local:

```bash
git remote add origin https://github.com/usuario/proyecto.git

Verifica la conexión:

git remote -v
```

### 🚀 11. Subir (push) y descargar (pull) cambios

Subir tus commits al remoto:
```bash
git push origin main
```
Descargar y fusionar cambios del remoto:
```bash
git pull origin main
```

### 📦 12. Clonar un repositorio existente

Clonar desde GitHub:
```bash
git clone https://github.com/usuario/repositorio.git
```
🪄 Esto crea una carpeta local con todos los archivos e historial del proyecto.

### 🧹 13. Guardar cambios temporales (stash)

Guardar los cambios sin hacer commit:
```bash
git stash
```
Recuperarlos más tarde:
```bash
git stash pop
```

### ⏪ 14. Deshacer cambios o commits

Deshacer el último commit sin borrar los cambios:
```bash
git reset --soft HEAD^
```
Deshacer el último commit y eliminar los cambios:
```bash
git reset --hard HEAD^
```
Revertir un commit específico:
```bash
git revert <id_commit>
```

### 🏷️ 15. Etiquetar versiones (tags)

Crear una etiqueta:
```bash
git tag v1.0.0
```

Subirla al remoto:
```bash
git push origin v1.0.0
```
💡 Consejos para la prueba técnica

✅ Usa siempre git status antes de cada paso.
✅ Haz commits pequeños y claros.
✅ Usa ramas para mantener tu trabajo ordenado.
✅ Sincroniza con frecuencia usando git pull.
✅ Si te pierdes, usa git log --oneline o git reflog.
✅ Practica el flujo completo:

```bash
git init → git add → git commit → git branch → git merge → git push
```