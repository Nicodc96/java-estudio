package com.compras.tarjeta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer menuTarjeta(Scanner scanner, Double limite, Integer cantidadTotal) {
        System.out.printf("""
                    ***********************************************
                              - Bienvenido/a nuevamente -

                    Limite actual: $%.2f
                    Cantidad de productos actual: %d

                    ***********************************************
                    ** Escriba el número de la operación deseada **

                    1) Establecer límite
                    2) Agregar producto
                    3) Listar productos
                    4) Listar productos ordenados por precio
                    5) Mostrar información de la tarjeta

                    9) Salir
                """, limite, cantidadTotal);
        Integer opcion;
        try{
            opcion = scanner.nextInt();
        } catch(InputMismatchException e){
            opcion = 99;
        }
        return opcion;
    }

    public static void establecerLimite(Scanner scanner, Tarjeta tarjeta) {
        System.out.print("Ingrese un nuevo límite: ");
        tarjeta.setLimite(scanner.nextDouble());
        System.out.println();
        System.out.println("¡Operación exitosa!");
        pressEnterToContinue(scanner);
    }

    public static void agregarProducto(Scanner scanner, Tarjeta tarjeta) {
        Producto p = new Producto();
        System.out.print("""
                    ---- Ingrese nombre de producto:
                """);
        scanner.nextLine();
        String pNombre = scanner.nextLine();
        System.out.print("""
                    ---- Ingrese valor del producto:
                """);
        Double pValor = scanner.nextDouble();
        p.setNombre(pNombre);
        p.setValor(pValor);
        System.out.print("El producto a agregar ");
        switch (tarjeta.agregarProducto(p)) {
            case 0:
                System.out.print("ya existe en la lista actual.\n");
                break;
            case 1:
                System.out.print("se ha añadido exitosamente!.\n");
                break;
            case 2:
                System.out.print("no se ha agregado ya que supera el límite de la tarjeta.\n");
                break;
            default:
                System.out.println("no se ha agregado debido a un error inesperado.\n");
        }
        ;
        pressEnterToContinue(scanner);
    }

    public static void listar(Scanner scanner, Tarjeta tarjeta, boolean ordenado) {
        System.out.printf("***** Lista de productos %s*****\n", ordenado ? "ORDENADO " : "");
        System.out.println(ordenado ? listarProductosOrdenados(tarjeta) : listarProductos(tarjeta));
        pressEnterToContinue(scanner);
    }

    private static String listarProductos(Tarjeta tarjeta) {
        StringBuilder sB = new StringBuilder();
        tarjeta.getProductos().stream().forEach((p) -> sB.append(p.toString()));
        return sB.toString();
    }

    private static String listarProductosOrdenados(Tarjeta tarjeta) {
        StringBuilder sB = new StringBuilder();
        tarjeta.getProductos().stream().sorted((p1, p2) -> p1.getValor().compareTo(p2.getValor()))
                .forEach((p) -> sB.append(p.toString()));
        return sB.toString();
    }

    public static void informacionTarjeta(Scanner scanner,Tarjeta tarjeta){
        System.out.println(tarjeta);
        pressEnterToContinue(scanner);
    }

    public static void pressEnterToContinue(Scanner scanner) {
        System.out.println("Presione 'Enter' para continuar...");
        try {
            System.in.read();
            scanner.nextLine();
        } catch (Exception e) {
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
