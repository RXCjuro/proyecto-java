import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        // Se cambió el nombre del Scanner de 'sc' a 'entrada'
        Scanner entrada = new Scanner(System.in);

        // Definir la cantidad de productos a registrar
        System.out.print("¿Cuántos productos desea registrar?: ");
        int cantidadProductos = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer

        // Matriz de N filas y 8 columnas (una columna para cada variable)
        Object[][] matrizInventario = new Object[cantidadProductos][8];
        
        // Variable para acumular el total general de todas las ventas
        double totalGeneralventas = 0.0;

        // 1. Entrada de datos y Cálculos dentro de la matriz
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("\n--- REGISTRO DEL PRODUCTO " + (i + 1) + " ---");
            
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = entrada.nextLine();

            System.out.print("Ingrese el precio unitario del producto: S/");
            double precioUnitario = entrada.nextDouble();

            System.out.print("Ingrese la cantidad de productos a vender: ");
            int cantidadVenta = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            // 2. Procesos y Cálculos Matemáticos
            double subtotal = precioUnitario * cantidadVenta;
            double descuento = 0.0;

            if (subtotal > 100.0) {
                descuento = subtotal * 0.10; // 10% de descuento si la compra es mayor a $100
            } else {
                descuento = 0.0; // Sin descuento si es menor o igual a $100
            }

            double valorConDescuento = subtotal - descuento;
            double igv = valorConDescuento * 0.18; // Cálculo del IGV (18%)
            double totalAPagar = valorConDescuento + igv;

            // Guardar los datos en las columnas de la fila actual [i]
            matrizInventario[i][0] = nombreProducto;
            matrizInventario[i][1] = precioUnitario;
            matrizInventario[i][2] = cantidadVenta;
            matrizInventario[i][3] = subtotal;
            matrizInventario[i][4] = descuento;
            matrizInventario[i][5] = valorConDescuento;
            matrizInventario[i][6] = igv;
            matrizInventario[i][7] = totalAPagar;
        }

        // 3. Salida de datos en formato TABLA
        System.out.println("\n\n========================================================= REPORTE GENERAL DE VENTAS =========================================================");
        
        // Cabecera de la tabla
        System.out.printf("| %-6s | %-18s | %-10s | %-8s | %-12s | %-11s | %-11s | %-9s | %-12s |\n", 
                "POS.", "PRODUCTO", "P. UNIT.", "CANT.", "SUBTOTAL", "DESCUENTO", "VALOR C/D", "IGV (18%)", "TOTAL");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < cantidadProductos; i++) {
            // Recuperamos los valores especificando la fila [i] y su respectiva columna
            String nombreProducto = (String) matrizInventario[i][0];
            double precioUnitario = (double) matrizInventario[i][1];
            int cantidadVenta = (int) matrizInventario[i][2];
            double subtotal = (double) matrizInventario[i][3];
            double descuento = (double) matrizInventario[i][4];
            double valorConDescuento = (double) matrizInventario[i][5];
            double igv = (double) matrizInventario[i][6];
            double totalAPagar = (double) matrizInventario[i][7];

            // Acumular al total general
            totalGeneralventas += totalAPagar;

            // Fila de datos alineada con la cabecera
            System.out.printf("|     [%d] | %-18s | S/%-8.2f | %-8d | S/%-10.2f | S/%-9.2f | S/%-9.2f | S/%-7.2f | S/%-10.2f |\n", 
                    i, nombreProducto, precioUnitario, cantidadVenta, subtotal, descuento, valorConDescuento, igv, totalAPagar);
        }

        // Mostrar la suma total al cierre de la tabla
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-114s | S/%-10.2f |\n", "TOTAL GENERAL ACUMULADO:", totalGeneralventas);
        System.out.println("=============================================================================================================================================");

        entrada.close();
    }
}
