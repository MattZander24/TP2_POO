package ar.edu.unlu.POO.TP2.EJ9;

import java.util.Scanner;

public class GestorFiguras {
    //public static void MenuEjercicio9 () {
    public static void main(String[] args) {
        /*Debo poder tener una lista de Formas y pedirles el
        área a todas sin importar el Subtipo. Además, de un
        listado de Formas en 3D tengo que poder pedirles el volumen.*/

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ejercicio 9");
            System.out.println("1. Calcular el AREA de una figura");
            System.out.println("2. Calcular el VOLUMEN de una figura");
            System.out.println("3. Prueba automatica de las funciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ListaAreas();
                    break;
                case 2:
                    ListaVolumenes();
                    break;
                case 3:
                    PruebaEjercicio9();
                    break;
                case 4:
                    System.out.println("\nSaliendo del ejercicio...\n");
                    break;
                default:
                    System.out.println("\nPor favor, seleccione una opción correcta\n");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
    public static void PruebaEjercicio9 () {
        /*Generar una clase que utilice varias de las
        clases construidas para mostrar su funcionamiento*/


    }

    public static void ListaAreas () {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nCálculo de Área:");
            System.out.println("1. Calcular Área de un Círculo");
            System.out.println("2. Calcular Área de un Rectángulo");
            System.out.println("3. Calcular Área de un Cuadrado");
            System.out.println("4. Calcular Área de un Triángulo");
            System.out.println("5. Calcular Área de un Cubo");
            System.out.println("6. Calcular Área de una Esfera");
            System.out.println("7. Calcular Área de un Paralelepipedo");
            System.out.println("8. Calcular Área de un Tetraedro");
            System.out.println("9. Volver al menú principal");
            System.out.print("Seleccione una figura: ");
            opcion = scanner.nextInt();

            System.out.println("\n");

            switch (opcion) {
                case 1:
                    //CIRCULO (radio)
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    Circulo circulo = new Circulo(radioCirculo);
                    double areaCirculo = circulo.getArea();
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case 2:
                    //RECTANGULO (base, altura)
                    System.out.print("Ingrese la base del rectangulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    double areaRectangulo = rectangulo.getArea();
                    System.out.println("El área del rectangulo es: " + areaRectangulo);
                    break;
                case 3:
                    //CUADRADO (lado)
                    System.out.print("Ingrese la longitud de lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                    double areaCuadrado = cuadrado.getArea();
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;
                case 4:
                    //TRIANGULO (base, altura)
                    System.out.print("Ingrese la base del triangulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                    double areaTriangulo = triangulo.getArea();
                    System.out.println("El área del triangulo es: " + areaTriangulo);
                    break;
                case 5:
                    //CUBO (arista)
                    System.out.print("Ingrese la arista del cubo: ");
                    double aristaCubo = scanner.nextDouble();
                    Cubo cubo = new Cubo(aristaCubo);
                    double areaCubo = cubo.getArea();
                    System.out.println("El área del cubo es: " + areaCubo);
                    break;
                case 6:
                    //ESFERA (radio)
                    System.out.print("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();
                    Esfera esfera = new Esfera(radioEsfera);
                    double areaEsfera = esfera.getArea();
                    System.out.println("El área de la esfera es: " + areaEsfera);
                    break;
                case 7:
                    //PARALELEPIPEDO (arista1, arista2, arista3)
                    System.out.print("Ingrese la arista N°1 del paralelepipedo: ");
                    double arista1 = scanner.nextDouble();
                    System.out.print("Ingrese la arista N°2 del paralelepipedo: ");
                    double arista2 = scanner.nextDouble();
                    System.out.print("Ingrese la arista N°3 del paralelepipedo: ");
                    double arista3 = scanner.nextDouble();
                    Paralelepipedo paralelepipedo = new Paralelepipedo(arista1, arista2, arista3);
                    double areaParalelepipedo = paralelepipedo.getArea();
                    System.out.println("El área del paralelepipedo es: " + areaParalelepipedo);
                    break;
                case 8:
                    //TETRAEDRO (arista)
                    System.out.print("Ingrese la arista del tetraedro: ");
                    double aristaTetraedro = scanner.nextDouble();
                    Tetraedro tetraedro = new Tetraedro(aristaTetraedro);
                    double areaTetraedro = tetraedro.getArea();
                    System.out.println("El área del tetraedro es: " + areaTetraedro);
                    break;
                case 9:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
                    break;
            }

        } while (opcion != 9);

        System.out.println("\n");

        //scanner.close();
        scanner.nextLine();
    }

    public static void ListaVolumenes () {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nCálculo de Volumen:");
            System.out.println("1. Calcular Área de un Cubo");
            System.out.println("2. Calcular Área de una Esfera");
            System.out.println("3. Calcular Área de un Paralelepipedo");
            System.out.println("4. Calcular Área de un Tetraedro");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una figura: ");
            opcion = scanner.nextInt();

            System.out.println("\n");

            switch (opcion) {
                case 1:
                    //CUBO (arista)
                    System.out.print("Ingrese la arista del cubo: ");
                    double aristaCubo = scanner.nextDouble();
                    Cubo cubo = new Cubo(aristaCubo);
                    double volumenCubo = cubo.getVolumen();
                    System.out.println("El volumen del cubo es: " + volumenCubo);
                    break;
                case 2:
                    //ESFERA (radio)
                    System.out.print("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();
                    Esfera esfera = new Esfera(radioEsfera);
                    double volumenEsfera = esfera.getVolumen();
                    System.out.println("El volumen de la esfera es: " + volumenEsfera);
                    break;
                case 3:
                    //PARALELEPIPEDO (arista1, arista2, arista3)
                    System.out.print("Ingrese la arista N°1 del paralelepipedo: ");
                    double arista1 = scanner.nextDouble();
                    System.out.print("Ingrese la arista N°2 del paralelepipedo: ");
                    double arista2 = scanner.nextDouble();
                    System.out.print("Ingrese la arista N°3 del paralelepipedo: ");
                    double arista3 = scanner.nextDouble();
                    Paralelepipedo paralelepipedo = new Paralelepipedo(arista1, arista2, arista3);
                    double volumenParalelepipedo = paralelepipedo.getVolumen();
                    System.out.println("El volumen del paralelepipedo es: " + volumenParalelepipedo);
                    break;
                case 4:
                    //TETRAEDRO (arista)
                    System.out.print("Ingrese la arista del tetraedro: ");
                    double aristaTetraedro = scanner.nextDouble();
                    Tetraedro tetraedro = new Tetraedro(aristaTetraedro);
                    double volumenTetraedro = tetraedro.getVolumen();
                    System.out.println("El volumen del tetraedro es: " + volumenTetraedro);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
                    break;
            }

        } while (opcion != 5);

        System.out.println("\n");

        //scanner.close();
        scanner.nextLine();
    }

}
