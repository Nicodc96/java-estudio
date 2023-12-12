package Productos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        while (edad > 90){
            System.out.print("Edad inválida. Reingrese su edad: ");
            edad = scanner.nextInt();
        }

        if (edad > 30){
            System.out.println("Usted no tiene acceso a ningún producto.");
        } else if (edad > 17){
            System.out.println("Usted tiene acceso a productos de gama alta.");
        } else{
            System.out.println("Usted tiene acceso a productos de gama media.");
        }

        scanner.close();
    }
}
