package switchCase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tipoMotor;
		String mensaje;
		
		System.out.print("Ingrese el tipo de motor (1-3): ");
		try {
			tipoMotor = scanner.nextInt();
		} catch(InputMismatchException e) {
			// En caso que se ingrese cualquier cosa que no sea un número, el valor será -1
			tipoMotor = -1;
		}
		
		switch(tipoMotor) {
			case 0:
				mensaje = "No hay establecido un valor definido para el tipo.";
				break;
			case 1:
				mensaje = "Agua.";
				break;
			case 2:
				mensaje = "Gasolina.";
				break;
			case 3:
				mensaje = "Hormigón.";
				break;
			default:
				mensaje = "No existe un valor válido.";
				break;
		}
		System.out.println(mensaje);
		scanner.close();
	}	
}
