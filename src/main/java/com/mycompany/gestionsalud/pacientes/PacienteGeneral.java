
package com.mycompany.gestionsalud.pacientes;


public class PacienteGeneral extends Paciente{
    
    public PacienteGeneral(String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        
    }

    public String getTipo() {
        return "Consulta General";
    
    }
    
}
