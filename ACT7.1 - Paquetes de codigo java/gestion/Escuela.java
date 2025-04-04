package gestion;

import entidad.Profesor;
import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre;
    private List<Profesor> profesores;
    
    public Escuela(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    
    public void mostrarProfesores() {
        System.out.println("Profesores en la escuela " + nombre + ":");
        for (Profesor p : profesores) {
            p.mostrarInformacion();
        }
    }
}