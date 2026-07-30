/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Cliente;

/**
 *
 * @author Avril
 */
public class GestionCliente {
     //Atributos:
    private Cliente[] clientes;
    private int totalClientes;
    
    //Constructor:
    public GestionCliente() {
        clientes = new Cliente[50];
        totalClientes = 0;
        
        Cliente cliente = new Cliente("45612378", "Anna Torres", "Tinoco Diaz", "10/04/06", "Soltera", "Oficinista", 150.9, "93861643", "avtinoco300@gmail.com"
                + "");
    }
    
    //Buscar DNI:
    public Cliente buscarPorDNI(String dni) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getDni().equalsIgnoreCase(dni)) {
                return clientes[i];
            }
        }
        return null;
    }
    
    // Agregar cliente:
    public boolean registrarCliente (Cliente cliente) {
        if (totalClientes == clientes.length) {
            return false; // lleno
        }
        if (buscarPorDNI(cliente.getDni()) != null) {
            return false; // duplicado
        }
        clientes[totalClientes] = cliente;
        totalClientes++;
        return true;
    }
    //Actualizar clientes:
    public boolean modificarCliente (Cliente cliente) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getDni().equalsIgnoreCase(cliente.getDni())) {
                clientes[i].setNombres(cliente.getNombres());
                clientes[i].setApellidos(cliente.getApellidos());
                clientes[i].setFechaNacimiento(cliente.getFechaNacimiento());
                clientes[i].setEstadoCivil(cliente.getEstadoCivil());
                clientes[i].setOcupacion(cliente.getOcupacion());
                clientes[i].setIngresosMensuales(cliente.getIngresosMensuales());
                clientes[i].setTelefono(cliente.getTelefono());
                clientes[i].setCorreo(cliente.getCorreo());
                return true;
            }
        }
        return false;
    }
    
     //Eliminar cliente:
    public boolean eliminarCliente (String dni) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getDni().equalsIgnoreCase(dni)) {
                //correr los demas elementos una posicion a la izquierda
                for (int j = i; j < totalClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                //Limpiamos el ultimo casillero
                clientes[totalClientes - 1] = null;
                totalClientes--;
                return true;
            }
        }
        
        return false;
    }
    //Metodo imprimir:
    public static void imprimir(String cadena) {
        System.out.println(cadena);
        
    }
    
    // Retorna el arreglo actual   
    public Cliente[] obtenerClientes() {
        return clientes;
    }

    public int obtenerTotalClientes() {
        return totalClientes;
    }
}
