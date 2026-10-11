
package proveedores;

import java.util.Scanner;

public class GestionDeProveedor {

    private Proveedor[] proveedores;
    private int cantidadProveedores;

    public GestionDeProveedor() {
        proveedores = new Proveedor[10];
        cantidadProveedores = 0;
    }

    public void registrar(Scanner teclado) {
        if (cantidadProveedores >= proveedores.length) {
            System.out.println("No hay espacio para mas proveedores");
            return;
        }

        System.out.println("Ingrese el nombre del proveedor:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el RUC:");
        String ruc = teclado.nextLine();
        System.out.println("Ingrese el telefono:");
        String telefono = teclado.nextLine();

        proveedores[cantidadProveedores] =
                new Proveedor(nombre, ruc, telefono);
        cantidadProveedores++;
        System.out.println("Proveedor registrado correctamente");
    }

    public void listar() {
        System.out.println("=== LISTA DE PROVEEDORES ===");
        if (cantidadProveedores == 0) {
            System.out.println("No hay proveedores registrados");
        } else {
            for (int i = 0; i < cantidadProveedores; i++) {
                proveedores[i].mostrarInformacion();
            }
        }
    }
}
