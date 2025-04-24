package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginWindow extends JFrame {
    private final JTextField emailField;
    private final JPasswordField passwordField;
    private final JButton loginButton;
    private final JButton registerButton;

    public LoginWindow() {
        setTitle("JavaEvents - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JLabel titleLabel = new JLabel("Bienvenido a JavaEvents", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel);

        JPanel emailPanel = new JPanel();
        emailPanel.add(new JLabel("Correo:"));
        emailField = new JTextField(20);
        emailPanel.add(emailField);
        add(emailPanel);

        JPanel passwordPanel = new JPanel();
        passwordPanel.add(new JLabel("Clave:"));
        passwordField = new JPasswordField(20);
        passwordPanel.add(passwordField);
        add(passwordPanel);

        JPanel buttonPanel = new JPanel();
        loginButton = new JButton("Iniciar Sesión");
        registerButton = new JButton("Registrarse");
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        add(buttonPanel);

        // Listeners
        loginButton.addActionListener(new LoginListener());
       // registerButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidad de registro aún no implementada."));

        setVisible(true);
    }

    private class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            // Validar credenciales
            if (email.equals("admin@javaevents.com") && password.equals("admin")) {
                JOptionPane.showMessageDialog(LoginWindow.this, "Bienvenido, Administrador.");
                dispose();
               // new AdminPanel();
            } else {
                JOptionPane.showMessageDialog(LoginWindow.this, "Credenciales incorrectas.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginWindow::new);
    }
}