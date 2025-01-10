import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String monedaBase = "";
        String monedaDestino = "";
        int opc = 0;
        double cantidad = 0;
        while (opc != 7) {
            System.out.println("*****************************************");
            System.out.println("Bienvenido/a al Conversor de Monedas\n");
            System.out.println("   1- Dolar ==> Peso Argentino.\n" +
                    "   2- Peso Argentino ==> Dolar.\n" +
                    "   3- Dolar ==> Real Brasilero.\n" +
                    "   4- Real Brasilero ==> Dolar.\n" +
                    "   5- Dolar ==> Peso Colombiano.\n" +
                    "   6- Peso Colombiano ==> Dolar.\n" +
                    "   7- Salir.\n" +
                    "Elija una opcion válida.");
            System.out.println("*****************************************");
            opc = leer.nextInt();

            switch (opc){
                case 1:
                    monedaBase = "USD"; monedaDestino = "ARS";
                    break;
                case 2:
                    monedaBase = "ARS"; monedaDestino = "USD";
                    break;
                case 3:
                    monedaBase = "USD"; monedaDestino = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL"; monedaDestino = "USD";
                    break;
                case 5:
                    monedaBase = "USD"; monedaDestino = "COP";
                    break;
                case 6:
                    monedaBase = "COP"; monedaDestino = "USD";
                    break;
                case 7:
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Ingresar una opcion válida!");
            }
            if(opc >= 1 && opc <= 6){
                System.out.println("Ingresar cantidad:");
                cantidad = leer.nextDouble();
                // Realizar la conversión
                double resultado = 0;
                try {
                    resultado = ConversorApp.convertir(monedaBase, monedaDestino, cantidad);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                System.out.printf("Resultado: $%.2f %s%n", resultado, monedaDestino);
            }
        }
    }
}