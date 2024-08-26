package ejerciciosIfSimples;

public class Ejercicio4 {
	public static void main(String[] args) {
		int numeroRandomUno = (int) Math.round(Math.random()*1000);
		int numeroRandomDos = (int) Math.round(Math.random()*100);
		
		System.out.printf(numeroRandomUno % numeroRandomDos == 0 
				? "El numero %d es múltiplo de %d."
				: "El número %d NO es múltiplo de %d.", numeroRandomUno, numeroRandomDos);
	}
}
