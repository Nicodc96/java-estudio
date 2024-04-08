package ejercicios;

import java.util.Scanner;

public class Calificaciones {
    public static void ejercicio(){
        double notaIngresada = -1;
        String respuesta = "Valor desconocido";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10:");
        notaIngresada = scanner.nextDouble();

        if(notaIngresada >= 0 && notaIngresada <= 10){
            if (notaIngresada >= 9) {
                respuesta = "A";
            } else if(notaIngresada >= 8){
                respuesta = "B";
            } else if (notaIngresada >= 7){
                respuesta = "C";
            } else if (notaIngresada >= 6){
                respuesta = "D";
            } else respuesta = "F";
        }

        System.out.println(respuesta);
        scanner.close();
    }
}
