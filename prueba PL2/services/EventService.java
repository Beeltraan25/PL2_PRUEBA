package services;

import domain.Evento;
import domain.Resena;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventService {
    private List<Evento> eventos;

    public EventService() {
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
    }

    public List<Evento> buscarPorCiudad(String ciudad) {
        return eventos.stream()
                .filter(evento -> evento.getDireccion().contains(ciudad))
                .collect(Collectors.toList());
    }

    public List<Evento> buscarPorTipo(String tipo) {
        return eventos.stream()
                .filter(evento -> evento.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public void actualizarCalificacionPromedio(Evento evento, List<Resena> resenas) {
        List<Resena> resenasDelEvento = resenas.stream()
                .filter(resena -> resena.getEvento().equals(evento))
                .collect(Collectors.toList());

        if (!resenasDelEvento.isEmpty()) {
            double promedio = resenasDelEvento.stream()
                    .mapToInt(Resena::getCalificacion)
                    .average()
                    .orElse(0.0);
            evento.setCalificacion(promedio);
        }
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}