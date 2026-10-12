# Gauss-Jordan-LuisAntonioZ-rate
# Práctica: Método de Gauss-Jordan

**Asignatura:** Métodos Numéricos (Unidad 3)
**Alumno:** Luis Antonio Zárate Romero 
**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)

---

## Descripción de la Estructura Modular
El proyecto está desarrollado en Java bajo una arquitectura modular y el principio de reutilización de código
* **`src/defmatrizz.java`**: Contiene la definición y el almacenamiento de la matriz aumentada $[A \vert{} b]$ del sistema de ecuaciones
* **`src/Gauss.java`**: Contiene el método de Eliminación Gaussiana simple (`eliminacionGaussiana`), encargado de realizar la fase de triangulación superior
* **`src/GaussJordan.java`**: Reutiliza la triangulación superior anterior, implementa la normalización de pivotes a la unidad y ejecuta el barrido superior para transformar la matriz en una matriz identidad, obteniendo el vector de soluciones de manera directa
* **`src/Lanzador_GaussJordan.java`**: Clase principal (`main`) que coordina la ejecución de los módulos y despliega los resultados

---

##  Pasos para Compilar y Ejecutar en Java

1. Asegúrate de tener instalado **Java JDK** en tu computadora.
2. Abre tu terminal o línea de comandos en la carpeta del proyecto `Gauss-Jordan`).
3. Compila el lanzador desde la carpeta src:
   ```bash
   cd "C:\RutaDeTuEquipo\Gauss-Jordan\src"
   Lanzador_GaussJordan.java
   
## Ejemplo de Prueba - Salida por Consola

Soluciones del sistema por el método de Gauss-Jordan:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
