package org.example;

public class HistoriaClinica extends AgendamientoPaciente {
    private String historialMedico;

    // Constructor
    public HistoriaClinica(String nombre, int idPaciente, String historialMedico) {
        super(nombre, idPaciente);
        this.historialMedico = historialMedico;
    }

    // Método para mostrar la información del paciente junto con el historial médico
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Historial Médico: " + historialMedico);
    }

    // Método para obtener detalles del paciente con el historial médico
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Historial Médico: " + historialMedico;
    }

    // Método para actualizar el historial médico
    public void actualizarHistorial(String nuevoHistorial) {
        if (nuevoHistorial != null && !nuevoHistorial.isEmpty()) {
            historialMedico = nuevoHistorial;
            System.out.println("Historial médico actualizado.");
        } else {
            System.out.println("Historial no válido.");
        }
    }

    // Sobrescribir el método para verificar el historial médico
    @Override
    public String verificarHistorialMedico() {
        return historialMedico != null && !historialMedico.isEmpty()
                ? "Historial médico: " + historialMedico
                : "Historial médico no inicializado.";
    }
        //metodo unico

        public boolean verificarHistorialCompleto() {
            return historialMedico != null && historialMedico.length() > 50; //
    }
}
