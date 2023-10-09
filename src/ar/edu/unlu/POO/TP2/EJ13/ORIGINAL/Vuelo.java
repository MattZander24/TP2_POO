package ar.edu.unlu.POO.TP2.EJ13.ORIGINAL;

import java.util.ArrayList;

public class Vuelo {
    private int idVuelo;
    private static int contadorIDV = 0;
    private int numeroVuelo;
    private ArrayList<Persona> miembrosVuelo;

    public Vuelo(int numeroVuelo) {
        this.idVuelo = contadorIDV;
        this.numeroVuelo = numeroVuelo;
        this.miembrosVuelo = new ArrayList<Persona>();
        contadorIDV++;
    }

    public void agergarPersona (Persona p) {
        miembrosVuelo.add(p);
    }
}
