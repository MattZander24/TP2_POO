package ar.edu.unlu.POO.TP2.EJ14;

import Sun_Beach2.*;

public class Sun_Beach {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente("Gustavo");
        Cliente cliente2 = new Cliente("Federico");
        Cliente cliente3 = new Cliente("Ricardo");

        Transporte transporte1 = new Transporte("Avion", 300.0);
        Transporte transporte3 = new Transporte("Ubber", 300.0);
        Transporte transporte2 = new Transporte("Autobus", 300.0);

        Hospedaje hospedaje1 = new Hospedaje("Hotel", 123.0, 70);
        Hospedaje hospedaje2 = new Hospedaje("Cabaña", 123.0, 45);
        Hospedaje hospedaje3 = new Hospedaje("Carpa", 213.0, 15);

        Guia guia1 = new Guia("Cavani", 150);
        Guia guia2 = new Guia("Sigali", 150);
        Guia guia3 = new Guia("Piovi", 150);

        Admin admin = new Admin();
        PaqueteTurismo paquete1 = admin.nuevo_viaje(transporte1, hospedaje3, guia1);
        PaqueteTurismo paquete2 = admin.nuevo_viaje(transporte2, hospedaje2, guia2);
        PaqueteTurismo paquete3 = admin.nuevo_viaje(transporte3, hospedaje1, guia3);

        admin.mostrar_viajes();
        admin.vender_viaje(cliente1, paquete1);
        admin.vender_viaje(cliente1, paquete3);
        admin.vender_viaje(cliente1, paquete2);
        admin.vender_viaje(cliente2, paquete2);
        admin.vender_viaje(cliente3, paquete2);
        admin.vender_viaje(cliente2, paquete2);
        // ------------------------ //

        admin.total_ventas();
        System.out.println("\n----------------------");
        admin.viaje_mas_vendidos();
        System.out.println("\n\n");
        System.out.println("\n----------------------");
        admin.viaje_mas_vendidos();
        System.out.println("\n----------------------");
        cliente1.mostrarViajesComprados();
    }
}


