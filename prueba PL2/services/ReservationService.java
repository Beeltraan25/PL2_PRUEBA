package services;

import domain.Cliente;
import domain.Evento;
import domain.Reserva;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationService {
    private final List<Reserva> reservas;

    public ReservationService() {
        this.reservas = new ArrayList<>();
    }

    public void crearReserva(Cliente cliente, Evento evento, double importe) {
        Reserva reserva = new Reserva(cliente, evento, new Date(), importe);
        reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public List<Reserva> buscarReservasPorFecha(Date fecha) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (!reserva.getFechaReserva().before(fecha)) {
                resultado.add(reserva);
            }
        }
        return resultado;
    }
}