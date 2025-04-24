package ui;

import domain.Resena;
import services.ResenaService;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ReviewListWindow extends JFrame {
    public ReviewListWindow(String tituloEvento, ResenaService resenaService) {
        setTitle("Reseñas - " + tituloEvento);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Reseñas para " + tituloEvento, SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, BorderLayout.NORTH);

        List<Resena> resenas = resenaService.buscarResenasPorEvento(tituloEvento);
        if (resenas.isEmpty()) {
            JLabel noReviewsLabel = new JLabel("No hay reseñas para este evento.", SwingConstants.CENTER);
            add(noReviewsLabel, BorderLayout.CENTER);
        } else {
            String[] columnNames = {"Cliente", "Calificación", "Comentario"};
            String[][] data = new String[resenas.size()][3];
            for (int i = 0; i < resenas.size(); i++) {
                Resena resena = resenas.get(i);
                data[i][0] = resena.getCliente().getNombre();
                data[i][1] = String.valueOf(resena.getCalificacion());
                data[i][2] = resena.getComentario();
            }
            JTable reviewTable = new JTable(data, columnNames);
            add(new JScrollPane(reviewTable), BorderLayout.CENTER);
        }

        setVisible(true);
    }
}