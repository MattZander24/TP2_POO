package ar.edu.unlu.POO.TP2.EJ13.ORIGINAL;

import java.util.ArrayList;

public class Tripulante extends Persona {
    private String cargo;
    private ArrayList<ReciboSueldo> recibos;

    public Tripulante(String nombre, String numTelefono, String direccion, String cargo) {
        super(nombre, numTelefono, direccion);
        this.cargo = cargo;
        this.recibos = new ArrayList<ReciboSueldo>();
    }

    public void nuevoRecibo (ReciboSueldo rc) {
        recibos.add(rc);
    }
}
