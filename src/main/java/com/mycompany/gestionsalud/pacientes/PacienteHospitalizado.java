/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionsalud.pacientes;


public class PacienteHospitalizado extends Paciente {
    
    
    private String cama;
    private String dieta;
    private String seguimiento;

    public PacienteHospitalizado(String cama, String dieta, String seguimiento, String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        this.cama = cama;
        this.dieta = dieta;
        this.seguimiento = seguimiento;
    }
    
    
    
       public  PacienteHospitalizado(String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
    }

    @Override
    public String getTipo() {
        return "Hospitalizado";
    }
}
