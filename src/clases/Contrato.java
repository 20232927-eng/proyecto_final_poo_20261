/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
/**
 *
 * @author Carlos
 */
public class Contrato {
    private Venta venta;
    //Constructor
    public Contrato(Venta venta) {
        this.venta = venta;
    }
    public Venta getVenta() {
        return venta;
    }
    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    public String generarDocumento() {
        return "=========================================\n"
                + "     CONTRATO DE COMPRA-VENTA\n"
                + "=========================================\n"
                + "\nDATOS DEL CLIENTE"
                + "\nNombres : " + venta.getCliente().getNombres() + " " + venta.getCliente().getApellidos()
                + "\nDNI : " + venta.getCliente().getDni()
                + "\n\nDATOS DEL PROYECTO"
                + "\nProyecto : " + venta.getProyecto().getNombreProyecto()
                + "\nDireccion : " + venta.getProyecto().getDireccion() + ", " + venta.getProyecto().getDistrito()
                + "\nFecha Estimada de Entrega : " + venta.getProyecto().getFechaEstimadaEntrega()
                + "\n\nDATOS DEL DEPARTAMENTO"
                + "\nCodigo : " + venta.getDepartamentos().getCodigo()
                + "\nPiso : " + venta.getDepartamentos().getNumeroPiso()
                + "\nArea : " + venta.getDepartamentos().getArea() + " m2"
                + "\nTipo : " + venta.getDepartamentos().getTipo()
                + "\n\nDATOS DE LA VENTA"
                + "\nAsesor Responsable : " + venta.getAsesor().getNombres() + " " + venta.getAsesor().getApellidos()
                + "\nFecha de Venta : " + venta.getFechaVenta()
                + "\nPrecio Total : S/. " + venta.getPrecioTotal()
                + "\n" + venta.getModalidadPago().getDetalle()
                + "\n\n========================================="
                + "\nDocumento generado automaticamente por el sistema."
                + "\n=========================================";
    }    
}
