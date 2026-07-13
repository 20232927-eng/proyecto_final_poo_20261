/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Departamentos;
import clases.Proyecto;
import clases.Venta;
/**
 *
 * @author Carlos
 */
public class GestorReportes {
    //Atributos: el gestor de reportes se apoya en los gestores ya existentes
    private GestionProyecto gestorProyectos;
    private GestorVentas gestorVentas;
    //Constructor
    public GestorReportes(GestionProyecto gestorProyectos, GestorVentas gestorVentas) {
        this.gestorProyectos = gestorProyectos;
        this.gestorVentas = gestorVentas;
    }
    //Reporte 1: departamentos disponibles/reservados/vendidos por proyecto
    public String reporteDepartamentosPorProyecto(Proyecto proyecto) {
        int disponibles = 0, reservados = 0, vendidos = 0;
        Departamentos[] deptos = proyecto.obtenerDepartamentos();
        for (int i = 0; i < proyecto.getTotalDepartamentos(); i++) {
            if (deptos[i].getEstado().equalsIgnoreCase("Disponible")) {
                disponibles++;
            } else if (deptos[i].getEstado().equalsIgnoreCase("Reservado")) {
                reservados++;
            } else if (deptos[i].getEstado().equalsIgnoreCase("Vendido")) {
                vendidos++;
            }
        }
        return "REPORTE DE DEPARTAMENTOS - " + proyecto.getNombreProyecto()
                + "\nDisponibles : " + disponibles
                + "\nReservados : " + reservados
                + "\nVendidos : " + vendidos
                + "\nTotal : " + proyecto.getTotalDepartamentos();
    }
    //Reporte 2
    public String reporteVentasPorAsesor(String dniAsesor) {
        String texto = "REPORTE DE VENTAS POR ASESOR (DNI " + dniAsesor + ")\n";
        int contador = 0;
        Venta[] ventas = gestorVentas.obtenerVentas();
        for (int i = 0; i < gestorVentas.obtenerTotalVentas(); i++) {
            if (ventas[i].getAsesor().getDni().equalsIgnoreCase(dniAsesor)) {
                texto += "\nDpto " + ventas[i].getDepartamentos().getCodigo()
                        + " | Cliente : " + ventas[i].getCliente().getNombres()
                        + " | Fecha : " + ventas[i].getFechaVenta()
                        + " | Precio : S/. " + ventas[i].getPrecioTotal();
                contador++;
            }
        }
        texto += "\n\nTotal de ventas encontradas : " + contador;
        return texto;
    }
    //Reporte 2b
    public String reporteVentasPorRangoFechas(String fechaInicio, String fechaFin) {
        String texto = "REPORTE DE VENTAS ENTRE " + fechaInicio + " Y " + fechaFin + "\n";
        int inicio = convertirFechaAEntero(fechaInicio);
        int fin = convertirFechaAEntero(fechaFin);
        int contador = 0;
        Venta[] ventas = gestorVentas.obtenerVentas();
        for (int i = 0; i < gestorVentas.obtenerTotalVentas(); i++) {
            int fechaVenta = convertirFechaAEntero(ventas[i].getFechaVenta());
            if (fechaVenta >= inicio && fechaVenta <= fin) {
                texto += "\nDpto " + ventas[i].getDepartamentos().getCodigo()
                        + " | Cliente : " + ventas[i].getCliente().getNombres()
                        + " | Fecha : " + ventas[i].getFechaVenta()
                        + " | Precio : S/. " + ventas[i].getPrecioTotal();
                contador++;
            }
        }
        texto += "\n\nTotal de ventas encontradas : " + contador;
        return texto;
    }
    //Reporte 3
    public String reporteIngresosYSaldos() {
        double ingresoTotal = 0;
        double saldoPendienteTotal = 0;
        Venta[] ventas = gestorVentas.obtenerVentas();
        for (int i = 0; i < gestorVentas.obtenerTotalVentas(); i++) {
            ingresoTotal += ventas[i].getPrecioTotal();
            saldoPendienteTotal += ventas[i].calcularSaldoPendiente();
        }
        return "REPORTE DE INGRESOS Y SALDOS"
                + "\nIngreso Total (ventas concretadas) : S/. " + ingresoTotal
                + "\nSaldo de Cuotas Pendientes : S/. " + saldoPendienteTotal;
    }
    //Reporte 4
    public String reporteProyectosPorPorcentajeVentas() {
        String texto = "REPORTE DE PROYECTOS POR % DE VENTAS\n";
        Proyecto[] proyectos = gestorProyectos.obtenerProyectos(); 
        for (int i = 0; i < gestorProyectos.obtenerTotalProyectos(); i++) {
            Proyecto p = proyectos[i];
            int vendidos = 0;
            Departamentos[] deptos = p.obtenerDepartamentos();
            for (int j = 0; j < p.getTotalDepartamentos(); j++) {
                if (deptos[j].getEstado().equalsIgnoreCase("Vendido")) {
                    vendidos++;
                }
            }
            double porcentaje = 0;
            if (p.getTotalDepartamentos() > 0) {
                porcentaje = (vendidos * 100.0) / p.getTotalDepartamentos();
            }
            texto += "\n" + p.getNombreProyecto() + " : " + String.format("%.2f", porcentaje) + "% vendido"
                    + " (" + vendidos + "/" + p.getTotalDepartamentos() + ")";
        }
        return texto;
    }
    //Metodo auxiliar que convierte "dd/MM/yyyy" a un entero comparable (yyyyMMdd)
    private int convertirFechaAEntero(String fecha) {
        String[] partes = fecha.split("/");
        String dia = partes[0];
        String mes = partes[1];
        String anio = partes[2];
        return Integer.parseInt(anio + mes + dia);
    }    
}
