// Botón para ver reseñas
JButton viewReviewsButton = new JButton("Ver Reseñas");
buttonPanel.add(viewReviewsButton);

// Listener para ver reseñas
viewReviewsButton.addActionListener(e -> {
    int selectedRow = eventTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(ClientPanel.this, "Por favor seleccione un evento para ver sus reseñas.");
        return;
    }

    String tituloEvento = (String) eventTable.getValueAt(selectedRow, 0);
    new ReviewListWindow(tituloEvento, resenaService);
});