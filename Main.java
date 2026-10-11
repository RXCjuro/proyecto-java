
import java.util.Scanner;
import medicamentos.GestionarMedicamentos;
import proveedores.GestionDeProveedor;
import almacen.GestionarAlmacenamiento;
import empleados.GestionarEmpleados;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        GestionarMedicamentos gestion = new GestionarMedicamentos();
        GestionDeProveedor gestionarProveedor = new GestionDeProveedor();
        GestionarAlmacenamiento gestionarAlmacen = new GestionarAlmacenamiento();
        GestionarEmpleados gestionarEmpleados = new GestionarEmpleados();
        int opcion;

        do {
            System.out.println("\n=== ALMACEN DE MEDICAMENTOS ===");
            System.out.println("1. Registrar medicamento");
            System.out.println("2. Listar medicamentos");
            System.out.println("3. Registrar proveedor");
            System.out.println("4. Listar proveedores");
            System.out.println("5. Registrar movimiento");
            System.out.println("6. Listar movimientos");
            System.out.println("7. Registrar empleado");
            System.out.println("8. Listar empleados");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 1) {
                gestion.registrar(teclado);
            } else if (opcion == 2) {
                gestion.listar();
            } else if (opcion == 3) {
                gestionarProveedor.registrar(teclado);
            } else if (opcion == 4) {
                gestionarProveedor.listar();
            } else if (opcion == 5) {
                gestionarAlmacen.registrar(teclado);
            } else if (opcion == 6) {
                gestionarAlmacen.listar();
            } else if (opcion == 7) {
                gestionarEmpleados.registrar(teclado);
            } else if (opcion == 8) {
                gestionarEmpleados.listar();
            } else if (opcion == 9) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opcion no valida");
            }
        } while (opcion != 9);
        teclado.close();
    }
}
