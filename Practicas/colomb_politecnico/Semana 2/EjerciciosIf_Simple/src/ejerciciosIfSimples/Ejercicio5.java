package ejerciciosIfSimples;

public class Ejercicio5 {
	public static void main(String[] args) {
		int notaRandom = (int) Math.round(Math.random()*10);
		
		if (notaRandom <= 6) {
			System.out.println("Perdió.");
		} else {
			System.out.println("Aprobó!");
		}
	}
}
