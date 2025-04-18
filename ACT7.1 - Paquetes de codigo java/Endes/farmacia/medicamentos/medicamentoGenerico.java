package Endes.farmacia.medicamentos;

public class medicamentoGenerico extends Medicamentos {

    public double constante_subvencionado = 15;

    public medicamentoGenerico(String nombre, double precio) {
        super(nombre, precio);
    }

    public double getPrecioSubvencionado() {
        return constante_subvencionado * precio;
    }
}
