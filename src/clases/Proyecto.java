/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author L35108
 */

public class Proyecto {
    //Atributos
    private String nombreProyecto;
    private String direccion;
    private String distrito;
    private int numeroPisos;
    private String fechaInicioObra;
    private String fechaEstimadaEntrega;
    private String estado; 

    private Departamentos[] departamentos;
    private int totalDepartamentos; 
    //Constructor
    public Proyecto(String nombreProyecto, String direccion, String distrito, int numeroPisos,
            String fechaInicioObra, String fechaEstimadaEntrega) {
        this.nombreProyecto = nombreProyecto;
        this.direccion = direccion;
        this.distrito = distrito;
        this.numeroPisos = numeroPisos;
        this.fechaInicioObra = fechaInicioObra;
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
        this.estado = "En planos";
        this.departamentos = new Departamentos[100];
        this.totalDepartamentos = 0;
    } 
    //Gets y sets
    public String getNombreProyecto() {
        return nombreProyecto;
    } 
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    } 
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDistrito() {
        return distrito;
    } 
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    } 
    public int getNumeroPisos() {
        return numeroPisos;
    }
    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    } 
    public String getFechaInicioObra() {
        return fechaInicioObra;
    }
    public void setFechaInicioObra(String fechaInicioObra) {
        this.fechaInicioObra = fechaInicioObra;
    }
    public String getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }
    public void setFechaEstimadaEntrega(String fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
<<<<<<< HEAD

}
    
=======
    public int getTotalDepartamentos() {
        return totalDepartamentos;
    }
    public Departamentos[] obtenerDepartamentos() {
        return departamentos;
    } 
    //Buscar departamento por codigo 
    public Departamentos buscarDepartamentoPorCodigo(String codigo) {
        for (int i = 0; i < totalDepartamentos; i++) {
            if (departamentos[i].getCodigo().equalsIgnoreCase(codigo)) {
                return departamentos[i];
            }
        }
        return null;
    }
    //Registrar departamento nuevo 
    public boolean registrarDepartamento(Departamentos departamento) {
        if (totalDepartamentos == departamentos.length) {
            return false; // lleno
        }
        if (buscarDepartamentoPorCodigo(departamento.getCodigo()) != null) {
            return false; // duplicado
        }
        departamentos[totalDepartamentos] = departamento;
        totalDepartamentos++;
        return true;
    } 
    //Modificar departamento existenter
    public boolean modificarDepartamento(Departamentos departamento) {
        for (int i = 0; i < totalDepartamentos; i++) {
            if (departamentos[i].getCodigo().equalsIgnoreCase(departamento.getCodigo())) {
                departamentos[i].setNumeroPiso(departamento.getNumeroPiso());
                departamentos[i].setNumeroDepartamento(departamento.getNumeroDepartamento());
                departamentos[i].setArea(departamento.getArea());
                departamentos[i].setDormitorios(departamento.getDormitorios());
                departamentos[i].setBanos(departamento.getBanos());
                departamentos[i].setTipo(departamento.getTipo());
                departamentos[i].setPrecioVentaBase(departamento.getPrecioVentaBase());
                return true;
            }
        }
        return false;
    }
    //Eliminar departamento por codigo
    public boolean eliminarDepartamento(String codigo) {
        for (int i = 0; i < totalDepartamentos; i++) {
            if (departamentos[i].getCodigo().equalsIgnoreCase(codigo)) {
                for (int j = i; j < totalDepartamentos - 1; j++) {
                    departamentos[j] = departamentos[j + 1];
                }
                departamentos[totalDepartamentos - 1] = null;
                totalDepartamentos--;
                return true;
            }
        }
        return false;
    }
    public String getInformacion() {
        return "Proyecto : " + nombreProyecto+ "\nDireccion : " + direccion+ "\nDistrito : " + distrito+ "\nNumero de Pisos : " + numeroPisos+ "\nInicio de Obra : " + fechaInicioObra+ "\nEntrega Estimada : " + fechaEstimadaEntrega+ "\nEstado : " + estado+ "\nDepartamentos Registrados : " + totalDepartamentos;
    }  
}
>>>>>>> e1670947cc1ef8e6459de59a1784d9f439bcfbef
