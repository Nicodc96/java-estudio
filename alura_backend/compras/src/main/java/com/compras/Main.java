package com.compras;

import java.util.Scanner;
import com.compras.tarjeta.Tarjeta;
import com.compras.tarjeta.Menu;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean continuar = true;
        Tarjeta tarjeta = new Tarjeta(0d);

        do {
            switch (Menu.menuTarjeta(scanner, tarjeta.getLimite(), tarjeta.getProductos().size())) {
                case 1:
                    Menu.establecerLimite(scanner, tarjeta);
                    break;
                case 2:
                    Menu.agregarProducto(scanner, tarjeta);
                    break;
                case 3:
                    Menu.listar(scanner, tarjeta, false);
                    break;
                case 4:
                    Menu.listar(scanner, tarjeta, true);
                    break;
                case 5:
                    Menu.informacionTarjeta(scanner, tarjeta);
                    break;
                case 9:
                    System.out.println("**** Saliendo del menú ****");
                    System.out.println("***** ¡Vuelva pronto! *****");
                    Menu.pressEnterToContinue(scanner);
                    continuar = false;
                    break;
                default:
                    System.out.println("***ERROR*** Ingrese una opción válida");
                    Menu.pressEnterToContinue(scanner);
            }
            Menu.clearScreen();
        } while (continuar);

        scanner.close();
    }
}