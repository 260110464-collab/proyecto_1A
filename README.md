# proyecto_1A

## Problema 1: Módulo Geométrico-Vectorial

### 1. Descripción

El módulo geométrico-vectorial permite calcular la distancia entre dos puntos ubicados en un plano cartesiano. Para realizar el cálculo, el usuario ingresa las coordenadas de dos puntos y el programa obtiene la diferencia entre sus coordenadas X y Y, así como la distancia que existe entre ellos.

Además, el programa muestra una representación gráfica de los dos puntos y del segmento que los une.

### 2. Objetivo

Desarrollar un programa en Java que permita calcular la distancia entre dos puntos del plano cartesiano mediante operaciones matemáticas y representar gráficamente el resultado.

### 3. Fórmula utilizada

Para calcular la distancia entre dos puntos se utiliza la fórmula de distancia euclidiana:

$$
d = \sqrt{(x_2-x_1)^2+(y_2-y_1)^2}
$$

Donde:

- $x_1$: coordenada X del primer punto.
- $y_1$: coordenada Y del primer punto.
- $x_2$: coordenada X del segundo punto.
- $y_2$: coordenada Y del segundo punto.
- $d$: distancia entre ambos puntos.

### 4. Funcionamiento del programa

1. El programa muestra un menú principal con tres opciones.
2. El usuario selecciona la opción **1. Módulo Geométrico-Vectorial**.
3. Se solicitan las coordenadas del primer punto en formato `x,y`.
4. Se solicitan las coordenadas del segundo punto en el mismo formato.
5. El programa verifica que las coordenadas sean válidas.
6. Se calculan las diferencias de las coordenadas X y Y.
7. Se calcula la distancia entre los dos puntos.
8. Se muestran los resultados en la consola con cuatro decimales.
9. Se abre una ventana gráfica que representa los puntos y el segmento que los conecta.

### 5. Ejemplo de ejecución

**Datos de entrada:**

- Punto 1: `(2,3)`
- Punto 2: `(5,7)`

**Procedimiento:**

Primero se calcula la diferencia entre las coordenadas X:

$$
\Delta X = x_2-x_1
$$

$$
\Delta X = 5-2=3 
$$

Después se calcula la diferencia entre las coordenadas Y:

$$
\Delta Y = y_2-y_1
$$

$$
\Delta Y = 7-3=4
$$

Finalmente, se sustituyen



# PROBLEMÁTICA 2: MÓDULO FINANCIERO-LÓGICO

**## 1. Descripción**

Desarrollar un programa que permita calcular el impuesto correspondiente a la compra de un equipo, tomando en cuenta dos condiciones lógicas:

- P: El comprador es estudiante acreditado.
- Q: El equipo adquirido pertenece al catálogo educativo.

Dependiendo de las respuestas, el programa determina si corresponde una exención total, un impuesto reducido o un impuesto general.

**## 2. Objetivo**

Aplicar la lógica proposicional y las estructuras condicionales para determinar el porcentaje de impuesto que corresponde a una compra y calcular el total que debe pagar el usuario.

**## 3. Funcionamiento**

1. Seleccionar la opción 2 del menú principal.
2. Ingresar el precio base del equipo.
3. Responder si el comprador es estudiante acreditado (P).
4. Responder si el equipo pertenece al catálogo educativo (Q).
5. Utilizar 1 si cumple y 0 si no cumple.
6. El programa evalúa las condiciones lógicas.
7. Determina el porcentaje de impuesto correspondiente.
8. Calcula el monto del impuesto y el total a pagar.
9. Muestra los resultados financieros.

**## 4. Condiciones lógicas**

- P: El comprador es estudiante acreditado.
- Q: El equipo pertenece al catálogo educativo.

Las condiciones utilizadas son:

- P AND Q: Exención total de impuesto (0%).
- P XOR Q: Impuesto reducido (8%).
- NOT P AND NOT Q: Impuesto general (16%).

**## 5. Tabla de verdad**

| P | Q | Impuesto aplicado |
|---|---|---|
| 1 | 1 | 0% |
| 1 | 0 | 8% |
| 0 | 1 | 8% |
| 0 | 0 | 16% |

**## 6. Ejemplos de ejecución**

**### Ejemplo 1: Exención total**

**Datos de entrada:**

```text
Precio base del equipo: 1000
P (Estudiante acreditado): 1
Q (Catálogo educativo): 1
```

**Resultado esperado:**

```text
Politica fiscal: Exencion Total de Impuesto

Porcentaje de impuesto: 0%
Monto del impuesto: $0.00

TOTAL A PAGAR: $1000.00
```

**### Ejemplo 2: Impuesto reducido**

**Datos de entrada:**

```text
Precio base del equipo: 1000
P (Estudiante acreditado): 1
Q (Catálogo educativo): 0
```

**Resultado esperado:**

```text
Politica fiscal: Impuesto Reducido

Porcentaje de impuesto: 8%
Monto del impuesto: $80.00

TOTAL A PAGAR: $1080.00
```

**### Ejemplo 3: Impuesto general**

**Datos de entrada:**

```text
Precio base del equipo: 1000
P (Estudiante acreditado): 0
Q (Catálogo educativo): 0
```

**Resultado esperado:**

```text
Politica fiscal: Impuesto General

Porcentaje de impuesto: 16%
Monto del impuesto: $160.00

TOTAL A PAGAR: $1160.00
```

**## 7. Instrucciones de uso**

- Seleccionar la opción 2.
- Ingresar un precio mayor que cero.
- Responder las preguntas P y Q utilizando solamente 0 o 1.
- El programa evaluará las condiciones automáticamente.
- Consultar el porcentaje de impuesto, el monto y el total a pagar.

**Significado de las respuestas:**

- 1 = Sí cumple.
- 0 = No cumple.

---

**# 3. Menú principal **

Al ejecutar el programa se presenta el siguiente menú:

```text
===== PROYECTO INTEGRADOR =====

1. Modulo Geometrico-Vectorial
2. Modulo Financiero-Logico
3. Salir

Selecciona una opcion:
```

El usuario puede seleccionar cualquiera de los dos módulos y regresar al menú principal al terminar su ejecución.

La opción 3 permite finalizar el programa.

---

**# 4. Herramientas tecnologías usadas**

- Lenguaje de programación: Java.
- Entorno de desarrollo: Apache NetBeans o Visual Studio Code.
- Scanner: permite leer los datos ingresados por el usuario.
- Swing: permite crear ventanas gráficas.
- AWT: permite dibujar los elementos del plano cartesiano.

**Conceptos de programación utilizados:**

- Variables.
- Métodos.
- Condicionales.
- Ciclos.
- Validación de datos.
- Operaciones matemáticas.
- Operaciones lógicas.

---

**# 5. Instrucciones para ejecutar el rpograma**

1. Tener instalado Java JDK.
2. Abrir el proyecto en el entorno de desarrollo.
3. Localizar el archivo ProyectoIntegrador.java.
4. Ejecutar el método principal main.
5. Seleccionar el módulo que se desea utilizar.
6. Seguir las instrucciones que aparecen en la consola.

---

*# 6. Conclusion*

Este proyecto integrador permitió aplicar los conocimientos de programación Java para resolver dos problemáticas diferentes.

En el módulo geométrico-vectorial se utilizaron operaciones matemáticas para calcular distancias y representar puntos en un plano cartesiano.

En el módulo financiero-lógico se aplicaron proposiciones lógicas y estructuras condicionales para determinar los impuestos correspondientes a una compra.

Ambos módulos permitieron reforzar el uso de variables, métodos, validaciones, estructuras de control y herramientas de programación.

