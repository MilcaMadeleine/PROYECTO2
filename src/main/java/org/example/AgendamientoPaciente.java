package org.example;

public class AgendamientoPaciente extends Paciente implements IPaciente {

    // Constructor
    public AgendamientoPaciente(String nombre, int idPaciente) {
        super(nombre, idPaciente);
    }

    // Método para agendar cita
    public boolean agendarCita(String fecha) {
        if (fecha != null && !fecha.isEmpty()) {
            System.out.println("Cita agendada para " + nombre + " en la fecha: " + fecha);
            return true;
        } else {
            System.out.println("Fecha no válida.");
            return false;
        }
    }

    // Implementación de los métodos de la interfaz
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles();
    }

    @Override
    public String verificarHistorialMedico() {
        return "Historial médico no inicializado.";
    }
}
