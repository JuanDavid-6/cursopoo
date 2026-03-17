package Ejercicio5;

public class Main {

     public static void main(String[] args) {

        ReservaHotel reserva1 = new ReservaHotel("Juan David", "2026-04-01", "2026-04-05", 101);
        ReservaHotel reserva2 = new ReservaHotel("Maria", "2026-05-10", "2026-05-15", 202);

        reserva1.nuevaReserva();
        reserva1.consultarReserva();

        reserva1.cancelarReserva();
        reserva1.consultarReserva();

        reserva2.nuevaReserva();
        reserva2.consultarReserva();
    }

}
