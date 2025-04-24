package domain;

import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable {
    private Cliente cliente;
    private Evento evento;
    private Date fechaReserva;
    private double importe;

    public Reserva(Cliente cliente, Evento evento, Date fechaReserva, double importe) {
        this.cliente = cliente;
        this.evento = evento;
        this.fechaReserva = fechaReserva;
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente.getNombre() +
                ", evento=" + evento.getTitulo() +
                ", fechaReserva=" + fechaReserva +
                ", importe=" + importe +
                '}';
    }
}