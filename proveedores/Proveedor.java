
package proveedores;

public class Proveedor {

    private String nombre;
    private String ruc;
    private String telefono;

    public Proveedor(String nombre, String ruc, String telefono) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUC: " + ruc);
        System.out.println("Telefono: " + telefono);
        System.out.println("----------------------");
    }
}
