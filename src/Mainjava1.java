package src;

import java.util.Scanner;
import src.model.ProductoDescuento;

public class Mainjava1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos productos desea registrar?: ");
        int cantidadProductos = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        // En lugar de Object[][], usamos un arreglo de objetos de la clase hija
        ProductoDescuento[] productos = new ProductoDescuento[cantidadProductos];

        double totalGeneralVentas = 0.0;

        // 1. Entrada de datos y creación de objetos
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("\n--- REGISTRO DEL PRODUCTO " + (i + 1) + " ---");

            System.out.print("Ingrese el nombre del producto: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el precio unitario del producto: S/");
            double precio = entrada.nextDouble();

            System.out.print("Ingrese la cantidad de productos a vender: ");
            int cantidad = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            // Instanciamos el objeto hijo y lo guardamos en el arreglo
            productos[i] = new ProductoDescuento(nombre, precio, cantidad);
        }

        // 2. Salida de datos en formato TABLA
        System.out.println(
                "\n\n========================================================= REPORTE GENERAL DE VENTAS =========================================================");
        System.out.printf("| %-6s | %-18s | %-10s | %-8s | %-12s | %-11s | %-11s | %-9s | %-12s |\n",
                "POS.", "PRODUCTO", "P. UNIT.", "CANT.", "SUBTOTAL", "DESCUENTO", "VALOR C/D", "IGV (18%)", "TOTAL");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < productos.length; i++) {
            // Obtenemos el objeto directamente de la posición [i]
            ProductoDescuento prod = productos[i];

            // Ejecutamos los métodos del objeto de forma directa
            double subtotal = prod.calcularSubtotal();
            double descuento = prod.calcularDescuento();
            double valorConDescuento = prod.calcularValorConDescuento();
            double igv = prod.calcularIgv(valorConDescuento);
            double totalAPagar = prod.calcularTotalAPagar();

            totalGeneralVentas += totalAPagar;

            // Imprimimos la fila usando los métodos del objeto
            System.out.printf(
                    "|     [%d] | %-18s | S/%-8.2f | %-8d | S/%-10.2f | S/%-9.2f | S/%-9.2f | S/%-7.2f | S/%-10.2f |\n",
                    i, prod.getNombre(), prod.getPrecioUnitario(), prod.getCantidadVenta(),
                    subtotal, descuento, valorConDescuento, igv, totalAPagar);
        }

        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-114s | S/%-10.2f |\n", "TOTAL GENERAL ACUMULADO:", totalGeneralVentas);
        System.out.println(
                "=============================================================================================================================================");

        entrada.close();
    }
}
