/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Carlos
 */
public class Cuota {
    //Atributos
    private int numero;
    private double montoCuota;
    private String fechaVencimiento;
    private double montoPagado;
    private String estado; // Pendiente, Pagada
    //Constructor
    public Cuota(int numero, double montoCuota, String fechaVencimiento) {
        this.numero = numero;
        this.montoCuota = montoCuota;
        this.fechaVencimiento = fechaVencimiento;
        this.montoPagado = 0;
        this.estado = "Pendiente";
    }
    //Propiedades
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getMontoCuota() {
        return montoCuota;
    }
    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public double getMontoPagado() {
        return montoPagado;
    }
    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Registra un pago parcial o total sobre esta cuota
    public void registrarPago(double monto) {
        montoPagado += monto;
        if (montoPagado >= montoCuota) {
            estado = "Pagada";
        }
    }
    public double getSaldoPendiente() {
        double saldo = montoCuota - montoPagado;
        if (saldo < 0) {
            saldo = 0;
        }
        return saldo;
    }
    public String getInformacion() {
        return "Cuota Nro " + numero
                + " | Monto : S/. " + montoCuota
                + " | Vence : " + fechaVencimiento
                + " | Pagado : S/. " + montoPagado
                + " | Saldo : S/. " + getSaldoPendiente()
                + " | Estado : " + estado;
    } 
}    

