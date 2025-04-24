submitButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int calificacion = (int) ratingComboBox.getSelectedItem();
        String comentario = commentArea.getText();

        Resena nuevaResena = new Resena(cliente, evento, calificacion, comentario);
        resenaService.agregarResena(nuevaResena);

        // Actualizar la calificación promedio del evento
        eventService.actualizarCalificacionPromedio(evento, resenaService.getResenas());

        // Mostrar mensaje de confirmación
        JOptionPane.showMessageDialog(ReviewWindow.this, "Reseña enviada. Gracias por tu opinión.");
        dispose();
    }
});