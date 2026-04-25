import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== calculadora de Interes Agricola ===");

        System.out.println("Ingrese el monto del prestamo: ");
        double monto = scanner.nextDouble();

        System.out.println("Ingrese la tasa anual: ");
        double tasaAnual = scanner.nextDouble();

        System.out.println("Ingrese el plazo en meses: ");
        int plazoMeses = scanner.nextInt();

        calculadoraIteres calculoIteres = new calculadoraIteres(monto, tasaAnual, plazoMeses);
        double total = calculoIteres.calcularInteres();

        System.out.println("---------------------------------");
        System.out.println("El interes simples a pagar es: $" + total);

        scanner.close();
    }
}