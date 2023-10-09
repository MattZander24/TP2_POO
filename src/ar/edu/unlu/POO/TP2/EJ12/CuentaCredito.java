package ar.edu.unlu.POO.TP2.EJ12;

public class CuentaCredito extends Cuenta{
    private double limiteCompra = 500;
    private double saldoDeudor = 0;
    private double montoCompraDisponible = 500;

    boolean realizarCompra(double saldo) {
        if (saldo <= montoCompraDisponible) {
            saldoDeudor += saldo * 1.05;
            limiteCompra -= saldo;
            return true;
        }
        return false;
    }

    void pagarSaldoDeudor(double saldo) {
        if (saldoDeudor - saldo >= 0) {
            saldoDeudor -= saldo;
            limiteCompra += saldo;
        }
    }
    double getSaldoDeudor() {
        return saldoDeudor;
    }
    double getMontoCompraDisponible() {
        return montoCompraDisponible;
    }
}
