package ar.edu.unlu.POO.TP2.EJ13.ORIGINAL;

public class Pasajero extends Persona {
    private int numeroPasajero;

    public Pasajero(String nombre, String numTelefono, String direccion, int numeroPasajero) {
        super(nombre, numTelefono, direccion);
        this.numeroPasajero = numeroPasajero;
    }
}
