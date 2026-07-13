/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Proyecto;
/**
 *
 * @author L35108
 */
public class GestionProyecto {
    //Atributos
    private Proyecto[] proyectos;
    private int totalProyectos;
    //Constructor
    public GestionProyecto() {
        proyectos = new Proyecto[30];
        totalProyectos = 0;
    }
    //Busca por nombre de proyecto
    public Proyecto buscarPorNombre(String nombreProyecto) {
        for (int i = 0; i < totalProyectos; i++) {
            if (proyectos[i].getNombreProyecto().equalsIgnoreCase(nombreProyecto)) {
                return proyectos[i];
            }
        }
        return null;
    }
    //Registra proyecto
    public boolean registrarProyecto(Proyecto proyecto) {
        if (totalProyectos == proyectos.length) {
            imprimir("No hay espacio para mas proyectos.");
            return false; 
        }
        if (buscarPorNombre(proyecto.getNombreProyecto()) != null) {
            imprimir("Ya existe un proyecto con ese nombre.");
            return false; 
        }
        proyectos[totalProyectos] = proyecto;
        totalProyectos++;
        imprimir("Proyecto agregado: " + proyecto.getNombreProyecto());
        return true;
    }
    //Modifica proyecto 
    public boolean modificarProyecto(Proyecto proyecto) {
        for (int i = 0; i < totalProyectos; i++) {
            if (proyectos[i].getNombreProyecto().equalsIgnoreCase(proyecto.getNombreProyecto())) {
                proyectos[i].setDireccion(proyecto.getDireccion());
                proyectos[i].setDistrito(proyecto.getDistrito());
                proyectos[i].setNumeroPisos(proyecto.getNumeroPisos());
                proyectos[i].setFechaInicioObra(proyecto.getFechaInicioObra());
                proyectos[i].setFechaEstimadaEntrega(proyecto.getFechaEstimadaEntrega());
                proyectos[i].setEstado(proyecto.getEstado());
                return true;
            }
        }
        return false;
    }
    //Elimina proyecto por nombre
    public boolean eliminarProyecto(String nombreProyecto) {
        for (int i = 0; i < totalProyectos; i++) {
            if (proyectos[i].getNombreProyecto().equalsIgnoreCase(nombreProyecto)) {
                for (int j = i; j < totalProyectos - 1; j++) {
                    proyectos[j] = proyectos[j + 1];
                }
                proyectos[totalProyectos - 1] = null;
                totalProyectos--;
                return true;
            }
        }
        return false;
    }
    public Proyecto[] obtenerProyectos() {
        return proyectos;
    }
    public int obtenerTotalProyectos() {
        return totalProyectos;
    }
    public static void imprimir(String cadena) {
        System.out.println(cadena);
    }    
}
