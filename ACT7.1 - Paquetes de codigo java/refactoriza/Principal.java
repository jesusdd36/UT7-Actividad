/**
 *
 * @author Jesús Díaz Delgado y Joel Mata Rodriguez
 * @version 1.0
 * 
 */

package refactoriza;




import Endes.farmacia.medicamentos.MedicamentoEspecializado;
import Endes.farmacia.medicamentos.medicamentoGenerico;

import java.util.Map;
import java.util.Random;

public class Principal {

    /*Comienza el programa*/
    // Comienza el programa
    public static void main(String[] args) {
        FARMACIA farmacia = new FARMACIA();
        Random random = new Random();

        // Agregar medicamentos genéricos
        for (int i = 1; i <= 10; i++) {
            String nombre = "Medicamento" + i;
            double precio = random.nextDouble() * 100;
            medicamentoGenerico med = new medicamentoGenerico(nombre, precio);
            farmacia.AgregarMedicamento(med, 100);
        }

        // Agregar medicamentos especializados
        for (int i = 1; i <= 10; i++) {
            String nombre = "Medicamento" + i;
            double precio = random.nextDouble() * 100;
            String tipo = "Tipo" + i;
            MedicamentoEspecializado medEsp = new MedicamentoEspecializado(nombre, precio, tipo);
            farmacia.AGREGAR_MEDICAMENTO_B(medEsp, 20);
        }

        // Mostrar inventario
        System.out.println("Inventario de la farmacia:");
        for (Map.Entry<String, Integer> entry : farmacia.inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }
}
