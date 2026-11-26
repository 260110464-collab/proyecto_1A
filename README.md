# Proyecto_1A

## Problema 1: Módulo Geométrico-Vectorial

### Descripción

El módulo geométrico-vectorial permite calcular la distancia entre dos puntos ubicados en un plano cartesiano. Para realizar el cálculo, el usuario ingresa las coordenadas de dos puntos y el programa obtiene la diferencia entre sus coordenadas X y Y, así como la distancia que existe entre ellos.

Además, el programa muestra una representación gráfica de los dos puntos y del segmento que los une.

### Objetivo

Desarrollar un programa en Java que permita calcular la distancia entre dos puntos del plano cartesiano mediante operaciones matemáticas y representar gráficamente el resultado.

### Fórmula utilizada

Para calcular la distancia entre dos puntos se utiliza la siguiente fórmula:

\[
d=\sqrt{(x_2-x_1)^2+(y_2-y_1)^2}
\]

Donde:

- \(x_1,y_1\): coordenadas del primer punto.
- \(x_2,y_2\): coordenadas del segundo punto.
- \(d\): distancia entre ambos puntos.

### Funcionamiento del programa

1. El programa muestra un menú principal.
2. El usuario selecciona la opción **1. Módulo Geométrico-Vectorial**.
3. Se solicitan las coordenadas del primer punto en formato `x,y`.
4. Se solicitan las coordenadas del segundo punto en el mismo formato.
5. El programa valida que las coordenadas sean numéricas y que cada punto tenga exactamente dos valores.
6. Se calculan las diferencias de las coordenadas y la distancia entre los puntos.
7. Se muestran los resultados en la consola.
8. Se abre una ventana con la representación gráfica de los puntos y el segmento que los une.

### Ejemplo de ejecución

**Datos de entrada:**

- Punto 1: `2,3`
- Punto 2: `5,7`

**Procedimiento:**

\[
\Delta X=5-2=3
\]

\[
\Delta Y=7-3=4
\]

\[
d=\sqrt{3^2+4^2}
\]

\[
d=\sqrt{9+16}=\sqrt{25}=5
\]

**Resultado esperado:**

- Punto 1: (2.0, 3.0)
- Punto 2: (5.0, 7.0)
- Diferencia en X: 3.0
- Diferencia en Y: 4.0
- Distancia entre los puntos: 5.0000

También se muestra una gráfica con los dos puntos y la línea que los conecta.

### Validaciones

El programa cuenta con las siguientes validaciones:

- Cada punto debe contener exactamente dos coordenadas.
- Las coordenadas deben ser valores numéricos.
- No se permiten valores NaN ni infinitos.
- Las coordenadas no pueden superar el límite de ±1,000,000.
- Si los datos ingresados son incorrectos, el programa solicita nuevamente la información.

También identifica situaciones especiales, como cuando los dos puntos son iguales o cuando tienen la misma coordenada X y forman una línea vertical.

### Requisitos

- Tener instalado Java JDK.
- Contar con un entorno de desarrollo compatible con Java, como Apache NetBeans o Visual Studio Code.
- Ejecutar el programa en un entorno que permita mostrar ventanas gráficas de Java Swing.

### Instrucciones para ejecutar

**Desde Apache NetBeans:**

1. Abrir el proyecto en NetBeans.
2. Localizar la clase `ProyectoIntegrador`.
3. Ejecutar el proyecto.
4. En el menú principal, seleccionar la opción `1`.
5. Ingresar las coordenadas de los dos puntos cuando el programa las solicite.

**Desde Visual Studio Code:**

1. Abrir la carpeta del proyecto.
2. Verificar que Java JDK esté instalado y configurado.
3. Abrir la clase `ProyectoIntegrador`.
4. Ejecutar el método `main`.
5. Seleccionar la opción `1` en la consola e ingresar los puntos.

### Tecnologías utilizadas

- Lenguaje de programación: Java.
- Interfaz gráfica: Java Swing.
- Operaciones matemáticas: cálculo de diferencias y distancia euclidiana.
- Entorno de desarrollo: Apache NetBeans / Visual Studio Code.