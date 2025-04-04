package entidad;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private List<Curso> cursos;
    
    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
        this.cursos = new ArrayList<>();
    }
    
    public void inscribirCurso(Curso curso) {
        cursos.add(curso);
        curso.agregarEstudiante(this);
    }
    
    public void mostrarCursos() {
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println("- " + c.getNombre());
        }
    }
}