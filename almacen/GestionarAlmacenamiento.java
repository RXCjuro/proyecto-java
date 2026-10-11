
package almacen;

import java.util.Scanner;

public class GestionarAlmacenamiento {

    private Almacen[] movimientos;
    private int cantidadMovimientos;

    public GestionarAlmacenamiento() {
        movimientos = new Almacen[10];
        cantidadMovimientos = 0;
    }
    public void registrar(Scanner teclado) {
        if (cantidadMovimientos >= movimientos.length) {
            System.out.println("No hay espacio para mas movimientos");
            return;
        }

        System.out.println("Ingrese el nombre del medicamento:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el tipo (Entrada o Salida):");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese la cantidad:");
        int cantidad = teclado.nextInt();
        teclado.nextLine();
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero");
            return;
        }

        movimientos[cantidadMovimientos] = new Almacen(nombre, tipo, cantidad);
        cantidadMovimientos++;
        System.out.println("Movimiento registrado correctamente");
    }

    public void listar() {

        System.out.println("=== MOVIMIENTOS DEL ALMACEN ===");
        if (cantidadMovimientos == 0) {
            System.out.println("No hay movimientos registrados");
        } else {
            for (int i = 0; i < cantidadMovimientos; i++) {
                movimientos[i].mostrarInformacion();
            }
        }
    }
}
