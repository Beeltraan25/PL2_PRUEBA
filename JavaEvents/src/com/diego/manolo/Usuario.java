package com.diego.manolo;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private String correo;
    private String clave;


    //Constructor


    public Usuario(String nombre, String correo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }
    
    
    //Getters and Setters

   
    public String getNombre() {
        return nombre;
    }  
    public String getCorreo() {
        return correo;
    }
    public String getClave() {
        return clave;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    //toString


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }

}
