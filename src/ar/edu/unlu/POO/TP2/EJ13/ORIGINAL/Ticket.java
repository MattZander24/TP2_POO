package ar.edu.unlu.POO.TP2.EJ13.ORIGINAL;

public class Ticket {
    private int idTicket;
    private static int contadorIDT = 0;
    private Pasajero pasajeroT;
    private Vuelo vueloT;

    public Ticket(Pasajero pasajeroT, Vuelo vueloT) {
        this.idTicket = contadorIDT;
        this.pasajeroT = pasajeroT;
        this.vueloT = vueloT;
        contadorIDT++;
    }
}
