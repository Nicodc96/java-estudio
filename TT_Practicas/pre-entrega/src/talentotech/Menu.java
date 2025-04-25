package talentotech;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Menu {
    public static int menuDeOpciones(Scanner scanner){
        System.out.println("""
            ***********************************************
            ************   MENU DE OPCIONES   *************
            ***********************************************
            ** Escriba el número de la operación deseada **

            1) Crear producto
            2) Listar productos existentes
            3) Buscar producto por ID
            4) Modificar un producto
            5) Eliminar un producto
            6) Crear un pedido
            7) Listar pedidos

            9) Salir
        """);
        int opcionSeleccionada = scanner.nextInt();
        List<Integer> opcionesValidas = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9);
        while(!opcionesValidas.contains(opcionSeleccionada)){
            System.out.println("""
                    **ERROR**
                    Por favor, seleccione una opción correcta:
            """);
            opcionSeleccionada = scanner.nextInt();
        }
        return opcionSeleccionada;
    }

    public static void pressEnterToContinue(Scanner scanner){ 
        System.out.println("Presione 'Enter' para continuar...");
        try{
            System.in.read();
            scanner.nextLine();
        }
        catch(Exception e){}  
    }
}
