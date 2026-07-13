/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Carlos
 */
public class PagoFinanciamiento extends ModalidadPago {
    //Atributos propios
    private String entidadBancaria;
    private double montoInicial;
    private double montoFinanciado;
    //Constructor
    public PagoFinanciamiento(String entidadBancaria, double montoInicial, double montoFinanciado) {
        this.entidadBancaria = entidadBancaria;
        this.montoInicial = montoInicial;
        this.montoFinanciado = montoFinanciado;
    }
    public String getEntidadBancaria() {
        return entidadBancaria;
    }
    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }
    public double getMontoInicial() {
        return montoInicial;
    }
    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }
    public double getMontoFinanciado() {
        return montoFinanciado;
    }
    public void setMontoFinanciado(double montoFinanciado) {
        this.montoFinanciado = montoFinanciado;
    }
    @Override
    public double calcularSaldoPendiente() {
        //Es el saldo financiado que lo asume el banco
        return 0;
    }
    @Override
    public String getDetalle() {
        return "Modalidad : Financiamiento Bancario"+ "\nEntidad Bancaria : " + entidadBancaria+ "\nMonto Inicial : S/. " + montoInicial+ "\nMonto Financiado : S/. " + montoFinanciado;
    }    
}
