/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Proyecto;
import java.util.ArrayList;

/**
 *
 * @author L35108
 */
public class GestionProyecto {
    
    private ArrayList<Proyecto>proyectos;
    
    public GestionProyecto(){
        proyectos = new ArrayList<>();
        
    }
    
    //Registrar proyectos
    
    public void registrarProyecto(Proyecto proyecto){
        proyectos.add(proyecto);
    } 
    
    //Eliminar proyectos
    
    public void eliminarProyecto(String codigo){
        
        for(Proyecto p: proyectos){
            if ( p.getCodigo().equals(codigo)){
                proyectos.remove(p);
                break;
            }
        }
        
        
            }
    
    
    
    //Buscar proyecto 
    
    public Proyecto buscarProyecto(String codigo){
        for ( Proyecto p : proyectos ){
            if ( p.getCodigo().equals(codigo)){
                return p;
            }
        }
        return null;
    }
    
    // Listar proyectos
    
    public ArrayList<Proyecto> listarProyectos(){
        return proyectos;
    }
    
    
    
    
    
    
}
