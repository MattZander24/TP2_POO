package ar.edu.unlu.POO.TP2.EJ14;


public class Ventas {
    private Cliente cliente;
    private PaqueteTurismo paqueteTurismo;

    public Ventas(Cliente cliente, PaqueteTurismo paqueteTurismo) {
        this.cliente = cliente;
        this.paqueteTurismo = paqueteTurismo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PaqueteTurismo getPaqueteTurismo() {
        return paqueteTurismo;
    }
}
