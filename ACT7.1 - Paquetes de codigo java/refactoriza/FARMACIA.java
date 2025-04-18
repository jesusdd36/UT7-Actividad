package refactoriza;

import Endes.farmacia.medicamentos.MedicamentoEspecializado;
import Endes.farmacia.medicamentos.medicamentoGenerico;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class FARMACIA {
    public Map<String, Integer> inventario;

    public FARMACIA() {
        this.inventario = new HashMap<>();
    }
    public static void main(String[] args) {
        FARMACIA farmacia = new FARMACIA();
        Random random = new Random();

        medicamentoGenerico paracetamol = new medicamentoGenerico("Paracetamol", 10.0);
        farmacia.AgregarMedicamento(paracetamol, 100);

        String nombre1 = "Medicamento1";
        double precio1 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico1 = new medicamentoGenerico(nombre1, precio1);
        farmacia.AgregarMedicamento(medicamentoGenerico1, 100);

        String nombre2 = "Medicamento2";
        double precio2 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico2 = new medicamentoGenerico(nombre2, precio2);
        farmacia.AgregarMedicamento(medicamentoGenerico2, 100);

        String nombre3 = "Medicamento3";
        double precio3 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico3 = new medicamentoGenerico(nombre3, precio3);
        farmacia.AgregarMedicamento(medicamentoGenerico3, 100);

        // Medicamento 4
        String nombre4 = "Medicamento4";
        double precio4 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico4 = new medicamentoGenerico(nombre4, precio4);
        farmacia.AgregarMedicamento(medicamentoGenerico4, 100);

        String nombre5 = "Medicamento5";
        double precio5 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico5 = new medicamentoGenerico(nombre5, precio5);
        farmacia.AgregarMedicamento(medicamentoGenerico5, 100);

        // Medicamento 6
        String nombre6 = "Medicamento6";
        double precio6 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico6 = new medicamentoGenerico(nombre6, precio6);
        farmacia.AgregarMedicamento(medicamentoGenerico6, 100);

        String nombre7 = "Medicamento7";
        double precio7 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico7 = new medicamentoGenerico(nombre7, precio7);
        farmacia.AgregarMedicamento(medicamentoGenerico7, 100);

        String nombre8 = "Medicamento8";
        double precio8 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico8 = new medicamentoGenerico(nombre8, precio8);
        farmacia.AgregarMedicamento(medicamentoGenerico8, 100);

        String nombre9 = "Medicamento9";
        double precio9 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico9 = new medicamentoGenerico(nombre9, precio9);
        farmacia.AgregarMedicamento(medicamentoGenerico9, 100);

        String nombre10 = "Medicamento10";
        double precio10 = random.nextDouble() * 100;
        medicamentoGenerico medicamentoGenerico10 = new medicamentoGenerico(nombre10, precio10);
        farmacia.AgregarMedicamento(medicamentoGenerico10, 100);

        MedicamentoEspecializado insulina = new MedicamentoEspecializado("Insulina", 50.0, "Diabetes");
        farmacia.AGREGAR_MEDICAMENTO_B(insulina, 20);


        String tipo1 = "Tipo1";
        MedicamentoEspecializado medicamentoEspecializado1 = new MedicamentoEspecializado(nombre1, precio1, tipo1);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado1, 20);


        String tipo2 = "Tipo2";
        MedicamentoEspecializado medicamentoEspecializado2 = new MedicamentoEspecializado(nombre2, precio2, tipo2);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado2, 20);


        String tipo3 = "Tipo3";
        MedicamentoEspecializado medicamentoEspecializado3 = new MedicamentoEspecializado(nombre3, precio3, tipo3);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado3, 20);

        String tipo4 = "Tipo4";
        MedicamentoEspecializado medicamentoEspecializado4 = new MedicamentoEspecializado(nombre4, precio4, tipo4);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado4, 20);

        String tipo5 = "Tipo5";
        MedicamentoEspecializado medicamentoEspecializado5 = new MedicamentoEspecializado(nombre5, precio5, tipo5);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado5, 20);

        String tipo6 = "Tipo6";
        MedicamentoEspecializado medicamentoEspecializado6 = new MedicamentoEspecializado(nombre6, precio6, tipo6);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado6, 20);

        String tipo7 = "Tipo7";
        MedicamentoEspecializado medicamentoEspecializado7 = new MedicamentoEspecializado(nombre7, precio7, tipo7);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado7, 20);

        String tipo8 = "Tipo8";
        MedicamentoEspecializado medicamentoEspecializado8 = new MedicamentoEspecializado(nombre8, precio8, tipo8);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado8, 20);
;
        String tipo9 = "Tipo9";
        MedicamentoEspecializado medicamentoEspecializado9 = new MedicamentoEspecializado(nombre9, precio9, tipo9);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado9, 20);


        String tipo10 = "Tipo10";
        MedicamentoEspecializado medicamentoEspecializado10 = new MedicamentoEspecializado(nombre10, precio10, tipo10);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado10, 20);

        System.out.println("Inventario de la farmacia:");
        for (Map.Entry<String, Integer> entry : farmacia.inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }

    // Metodo para agregar medicamento generico //
    public void AgregarMedicamento(medicamentoGenerico medicamento, int cantidad) {
        String nombre = medicamento.nombre;
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, Integer.valueOf(cantidadExistente + cantidad));
        } else {
            inventario.put(nombre, Integer.valueOf(cantidad));
        }
    }

    // Metodo para agregar medicamento especializado //
    public void AGREGAR_MEDICAMENTO_B(MedicamentoEspecializado medicamento, int cantidad) {
        String nombre = medicamento.nombre;
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, Integer.valueOf(cantidadExistente + cantidad));
        } else {
            inventario.put(nombre, Integer.valueOf(cantidad));
        }
    }
    
    
    
}


