/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public class Estudiante extends Clase {

    String nombreE;
    String apellidoE;

    public Estudiante(String nombreE, String apellidoE, String turno, String curso) {
        super(turno, curso);
        this.nombreE = nombreE;
        this.apellidoE = apellidoE;
    }

    public Estudiante(String turno, String curso) {
        super(turno, curso);
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getApellidoE() {
        return apellidoE;
    }

    public void setApellidoE(String apellidoE) {
        this.apellidoE = apellidoE;
    }

}
