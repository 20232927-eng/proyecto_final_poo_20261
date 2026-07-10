/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Empleado;

/**
 *
 * @author Avril
 */
public class GestionEmpleado {
    //Atributos:
    private Empleado[] empleados;
    private int totalEmpleados;
    
    //Constructor:

    public GestionEmpleado() {
        empleados = new Empleado[50];
        totalEmpleados = 0;
        
        registrarEmpleado(new Empleado("78945312", "Avril Yadhira", "Tinoco Torres", "AV202356", "111111", "Asesor de Ventas"));
        registrarEmpleado(new Empleado("78945312", "Artemio Gustavo", "Sanchez Quispe", "AV201589", "753159", "Asesor de Ventas"));
        registrarEmpleado(new Empleado("78945312", "Luz Estrella", "Cespedes Gomez", "AV202178", "951357", "Asesor de Ventas"));
        
        registrarEmpleado(new Empleado("78945312", "Sabina Celia", "Huaman Vazquez", "A0201545", "456739", "Administrador"));
        registrarEmpleado(new Empleado("78945312", "Diana Nadia", "Perez Rodriguez", "A0202273", "333333", "Administrador"));
        registrarEmpleado(new Empleado("78945312", "Maria Gracia", "Hernandez Garcia", "A0201094", "741963", "Administrador"));
        
        registrarEmpleado(new Empleado("78945312", "Tirza Fabiana", "Portilla Torres", "GE200938", "789102", "Gerente"));
        registrarEmpleado(new Empleado("78945312", "Grecia Ariadna", "Olviares Gonzales", "GE201889", "963741", "Gerente"));
        registrarEmpleado(new Empleado("78945312", "Valeria Dominique", "Jimenez Tello", "GE201593", "888888", "Gerente"));
        
        registrarEmpleado(new Empleado("78945312", "Heissy Fatima", "Molina de la Vega", "AV201582", "111111", "Asesor de Ventas"));
        registrarEmpleado(new Empleado("78945312", "Mariano Guzman", "Almonacid Guerra", "A0200519", "123456", "Administrador"));
        registrarEmpleado(new Empleado("78945312", "Hector Marcello", "Diaz Tinoco", "GE202378", "222222", "Gerente"));
    
    }
    
    //------------------------------------------------------------
    //Metodo buscar empleado por DNI: (P.F)
    public Empleado buscarPorDni(String dni) {
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].getDni().equalsIgnoreCase(dni)) {
                return empleados[i];
            }
        }
        return null;
    }    
    
    //------------------------------------------------------------
    //Metodo agregar empleado: (P.F)
    public boolean registrarEmpleado(Empleado empleado) {
        
        //Verifica si esta lleno el arreglo:
        if (totalEmpleados == empleados.length) {
            imprimir("No hay espacio para mas empleados.");
            return false; // lleno
        }
        
        //Evita duplicados:
        if (buscarPorDni(empleado.getDni())!= null) {
            return false; //duplicado            
        }
        
        //registro:
        empleados [totalEmpleados] = empleado;
        totalEmpleados ++;
        imprimir("Empleado agregado con exito:"+empleado.getNombres());
        return true;
        
    }
    
    //------------------------------------------------------------
    //Modifica / actualiza los datos de un empleado buscandolo por DNI:
    public boolean modificarEmpleado(Empleado empleado) {
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].getDni().equalsIgnoreCase(empleado.getDni())) {
                empleados[i].setNombres(empleado.getNombres());
                empleados[i].setApellidos(empleado.getApellidos());
                empleados[i].setUsuario(empleado.getUsuario());
                empleados[i].setContrasena(empleado.getContrasena());
                empleados[i].setRol(empleado.getRol());
                return true;
                
            }
            
        }
        return false;
    }   
    
    //------------------------------------------------------------
    //Metodo para eliminar un empleado buscandolo por su DNI:
    public boolean eliminarEmpleado(String dni) {
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].getDni().equalsIgnoreCase(dni)) {
                //Corre los demas elementos una posicion a la izquierda:
                for (int j = 0; j < totalEmpleados -1; j++) {
                    empleados[j] = empleados [j+1];
                }
                imprimir("Empleado eliminado con exito:"+empleados[i].getDni());
                
                //Limpia el ultimo casillero:
                empleados [totalEmpleados - 1]= null;
                totalEmpleados -- ;
                return true;
            }
        }
        return false;
    }
    //------------------------------------------------------------
    //Retorna el arreglo actual:
    public Empleado[] obtenerEmpleados() {
        return empleados;
    }
    public int obtenerTotalEmpleados() {
        return totalEmpleados;
    }
    //------------------------------------------------------------
    //Metodo impirmir:
    public static void imprimir(String cadena) {
        System.out.println(cadena);
    }
    //------------------------------------------------------------
    
    
    
}
