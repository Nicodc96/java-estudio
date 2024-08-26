package ejerciciosIf_complejas;

public class Ejercicio4 {
	public static void main(String[] args) {
		int totalPreguntas = 25;
		int correctas = (int) Math.round(Math.random()*25);
		
		System.out.printf("Se ha respondido %d preguntas de un total de %d: %s"
				, correctas, totalPreguntas
				, informarNivel(totalPreguntas, correctas));
	}
	
	private static String informarNivel(int cantidadTotal, int cantidadCorrectas) {
		StringBuilder mensajeBuilder = new StringBuilder();
		double porcentaje = ((double)cantidadCorrectas / (double)cantidadTotal) * 100;
		if (porcentaje < 90) {
			if (porcentaje < 50) {
				mensajeBuilder.append("Fuera de nivel.");
			} else if (porcentaje > 50 && porcentaje < 75) {
				mensajeBuilder.append("Nivel regular.");
			} else {
				mensajeBuilder.append("Nivel medio.");
			}
		} else {
			mensajeBuilder.append("Nivel máximo.");
		}
		
		return mensajeBuilder.toString();
	}
}
