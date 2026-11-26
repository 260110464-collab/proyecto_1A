# Pruebas Problema 2

| Caso | Entradas | Cálculo manual | Esperado | Obtenido | Coinciden |
| :---: | :--- | :--- | :--- | :--- | :---: |
| 1 | Precio: `1000`<br>P: `1`, Q: `1` | Impuesto = 1000 × 0 = 0<br>Total = 1000 + 0 = 1000 | Exención Total (0%):<br>Total a pagar: $1000.00 | Exención Total (0%):<br>Total a pagar: $1000.00 | Sí |
| 2 | Precio: `1000`<br>P: `1`, Q: `0` | Impuesto = 1000 × 0.08 = 80<br>Total = 1000 + 80 = 1080 | Impuesto Reducido (8%):<br>Total a pagar: $1080.00 | Impuesto Reducido (8%):<br>Total a pagar: $1080.00 | Sí |
| 3 | Precio: `500.50`<br>P: `0`, Q: `1` | Impuesto = 500.50 × 0.08 = 40.04<br>Total = 500.50 + 40.04 = 540.54 | Impuesto Reducido con decimales: $540.54 | Impuesto Reducido con decimales: $540.54 | Sí |
| 4 | Precio: `2000`<br>P: `0`, Q: `0` | Impuesto = 2000 × 0.16 = 320<br>Total = 2000 + 320 = 2320 | Impuesto General (16%):<br>Total a pagar: $2320.00 | Impuesto General (16%):<br>Total a pagar: $2320.00 | Sí |
| 5 | Precio: `-500`<br>*(o `0`)* | No aplica: el precio base es menor o igual a cero. | Error: el precio debe ser mayor que cero. | Error: el precio debe ser mayor que cero. | Sí |
| 6 | Precio: `"abc"` | No aplica: contiene un dato no numérico en el precio. | Error: debes ingresar un valor numérico. | Error: debes ingresar un valor numérico. | Sí |
| 7 | Precio: `1.7e308` | No aplica: el precio supera el límite permitido (MAX_VALUE / 1.16). | Error: el precio es demasiado grande. | Error: el precio es demasiado grande. | Sí |
| 8 | Precio: `1000`<br>P: `5` | No aplica: número entero fuera del rango booleano (0 o 1). | Error: solamente se permite 0 o 1. | Error: solamente se permite 0 o 1. | Sí |
| 9 | Precio: `1000`<br>P: `"si"` | No aplica: entrada no numérica al evaluar la proposición. | Error: debes ingresar 0 o 1. | Error: debes ingresar 0 o 1. | Sí |
| 10 | Precio: `1000`<br>P: `1`, Q: `1.5` | No aplica: entrada decimal cuando se requiere un entero (0 o 1). | Error: debes ingresar 0 o 1. | Error: debes ingresar 0 o 1. | Sí |

# Resultado General
Las 10 pruebas fueron ejecutadas y los resultados obtenidos coincidieron con los resultados esperados.