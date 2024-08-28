package ejercicioCasaStatic;

public class Casa {
	private static final String ciudad = "Departamento Las Heras";
	private static final String barrio = "El challao";
	private static final String color = "Azul francia";
	private static final Integer pisos = 2;
	private static final Integer habitaciones = 4;
	private static final Integer baños = 2;
	private static final Integer cocinas = 1;
	
	public static String getCiudad() {
		return ciudad;
	}
	
	public static String getBarrio() {
		return barrio;
	}
	
	public static String getColor() {
		return color;
	}
	
	public static Integer getPisos() {
		return pisos;
	}
	
	public static Integer getHabitaciones() {
		return habitaciones;
	}
	
	public static Integer getBanios() {
		return baños;
	}
	
	public static Integer getCocinas() {
		return cocinas;
	}
}
