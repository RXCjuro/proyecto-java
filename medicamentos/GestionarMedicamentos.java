
package medicamentos;

import java.util.Scanner;

public class GestionarMedicamentos {

    private Medicamento[] medicamentos;
    private int cantidadMedicamentos;

    public GestionarMedicamentos() {
        medicamentos = new Medicamento[10];
        cantidadMedicamentos = 0;
    }

    public void registrar(Scanner teclado) {
        if (cantidadMedicamentos >= medicamentos.length) {
            System.out.println("No hay espacio para más medicamentos");
            return;
        }

        System.out.println("Ingrese el nombre del medicamento:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el precio:");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese el stock:");
        int stock = teclado.nextInt();
        teclado.nextLine();
        medicamentos[cantidadMedicamentos] =
                new Medicamento(nombre, precio, stock);
        cantidadMedicamentos++;
        System.out.println("Medicamento registrado correctamente");
    }

    public void listar() {

        System.out.println("=== LISTA DE MEDICAMENTOS ===");
        if (cantidadMedicamentos == 0) {
            System.out.println("No hay medicamentos registrados");
        } else {
            for (int i = 0; i < cantidadMedicamentos; i++) {
                medicamentos[i].mostrarInformacion();
            }
        }
    }
}
