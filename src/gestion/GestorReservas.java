/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Cliente;
import clases.Departamentos;
import clases.Reserva;
/**
 *
 * @author Carlos
 */
public class GestorReservas { 
    //Atributos
    private Reserva[] reservas;
    private int totalReservas;
    //Constructor
    public GestorReservas() {
        reservas = new Reserva[100];
        totalReservas = 0;
    }
    //Registra la reserva
    public boolean registrarReserva(Cliente cliente, Departamentos departamento,
            double montoSeparacion, String fechaVigencia) {
        if (totalReservas == reservas.length) {
            imprimir("No hay espacio para mas reservas.");
            return false;
        }
        if (!departamento.estaDisponible()) {
            imprimir("El departamento " + departamento.getCodigo()
                    + " ya esta " + departamento.getEstado() + ", no se puede reservar.");
            return false;
        }
        Reserva nuevaReserva = new Reserva(cliente, departamento, montoSeparacion, fechaVigencia);
        reservas[totalReservas] = nuevaReserva;
        totalReservas++;
        //Actualiza el estado del departamento
        departamento.setEstado("Reservado");
        imprimir("Reserva registrada para " + cliente.getNombres() + " - Dpto " + departamento.getCodigo());
        return true;
    }
    //Busca la reserva vigente de un departamento 
    public Reserva buscarReservaVigentePorDepartamento(String codigoDepartamento) {
        for (int i = 0; i < totalReservas; i++) {
            if (reservas[i].getDepartamento().getCodigo().equalsIgnoreCase(codigoDepartamento)
                    && reservas[i].getEstado().equalsIgnoreCase("Vigente")) {
                return reservas[i];
            }
        }
        return null;
    }
    public Reserva[] obtenerReservas() {
        return reservas;
    }
    public int obtenerTotalReservas() {
        return totalReservas;
    }
    public static void imprimir(String cadena) {
        System.out.println(cadena);
    }    
}
