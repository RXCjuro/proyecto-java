import java.time.LocalTime;
import java.util.Scanner;

public class Trabajo {
    public static void main(String[] args) {
        try (Scanner trabajador = new Scanner(System.in)) {

            // Definir la cantidad de trabajadores a registrar
            System.out.print("¿Cuántos trabajadores desea registrar?: ");
            int cantidadTrabajadores = trabajador.nextInt();
            trabajador.nextLine(); // Limpiar el buffer

            // Matriz de N filas y 5 columnas para almacenar los datos de asistencia
            Object[][] matrizAsistencia = new Object[cantidadTrabajadores][5];

            // 1. Entrada de datos y Procesamiento dentro de la matriz
            for (int i = 0; i < cantidadTrabajadores; i++) {
                System.out.println("\n--- REGISTRO DE ASISTENCIA (" + (i + 1) + ") ---");

                // Entrada de datos
                System.out.print("Nombre del trabajador: ");
                String nombre = trabajador.nextLine();

                System.out.print("Hora de ingreso (formato HH:mm): ");
                String horaingresoStr = trabajador.nextLine();

                // Convertir la hora de ingreso a un objeto LocalTime
                LocalTime horaingreso = LocalTime.parse(horaingresoStr);

                // Hora de entrada establecida (8:00 AM)
                LocalTime horaentrada = LocalTime.of(8, 0);

                // Hora límite para considerar puntualidad (8:15 AM)
                LocalTime horalimite = horaentrada.plusMinutes(15);

                // Guardar las variables originales en las columnas de la matriz
                matrizAsistencia[i][0] = nombre;
                matrizAsistencia[i][2] = horaingreso;
                matrizAsistencia[i][3] = horaentrada;
                matrizAsistencia[i][4] = horalimite;
            }

            // 2. Salida de datos en formato TABLA
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

            for (int i = 0; i < cantidadTrabajadores; i++) {
                // Recuperamos los valores de la matriz asignándolos a tus variables originales
                String nombre = (String) matrizAsistencia[i][0];
                LocalTime horaingreso = (LocalTime) matrizAsistencia[i][2];
                LocalTime horaentrada = (LocalTime) matrizAsistencia[i][3];
                LocalTime horalimite = (LocalTime) matrizAsistencia[i][4];

                // Determinar el estado para la columna utilizando tu lógica original
                String estado;
                if (horaingreso.isBefore(horalimite) || horaingreso.equals(horalimite)) {
                    estado = "Puntual";
                } else {
                    estado = "Llega tarde";
                }

                // Imprimir la fila alineada en columnas
                System.out.printf("| Fila[%d] | %-20s | %-12s | %-12s | %-12s | %-15s |\n",
                        i, nombre, horaentrada, horalimite, horaingreso, estado);
            }
            System.out.println(
                    "=========================================================================================");
        }
    }
}
