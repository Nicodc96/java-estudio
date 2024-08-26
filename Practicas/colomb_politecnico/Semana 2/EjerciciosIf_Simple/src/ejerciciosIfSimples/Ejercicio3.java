package ejerciciosIfSimples;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numeroRandom = (int) Math.round(Math.random()*100);
		int cambiarSigno = (int) Math.round(Math.random()*10);
		
		// Uso la variable para determinar si se pone el número negativo
		// si cambiarSigno es impar
		if (cambiarSigno % 2 == 1) {
			numeroRandom *= -1;
		}
		
		System.out.println(numeroRandom > 0 
				? "El número random es positivo." 
				: "El número random es negativo.");
	}	
}
