package entidad;

public class Profesor extends Empleado {
    private String especialidad;
    
    public Profesor(String nombre, int edad, double salario, String especialidad) {
        super(nombre, edad, salario);
        this.especialidad = especialidad;
    }
    
    @Override
    public void calcularSalario() {
        System.out.println("Salario del profesor " + nombre + " es: " + salario);
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }
    
    @Override
    public void realizarTarea() {
        System.out.println(nombre + " está enseñando.");
    }
}