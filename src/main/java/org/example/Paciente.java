package org.example;

// Clase padre Paciente
public class Paciente {
    protected String nombre;
    protected int idPaciente;

    // Constructor
    public Paciente(String nombre, int idPaciente) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
    }

    // Método para mostrar la información del paciente
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID Paciente: " + idPaciente);
    }

    // Método para obtener detalles del paciente
    public String obtenerDetalles() {
        return "Nombre: " + nombre + ", ID Paciente: " + idPaciente;
    }
}

