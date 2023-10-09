package ar.edu.unlu.POO.TP2.EJ13.NUEVO;

public class Pasajero extends Rol {
    private String numeroPasajero;
    private Ticket ticketPasajero;

    public Pasajero(String numeroPasajero, Ticket ticketPasajero) {
        super();
        this.numeroPasajero = numeroPasajero;
        this.ticketPasajero = ticketPasajero;
    }

    @Override
    public String getNumeroPasajero() {
        return numeroPasajero;
    }

    @Override
    public void setNumeroPasajero(String numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    public Ticket getTicketPasajero() {
        return ticketPasajero;
    }

    public void setTicketPasajero(Ticket ticketPasajero) {
        this.ticketPasajero = ticketPasajero;
    }
}
