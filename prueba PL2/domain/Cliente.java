package domain;

public class Cliente extends Usuario {
    private String telefono;
    private String direccion;
    private String tarjetaCredito;
    private boolean esVIP;

    public Cliente(String nombre, String correo, String clave, String telefono, String direccion, String tarjetaCredito, boolean esVIP) {
        super(nombre, correo, clave);
        this.telefono = telefono;
        this.direccion = direccion;
        this.tarjetaCredito = tarjetaCredito;
        this.esVIP = esVIP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public boolean isEsVIP() {
        return esVIP;
    }

    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }

    @Override
    public void login() {
        System.out.println("Cliente " + getNombre() + " ha iniciado sesión.");
    }
}