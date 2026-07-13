/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Empleado;
import clases.ModalidadPago;
import clases.Proyecto;
import clases.Reserva;
import clases.Venta;
/**
 *
 * @author Carlos
 */
public class GestorVentas {
    //Atributos
    private Venta[] ventas;
    private int totalVentas;
    //Constructor
    public GestorVentas() {
        ventas = new Venta[100];
        totalVentas = 0;
    }
    //Registra la venta de una reserva vigente
    public boolean registrarVenta(Reserva reserva, Proyecto proyecto, Empleado asesor,ModalidadPago modalidadPago, double precioTotal, String fechaVenta) {
        if (totalVentas == ventas.length) {
            imprimir("No hay espacio para mas ventas.");
            return false;
        }
        if (!reserva.getEstado().equalsIgnoreCase("Vigente")) {
            imprimir("La reserva no esta vigente, no se puede concretar la venta.");
            return false;
        }
        Venta nuevaVenta = new Venta(reserva.getCliente(), reserva.getDepartamento(), proyecto,
                asesor, modalidadPago, precioTotal, fechaVenta);
        ventas[totalVentas] = nuevaVenta;
        totalVentas++;
        //Actualiza
        reserva.getDepartamento().setEstado("Vendido");
        reserva.setEstado("Convertida a Venta");
 
        imprimir("Venta registrada: " + reserva.getDepartamento().getCodigo()
                + " para " + reserva.getCliente().getNombres());
        return true;
    }
    public Venta[] obtenerVentas() {
        return ventas;
    }
    public int obtenerTotalVentas() {
        return totalVentas;
    }
    public static void imprimir(String cadena) {
        System.out.println(cadena);
    }    
}
