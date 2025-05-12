
package com.mycompany.gestionsalud;

import com.mycompany.gestionsalud.pacientes.Paciente;
import com.mycompany.gestionsalud.pacientes.PacienteEmergencia;
import com.mycompany.gestionsalud.pacientes.PacienteGeneral;
import com.mycompany.gestionsalud.pacientes.PacienteHospitalizado;
import java.util.*;

public class CentroSalud {
    


    private Stack<PacienteEmergencia> pilaEmergencias = new Stack<>();
    private Queue<PacienteGeneral> colaConsulta = new LinkedList<>();
    private List<Paciente> listaPacientesRegistrados = new ArrayList<>();
    private List<Paciente> listaPacientesAtendidos = new ArrayList<>();

    public void registrarPaciente(String nombre, int edad, String cedula, String tipo) {
        Paciente nuevo;
        switch (tipo.toLowerCase()) {
            case "emergencia":
                nuevo = new PacienteEmergencia(nombre, edad, cedula);
                pilaEmergencias.push((PacienteEmergencia) nuevo);
                break;
            case "consulta":
                nuevo = new PacienteGeneral(nombre, edad, cedula);
                colaConsulta.offer((PacienteGeneral) nuevo);
                break;
            case "hospitalizado":
                nuevo = new PacienteHospitalizado(nombre, edad, cedula);
                break;
            default:
                System.out.println("Tipo de paciente no valido.");
                return;
        }
        listaPacientesRegistrados.add(nuevo);
        System.out.println("Paciente registrado: " + nuevo);
    }

    public void atenderEmergencia() {
        if (!pilaEmergencias.isEmpty()) {
            Paciente paciente = pilaEmergencias.pop();
            listaPacientesAtendidos.add(paciente);
            System.out.println("Atendiendo paciente de emergencia: " + paciente);
        } else {
            System.out.println("No hay pacientes de emergencia para atender.");
        }
    }

    public void atenderConsulta() {
        if (!colaConsulta.isEmpty()) {
            Paciente paciente = colaConsulta.poll();
            listaPacientesAtendidos.add(paciente);
            System.out.println("Atendiendo paciente de consulta general: " + paciente);
        } else {
            System.out.println("No hay pacientes de consulta general para atender.");
        }
    }

    public void mostrarPacientesRegistrados() {
        System.out.println(" Lista de pacientes registrados:");
        for (Paciente p : listaPacientesRegistrados) {
            System.out.println(p);
        }
    }

    public void generarReporteFinal() {
        System.out.println("Reporte Final de Pacientes Atendidos:");
        Map<String, Integer> conteoPorTipo = new HashMap<>();
        for (Paciente p : listaPacientesAtendidos) {
            String tipo = p.getTipo();
            conteoPorTipo.put(tipo, conteoPorTipo.getOrDefault(tipo, 0) + 1);
            System.out.println(p);
        }

        System.out.println("Resumen por tipo:");
        for (String tipo : conteoPorTipo.keySet()) {
            System.out.println("- " + tipo + ": " + conteoPorTipo.get(tipo));
        }
    }
}
