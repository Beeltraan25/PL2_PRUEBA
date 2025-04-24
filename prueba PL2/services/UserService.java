package services;

import domain.Cliente;
import domain.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<Usuario> usuarios;

    public UserService() {
        this.usuarios = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        usuarios.add(cliente);
    }

    public Usuario login(String correo, String clave) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getClave().equals(clave)) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}