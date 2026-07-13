/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Departamento;
/**
 *
 * @author L35108
 */
public class GestionDepartamentos {
    
private Departamento[] departamentos;

    private int totalDepartamentos;

    //Constructor:

    public GestionDepartamento(){
        departamentos = new Departamento[100];
        totalDepartamentos = 0;
        registrarDepartamento(new Departamento(
                "D001",
                1,
                "101",
                80.5,
                3,
                2,
                "Flat",
                350000
        ));

        registrarDepartamento(new Departamento(
                "D002",
                2,
                "202",
               95.0,
                3,
                2,
                "Flat",
                420000

        ));

        registrarDepartamento(new Departamento(
                "D003",
                5,
                "501",
                150.0,
                4,
                3,
                "Penthouse",
                750000

        ));

    }

    

    //Buscar departamento por código

    public Departamento buscarPorCodigo(String codigo){
        for(int i = 0; i < totalDepartamentos; i++){
            if(departamentos[i].getCodigo()
                    .equalsIgnoreCase(codigo)){
                return departamentos[i];
            }

        }
        return null;

    }

    

    //Registrar departamento

    public boolean registrarDepartamento(Departamento departamento){


        if(totalDepartamentos == departamentos.length){

            imprimir("No hay espacio para más departamentos.");

            return false;

        }

        

        if(buscarPorCodigo(departamento.getCodigo()) != null){

            imprimir("El departamento ya existe.");

            return false;

        }

        

        departamentos[totalDepartamentos] = departamento;

        totalDepartamentos++;

        imprimir("Departamento registrado correctamente: "

                + departamento.getCodigo());

        return true;

    }

   

    //Modificar departamento

    public boolean modificarDepartamento(Departamento departamento){

        for(int i = 0; i < totalDepartamentos; i++){

            if(departamentos[i].getCodigo()

                    .equalsIgnoreCase(departamento.getCodigo())){

                departamentos[i].setPiso(departamento.getPiso());

                departamentos[i].setNumeroDepartamento(

                        departamento.getNumeroDepartamento());

                departamentos[i].setArea(

                        departamento.getArea());

                departamentos[i].setDormitorios(

                        departamento.getDormitorios());

                departamentos[i].setBanos(

                        departamento.getBanos());

                departamentos[i].setTipo(

                        departamento.getTipo());

                departamentos[i].setPrecioVenta(

                        departamento.getPrecioVenta());

                departamentos[i].setEstado(

                        departamento.getEstado());

                imprimir("Departamento modificado correctamente.");

                return true;

            }

        }

        return false;

    }

    

    //Eliminar departamento

    public boolean eliminarDepartamento(String codigo){

        for(int i = 0; i < totalDepartamentos; i++){

            if(departamentos[i].getCodigo()

                    .equalsIgnoreCase(codigo)){

                //Mover elementos

                for(int j = i; j < totalDepartamentos - 1; j++){

                    departamentos[j] = departamentos[j + 1];

                }

                //Limpiar última posición

                departamentos[totalDepartamentos - 1] = null;

                totalDepartamentos--;

                imprimir("Departamento eliminado correctamente.");

                return true;

            }

        }

        return false;

    }

    

    //Obtener arreglo actual

    public Departamento[] obtenerDepartamentos(){

        return departamentos;

    }


    //Obtener cantidad

    public int obtenerTotalDepartamentos(){

        return totalDepartamentos;
    }

    public static void imprimir(String cadena){

        System.out.println(cadena);

    }

}
