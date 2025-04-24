package ui;

import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JFrame {

    public AdminPanel() {
        setTitle("JavaEvents - Panel de Administrador");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeLabel = new JLabel("Bienvenido al Panel de Administrador", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(welcomeLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2));
        buttonPanel.add(new JButton("Gestión de Eventos"));
        buttonPanel.add(new JButton("Consulta de Usuarios"));
        buttonPanel.add(new JButton("Consulta de Reservas"));
        buttonPanel.add(new JButton("Cerrar Sesión"));

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}