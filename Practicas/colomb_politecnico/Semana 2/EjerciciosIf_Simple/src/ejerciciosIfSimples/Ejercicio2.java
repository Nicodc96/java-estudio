package ejerciciosIfSimples;

public class Ejercicio2 {
	public static void main(String[] args) {
		int numeroRandomUno = (int) Math.round(Math.random()*10);
		int numeroRandomDos = (int) Math.round(Math.random()*10);
		
		System.out.println("Numero random 1: " + numeroRandomUno);
		System.out.println("Numero random 2: " + numeroRandomDos);
		
		System.out.println(numeroRandomUno > numeroRandomDos
				? "El numero 1 es mayor."
				: "El numero 2 es mayor.");
		
		if (numeroRandomUno > numeroRandomDos) {
			System.out.printf("El resultado de %d elevado a %d es: %.0f (redondeado)"
					, numeroRandomUno, numeroRandomDos, Math.pow(numeroRandomUno, numeroRandomDos));
		} else {
			System.out.printf("El resultado de %d elevado a %d es: %.0f (redondeado)"
					, numeroRandomDos, numeroRandomUno, Math.pow(numeroRandomDos, numeroRandomUno));
		}
	}

	
}
