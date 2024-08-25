package Matrices;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[][] matrizPropuesta = new int[5][3];
		int numeroAleatorio;
		
		// Carga de valores a la matriz
		for (int i = 0; i < matrizPropuesta.length; i++) {
			for (int j = 0; j < matrizPropuesta[i].length; j++) {
				numeroAleatorio = (int) Math.round(Math.random()*50);
				matrizPropuesta[i][j] = numeroAleatorio;
			}
		}
		
		System.out.println(imprimirMatriz(matrizPropuesta, "Matriz original"));
		System.out.println(maxValueMatrix(matrizPropuesta));
	}
	
	
	public static String maxValueMatrix(int[][] matrix) {
		StringBuilder sB = new StringBuilder();
		int maxNumber = 0;
		
		sB.append("El máximo valor de la matriz es: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				maxNumber = Math.max(maxNumber, matrix[i][j]);
			}
		}
		sB.append(maxNumber);
		
		return sB.toString();
	}
	
	public static String imprimirMatriz(int[][] matriz, String titulo) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("- " + titulo + " -\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// Este ternario es para mostrar sin el "-" si es el último numero de la matriz
				stringBuilder.append(j == matriz[i].length - 1 
						? matriz[i][j] 
						: matriz[i][j] + " - ");
			}
			stringBuilder.append("\n");
		}
		
		return stringBuilder.toString();
	}
}
