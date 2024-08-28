package ejercicioCasaInstance;

public class Casa {
	private String ciudad;
	private String barrio;
	private String color;
	private Integer pisos;
	private Integer habitaciones;
	private Integer baños;
	private Integer cocinas;
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public String getBarrio() {
		return this.barrio;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public Integer getPisos() {
		return this.pisos;
	}
	
	public Integer getHabitaciones() {
		return this.habitaciones;
	}
	
	public Integer getBanios() {
		return this.baños;
	}
	
	public Integer getCocinas() {
		return this.cocinas;
	}
	
	public Casa() {}
	
	public Casa(String ciudad, String barrio, String color) {
		this();
		this.ciudad = ciudad;
		this.barrio = barrio;
		this.color = color;
	}
	
	public Casa(String barrio, String color, Integer pisos) {
		this();
		this.barrio = barrio;
		this.color = color;
		this.pisos = pisos;
	}
	
	public Casa(Integer pisos, Integer habitaciones, Integer banios, Integer cocinas) {
		this();
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.baños = banios;
		this.cocinas = cocinas;
	}
	
	public String imprimirCasa() {
		StringBuilder sB = new StringBuilder();
		
		sB.append("La casa que verá a continuación se encuentra en ");
		sB.append(this.getCiudad());
		sB.append(", en el barrio de ");
		sB.append(this.getBarrio());
		sB.append(". Cuenta con ");
		sB.append(this.getHabitaciones());
		sB.append(" habitacion(es), ");
		sB.append(this.getBanios() + " baños(s) y ");
		sB.append(this.getCocinas() + " cocina(s).");
		sB.append(" Finalmente, la casa posee ");
		sB.append(this.getPisos() + " piso(s).");
		
		return sB.toString();
	}
}
