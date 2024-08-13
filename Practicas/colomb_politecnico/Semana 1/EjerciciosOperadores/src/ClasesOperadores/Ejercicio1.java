package ClasesOperadores;

import java.text.DecimalFormat;

public class Ejercicio1 {
	public static void main(String[] args) {
		String nombreEstudiante = "Nicolas";
		
		// Extra
		DecimalFormat dF = new DecimalFormat("#.##");
		// -----
		
		Double nota1 = Double.valueOf(dF.format(Math.random()*10));
		Double nota2 = Double.valueOf(dF.format(Math.random()*10));
		Double nota3 = Double.valueOf(dF.format(Math.random()*10));
		Double nota4 = Double.valueOf(dF.format(Math.random()*10));
		Double nota5 = Double.valueOf(dF.format(Math.random()*10));
		
		System.out.println("-Notas obtenidas -");
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota 3: " + nota3);
		System.out.println("Nota 4: " + nota4);
		System.out.println("Nota 5: " + nota5);
		
		Double promedio = (nota1+nota2+nota3+nota4+nota5) / 5;	
		
		System.out.println("Nombre del alumno: " + nombreEstudiante);
		System.out.println("Promedio de notas: " + Double.valueOf(dF.format(promedio)));
	}
}
