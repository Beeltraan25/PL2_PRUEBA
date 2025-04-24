package services;

import domain.Resena;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResenaService {
    private List<Resena> resenas;

    public ResenaService() {
        this.resenas = new ArrayList<>();
    }

    public void agregarResena(Resena resena) {
        resenas.add(resena);
    }

    public List<Resena> buscarResenasPorEvento(String tituloEvento) {
        return resenas.stream()
                .filter(resena -> resena.getEvento().getTitulo().equalsIgnoreCase(tituloEvento))
                .collect(Collectors.toList());
    }

    public List<Resena> getResenas() {
        return resenas;
    }
}