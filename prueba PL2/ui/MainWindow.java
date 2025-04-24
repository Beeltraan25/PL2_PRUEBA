package ui;

import javax.swing.*;

public class MainWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JavaEvents");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setVisible(true);

            JLabel label = new JLabel("Bienvenido a JavaEvents", SwingConstants.CENTER);
            frame.add(label);
        });
    }
}