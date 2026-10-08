package src;

import java.time.LocalTime;
import java.util.Scanner;

import asistencia.AsistenciaEstado;

public class Mainjava2 {
    public static void main(String[] args) {
        try (Scanner trabajador = new Scanner(System.in)) {

            // Definir la cantidad de trabajadores a registrar
            System.out.print("¿Cuántos trabajadores desea registrar?: ");
            int cantidadTrabajadores = trabajador.nextInt();
            trabajador.nextLine(); // Limpiar el buffer

            // En lugar de la matriz Object[][], usamos un arreglo de objetos de la clase
            // hija
            AsistenciaEstado[] asistencias = new AsistenciaEstado[cantidadTrabajadores];

            // 1. Entrada de datos y creación de objetos
            for (int i = 0; i < cantidadTrabajadores; i++) {
                System.out.println("\n--- REGISTRO DE ASISTENCIA (" + (i + 1) + ") ---");

                System.out.print("Nombre del trabajador: ");
                String nombre = trabajador.nextLine();

                System.out.print("Hora de ingreso (formato HH:mm): ");
                String horaIngresoStr = trabajador.nextLine();

                // Convertir la entrada a LocalTime
                LocalTime horaIngreso = LocalTime.parse(horaIngresoStr);

                // Instanciamos el objeto hijo directo en la posición del arreglo
                asistencias[i] = new AsistenciaEstado(nombre, horaIngreso);
            }

            // 2. Salida de datos en formato TABLA EXACTA
            System.out.println(
                    "\n\n=========================================================================================");
            System.out.println(
                    "                               REPORTE GENERAL DE ASISTENCIA                             ");
            System.out.println(
                    "=========================================================================================");

            // Cabecera de la tabla
            System.out.printf("| %-6s | %-20s | %-12s | %-12s | %-12s | %-15s |\n",
                    "POS.", "TRABAJADOR", "H. ENTRADA", "H. LÍMITE", "H. REGISTRO", "ESTADO");
            System.out.println(
                    "-----------------------------------------------------------------------------------------");

            for (int i = 0; i < asistencias.length; i++) {
                // Recuperamos el objeto guardado
                AsistenciaEstado asis = asistencias[i];

                // Imprimir la fila consumiendo los métodos y propiedades del objeto
                System.out.printf("| Fila[%d] | %-20s | %-12s | %-12s | %-12s | %-15s |\n",
                        i,
                        asis.getNombre(),
                        asis.getHoraEntrada(),
                        asis.getHoraLimite(),
                        asis.getHoraIngreso(),
                        asis.evaluarEstado());
            }
            System.out.println(
                    "=========================================================================================");
        }
    }
}
