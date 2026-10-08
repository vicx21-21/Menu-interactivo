# Proyecto Final - Fundamentos de Computación I

Este repositorio contiene la implementación en **Java** de una aplicación de consola interactiva desarrollada para la asignatura de **Fundamentos de Computación I** en la Universidad de Sonora. 

El programa integra un menú principal interactivo que permite ejecutar y visualizar distintos algoritmos clásicos y ejercicios prácticos de lógica de programación.

---

## 🛠️ Tecnologías y Conceptos Aplicados

- **Lenguaje:** Java (JDK 17+)
- **Estructuras de Control de Flujo:** `if-else`, `switch`, `while`, `do-while`, `for`
- **Manejo de Arreglos:** Manipulación y rotación de arreglos unidimensionales.
- **Interfaz de Consola:**
  - Control de entrada con `System.console().readLine()` y `Scanner`.
  - Formateo de pantalla mediante **secuencias de escape ANSI** (`\033[H\033[2J`) para la limpieza dinámica de la terminal.
- **Modularización:** Organización del código mediante métodos estáticos independientes.

---

## 📋 Módulos y Algoritmos Implementados

1. **Triángulos (`if-else`):** Evalúa tres longitudes ingresadas por el usuario para determinar si forman un triángulo válido y lo clasifica en *Equilátero*, *Isósceles* o *Escaleno*.
2. **Secuencia de Padovan (`for` / `while`):** Genera la cantidad solicitada de términos pertenecientes a la secuencia de Padovan ($P(n) = P(n-2) + P(n-3)$).
3. **Sumatoria de Serie (`while`):** Calcula el resultado exacto de la serie armónica:
   $$\sum_{i=1}^{50} \frac{1}{i} = \frac{1}{1} + \frac{1}{2} + \frac{1}{3} + \dots + \frac{1}{50}$$
4. **Conjetura de Collatz (`do-while`):** Genera la secuencia numérica a partir de un entero positivo según la regla de Collatz ($n/2$ si es par, $3n + 1$ si es impar) hasta llegar a 1.
5. **Rotación de Arreglo (`arreglos`):** Demuestra el desplazamiento de elementos en un arreglo circular desplazando todas las posiciones una unidad hacia la derecha.

---
imagen
<img width="632" height="796" alt="image" src="https://github.com/user-attachments/assets/ea76634f-ac19-473a-b125-63abffb8fcf9" />

## 🚀 Cómo Ejecutar el Proyecto

### Requisitos Previos
Tener instalado el entorno de ejecución de Java (JDK 11 o superior).

### Pasos
1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/vicx21-21/nombre-de-tu-repositorio.git](https://github.com/vicx21-21/nombre-de-tu-repositorio.git)
   cd nombre-de-tu-repositorio
