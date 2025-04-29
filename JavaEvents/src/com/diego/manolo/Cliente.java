package com.diego.manolo;

public class Cliente extends Usuario {
    private String telefono;
    private Direccion direccion;
    private TarjetaDeCredito tarjetaDeCredito;
    private boolean esVIP;


    //Constructor


    public Cliente(String nombre, String correo, String clave, String telefono, Direccion direccion, TarjetaDeCredito tarjetaDeCredito, boolean esVIP) {
        super(nombre, correo, clave);
        this.telefono = telefono;
        this.direccion = direccion;
        this.tarjetaDeCredito = tarjetaDeCredito;
        this.esVIP = esVIP;
    }

    //Getters and Setters


    public String getTelefono() {
        return telefono;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    public boolean getEsVIP() {
        return esVIP;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }
    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }

    //toString

    
    @Override
    public String toString() {
        return super.toString() +
                "Cliente{" +
                "telefono='" + telefono + '\'' +
                ", direccion=" + direccion +
                ", tarjetaDeCredito=" + tarjetaDeCredito +
                ", esVIP=" + esVIP +
                '}';
    }
}
