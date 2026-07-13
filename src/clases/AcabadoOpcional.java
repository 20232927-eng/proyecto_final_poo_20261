/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
/**
 *
 * @author Carlos
 */
public class AcabadoOpcional {
    //Atributos
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precioAdicional;
    //Constructor
    public AcabadoOpcional(String codigo, String nombre, String descripcion, double precioAdicional) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioAdicional = precioAdicional;
    }
    //Propiedades
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioAdicional() {
        return precioAdicional;
    }
    public void setPrecioAdicional(double precioAdicional) {
        this.precioAdicional = precioAdicional;
    }
    public String getInformacion() {
        return "Codigo : " + codigo
                + "\nNombre : " + nombre
                + "\nDescripcion : " + descripcion
                + "\nPrecio Adicional : S/. " + precioAdicional;
    }      
}
