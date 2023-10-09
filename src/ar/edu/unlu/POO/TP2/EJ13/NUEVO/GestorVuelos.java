package ar.edu.unlu.POO.TP2.EJ13.NUEVO;

public class GestorVuelos {
    public static void Ejercicio13Nuevo () {

        System.out.println("PRUEBA EJERCICIO 13. IMPLEMENTACIÓN NUEVA");

        //COPILOTO (VUELO 1) Y PASAJERO (VUELO 2)
        Persona juan = new Persona("Juan", "1122223333", "...");
        //PASAJERO EN AMBOS VUELOS
        Persona pedro = new Persona("Pedro", "1133334444", "...");
        //PILOTO EN AMBOS VUELOS
        Persona ramiro = new Persona("Ramiro", "1144445555", "...");

        Rol tripulanteJuan = new Tripulante("Copiloto");
        Rol tripulanteRamiro = new Tripulante("Piloto");

        juan.agregarRol(tripulanteJuan);
        ramiro.agregarRol(tripulanteRamiro);

        Vuelo v = new Vuelo(999999999);
        Ticket t1v = new Ticket(v);
        Vuelo v2 = new Vuelo(111111111);
        Ticket tv2 = new Ticket(v2);
        Ticket t2v2 = new Ticket(v2);

        ReciboSueldo rcJuan = new ReciboSueldo(10000);
        rcJuan.agregarVuelo(v);

        ReciboSueldo rcRamiro = new ReciboSueldo(30000);
        rcRamiro.agregarVuelo(v);
        rcRamiro.agregarVuelo(v2);

        tripulanteJuan.nuevoRecibo(rcJuan);
        tripulanteRamiro.nuevoRecibo(rcRamiro);

        Rol pasajeroJuan = new Pasajero("100", tv2);
        juan.agregarRol(pasajeroJuan);

        Rol pasajeroPedro = new Pasajero("99", t1v);
        pedro.agregarRol(pasajeroPedro);
        Rol pasajeroPedro1 = new Pasajero("101", t2v2);
        pedro.agregarRol(pasajeroPedro1);

        v.agergarPersona(juan);
        v2.agergarPersona(juan);
        v.agergarPersona(pedro);
        v2.agergarPersona(pedro);
        v.agergarPersona(ramiro);
        v2.agergarPersona(ramiro);

        juan.verRolesPersona();
        pedro.verRolesPersona();
        ramiro.verRolesPersona();
        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("\n");

        v.verVuelo();
        System.out.println("\n");
        v2.verVuelo();
    }
}
