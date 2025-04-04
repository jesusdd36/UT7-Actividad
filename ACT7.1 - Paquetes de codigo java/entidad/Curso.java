package entidad;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;
    
    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el curso " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.nombre);
        }
    }
}