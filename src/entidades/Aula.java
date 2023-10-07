/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author jaime
 */
public class Aula {

    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;
    private int carpetas;

    public Aula(List<Estudiante> estudiantes, List<Profesor> profesores, int carpetas) {
        this.estudiantes = estudiantes;
        this.profesores = profesores;
        this.carpetas = carpetas;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public int getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(int carpetas) {
        this.carpetas = carpetas;
    }

    public void agregarProfesor(Profesor profe) {
        if (this.profesores != null
                && this.profesores.size() >= 0) {
            profesores.add(profe);
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (this.estudiantes != null
                && this.estudiantes.size() >= 0) {
            estudiantes.add(estudiante);
        }
    }
}
