/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author L35108
 */
public class  Departamentos{
    
    private String codigo;
    private int piso;
    private String numeroDepartamento;
    private double area;
    private int dormitorios;
    private int banos;
    private String tipo;
    private double precioVenta;
    private String estado;

    

    public Departamento(String codigo, int piso, String numeroDepartamento,
            double area, int dormitorios, int banos,
            String tipo, double precioVenta) {

        this.codigo = codigo;
        this.piso = piso;
        this.numeroDepartamento = numeroDepartamento;
        this.area = area;
        this.dormitorios = dormitorios;
        this.banos = banos;
        this.tipo = tipo;
        this.precioVenta = precioVenta;
        this.estado = "Disponible";

    }

    //Getters y Setters

    public String getCodigo() {
        return codigo;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

    public int getPiso() {
        return piso;

    }

    public void setPiso(int piso) {
        this.piso = piso;

    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;

    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;

    }

    public double getArea() {
        return area;

    }

    public void setArea(double area) {
        this.area = area;

    }

    public int getDormitorios() {
        return dormitorios;

    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;

    }

    public int getBanos() {
        return banos;

    }

    public void setBanos(int banos) {
        this.banos = banos;

    }

    public String getTipo() {
        return tipo;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public double getPrecioVenta() {
        return precioVenta;

    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;

    }

    public String getEstado() {
        return estado;

    }

    public void setEstado(String estado) {
        this.estado = estado;

    }

    

    public void reservar(){
        estado = "Reservado";
    }

    public void vender(){

        estado = "Vendido";

    }

    @Override

    public String toString(){
        return codigo + " - Piso: " + piso 
                + " - Estado: " + estado;
    }

}
    
    
    
    
    

    
    
}
