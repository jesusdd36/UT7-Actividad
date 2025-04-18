package Endes.farmacia.medicamentos;

public class MedicamentoEspecializado extends Medicamentos {
    private String tipo;

    public MedicamentoEspecializado(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String mostrarMedicamento(int numero, int cantidad, int numFarmacia, int codigoMedicamento, int codigoFarmacia) {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;

    }

    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;
    }
}
