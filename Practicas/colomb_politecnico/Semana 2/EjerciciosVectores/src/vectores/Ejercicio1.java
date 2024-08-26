package vectores;

public class Ejercicio1 {
	public static void main(String[] args) {
		float[] pesoDePersonas = new float[5];
		
		cargaDeValores(pesoDePersonas);
		
		System.out.println("Array de pesos:");
		System.out.println(imprimirVector(pesoDePersonas));
		
		float promedioDePesos = 0f;
		float sumaDePesos = 0f;
		
		for (int i = 0; i < pesoDePersonas.length; i++) {
			sumaDePesos += pesoDePersonas[i];
		}
		
		promedioDePesos = sumaDePesos / pesoDePersonas.length;
		
		System.out.println("Promedio de pesos: " + promedioDePesos);
		
		int contadorPesosMayorAlPromedio = 0;
		int contadorPesosMenorAlPromedio = 0;
		
		for (int i = 0; i < pesoDePersonas.length; i++) {
			if (pesoDePersonas[i] > promedioDePesos) contadorPesosMayorAlPromedio++;
			if (pesoDePersonas[i] < promedioDePesos) contadorPesosMenorAlPromedio++;
		}
		
		System.out.println("Cantidad de personas que superan el promedio: " + contadorPesosMayorAlPromedio);
		System.out.println("Cantidad de personas que están por debajo del promedio: " + contadorPesosMenorAlPromedio);
	}

	public static void cargaDeValores(float[] arrayFloat) {
		for (int i = 0; i < arrayFloat.length; i++) {
			arrayFloat[i] = (float) Math.random()*100;
		}
	}
	
	public static String imprimirVector(float[] arrayFloat) {
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i = 0; i < arrayFloat.length; i++) {
			sBuilder.append(i == arrayFloat.length-1 ? arrayFloat[i] + "kg" : arrayFloat[i] + "kg - ");
		}
		
		return sBuilder.toString();
	}
}
