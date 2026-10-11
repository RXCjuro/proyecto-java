
package almacen;

public class Almacen {

    private String nombreMedicamento;
    private String tipo;
    private int cantidad;

    public Almacen(String nombreMedicamento, String tipo, int cantidad) {
        this.nombreMedicamento = nombreMedicamento;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("----------------------");
    }
}
