
package empleados;

public class Administrador extends Empleado {

    private String usuario;

    public Administrador(String nombre, String dni, double sueldo, String usuario) {

        super(nombre, dni, sueldo);
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Usuario: " + usuario);
    }
}
