package Endes.medicamentos;

public class MedicamentoGenerico extends Medicamentos {

    public double constante_subvencionado = 15;

    public MedicamentoGenerico(String nombre, double precio) {
        super(nombre, precio);
    }

    public double getPrecioSubvencionado() {
        return constante_subvencionado * precio;
    }
}
