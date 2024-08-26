package vectores;

public class Ejercicio2 {
	public static void main(String[] args) {		
		int[] notaFinalGrupoA = new int[10];
		int[] notaFinalGrupoB = new int[10];
		
		cargaDeValores(notaFinalGrupoA);
		cargaDeValores(notaFinalGrupoB);
		
		float promedioNotasGrupoA = calcularPromedio(notaFinalGrupoA);
		float promedioNotasGrupoB = calcularPromedio(notaFinalGrupoB);
		float promedioGeneral = calcularPromedio(notaFinalGrupoA, notaFinalGrupoB);
		
		System.out.println("Notas Grupo A:");
		System.out.println(imprimirVector(notaFinalGrupoA));
		System.out.println("Notas Grupo B:");
		System.out.println(imprimirVector(notaFinalGrupoB));
		
		System.out.printf("Promedio de notas grupo A: %.2f\n", promedioNotasGrupoA);
		System.out.printf("Promedio de notas grupo B: %.2f\n", promedioNotasGrupoB);
		
		System.out.printf("Promedio general de ambos cursos: %.2f\n", promedioGeneral);
		System.out.println(promedioNotasGrupoA > promedioNotasGrupoB 
				? "El grupo con mejor promedio es el: A" 
				: "El grupo con mejor promedio es el: B");
	}
	
	private static void cargaDeValores(int[] arrayInt) {
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = (int) Math.floor(Math.random()*11);
		}
	}
	
	private static float calcularPromedio(int[] arrayInt) {
		int sumaNotas = 0;
		float promedio;
		for(int i = 0; i < arrayInt.length; i++) {
			sumaNotas += arrayInt[i];
		}
		promedio = sumaNotas / arrayInt.length;
		return promedio;
	}
	
	private static float calcularPromedio(int[] arrayUno, int[] arrayDos) {
		return (calcularPromedio(arrayUno) + calcularPromedio(arrayDos)) / 2;
	}
	
	public static String imprimirVector(int[] arrayInt) {
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i = 0; i < arrayInt.length; i++) {
			sBuilder.append(i == arrayInt.length-1 ? arrayInt[i] : arrayInt[i] + " - ");
		}
		
		return sBuilder.toString();
	}
}
