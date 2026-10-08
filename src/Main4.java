package src;

import java.util.Scanner;

import cliente.ClienteDescuento;

public class Main4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ClienteDescuento[] clientes = new ClienteDescuento[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("\n--- CLIENTE " + (i + 1) + " ---");

            System.out.print("Ingrese el monto de la compra: ");
            double compra = entrada.nextDouble();

            System.out.print("Ingrese la edad: ");
            double edad = entrada.nextDouble();

            System.out.print("¿Tiene tarjeta? (1 = Sí / 2 = No): ");
            double tarjeta = entrada.nextDouble();

            clientes[i] = new ClienteDescuento(compra, edad, tarjeta);
        }

        System.out.println("\n=== RESULTADOS ===");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nCliente " + (i + 1));

            clientes[i].mostrarResultado();
        }

        entrada.close();
    }
}