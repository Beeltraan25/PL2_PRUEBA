package domain;

public class Administrador extends Usuario {

    public Administrador(String nombre, String correo, String clave) {
        super(nombre, correo, clave);
    }

    @Override
    public void login() {
        System.out.println("Administrador " + getNombre() + " ha iniciado sesión.");
    }
}