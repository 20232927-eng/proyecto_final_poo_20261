/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Carlos
 */
public class PagoContado extends ModalidadPago {
    //Atributo
    private double montoPagado;
    //Constructor
    public PagoContado(double montoPagado) {
        this.montoPagado = montoPagado;
    }
    public double getMontoPagado() {
        return montoPagado;
    }
    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }
    @Override
    public double calcularSaldoPendiente() {
        //Al contado
        return 0;
    }
    @Override
    public String getDetalle() {
        return "Modalidad : Al Contado"+ "\nMonto Pagado : S/. " + montoPagado;
    }    
}
