
package empleados;

import java.util.Scanner;

public class GestionarEmpleados {

    private Empleado[] empleados;
    private int cantidadEmpleados;

    public GestionarEmpleados() {
        empleados = new Empleado[10];
        cantidadEmpleados = 0;
    }

    public void registrar(Scanner teclado) {
        if (cantidadEmpleados >= empleados.length) {
            System.out.println("No hay espacio para mas empleados");
            return;
        }

        System.out.println("Ingrese el nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el DNI:");
        String dni = teclado.nextLine();
        System.out.println("Ingrese el sueldo:");
        double sueldo = teclado.nextDouble();
        teclado.nextLine();

        empleados[cantidadEmpleados] = new Empleado(nombre, dni, sueldo);
        cantidadEmpleados++;
        System.out.println("Empleado registrado correctamente");
    }

    public void listar() {
        System.out.println("=== LISTA DE EMPLEADOS ===");
        if (cantidadEmpleados == 0) {
            System.out.println("No hay empleados registrados");
        } else {
            for (int i = 0; i < cantidadEmpleados; i++) {
                empleados[i].mostrarInformacion();
            }
        }
    }
}
