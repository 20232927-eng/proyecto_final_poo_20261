/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases

/**
 *
 * @author L35108
 */
public class  Departamentos{
    
    private String codigo;
    private int numero;
    private double precio;
    private String estado;

    public Departamentos(String codigo, int numero, double precio, String estado) {
        this.codigo = codigo;
        this.numero = numero;
        this.precio = precio;
        this.estado = "DISPONIBLE";
        
        
    }
    
    //GETTERS

    public String getCodigo() {
        return codigo;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }
    
    
    // SETTERS

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dep. "+ numero +"["+estado +"]-$"+ precio;
         
    }
    
    
    
    
    

    
    
}
