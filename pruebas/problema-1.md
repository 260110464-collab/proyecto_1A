# pruebas/problema-1

| Caso | Entradas | Cálculo manual | Esperado | Obtenido | Coinciden |
|---:|---|---|---|---|---|
| 1 | (2,3) y (5,7) | √((5-2)² + (7-3)²) = √(9+16) = 5 | Distancia normal: 5 | Distancia normal: 5 | Sí |
| 2 | (0,0) y (3,4) | √((3-0)² + (4-0)²) = √(9+16) = 5 | Punto en el origen: 5 | Punto en el origen: 5 | Sí |
| 3 | (-2,-3) y (1,1) | √((1+2)² + (1+3)²) = √(9+16) = 5 | Coordenadas negativas: 5 | Coordenadas negativas: 5 | Sí |
| 4 | (1.5,2.5) y (4.5,6.5) | √((4.5-1.5)² + (6.5-2.5)²) = √(9+16) = 5 | Coordenadas decimales: 5 | Coordenadas decimales: 5 | Sí |
| 5 | (2,3) y (2,3) | √((2-2)² + (3-3)²) = √0 = 0 | Puntos iguales: 0 | Puntos iguales: 0 | Sí |
| 6 | (2,1) y (2,6) | √((2-2)² + (6-1)²) = √25 = 5 | Línea vertical: 5 | Línea vertical: 5 | Sí |
| 7 | (1,2,3) y (4,5) | No aplica: cantidad incorrecta de coordenadas. | Cantidad incorrecta de coordenadas | Cantidad incorrecta de coordenadas | Sí |
| 8 | (a,2) y (3,4) | No aplica: contiene un dato no numérico. | Entrada no numérica | Entrada no numérica | Sí |
| 9 | (-1000000,0) y (1000000,0) | √((1000000+1000000)² + (0-0)²) = 2,000,000 | Límite permitido: 2,000,000 de distancia | Límite permitido: 2,000,000 de distancia | Sí |
| 10 | (1000001,0) y (2,3) | No aplica: coordenada fuera del límite permitido. | Coordenada fuera del límite | Coordenada fuera del límite | Sí |

## Resultado general

Las 10 pruebas fueron ejecutadas y los resultados obtenidos coincidieron con los resultados esperados.