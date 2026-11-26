public static void ejecutarModuloFinanciero(Scanner read) {

        System.out.println("\n===== MODULO FINANCIERO-LOGICO =====");

        double precioBase;

        // Validar el precio base
        while (true) {

            System.out.print("\nIngresa el precio base del equipo: $");

            if (!read.hasNextDouble()) {

                System.out.println("Error: debes ingresar un valor numerico.");
                read.next();
                continue;
            }

            precioBase = read.nextDouble();

            // Evitar valores negativos, cero, NaN e infinito
            if (!Double.isFinite(precioBase) || precioBase <= 0) {

                System.out.println("Error: el precio debe ser mayor que cero.");
                continue;
            }

            // Evitar que el calculo del impuesto produzca infinito
            if (precioBase > Double.MAX_VALUE / 1.16) {

                System.out.println("Error: el precio es demasiado grande.");
                continue;
            }

            break;
        }

        // Explicar como responder las proposiciones
        System.out.println("\nResponde las siguientes preguntas:");
        System.out.println("1 = Si cumple");
        System.out.println("0 = No cumple");

        // Evaluar la proposicion P
        int p = leerProposicion(read, "P",
                "¿El comprador es estudiante acreditado?");

        // Evaluar la proposicion Q
        int q = leerProposicion(read, "Q",
                "¿El equipo pertenece al catalogo educativo?");

        // Convertir los valores numericos a booleanos
        boolean proposicionP = (p == 1);
        boolean proposicionQ = (q == 1);

        double porcentajeImpuesto;
        String politicaFiscal;
        String explicacion;

        // Determinar el porcentaje de impuesto
        if (proposicionP && proposicionQ) {

            porcentajeImpuesto = 0.0;

            politicaFiscal = "Exencion Total de Impuesto";

            explicacion = "Se cumplen ambas condiciones. "
                    + "Se aplica la exencion total.";

        } else if (proposicionP ^ proposicionQ) {

            porcentajeImpuesto = 0.08;

            politicaFiscal = "Impuesto Reducido";

            explicacion = "Solamente una condicion se cumple. "
                    + "Se aplica el impuesto reducido.";

        } else {

            porcentajeImpuesto = 0.16;

            politicaFiscal = "Impuesto General";

            explicacion = "Ninguna condicion se cumple. "
                    + "Se aplica el impuesto general.";
        }

        // Calcular el impuesto y el total a pagar
        double montoImpuesto = precioBase * porcentajeImpuesto;

        double totalPagar = precioBase + montoImpuesto;

        // Mostrar los resultados financieros
        System.out.println("\n===== RESULTADOS FINANCIEROS =====");

        System.out.printf("Precio base: $%.2f%n", precioBase);

        System.out.println("\nEvaluacion de condiciones:");

        System.out.println("P (Estudiante acreditado): "
                + (proposicionP ? "Si cumple" : "No cumple"));

        System.out.println("Q (Catalogo educativo): "
                + (proposicionQ ? "Si cumple" : "No cumple"));

        System.out.println("\nPolitica fiscal: " + politicaFiscal);

        System.out.println("Motivo: " + explicacion);

        System.out.println("\nDesglose de la compra:");

        System.out.printf("Porcentaje de impuesto: %.0f%%%n",
                porcentajeImpuesto * 100);

        System.out.printf("Monto del impuesto: $%.2f%n", montoImpuesto);

        System.out.println("------------------------------------------");

        System.out.printf("TOTAL A PAGAR: $%.2f%n", totalPagar);

        System.out.println("------------------------------------------");
    }

    // ==========================================
    // METODO PARA VALIDAR LAS PROPOSICIONES
    // ==========================================

    public static int leerProposicion(Scanner read,
            String nombre, String pregunta) {

        int valor;

        System.out.println("\n" + nombre + ": " + pregunta);

        System.out.print("Respuesta (0 o 1): ");

        while (true) {

            // Comprobar que el dato sea entero
            while (!read.hasNextInt()) {

                System.out.println("Error: debes ingresar 0 o 1.");
                read.next();

                System.out.print("Respuesta (0 o 1): ");
            }

            valor = read.nextInt();

            // Comprobar que solamente sea 0 o 1
            if (valor == 0 || valor == 1) {

                return valor;

            } else {

                System.out.println("Error: solamente se permite 0 o 1.");

                System.out.print("Respuesta (0 o 1): ");
            }
        }
    }
