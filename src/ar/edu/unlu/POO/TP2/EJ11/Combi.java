package ar.edu.unlu.POO.TP2.EJ11;

public class Combi extends Vehiculo{
    private double precioBaseCombi = 4500;

    public Combi(Patente patente) {
        super(patente);
        this.setPrecioBase(precioBaseCombi);
    }

    @Override
    public double getPrecioBase_PorDia() {
        return getPrecioBase();
    }
}
