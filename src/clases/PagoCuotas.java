/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Carlos
 */
public class PagoCuotas extends ModalidadPago {
    //Atributos propios
    private double cuotaInicial;
    private int numeroCuotas;
    private Cuota[] cronograma;
    //Constructor: genera automaticamente el cronograma de pagos
    public PagoCuotas(double cuotaInicial, int numeroCuotas, double montoPorCuota, String[] fechasVencimiento) {
        this.cuotaInicial = cuotaInicial;
        this.numeroCuotas = numeroCuotas;
        this.cronograma = new Cuota[numeroCuotas];
 
        for (int i = 0; i < numeroCuotas; i++) {
            cronograma[i] = new Cuota(i + 1, montoPorCuota, fechasVencimiento[i]);
        }
    }
    public double getCuotaInicial() {
        return cuotaInicial;
    }
    public void setCuotaInicial(double cuotaInicial) {
        this.cuotaInicial = cuotaInicial;
    }
    public int getNumeroCuotas() {
        return numeroCuotas;
    }
    public Cuota[] getCronograma() {
        return cronograma;
    }
    //Registra un pago parcial sobre una cuota especifica
    public boolean registrarPago(int numeroCuota, double monto) {
        for (int i = 0; i < cronograma.length; i++) {
            if (cronograma[i].getNumero() == numeroCuota) {
                cronograma[i].registrarPago(monto);
                return true;
            }
        }
        return false;
    }
    @Override
    public double calcularSaldoPendiente() {
        double saldo = 0;
        for (int i = 0; i < cronograma.length; i++) {
            saldo += cronograma[i].getSaldoPendiente();
        }
        return saldo;
    }
    @Override
    public String getDetalle() {
        String texto = "Modalidad : Cuotas Directas"
                + "\nCuota Inicial : S/. " + cuotaInicial
                + "\nNumero de Cuotas : " + numeroCuotas
                + "\nCronograma :";
        for (int i = 0; i < cronograma.length; i++) {
            texto += "\n   " + cronograma[i].getInformacion();
        }
        return texto;
    }    
}
