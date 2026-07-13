/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Carlos
 */
public class Reserva {
    //Atributos
    private Cliente cliente;
    private Departamentos departamento;
    private double montoSeparacion;
    private String fechaVigencia;
    private String estado; 
    //Constructor
    public Reserva(Cliente cliente, Departamentos departamento, double montoSeparacion, String fechaVigencia) {
        this.cliente = cliente;
        this.departamento = departamento;
        this.montoSeparacion = montoSeparacion;
        this.fechaVigencia = fechaVigencia;
        this.estado = "Vigente";
    }
    //Propiedades
    public Cliente getCliente() {
        return cliente;
    } 
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Departamentos getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }
    public double getMontoSeparacion() {
        return montoSeparacion;
    }
    public void setMontoSeparacion(double montoSeparacion) {
        this.montoSeparacion = montoSeparacion;
    }
    public String getFechaVigencia() {
        return fechaVigencia;
    }
    public void setFechaVigencia(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getInformacion() {
        return "Cliente : " + cliente.getNombres() + " " + cliente.getApellidos()
                + "\nDepartamento : " + departamento.getCodigo()
                + "\nMonto Separacion : S/. " + montoSeparacion
                + "\nFecha Vigencia : " + fechaVigencia
                + "\nEstado Reserva : " + estado;
    }    
}