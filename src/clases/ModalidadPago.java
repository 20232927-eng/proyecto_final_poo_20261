/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
/**
 *
 * @author Carlos
 */
public abstract class ModalidadPago {
    //Metodo abstracto que define como calcula su saldo pendiente
    public abstract double calcularSaldoPendiente();
    //Metodo abstracto que describe como fue pactada
    public abstract String getDetalle();
}    
