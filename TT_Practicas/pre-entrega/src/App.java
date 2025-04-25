import java.util.Scanner;

import talentotech.Menu;
public class App {
    public static void main(String[] args) throws Exception {
        String respuesta = "no";
        Scanner entradaDeDatos = new Scanner(System.in);

        do{
            switch (Menu.menuDeOpciones(entradaDeDatos)) {
                case 1:
                    System.out.println("Acá se agregará un producto");
                break;
                case 2:
                    System.out.println("Acá se listará todos los productos");
                break;
                case 3:
                    System.out.println("Acá se buscará un producto según su ID");
                break;
                case 4:
                    System.out.println("Acá se modificará un producto");
                break;
                case 5:
                    System.out.println("Acá se eliminará un producto");
                break;
                case 6:
                    System.out.println("Acá se agregará un pedido");
                break;
                case 7:
                    System.out.println("Acá se listarán los pedidos");
                break;
                case 9:
                System.out.print("¿Está seguro que desea salir? Escriba 'si' o 'no': ");
                entradaDeDatos.nextLine();
                respuesta = entradaDeDatos.nextLine();
                while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")){
                    System.out.println("**ERROR** Por favor, escriba 'si' o 'no': ");
                    respuesta = entradaDeDatos.nextLine();
                }
                break;
            }
            Menu.pressEnterToContinue(entradaDeDatos);
        }while(respuesta.equalsIgnoreCase("no"));

        entradaDeDatos.close();;
    }
}
