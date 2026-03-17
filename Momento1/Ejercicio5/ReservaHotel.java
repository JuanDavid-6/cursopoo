package Ejercicio5;

public class ReservaHotel {

    private String nombreCliente;
    private String fechaEntrada;
    private String fechaSalida;
    private int numeroHabitacion;
    private boolean activa;

    public ReservaHotel(String nombreCliente, String fechaEntrada, String fechaSalida, int numeroHabitacion) {
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
        this.activa = false;
    }

    public void nuevaReserva() {
        if (!activa) {
            activa = true;
            System.out.println("Reserva creada correctamente.");
        } else {
            System.out.println("Ya existe una reserva activa.");
        }
    }

    public void cancelarReserva() {
        if (activa) {
            activa = false;
            System.out.println("Reserva cancelada.");
        } else {
            System.out.println("No hay reserva activa para cancelar.");
        }
    }

    public void consultarReserva() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha de entrada: " + fechaEntrada);
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println("Habitación: " + numeroHabitacion);
        System.out.println("Estado: " + (activa ? "Activa" : "Cancelada"));
    }

}
