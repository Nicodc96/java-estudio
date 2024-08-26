package ejerciciosIf_complejas;


public class Ejercicio3 {
	public static void main(String[] args) {
		int numeroUno = (int) Math.round(Math.random()*500);
		int numeroDos = (int) Math.round(Math.random()*500);
		int numeroTres = (int) Math.round(Math.random()*500);
		
		System.out.printf("Entre %d, %d y %d, el mayor es: %d"
				, numeroUno, numeroDos, numeroTres, 
				verificarMayor(numeroUno, numeroDos, numeroTres));
	}
	
	private static int verificarMayor(int numUno, int numDos, int numTres) {
		return Math.max(numUno, Math.max(numDos, numTres));
	}
}
