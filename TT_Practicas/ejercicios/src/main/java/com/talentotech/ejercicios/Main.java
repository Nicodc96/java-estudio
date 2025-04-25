package com.talentotech.ejercicios;

import java.util.Scanner;

import com.talentotech.ejercicios.ejercicio.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerGlobal = new Scanner(System.in);

        
        //Ejercicio.EjercicioCuatro_Avanzado((short)20);
        String input = "";

        while (!input.equalsIgnoreCase("salir")) { // mientras sea verdadero, se ejecuta el bucle--> esto siempre es verdadero, entonces tenemos que controlar desde dentro del while cuando se tiene que cortar el bucle, con un break
            System.out.print("Ingresá algo ('salir' para terminar): ");
            input = scannerGlobal.nextLine();

            System.out.println("Ingresaste: " + input);
        }

        System.out.println("Has salido!");
        
        
        scannerGlobal.close();
    }
}