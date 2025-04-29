package Servicios;

import java.util.ArrayList;
import com.diego.manolo.Evento;
import java.util.stream.Collectors;
import java.util.List;

public class CompraEntrada {
    private List<Evento> eventos;

    public CompraEntrada() {
        this.eventos = new ArrayList<>();
    }


    //Método para buscar eventos por ciudad


    public List<Evento> BuscarEventoPorCiudad (String ciudad) {
        return eventos.stream()
                .filter(evento -> evento.getDireccion().contains(ciudad))
                .collect(Collectors.toList());
    }
   
    
    //Método para buscar eventos por tipo


    public List<Evento> BuscarEventoPorTipo (String tipo) {
        return eventos.stream()
                .filter(evento -> evento.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }


    //Método para buscar eventos por ciudad y tipo VOLUNTARIO


    public List<Evento> MostrarEventosPorCiudadYTipo(String ciudad, String tipo) {
        return eventos.stream()
                .filter(evento -> evento.getDireccion().contains(ciudad) && evento.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    
    //Método para mostrar todos los eventos (sin filtros) VOLUNTARIO


     public List<Evento> MostrarEventos() {
        return new ArrayList<>(eventos);
    }
}
