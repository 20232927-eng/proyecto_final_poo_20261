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
    
    private Proyecto[] proyectos;
    private int totalProyectos;

    //Constructor:

    public GestionProyecto() {
        proyectos = new Proyecto[50];
        totalProyectos = 0;
        registrarProyecto(new Proyecto(

                "P001",

                "Residencial Los Olivos",

                "Av. Primavera 250",

                "Surco",

                12,

                "10/01/2025",

                "20/12/2026",

                "En construcción"

        ));

        registrarProyecto(new Proyecto(

                "P002",

                "Edificio Vista Mar",

                "Av. La Marina 500",

                "San Miguel",

                15,

                "15/03/2025",

                "30/11/2027",

                "En planos"

        ));

        registrarProyecto(new Proyecto(

                "P003",

                "Condominio Central",

                "Av. Arequipa 800",

                "Miraflores",

                20,

                "01/06/2024",

                "15/12/2026",
                
                 "Terminado",

        ));
    }
            
            
            

    //Buscar proyecto por código

    public Proyecto buscarPorCodigo(String codigo) {

        for (int i = 0; i < totalProyectos; i++) {

            if (proyectos[i].getCodigo().equalsIgnoreCase(codigo)) {

                return proyectos[i];

            }

        }

        return null;

    }

    

    //Registrar proyecto

    public boolean registrarProyecto(Proyecto proyecto) {

        //Verifica si el arreglo está lleno

        if (totalProyectos == proyectos.length) {

            imprimir("No hay espacio para más proyectos.");

            return false;

        }

        //Evita proyectos duplicados

        if (buscarPorCodigo(proyecto.getCodigo()) != null) {

            imprimir("El proyecto ya existe.");

            return false;

        }

        //Registro

        proyectos[totalProyectos] = proyecto;

        totalProyectos++;

        imprimir("Proyecto agregado con éxito: "

                + proyecto.getNombre());

        return true;

    }

    

    //Modificar proyecto

    public boolean modificarProyecto(Proyecto proyecto) {

        for (int i = 0; i < totalProyectos; i++) {

            if (proyectos[i].getCodigo()

                    .equalsIgnoreCase(proyecto.getCodigo())) {

                proyectos[i].setNombre(proyecto.getNombre());

                proyectos[i].setDireccion(proyecto.getDireccion());

                proyectos[i].setDistrito(proyecto.getDistrito());

                proyectos[i].setNumeroPisos(proyecto.getNumeroPisos());

                proyectos[i].setFechaInicio(proyecto.getFechaInicio());

                proyectos[i].setFechaEntrega(proyecto.getFechaEntrega());

                proyectos[i].setEstado(proyecto.getEstado());

                imprimir("Proyecto modificado correctamente.");

                return true;

            }

        }

        return false;

    }

    //------------------------------------------------------------

    //Eliminar proyecto

    public boolean eliminarProyecto(String codigo) {

        for (int i = 0; i < totalProyectos; i++) {

            if (proyectos[i].getCodigo()

                    .equalsIgnoreCase(codigo)) {

                //Mover elementos a la izquierda

                for (int j = i; j < totalProyectos - 1; j++) {

                    proyectos[j] = proyectos[j + 1];

                }

                //Limpia última posición

                proyectos[totalProyectos - 1] = null;

                totalProyectos--;

                imprimir("Proyecto eliminado con éxito.");

                return true;

            }

        }

        return false;

    }

    //------------------------------------------------------------

    //Obtener arreglo actual

    public Proyecto[] obtenerProyectos() {

        return proyectos;

    }

    //------------------------------------------------------------

    //Obtener cantidad de proyectos

    public int obtenerTotalProyectos() {

        return totalProyectos;

    }

    //------------------------------------------------------------

    //Imprimir

    public static void imprimir(String cadena) {

        System.out.println(cadena);

    }

}
