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