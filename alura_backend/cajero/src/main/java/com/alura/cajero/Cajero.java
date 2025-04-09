package com.alura.cajero;

import java.util.Scanner;

public class Cajero {
    private static Double saldo = 1001.01;
    private static String nombreCliente = "Cosme fulanito";
    private static String tipoCuenta = "Caja de ahorro";
    private static String respuesta;
    
    public static void main(String[] args) {
        respuesta = "no";
        Scanner scanner = new Scanner(System.in);

        do{
            switch (menu(scanner)) {
                case 1:
                    consultar(scanner);
                    break;
                case 2:
                    retirar(scanner);
                    break;
                case 3:
                    depositar(scanner);
                    break;
                case 9:
                    System.out.println("¿Está seguro que desea salir? Escriba si/no: ");
                    scanner.nextLine();
                    respuesta = scanner.nextLine();
                    while(respuesta.toLowerCase().equals("si") && respuesta.toLowerCase().equals("no")){
                        System.out.println("**ERROR** Por favor, escriba 'si' o 'no': ");
                        respuesta = scanner.nextLine();
                    }
                    break;
            }
            clearScreen();
        }while(respuesta.equals("no"));
        scanner.close();
    }

    public static void consultar(Scanner scanner){
        System.out.printf("""
                ** Su saldo actualmente es: $%.2f **
        """, saldo);
        pressEnterToContinue(scanner);
    }

    public static void depositar(Scanner scanner){
        proceso(scanner, "depositar", true, "No es posible depositar 0 o valores negativos.");
    }

    public static void retirar(Scanner scanner){
        proceso(scanner, "retirar", false, "No es posible superar el saldo disponible.");
    }

    private static void proceso(Scanner scanner, String procesoMsg, Boolean esDeposito, String errorMsg){
        System.out.printf("Por favor, ingrese el monto que desea %s: ", procesoMsg);
        Double valor = scanner.nextDouble();
        if((esDeposito && valor < 0d) || (!esDeposito && valor > saldo)){
            System.out.printf("**ERROR** %s\n", errorMsg);
            pressEnterToContinue(scanner);
        } else{
            saldo = esDeposito ? saldo + valor : saldo - valor;
            consultar(scanner);
        }
    }

    public static int menu(Scanner scanner){
        System.out.printf("""
            ***********************************************

            Nombre del cliente: %s
            Tipo de cuenta: %s
            Saldo disponible: $%.2f

            ***********************************************
            ** Escriba el número de la operación deseada **
            1) Consultar saldo
            2) Retirar
            3) Depositar

            9) Salir
        """, nombreCliente, tipoCuenta, saldo);
        int opcionSeleccionada = scanner.nextInt();
        while(opcionSeleccionada != 1 && opcionSeleccionada != 2 && opcionSeleccionada != 3 && opcionSeleccionada != 9){
            System.out.println("""
                    **ERROR**
                    Por favor, seleccione una opción correcta:
            """);
            opcionSeleccionada = scanner.nextInt();
        }
        return opcionSeleccionada;
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private static void pressEnterToContinue(Scanner scanner){ 
        System.out.println("Presione 'Enter' para continuar...");
        try{
            System.in.read();
            scanner.nextLine();
        }
        catch(Exception e){}  
    }
}