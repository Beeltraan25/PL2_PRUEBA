public List<Resena> loadResenas(String fileName) {
    try {
        return new FileManager<Resena>().loadFromFile(fileName);
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("No se encontraron reseñas previas. Cargando lista vacía.");
        return new ArrayList<>();
    }
}