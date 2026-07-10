/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Avril
 */
public class Usuario {
    
    //Atributos:
    private String usuario;
    private String clave;
    private String rol;
    
    //Constructor:
    public Usuario(String usuario, String clave, String rol) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }
    
    //Propiedades (Getters y Setters):
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
