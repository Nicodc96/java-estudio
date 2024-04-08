package ejercicios;

import java.util.Scanner;

public class Rectangulo {
    public static void ejercicio(){
        int alto;
        int ancho;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        alto = scanner.nextInt();
        System.out.println("Proporciona el ancho: ");
        ancho = scanner.nextInt();

        System.out.println("Area: " + alto * ancho);
        System.out.println("Perimetro: " + (alto + ancho) * 2);

        scanner.close();
    }
}
