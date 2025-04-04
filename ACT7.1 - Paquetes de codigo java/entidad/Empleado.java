package entidad;

public abstract class Empleado extends Persona implements Trabajador {
    protected double salario;
    
    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }
    
    public abstract void calcularSalario();
}