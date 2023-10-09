package ar.edu.unlu.POO.TP2.EJ13.ORIGINAL;

public class ReciboSueldo {
    private int idRecibo;
    private static int contadorIDR = 0;
    private double montoTotal;

    public ReciboSueldo(double montoTotal) {
        this.idRecibo = contadorIDR;
        this.montoTotal = montoTotal;
        contadorIDR++;
    }
}
