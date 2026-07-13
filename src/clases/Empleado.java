/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Avril
 */
public abstract class Empleado {
    
    //Atributos:
    private String dni;
    private String nombres;
    private String apellidos;
    private String usuario;
    private String contrasena;
    private String rol; //Administrador , Asesor, Gerente
    
    //Constructor:

    public Empleado(String dni, String nombres, String apellidos, String usuario, String contrasena, String rol) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }
    
    
    //Propiedades (Getters y Setters):
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    public boolean validarCredenciales(String usuarioIngresado, String claveIngresada) {
        return usuario.equalsIgnoreCase(usuarioIngresado) && contrasena.equals(claveIngresada);
    } 
    public String getInformacion() {
        return "DNI : " + dni+ "\nNombres : " + nombres+ "\nApellidos : " + apellidos+ "\nUsuario : " + usuario+ "\nRol : " + getRol();
    }   
}
