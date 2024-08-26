package vectores;

public class Ejercicio3 {
	public static void main(String[] args) {
		String textoEjemplo = "Hola mundo!";
		
		char[] textoComoCadena = explode(textoEjemplo);
		
		System.out.println("Texto ejemplo: " + textoEjemplo);
		System.out.println("Texto en cadena: ");
		
		for (int i = 0; i < textoComoCadena.length; i++) {
			System.out.print(textoComoCadena[i] + " ");
		}
	}
	
	private static char[] explode(String texto) {
		char[] cadena = new char[texto.length()];
		
		for (int i = 0; i < texto.length(); i++) {
			cadena[i] = texto.charAt(i);
		}
		
		return cadena;
	}
}
