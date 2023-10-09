package ar.edu.unlu.POO.TP2.EJ13.ORIGINAL;

public class Persona {

    private int ID;
    private static int contadorIDP = 0;
    private String nombre;
    private String numTelefono;
    private String direccion;

    public Persona(String nombre, String numTelefono, String direccion) {
        this.ID = contadorIDP;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
        contadorIDP++;
    }
}
