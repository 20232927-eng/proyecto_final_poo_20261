/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author L35108
 */
public class Proyecto {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private double presupuesto;
    private String estado;

    //constructor
    public Proyecto(String codigo, String nombre, String ubicacion, double presupuesto, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
        this.estado = estado;
    }
    
    //getters 

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public String getEstado() {
        return estado;
    }
    
    // setters

    public void setCodigo(String idProyect) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
         return codigo + " - " + nombre + " - "+ estado;
    }
    
    
    
    
    
    
}
