
package com.mycompany.gestionsalud;

import java.util.Scanner;

public class GestionSalud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentroSalud centro = new CentroSalud();
        boolean salir = false;
   
        while (!salir) {
            System.out.println("MENU DEL CENTRO DE SALUD");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Atender emergencia");
            System.out.println("3. Atender consulta general");
            System.out.println("4. Mostrar pacientes registrados");
            System.out.println("5. Generar reporte final");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = Integer.parseInt(scanner.nextLine());
                    System.out.print("Cedula: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Tipo de atencion (consulta/emergencia/hospitalizado): ");
                    String tipo = scanner.nextLine();
                    centro.registrarPaciente(nombre, edad, cedula, tipo);
                    break;
                case 2:
                    centro.atenderEmergencia();
                    break;
                case 3:
                    centro.atenderConsulta();
                    break;
                case 4:
                    centro.mostrarPacientesRegistrados();
                    break;
                case 5:
                    centro.generarReporteFinal();
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.");
            }
        }
    }
}
