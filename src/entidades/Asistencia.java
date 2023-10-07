/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public class Asistencia extends Estudiante {
    
    private String registro;

    public String getAsistencia() {
        return registro;
    }

    public void setAsistencia(String asistencia) {
        this.registro = asistencia;
    }

    public Asistencia(String nombreE, String apellidoE, 
            String turno, String curso, String registro) {
        super(nombreE, apellidoE, turno, curso);
        this.registro = registro;
    }

    

    public Asistencia(String nombreE, String apellidoE, String turno, String curso) {
        super(nombreE, apellidoE, turno, curso);
    }
    public String getTexto(){
       return this.nombreE  + this.apellidoE +
               " | "+ this.curso +  " | "
               + this.turno +  " | "+ this.registro;
   }
  
    
}
