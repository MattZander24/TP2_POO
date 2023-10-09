package ar.edu.unlu.POO.TP2.EJ13;

import java.util.Scanner;

public class Menu {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nEjercicio 13");
            System.out.println("1. Prueba del sistema NUEVO");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ar.edu.unlu.POO.TP2.EJ13.NUEVO.GestorVuelos.Ejercicio13Nuevo();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nPor favor, seleccione una opción correcta\n");
                    break;
            }

        } while (opcion != 2);

        scanner.close();
    }
}
