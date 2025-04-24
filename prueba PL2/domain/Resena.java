package domain;

import java.io.Serializable;

public class Resena implements Serializable {
    private Cliente cliente;
    private Evento evento;
    private int calificacion; // Valor entre 1 y 5
    private String comentario; // Comentario opcional

    public Resena(Cliente cliente, Evento evento, int calificacion, String comentario) {
        this.cliente = cliente;
        this.evento = evento;
        this.calificacion = calificacion;
        this.comentario = comentario;
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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Reseña{" +
                "cliente=" + cliente.getNombre() +
                ", evento=" + evento.getTitulo() +
                ", calificación=" + calificacion +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}