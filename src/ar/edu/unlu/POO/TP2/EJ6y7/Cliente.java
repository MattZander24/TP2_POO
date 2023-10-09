package ar.edu.unlu.POO.TP2.EJ6y7;

public class Cliente {
    private static int id = 500;
    private int idCliente = id;
    private String nombre;
    private String patenteAuto;
    private double montoTotalCompra = 0;

    public Cliente(String nombre, String patenteAuto) {
        id += 1;
        idCliente = id;
        this.nombre = nombre;
        this.patenteAuto = patenteAuto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatenteAuto() {
        return patenteAuto;
    }

    public void setPatenteAuto(String patenteAuto) {
        this.patenteAuto = patenteAuto;
    }

    void setMontoTotalCompra(double montoTotalCompra) {
        this.montoTotalCompra = montoTotalCompra;
    }

    public double getMontoTotalCompra() {
        return montoTotalCompra;
    }
}
