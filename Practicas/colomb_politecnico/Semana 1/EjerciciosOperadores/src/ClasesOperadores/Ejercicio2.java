package ClasesOperadores;

import java.text.DecimalFormat;

public class Ejercicio2 {
	public static void main(String[] args) {
		Integer valor1 = 9;
		Integer valor2 = 7;
		
		Integer suma = valor1 + valor2;
		Integer resta = valor1 - valor2;
		Integer multiplicacion = valor1 * valor2;
		Double division = (double) valor1 / valor2;
		
		System.out.println("Suma 9 + 7: " + suma);
		System.out.println("Resta 9 - 7: " + resta);
		System.out.println("Multiplicacion 9 * 7: " + multiplicacion);
		System.out.println("Division 9 / 7: " + Double.valueOf(new DecimalFormat("#.##").format(division)));
	}
}
