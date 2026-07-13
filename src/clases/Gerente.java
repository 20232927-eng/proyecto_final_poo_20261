
package clases;

public class Gerente extends Empleado{
    private String areaSupervisada; 
    public Gerente(String dni, String nombres, String apellidos, String usuario, String contrasena,
            String areaSupervisada) {
        super(dni, nombres, apellidos, usuario, contrasena);
        this.areaSupervisada = areaSupervisada;
    } 
    public String getAreaSupervisada() {
        return areaSupervisada;
    } 
    public void setAreaSupervisada(String areaSupervisada) {
        this.areaSupervisada = areaSupervisada;
    } 
    @Override
    public String getRol() {
        return "Gerente";
    } 
    @Override
    public String getPermisos() {
        return "Acceso solo a Reportes y Estadisticas";
    } 
    @Override
    public String getInformacion() {
        return super.getInformacion()
                + "\nPermisos : " + getPermisos()
                + "\nArea Supervisada : " + areaSupervisada;
    }   
}
