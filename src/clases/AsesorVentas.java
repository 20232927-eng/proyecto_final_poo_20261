
package clases;

public class AsesorVentas extends Empleado {
    private double metaMensual; 
    public AsesorVentas(String dni, String nombres, String apellidos, String usuario, String contrasena,
            double metaMensual) {
        super(dni, nombres, apellidos, usuario, contrasena);
        this.metaMensual = metaMensual;
    } 
    public double getMetaMensual() {
        return metaMensual;
    } 
    public void setMetaMensual(double metaMensual) {
        this.metaMensual = metaMensual;
    } 
    @Override
    public String getRol() {
        return "Asesor de Venta";
    } 
    @Override
    public String getPermisos() {
        return "Gestion de Clientes, Reservas, Ventas y Pagos";
    } 
    @Override
    public String getInformacion() {
        return super.getInformacion()
                + "\nPermisos : " + getPermisos()
                + "\nMeta Mensual : " + metaMensual;
    }   
}
