/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public class Profesor extends Clase {

    private String nombreP;
    private String apellidoP;
    
    public Profesor(String turno, String curso) {
        super(turno, curso);
    }

    public Profesor(String nombreP, String apellidoP, String turno, String curso) {
        super(turno, curso);
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

   public String getTexto(){
       return this.nombreP + this.apellidoP + this.curso + this.turno ;
   }
    
}
