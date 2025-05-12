/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionsalud.pacientes;

/**
 *
 * @author SO-LAB1-PC26
 */
public class PacienteEmergencia extends Paciente{
    
    public PacienteEmergencia(String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
    }
    
 
    public String getTipo() {
        return "Emergencia";
    }
}
