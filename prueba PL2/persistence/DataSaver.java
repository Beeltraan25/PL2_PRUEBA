public void saveResenas(String fileName, List<Resena> resenas) {
    try {
        new FileManager<Resena>().saveToFile(fileName, resenas);
        System.out.println("Reseñas guardadas correctamente.");
    } catch (IOException e) {
        System.out.println("Error al guardar reseñas: " + e.getMessage());
    }
}