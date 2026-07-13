/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
/**
 *
 * @author Carlos
 */
public class Venta {
    //Atributos
    private Cliente cliente;
    private Departamentos departamento;
    private Proyecto proyecto;
    private Empleado asesor;
    private ModalidadPago modalidadPago; 
    private double precioTotal;
    private String fechaVenta;
    //Constructor
    public Venta(Cliente cliente, Departamentos departamento, Proyecto proyecto,
            Empleado asesor, ModalidadPago modalidadPago, double precioTotal, String fechaVenta) {
        this.cliente = cliente;
        this.departamento = departamento;
        this.proyecto = proyecto;
        this.asesor = asesor;
        this.modalidadPago = modalidadPago;
        this.precioTotal = precioTotal;
        this.fechaVenta = fechaVenta;
    }
    //Geys y sets
    public Cliente getCliente() {
        return cliente;
    }
    public Departamentos getDepartamentos() {
        return departamento;
    }
    public Proyecto getProyecto() {
        return proyecto;
    }
    public Empleado getAsesor() {
        return asesor;
    }
    public ModalidadPago getModalidadPago() {
        return modalidadPago;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public String getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    //Polimorfismo
    public double calcularSaldoPendiente() {
        return modalidadPago.calcularSaldoPendiente();
    }
    public String getInformacion() {
        return "Cliente : " + cliente.getNombres() + " " + cliente.getApellidos()
                + "\nProyecto : " + proyecto.getNombreProyecto()
                + "\nDepartamento : " + departamento.getCodigo()
                + "\nAsesor : " + asesor.getNombres() + " " + asesor.getApellidos()
                + "\nPrecio Total : S/. " + precioTotal
                + "\nFecha de Venta : " + fechaVenta
                + "\n" + modalidadPago.getDetalle()
                + "\nSaldo Pendiente : S/. " + calcularSaldoPendiente();
    }        
}
