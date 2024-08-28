package ejercicioCasaStatic;

public class Main {
	public static void main(String[] args) {
		System.out.printf("La casa que verá a continuación se encuentra en %s, en el barrio %s."
				+ " Cuenta con %d habitaciones/ambientes, %d baño(s) y %d cocina(s). "
				+ "Finalmente, tiene %d piso(s)."
				, Casa.getCiudad(), Casa.getBarrio(), Casa.getHabitaciones()
				, Casa.getBanios(), Casa.getCocinas(), Casa.getPisos());
	}
}
