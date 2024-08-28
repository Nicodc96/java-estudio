package ejercicioCasaInstance;

public class Main {
	public static void main(String[] args) {
		Casa casaUno = new Casa("Lanus", "Valentin Alsina", "Verde agua");
		Casa casaDos = new Casa("Villa caraza", "Bordó", 1);
		Casa casaTres = new Casa(1, 3, 2, 1);
		
		System.out.println("- Casa uno -");
		System.out.println(casaUno.imprimirCasa());
		System.out.println("- Casa dos -");
		System.out.println(casaDos.imprimirCasa());
		System.out.println("- Casa tres -");
		System.out.println(casaTres.imprimirCasa());
	}
}
