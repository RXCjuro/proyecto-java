import java.util.Scanner;

public class DescuentoMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] clientes = new double[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- CLIENTE " + (i + 1) + " ---");
            System.out.println("Ingrese el monto de la compra:");
            clientes[i][0] = entrada.nextDouble();
            System.out.println("Ingrese la edad:");
            clientes[i][1] = entrada.nextDouble();
            System.out.println("¿Tiene tarjeta? (1 = Sí / 2 = No)");
            clientes[i][2] = entrada.nextDouble();
        }
        System.out.println("\n=== RESULTADOS ===");

        for (int i = 0; i < 3; i++) {
            double compra = clientes[i][0];
            double edad = clientes[i][1];
            double tarjeta = clientes[i][2];

            double descuento = 0;
            if (tarjeta == 1 && edad >= 60) {
                descuento = compra * 0.20;
            } else if (edad >= 60) {
                descuento = compra * 0.15;
            } else if (tarjeta == 1) {
                descuento = compra * 0.10;
            }

            double total = compra - descuento;
            System.out.println("\nCliente " + (i + 1));
            System.out.println("Compra: S/. " + compra);
            System.out.println("Descuento: S/. " + descuento);
            System.out.println("Total a pagar: S/. " + total);
        }
        entrada.close();
    }
}