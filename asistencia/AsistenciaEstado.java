package asistencia;

import java.time.LocalTime;

public class AsistenciaEstado extends AsistenciaBase {

    // Constructor que invoca al padre usando super()
    public AsistenciaEstado(String nombre, LocalTime horaIngreso) {
        super(nombre, horaIngreso);
    }

    // Proceso lógico propio: Determinar si llegó puntual o tarde
    public String evaluarEstado() {
        if (horaIngreso.isBefore(horaLimite) || horaIngreso.equals(horaLimite)) {
            return "Puntual";
        } else {
            return "Llega tarde";
        }
    }

    // Método de impresión compuesta (similar a mostrarInformacionLaptop)
    public void mostrarInformacionCompleta() {
        mostrarInformacion(); // Llama al método del padre
        System.out.println("Estado Final: " + evaluarEstado());
    }
}
