# 📘 Actividad: Programación Funcional en Java

Este proyecto reúne varios ejercicios cuyo objetivo es **aprender y practicar programación funcional en Java**, incluyendo el uso de **interfaces funcionales**, **clases anónimas**, **expresiones lambda** y **comparadores**.

---

## 🚀 Contenidos

### Ejercicio 1
- **Interfaz funcional `Operacion`**: define un método para aplicar operaciones matemáticas sobre dos enteros.  
- Implementación mediante:
  - **Clase anónima** → suma.
  - **Expresiones lambda** → suma, resta y multiplicación.
- Incluye un método auxiliar para introducir números desde consola con validación de entrada.

### Ejercicio 2
- **Interfaz `Saludable`**: obliga a mostrar un consejo de salud.
- **Clase abstracta `Vehiculo`**: define el método abstracto `arrancar()`.  
- Uso de **clases anónimas** en `MainEjercicio2` para:
  - Mostrar consejos de salud (alimentación y ejercicio).
  - Simular el arranque de un vehículo.

### Ejercicio 3
- **Clase `Libro`**: representa un libro con título, autor y número de páginas.
- **Clase `GestionLibros`**: permite agregar, mostrar y ordenar libros.
- **Ordenación de colecciones** mediante:
  - Clase anónima (`Comparator`) → por número de páginas.
  - Expresión lambda → por título.
  - `Comparator.comparing().reversed()` → por autor en orden descendente.
- **Clase `MainEjercicio3`**: interfaz de consola con menú interactivo para probar las funcionalidades.

---

## 🎯 Objetivos de aprendizaje
- Comprender el uso de **interfaces funcionales** y la anotación `@FunctionalInterface`.
- Diferenciar entre **clases anónimas** y **expresiones lambda**.
- Aplicar **programación funcional** en operaciones matemáticas y manejo de colecciones.
- Practicar el uso de **comparadores y referencias a métodos**.
- Desarrollar código más **conciso, expresivo y flexible**.

---

## ▶️ Ejecución
1. Compilar el proyecto:
Ejecutar los distintos programas:

Ejercicio 1:
java Ejercicio1.MainEjercicio1


Ejercicio 2:
java Ejercicio2.MainEjercicio2


Ejercicio 3:
java Ejercicio3.MainEjercicio3
