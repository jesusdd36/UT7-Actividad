package refactoriza;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class FARMACIA {
    private Map<String, Integer> inventario;

    public FARMACIA() {
        this.inventario = new HashMap<>();
    }
    // Metodo para agregar medicamento generico //
    public void AGREGAR_MEDICAMENTO_A(MEDICAMENTO_GENERICO medicamento, int cantidad) {
        String nombre = medicamento.nombre;
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, cantidadExistente + cantidad);
        } else {
            inventario.put(nombre, cantidad);
        }
    }
    // Metodo para agregar medicamento especializado //
    public void AGREGAR_MEDICAMENTO_B(MEDICAMENTO_ESPECIALIZADO medicamento, int cantidad) {
        String nombre = medicamento.nombre;
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, cantidadExistente + cantidad);
        } else {
            inventario.put(nombre, cantidad);
        }
    }

    public static void main(String[] args) {
        FARMACIA farmacia = new FARMACIA();
        Random random = new Random();

        MEDICAMENTO_GENERICO paracetamol = new MEDICAMENTO_GENERICO("Paracetamol", 10.0);
        farmacia.AGREGAR_MEDICAMENTO_A(paracetamol, 100);
        
        String nombre1 = "Medicamento1";
        double precio1 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico1 = new MEDICAMENTO_GENERICO(nombre1, precio1);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico1, 100);

        String nombre2 = "Medicamento2";
        double precio2 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico2 = new MEDICAMENTO_GENERICO(nombre2, precio2);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico2, 100);

        String nombre3 = "Medicamento3";
        double precio3 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico3 = new MEDICAMENTO_GENERICO(nombre3, precio3);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico3, 100);

        // Medicamento 4
        String nombre4 = "Medicamento4";
        double precio4 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico4 = new MEDICAMENTO_GENERICO(nombre4, precio4);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico4, 100);

        String nombre5 = "Medicamento5";
        double precio5 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico5 = new MEDICAMENTO_GENERICO(nombre5, precio5);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico5, 100);

        // Medicamento 6
        String nombre6 = "Medicamento6";
        double precio6 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico6 = new MEDICAMENTO_GENERICO(nombre6, precio6);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico6, 100);

        String nombre7 = "Medicamento7";
        double precio7 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico7 = new MEDICAMENTO_GENERICO(nombre7, precio7);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico7, 100);

        String nombre8 = "Medicamento8";
        double precio8 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico8 = new MEDICAMENTO_GENERICO(nombre8, precio8);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico8, 100);

        String nombre9 = "Medicamento9";
        double precio9 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico9 = new MEDICAMENTO_GENERICO(nombre9, precio9);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico9, 100);

        String nombre10 = "Medicamento10";
        double precio10 = random.nextDouble() * 100;
        MEDICAMENTO_GENERICO medicamentoGenerico10 = new MEDICAMENTO_GENERICO(nombre10, precio10);
        farmacia.AGREGAR_MEDICAMENTO_A(medicamentoGenerico10, 100);

        MEDICAMENTO_ESPECIALIZADO insulina = new MEDICAMENTO_ESPECIALIZADO("Insulina", 50.0, "Diabetes");
        farmacia.AGREGAR_MEDICAMENTO_B(insulina, 20);
        
  
        String tipo1 = "Tipo1";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado1 = new MEDICAMENTO_ESPECIALIZADO(nombre1, precio1, tipo1);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado1, 20);


        String tipo2 = "Tipo2";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado2 = new MEDICAMENTO_ESPECIALIZADO(nombre2, precio2, tipo2);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado2, 20);


        String tipo3 = "Tipo3";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado3 = new MEDICAMENTO_ESPECIALIZADO(nombre3, precio3, tipo3);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado3, 20);
 
        String tipo4 = "Tipo4";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado4 = new MEDICAMENTO_ESPECIALIZADO(nombre4, precio4, tipo4);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado4, 20);

        String tipo5 = "Tipo5";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado5 = new MEDICAMENTO_ESPECIALIZADO(nombre5, precio5, tipo5);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado5, 20);

        String tipo6 = "Tipo6";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado6 = new MEDICAMENTO_ESPECIALIZADO(nombre6, precio6, tipo6);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado6, 20);

        String tipo7 = "Tipo7";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado7 = new MEDICAMENTO_ESPECIALIZADO(nombre7, precio7, tipo7);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado7, 20);

        String tipo8 = "Tipo8";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado8 = new MEDICAMENTO_ESPECIALIZADO(nombre8, precio8, tipo8);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado8, 20);
;
        String tipo9 = "Tipo9";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado9 = new MEDICAMENTO_ESPECIALIZADO(nombre9, precio9, tipo9);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado9, 20);


        String tipo10 = "Tipo10";
        MEDICAMENTO_ESPECIALIZADO medicamentoEspecializado10 = new MEDICAMENTO_ESPECIALIZADO(nombre10, precio10, tipo10);
        farmacia.AGREGAR_MEDICAMENTO_B(medicamentoEspecializado10, 20);

        System.out.println("Inventario de la farmacia:");
        for (Map.Entry<String, Integer> entry : farmacia.inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }
    
    
    
}



class MEDICAMENTO_GENERICO {
public String nombre;
public double precio;

public double constante_subvencionado = 15;
public MEDICAMENTO_GENERICO(String nombre, double precio) {
        this.nombre=nombre;
        this.precio=precio;
    }

    public double getPrecioSubvencionado(){
        return constante_subvencionado * precio;
    }
}

class MEDICAMENTO_ESPECIALIZADO {
public String nombre;
public double precio;
private String tipo;

public MEDICAMENTO_ESPECIALIZADO(String nombre, double precio, String tipo) {
   this.nombre=nombre;
     this.precio=precio;
        this.tipo = tipo;
}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
public String mostrarMedicamento(int numero, int cantidad, int numFarmacia, int codigoMedicamento, int codigoFarmacia ) {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;

}
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;
    }
}