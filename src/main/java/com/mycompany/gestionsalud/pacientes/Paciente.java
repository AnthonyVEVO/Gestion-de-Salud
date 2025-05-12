
package com.mycompany.gestionsalud.pacientes;

public abstract class Paciente {
    
    protected String nombre;
    protected int edad;
    protected String cedula;

    public Paciente(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public abstract String getTipo();

    @Override
    public String toString() {
        return   " Nombre: " + nombre + ", Edad: " + edad + ", Cedula: " + cedula + ", Tipo: " + getTipo();
    }
    
    
}
