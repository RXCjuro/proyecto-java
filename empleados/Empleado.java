
package empleados;

public class Empleado {

    private String nombre;
    private String dni;
    private double sueldo;

    public Empleado(String nombre, String dni, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("----------------------");
    }
}
