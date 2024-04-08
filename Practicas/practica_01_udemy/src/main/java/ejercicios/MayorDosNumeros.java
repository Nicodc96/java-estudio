package ejercicios;

import java.util.Scanner;
import java.lang.Math;

public class MayorDosNumeros {
    public static void ejercicio(){
        int numero1;
        int numero2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el numero1:");
        numero1 = scanner.nextInt();
        System.out.println("Proporciona el numero2:");
        numero2 = scanner.nextInt();

//        System.out.println("El numero mayor es: \n" + Math.max(numero1, numero2));
        System.out.println("El numero mayor es: ");
        System.out.println(numero1>numero2?numero1:numero2);
        scanner.close();
    }
}
