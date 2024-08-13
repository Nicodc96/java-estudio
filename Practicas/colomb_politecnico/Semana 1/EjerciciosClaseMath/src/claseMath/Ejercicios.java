package claseMath;

public class Ejercicios {
	public static void main(String[] args) {
		System.out.println("Ejercicio 1 (Base 5, exponente 3): " + Ejercicio1(5, 3));
		System.out.println(Ejercicio2());
		Ejercicio3();
		Ejercicio4();
	}
	
	private static double Ejercicio1(double base, double exponente) {
		return Math.pow(base, exponente);
	}

	private static String Ejercicio2() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("- Raíces cuadradas | Ejercicio 2 | -");
		stringBuilder.append("\n\n- Raíz cuadrada de 2: ").append(Math.sqrt(2));
		stringBuilder.append("\n- Raíz cuadrada de 8: ").append(Math.sqrt(8));
		stringBuilder.append("\n- Raíz cuadrada de 9: ").append(Math.sqrt(9));
		stringBuilder.append("\n- Raíz cuadrada de 27: ").append(Math.sqrt(27));
		stringBuilder.append("\n- Raíz cuadrada de 28: ").append(Math.sqrt(28));
		stringBuilder.append("\n- Raíz cuadrada de 55: ").append(Math.sqrt(55));
		stringBuilder.append("\n- Raíz cuadrada de 121: ").append(Math.sqrt(121)).append("\n\n");
		
		return stringBuilder.toString();
	}
	
	private static void Ejercicio3() {
		double nota1 = Math.floor(Math.random()*10);
		double nota2 = Math.floor(Math.random()*10);
		double nota3 = Math.floor(Math.random()*10);
		double nota4 = Math.floor(Math.random()*10);
		double nota5 = Math.floor(Math.random()*10);
		
		double promedioNotas = (nota1+nota2+nota3+nota4+nota5) / 5;
		
		System.out.println("- Promedio de 5 notas random() | Ejercicio 3 | -\n");
		System.out.println("- Notas -");
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota 3: " + nota3);
		System.out.println("Nota 4: " + nota4);
		System.out.println("Nota 5: " + nota5);
		System.out.println("Promedio: " + promedioNotas + "\n");
	}
	
	private static void Ejercicio4() {
		double decimalRandom1 = 1 + Math.floor(Math.random()*50);
		double decimalRandom2 = 1 + Math.floor(Math.random()*50);
		
		System.out.println("- Ejercicio 4 - \n");
		System.out.println("Numero random 1: " + decimalRandom1);
		System.out.println("Numero random 2: " + decimalRandom2);
		System.out.println("Numero mayor: " + Math.max(decimalRandom1, decimalRandom2));
	}
}
