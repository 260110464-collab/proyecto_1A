// Modulo Geometrico - Vectorial

package com.mycompany.alexmartin;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class proyectointegradorjava {

        public static boolean tieneCaracteresProhibidos(String texto) {
        if (texto.length() == 0) {
            return true;
        }
        int puntosDecimales = 0;
        int cantidadDigitos = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i); // Primitivo char

            if (c >= '0' && c <= '9') {
                cantidadDigitos++;
            } else if (c == '.') {
                puntosDecimales++;
                if (puntosDecimales > 1) {
                    return true; // Mas de un punto decimal (ej: 5.4.2)
                }
            } else if (c == '-' || c == '+') {
                if (i != 0) {
                    return true; // El signo solo puede ir al principio (bloquea 5-3)
                }
            } else {
                // Cualquier otro símbolo o letra (incluyendo 'f', 'd', 'e', letras, etc.)
                return true;
            }
        }
        return cantidadDigitos == 0; // Si solo puso "." o "-", lo rechaza
    }

    public static void derivada_puntos() {
        Scanner entrada = new Scanner(System.in);

        // Variables primitivas (float y boolean)
        float valX1 = 0.0f, valY1 = 0.0f, valX2 = 0.0f, valY2 = 0.0f;
        boolean datosValidos = false;

        while (!datosValidos) {
            System.out.println("Ingresa la coordenada de los 2 puntos separadas por coma EJEMPLO (5,7,4,3): ");

            if (!entrada.hasNextLine()) {
                return;
            }

            String P1 = entrada.nextLine().trim();

            // 1. Bloquear run vacio
            if (P1.isEmpty()) {
                System.out.println("[ERROR]: No ingresaste ningun dato. Intenta de nuevo.");
                continue;
            }

            // 2. Si se ponen parentesis al inicio y final como:(5,7,4,3), se eliminan
            if (P1.startsWith("(") && P1.endsWith(")")) {
                P1 = P1.substring(1, P1.length() - 1).trim();
            }

            // 3. Separar por coma (el -1 detecta comas vacias como "5,7,4,3,")
            String[] coordenada = P1.split(",", -1);

            if (coordenada.length != 4) {
                System.out.println("[ERROR]: Debes ingresar exactamente 4 valores separados por coma (Ingresaste " + coordenada.length + ").");
                continue;
            }

            String P1_X = coordenada[0].trim();
            String P1_Y = coordenada[1].trim();
            String P2_X = coordenada[2].trim();
            String P2_Y = coordenada[3].trim();

            // 4. Revision estricta caracter por caracter (con primitivo char)
            if (tieneCaracteresProhibidos(P1_X) || tieneCaracteresProhibidos(P1_Y) ||
                tieneCaracteresProhibidos(P2_X) || tieneCaracteresProhibidos(P2_Y)) {
                System.out.println("[ERROR]: Formato invalido. Usa unicamente numeros enteros o decimales (sin letras ni simbolos extra).");
                continue;
            }

            // 5. Conversion a float primitivo y validación de límites de memoria (32 bits)
            try {
                valX1 = Float.parseFloat(P1_X);
                valY1 = Float.parseFloat(P1_Y);
                valX2 = Float.parseFloat(P2_X);
                valY2 = Float.parseFloat(P2_Y);

                // Bloquear numeros gigantes o microscopicos que desborden la grafica
                float limiteMaximo = 10000000.0f; // 10 millones para evitar desbordamiento visual
                float abs1 = valX1 < 0 ? -valX1 : valX1;
                float abs2 = valY1 < 0 ? -valY1 : valY1;
                float abs3 = valX2 < 0 ? -valX2 : valX2;
                float abs4 = valY2 < 0 ? -valY2 : valY2;

                if (Float.isInfinite(valX1) || Float.isInfinite(valY1) || Float.isInfinite(valX2) || Float.isInfinite(valY2) ||
                    Float.isNaN(valX1) || Float.isNaN(valY1) || Float.isNaN(valX2) || Float.isNaN(valY2) ||
                    abs1 > limiteMaximo || abs2 > limiteMaximo || abs3 > limiteMaximo || abs4 > limiteMaximo) {
                    System.out.println("[ERROR]: Numeros demasiado grandes para graficar. Usa valores entre -10,000,000 y 10,000,000.");
                    continue;
                }

                // Limpia -0.0
                if (valX1 == 0.0f) valX1 = 0.0f;
                if (valY1 == 0.0f) valY1 = 0.0f;
                if (valX2 == 0.0f) valX2 = 0.0f;
                if (valY2 == 0.0f) valY2 = 0.0f;

                datosValidos = true;

                // Impresion de coordenadas
                System.out.println("Coordenada X en P1: " + valX1);
                System.out.println("Coordenada Y en P1: " + valY1);
                System.out.println("Coordenada X en P2: " + valX2);
                System.out.println("Coordenada Y en P2: " + valY2);

                // Calculo seguro de la derivada/pendiente entre los 2 puntos
                float deltaX = valX2 - valX1;
                float deltaY = valY2 - valY1;

                if (deltaX == 0.0f && deltaY == 0.0f) {
                    System.out.println("Pendiente (Derivada): Indeterminada (0/0) - P1 y P2 son el mismo punto.");
                } else if (deltaX == 0.0f) {
                    System.out.println("Pendiente (Derivada): Indefinida (Recta vertical, division entre 0).");
                } else {
                    float pendiente = deltaY / deltaX;
                    if (pendiente == 0.0f) pendiente = 0.0f;
                    if (Float.isInfinite(pendiente) || Float.isNaN(pendiente)) {
                        System.out.println("Pendiente (Derivada): Tiende a infinito (pendiente extremadamente pronunciada).");
                    } else {
                        System.out.println("Pendiente (Derivada) m = " + pendiente);
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("[ERROR]: No se pudo convertir a numero float. Intenta de nuevo.");
            }
        }

        final float fx1 = valX1, fy1 = valY1, fx2 = valX2, fy2 = valY2;

        JPanel panelGrafica = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int ancho = getWidth();
                int alto = getHeight();
                int centroX = ancho / 2;
                int centroY = alto / 2;

                float absX1 = fx1 < 0 ? -fx1 : fx1;
                float absY1 = fy1 < 0 ? -fy1 : fy1;
                float absX2 = fx2 < 0 ? -fx2 : fx2;
                float absY2 = fy2 < 0 ? -fy2 : fy2;

                float max1 = absX1 > absY1 ? absX1 : absY1;
                float max2 = absX2 > absY2 ? absX2 : absY2;
                float maxValor = max1 > max2 ? max1 : max2;

                if (maxValor < 0.0001f) {
                    maxValor = 1.0f;
                }

                int dimMenor = ancho < alto ? ancho : alto;
                float espacioUtil = (dimMenor / 2.0f) - 70.0f;
                if (espacioUtil < 20.0f) {
                    espacioUtil = 20.0f;
                }

                float escala = espacioUtil / maxValor;

                // Cuadricula
                g2.setColor(new Color(225, 225, 225));
                int paso = (int) escala;
                if (paso < 25 || paso > 100) {
                    paso = 40;
                }

                for (int i = centroX; i < ancho; i += paso) g2.drawLine(i, 0, i, alto);
                for (int i = centroX; i > 0; i -= paso) g2.drawLine(i, 0, i, alto);
                for (int i = centroY; i < alto; i += paso) g2.drawLine(0, i, ancho, i);
                for (int i = centroY; i > 0; i -= paso) g2.drawLine(0, i, ancho, i);

                // Ejes X e Y
                g2.setColor(Color.BLACK);
                g2.setStroke(new BasicStroke(1.5f));
                g2.drawLine(0, centroY, ancho, centroY);
                g2.drawLine(centroX, 0, centroX, alto);
                g2.drawString("Eje X", ancho - 45, centroY - 10);
                g2.drawString("Eje Y", centroX + 10, 20);

                int px1 = (int) (centroX + (fx1 * escala));
                int py1 = (int) (centroY - (fy1 * escala));
                int px2 = (int) (centroX + (fx2 * escala));
                int py2 = (int) (centroY - (fy2 * escala));

                // Linea azul de P1 a P2
                g2.setColor(Color.BLUE);
                g2.setStroke(new BasicStroke(2.5f));
                g2.drawLine(px1, py1, px2, py2);

                // Puntos rojos
                g2.setColor(Color.RED);
                g2.fillOval(px1 - 5, py1 - 5, 10, 10);
                g2.fillOval(px2 - 5, py2 - 5, 10, 10);

                // Textos
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("Arial", Font.BOLD, 12));
                g2.drawString("P1 (" + fx1 + ", " + fy1 + ")", px1 + 8, py1 - 8);
                if (fx1 == fx2 && fy1 == fy2) {
                    g2.drawString("P2 (" + fx2 + ", " + fy2 + ") [Mismo punto]", px2 + 8, py2 + 15);
                } else {
                    g2.drawString("P2 (" + fx2 + ", " + fy2 + ")", px2 + 8, py2 - 8);
                }
            }
        };

        JFrame ventana = new JFrame("Grafica de los puntos P1 y P2");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(650, 650);
        ventana.setMinimumSize(new Dimension(350, 350)); // No colapse ventana
        ventana.setLocationRelativeTo(null);
        ventana.add(panelGrafica);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        derivada_puntos();
    }
}