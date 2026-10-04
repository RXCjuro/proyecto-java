package src.model;

import java.time.LocalTime;

public class AsistenciaBase {
    // Atributos protegidos accesibles por la clase hija
    protected String nombre;
    protected LocalTime horaIngreso;
    protected LocalTime horaEntrada;
    protected LocalTime horaLimite;

    // Constructor base
    public AsistenciaBase(String nombre, LocalTime horaIngreso) {
        this.nombre = nombre;
        this.horaIngreso = horaIngreso;
        this.horaEntrada = LocalTime.of(8, 0); // Hora fija: 8:00 AM
        this.horaLimite = this.horaEntrada.plusMinutes(15); // Hora límite: 8:15 AM
    }

    // Método para mostrar información individual básica
    public void mostrarInformacion() {
        System.out.println("Trabajador: " + nombre);
        System.out.println("Hora Registro: " + horaIngreso);
    }

    // Getters necesarios para construir el reporte en el Main
    public String getNombre() {
        return nombre;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraLimite() {
        return horaLimite;
    }
}
