package ejerciciosIfSimples;

public class Ejercicio1 {
	public static void main(String[] args) {
		int numeroRandom = (int) Math.round(Math.random()*101);
		
		System.out.println("Numero random: " + numeroRandom);
		System.out.println(numeroRandom > 50 
				? "El numero es mayor a 50." 
				: "El numero es menor a 50.");
	}

}
