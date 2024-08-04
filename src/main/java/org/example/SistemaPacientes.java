package org.example;

public class SistemaPacientes extends AgendamientoPaciente {

    // Constructor
    public SistemaPacientes(String nombre, int idPaciente) {
        super(nombre, idPaciente);
    }

    // Método para validar paciente
    public boolean validarPaciente(int idPaciente) {
        return this.idPaciente == idPaciente;
    }

    // Método para agregar paciente al sistema
    public void agregarPaciente(SistemaPacientes paciente) {
        if (paciente != null) {
            System.out.println("Paciente " + paciente.nombre + " agregado al sistema.");
        } else {
            System.out.println("Paciente no válido.");
        }
    }

    // Sobrescribir el método para verificar el historial médico
    @Override
    public String verificarHistorialMedico() {
        return "Historial médico no disponible en el sistema de pacientes.";
    }
}
