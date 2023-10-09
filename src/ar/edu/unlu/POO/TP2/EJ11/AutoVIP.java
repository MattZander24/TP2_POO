package ar.edu.unlu.POO.TP2.EJ11;

public class AutoVIP extends Auto{
    public AutoVIP(Patente patente) {
        super(patente);
    }

    @Override
    public double getPrecioBase_PorDia() {
        double precio = getPrecioBase();
        precio += 500;
        return precio;
    }
}
