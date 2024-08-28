package ejercicioCiudad;

public class Main {
	public static void main(String[] args) {
		Ciudad ezeiza = new Ciudad();
		Ciudad bogota = new Ciudad();
		Ciudad montevideo = new Ciudad();
		
		ezeiza.setNombre("Ezeiza");
		bogota.setNombre("Bogotá");
		montevideo.setNombre("Montevideo");
		
		ezeiza.setPais("Argentina");
		bogota.setPais("Colombia");
		montevideo.setPais("Uruguay");
		
		ezeiza.setPoblacion(201511);
		bogota.setPoblacion(7181000);
		montevideo.setPoblacion(1381000);
		
		ezeiza.setPresidente("Javier Milei");
		bogota.setPresidente("Gustavo Petro");
		montevideo.setPresidente("Luis Lacalle Pou");
		
		System.out.printf("La primera ciudad es %s, perteneciente a %s. Su población es de %d ciudadanos. El presidente actual es %s.\n"
				, ezeiza.getNombre()
				, ezeiza.getPais()
				, ezeiza.getPoblacion()
				, ezeiza.getPresidente());
		System.out.printf("La segunda ciudad es %s, perteneciente a %s. Su población es de %d ciudadanos. El presidente actual es %s.\n"
				, bogota.getNombre()
				, bogota.getPais()
				, bogota.getPoblacion()
				, bogota.getPresidente());
		System.out.printf("La tercera ciudad es %s, perteneciente a %s. Su población es de %d ciudadanos. El presidente actual es %s.\n"
				, montevideo.getNombre()
				, montevideo.getPais()
				, montevideo.getPoblacion()
				, montevideo.getPresidente());
	}
}
