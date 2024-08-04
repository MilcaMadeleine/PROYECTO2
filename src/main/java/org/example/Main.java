package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de HistoriaClinica
        HistoriaClinica paciente1 = new HistoriaClinica("Victor Guerrero", 100, "Paciente con hipertensión controlada, sin alergias conocidas.\n.");
        paciente1.mostrarInformacion();
        paciente1.actualizarHistorial("Paciente presenta en ultima visita mejoria en base a tratamiento recetado.");
        paciente1.agendarCita("2024-08-05"); // Agenda una cita
        System.out.println(paciente1.verificarHistorialMedico());

        // Verificar si el historial es completo
        if (paciente1.verificarHistorialCompleto()) {
            System.out.println("El historial médico esta completo.");
        } else {
            System.out.println("Al historial médico le faltan caracteres.");
        }

        // Crear una instancia de SistemaPacientes
        SistemaPacientes paciente2 = new SistemaPacientes("Jonathan Mosquera", 101);
        paciente2.mostrarInformacion();

        // Intentar validar un ID que no coincide con el de paciente2
        boolean esValidoIncorrecto = paciente2.validarPaciente(101); // Verifica ID incorrecto
        if (!esValidoIncorrecto) {
            System.out.println("Error: No se puede continuar con el programa. El paciente no es válido.");
            System.exit(1);
        }

        // Si la validación es exitosa, agendar una cita para paciente2

        boolean citaAgendada = paciente2.agendarCita("2024-08-10");
        if (citaAgendada) {
            System.out.println("Cita para " + paciente2.nombre + " agendada con éxito.");
        } else {
            System.out.println("No se pudo agendar la cita para " + paciente2.nombre + ".");
        }
    }
}
