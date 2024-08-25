package Matrices;

public class Ejercicio3 {
	public static void main(String[] args) {
		int[][] matrizPropuesta = new int[3][4];
		int numeroAleatorio;
		
		// Carga de valores a la matriz
		for (int i = 0; i < matrizPropuesta.length; i++) {
			for (int j = 0; j < matrizPropuesta[i].length; j++) {
				numeroAleatorio = (int) Math.round(Math.random()*200);
				matrizPropuesta[i][j] = numeroAleatorio;
			}
		}
		
		System.out.println(imprimirMatriz(matrizPropuesta, "Matriz original"));
		
		// Solo primera fila
		System.out.println(imprimirMatrizDeterminado(matrizPropuesta, 0, -1));
		// Solo segunda columna
		System.out.println(imprimirMatrizDeterminado(matrizPropuesta, -1, 1));
		// Solo tercera fila
		System.out.println(imprimirMatrizDeterminado(matrizPropuesta, 2, -1));
	}
	
	public static String imprimirMatrizDeterminado(int[][] matriz, int filaDeterminada, int columnaDeterminada) {
		StringBuilder stringBuilder = new StringBuilder();
		
		if (filaDeterminada >= 0 && columnaDeterminada < 0) {
			stringBuilder.append("Matriz 3*4 (Fila "+ (filaDeterminada + 1) + "):\n");
			for (int j = 0; j < matriz[filaDeterminada].length; j++) {
				// Este ternario es para mostrar sin el "-" si es el último numero de la fila
				stringBuilder.append(j == matriz[filaDeterminada].length - 1 
						? matriz[filaDeterminada][j] 
						: matriz[filaDeterminada][j] + " - ");
			}
		}
		if (filaDeterminada < 0 && columnaDeterminada >= 0) {
			stringBuilder.append("Matriz 3*4 (Columna "+ (columnaDeterminada + 1) + "):\n");
			for (int i = 0; i < matriz.length; i++) {
				stringBuilder.append(matriz[i][columnaDeterminada] + "\n");
			}
		}
		stringBuilder.append("\n");
		
		return stringBuilder.toString();
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
