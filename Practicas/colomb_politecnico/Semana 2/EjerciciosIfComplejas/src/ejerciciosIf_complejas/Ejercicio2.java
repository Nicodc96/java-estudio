package ejerciciosIf_complejas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		try {
			System.out.print("Ingrese un número entre 0 y 9999: ");
			numero = scanner.nextInt();
		} catch (InputMismatchException e) {
			numero = (int) Math.round(Math.random()*1000);
		}
		
		System.out.println("Numero: " + numero);
		System.out.println(verificarNumero(numero));
		scanner.close();
	}
	
	private static String verificarNumero(int numero) {
		StringBuilder mensaje = new StringBuilder();
		
		if (numero > 9999) {
			mensaje.append("El número ingresado tiene más de 4 cifras.");
		} else {
			if (numero < 1000) {
				if (numero < 10) {
					mensaje.append("El número tiene 1 cifra.");
				} else if (numero > 9 && numero < 100) {
					mensaje.append("El número tiene 2 cifras.");
				} else {
					mensaje.append("El número tiene 3 cifras.");
				}
			} else {
				mensaje.append("El número tiene 4 cifras.");
			}
		}
		
		return mensaje.toString();
	}
}
