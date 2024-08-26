package ejerciciosIf_complejas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edad;
		StringBuilder categoria = new StringBuilder();
		
		
		try {
			System.out.print("Ingrese una edad: ");
			edad = scanner.nextInt();
		} catch(InputMismatchException ex) {
			edad = (int) Math.round(Math.random()*100);
		}
		
		categoria.append("Al tener usted ").append(edad).append(" años, su categoría es: ");
		
		if (edad < 56) {
			if (edad < 26) {
				if (edad < 6) {
					categoria.append("Infante.");
				} else if (edad > 5 && edad < 11) {
					categoria.append("Niño.");				
				} else if(edad > 11 && edad < 16){
					categoria.append("Pre adolescente.");
				} else if (edad > 15 && edad < 19) {
					categoria.append("Adolescente.");
				} else {
					categoria.append("Pre adulto.");
				}
			} else {
				if (edad < 41) {
					categoria.append("Adulto.");
				} else {
					categoria.append("Pre anciano.");
				}
			}
		} else {
			categoria.append("Anciano.");
		}
		
		System.out.println(categoria.toString());
		scanner.close();
	}
	
	
}
