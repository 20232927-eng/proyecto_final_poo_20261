/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.AcabadoOpcional;
/**
 *
 * @author Carlos
 */
public class GestorAcabados {
    //Atributos
    private AcabadoOpcional[] acabados;
    private int totalAcabados;
    //Constructor
    public GestorAcabados() {
        acabados = new AcabadoOpcional[50];
        totalAcabados = 0;
    }
    //Busca por codigo
    public AcabadoOpcional buscarPorCodigo(String codigo) {
        for (int i = 0; i < totalAcabados; i++) {
            if (acabados[i].getCodigo().equalsIgnoreCase(codigo)) {
                return acabados[i];
            }
        }
        return null;
    }
    //Registra el acabado
    public boolean registrarAcabado(AcabadoOpcional acabado) {
        if (totalAcabados == acabados.length) {
            imprimir("No hay espacio para mas acabados.");
            return false;
        }
        if (buscarPorCodigo(acabado.getCodigo()) != null) {
            imprimir("Ya existe un acabado con ese codigo.");
            return false;
        }
        acabados[totalAcabados] = acabado;
        totalAcabados++;
        imprimir("Acabado agregado: " + acabado.getNombre());
        return true;
    }
    //Modifica el acabado
    public boolean modificarAcabado(AcabadoOpcional acabado) {
        for (int i = 0; i < totalAcabados; i++) {
            if (acabados[i].getCodigo().equalsIgnoreCase(acabado.getCodigo())) {
                acabados[i].setNombre(acabado.getNombre());
                acabados[i].setDescripcion(acabado.getDescripcion());
                acabados[i].setPrecioAdicional(acabado.getPrecioAdicional());
                return true;
            }
        }
        return false;
    }
    //Elimina el acabado por codigo
    public boolean eliminarAcabado(String codigo) {
        for (int i = 0; i < totalAcabados; i++) {
            if (acabados[i].getCodigo().equalsIgnoreCase(codigo)) {
                for (int j = i; j < totalAcabados - 1; j++) {
                    acabados[j] = acabados[j + 1];
                }
                acabados[totalAcabados - 1] = null;
                totalAcabados--;
                return true;
            }
        }
        return false;
    }
    public AcabadoOpcional[] obtenerAcabados() {
        return acabados;
    }
    public int obtenerTotalAcabados() {
        return totalAcabados;
    }
    public static void imprimir(String cadena) {
        System.out.println(cadena);
    }    
}
