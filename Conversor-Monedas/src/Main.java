import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean entrada = true;

        while (entrada) {
            System.out.println("**********************************************");
            System.out.println("Bienvenido/a al Conversor de Monedas\n");
            System.out.println("   1- Dolar ==> Peso Argentino\n" +
                    "   2- Peso Argentino ==> Dolar\n" +
                    "   3- Dolar ==> Real Brasilero\n" +
                    "   4- Real Brasilero ==> Dolar\n" +
                    "   5- Dolar ==> Peso Colombiano\n" +
                    "   6- Peso Colombiano ==> Dolar\n" +
                    "   7- Salir\n" +
                    "Elija una opcion válida:");
            System.out.println("**********************************************");

            String monedaBase;
            String monedaDestino;
            int opc;

            // Validar que la opción sea un número entero
            try {
                opc = Integer.parseInt(leer.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Solo se admiten números. Inténtelo de nuevo.");
                continue; // Volver al inicio del bucle
            }

            switch (opc) {
                case 1:
                    monedaBase = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    monedaBase = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    monedaDestino = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL";
                    monedaDestino = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaDestino = "COP";
                    break;
                case 6:
                    monedaBase = "COP";
                    monedaDestino = "USD";
                    break;
                case 7:
                    System.out.println("Hasta luego...");
                    entrada = false;
                    continue; // Salir del bucle
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    continue; // Volver al inicio del bucle
            }

            // Solicitar la cantidad
            double cantidad;
            while (true) {
                System.out.println("Ingrese la cantidad de " + monedaBase + " a convertir en " + monedaDestino + ":");
                try {
                    cantidad = Double.parseDouble(leer.nextLine());
                    if (cantidad <= 0) {
                        System.out.println("La cantidad debe ser mayor a 0. Inténtelo de nuevo.");
                        continue;
                    }
                    break; // Salir del bucle si la entrada es válida
                } catch (NumberFormatException e) {
                    System.out.println("Solo se admiten números válidos. Inténtelo de nuevo.");
                }
            }

            // Realizar la conversión
            try {
                double resultado = ConversorApp.convertir(monedaBase, monedaDestino, cantidad);
                System.out.printf("Resultado: $%.2f %s%n", resultado, monedaDestino);
            } catch (Exception e) {
                System.out.println("Error al realizar la conversión: " + e.getMessage());
            }
        }

        leer.close(); // Cerrar el scanner
    }
}
