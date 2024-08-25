package Matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] primeraMatriz = new int[5][5];
		int[][] segundaMatriz = new int[5][5];
		int[][] terceraMatriz = new int[5][5];
		
		cargaDeValores(primeraMatriz, "sumaPares");
		cargaDeValores(segundaMatriz, "sumaImpares");
		cargaDeValores(primeraMatriz, segundaMatriz, terceraMatriz);
		
		System.out.println(imprimirMatriz(primeraMatriz, "Primera Matriz"));
		System.out.println(imprimirMatriz(segundaMatriz, "Segunda Matriz"));
		System.out.println(imprimirMatriz(terceraMatriz, "Suma de la primera y segunda matriz"));
	}
	
	public static void cargaDeValores(int[][] matriz, String tipoOperacion) {
		// Inicializo este valor en 0 por el compilador
		int numeroAleatorio = 0;
		
		/*
		 * Primero recorro las filas de la matriz (i) y luego las columnas (j),
		 * luego determino mediante un swtich que tipo de operacion se debe hacer
		 * (opcional, se pudo haber hecho con un booleano).
		 */
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				switch(tipoOperacion) {
					case "sumaPares":
						numeroAleatorio = (int) Math.round(Math.random()*100);
						// Si el número generado es impar, se debe volver a generar
						while (numeroAleatorio % 2 != 0) {
							numeroAleatorio = (int) Math.round(Math.random()*100);
						}
						break;
					case "sumaImpares":
						numeroAleatorio = (int) Math.round(Math.random()*50);
						// Si el número generado es par, se debe volver a generar
						while (numeroAleatorio % 2 == 0) {
							numeroAleatorio = (int) Math.round(Math.random()*50);
						}
						break;
				}
				matriz[i][j] = numeroAleatorio;
			}
		}
		
	}
	
	// Sobrecarga del otro método para reciclar el nombre y hacer una operación totalmente distinta
	public static void cargaDeValores(int[][] primeraMatriz, int[][] segundaMatriz, int[][] matrizResultado) {
		for (int i = 0; i < primeraMatriz.length; i++) {
			for (int j = 0; j < primeraMatriz[i].length; j++) {
				matrizResultado[i][j] = primeraMatriz[i][j] + segundaMatriz[i][j];
			}
		}
	}
	
	public static String imprimirMatriz(int[][] matriz, String titulo) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("- " + titulo + " -\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// Este ternario es para mostrar sin el "-" si es el último numero de la fila
				stringBuilder.append(j == matriz[i].length - 1 
						? matriz[i][j] 
						: matriz[i][j] + " - ");
			}
			stringBuilder.append("\n");
		}
		
		return stringBuilder.toString();
	}
}
