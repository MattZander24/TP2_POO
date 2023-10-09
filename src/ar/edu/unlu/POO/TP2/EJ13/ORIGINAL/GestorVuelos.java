package ar.edu.unlu.POO.TP2.EJ13.ORIGINAL;

public class GestorVuelos {
    public static void Ejercicio13Original () {
        /* si un miembro de la Tripulación desea subir a un vuelo como pasajero, entonces debe ser dado de alta 2
        veces en el sistema (una como Pasajero y otra como Tripulante). */

        System.out.println("PRUEBA EJERCICIO 13. IMPLEMENTACIÓN ORIGINAL");

        Tripulante tri = new Tripulante("XXXX", "1122223333", "...", "Copiloto");

        ReciboSueldo rc = new ReciboSueldo(10000);
        tri.nuevoRecibo(rc);

        //No puedo agregar a la persona como pasajero sin crear esto porque ticket admite solo pasajeros para su alta
        Pasajero pas = new Pasajero("XXXX", "1122223333", "...", 1234);

        Vuelo v = new Vuelo(123456789);
        v.agergarPersona(pas);

        Ticket t = new Ticket(pas, v);
    }
}
