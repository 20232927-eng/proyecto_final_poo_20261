/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author L35108
 */
public class  Departamentos{
    //Atributos
    private String codigo;
    private int numeroPiso;
    private int numeroDepartamento;
    private double area;
    private int dormitorios;
    private int banos;
    private String tipo; 
    private double precioVentaBase;
    private String estado; 
    //Opcional
    private AcabadoOpcional[] acabadosSeleccionados;
    private int totalAcabadosSeleccionados;
    //Constructor
    public Departamentos(String codigo, int numeroPiso, int numeroDepartamento, double area,
            int dormitorios, int banos, String tipo, double precioVentaBase) {
        this.codigo = codigo;
        this.numeroPiso = numeroPiso;
        this.numeroDepartamento = numeroDepartamento;
        this.area = area;
        this.dormitorios = dormitorios;
        this.banos = banos;
        this.tipo = tipo;
        this.precioVentaBase = precioVentaBase;
        this.estado = "Disponible";
        this.acabadosSeleccionados = new AcabadoOpcional[20];
        this.totalAcabadosSeleccionados = 0;  
    }
    //GET Y SET
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getNumeroPiso() {
        return numeroPiso;
    }
    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }
    public void setNumeroDepartamento(int numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    } 
    public int getDormitorios() {
        return dormitorios;
    } 
    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    } 
    public int getBanos() {
        return banos;
    } 
    public void setBanos(int banos) {
        this.banos = banos;
    } 
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPrecioVentaBase() {
        return precioVentaBase;
    }
    public void setPrecioVentaBase(double precioVentaBase) {
        this.precioVentaBase = precioVentaBase;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Metodos de validacion de estado 
    public boolean estaDisponible() {
        return estado.equalsIgnoreCase("Disponible");
    }
    //Agrega un acabado
    public boolean agregarAcabadoSeleccionado(AcabadoOpcional acabado) {
        if (totalAcabadosSeleccionados == acabadosSeleccionados.length) {
            return false; // lleno
        }
        acabadosSeleccionados[totalAcabadosSeleccionados] = acabado;
        totalAcabadosSeleccionados++;
        return true;
    }
    public AcabadoOpcional[] obtenerAcabadosSeleccionados() {
        return acabadosSeleccionados;
    }
    public int getTotalAcabadosSeleccionados() {
        return totalAcabadosSeleccionados;
    }
    //Precio final = precio base + suma de acabados elegidos
    public double calcularPrecioFinal() {
        double total = precioVentaBase;
        for (int i = 0; i < totalAcabadosSeleccionados; i++) {
            total += acabadosSeleccionados[i].getPrecioAdicional();
        }
        return total;
    }
    public String getInformacion() {
        return "Codigo : " + codigo
                + "\nPiso : " + numeroPiso
                + "\nNumero Dpto : " + numeroDepartamento
                + "\nArea : " + area + " m2"
                + "\nDormitorios : " + dormitorios
                + "\nBanos : " + banos
                + "\nTipo : " + tipo
                + "\nPrecio Venta Base : S/. " + precioVentaBase
                + "\nEstado : " + estado
                + "\nPrecio Final (con acabados) : S/. " + calcularPrecioFinal();
    }   
}
