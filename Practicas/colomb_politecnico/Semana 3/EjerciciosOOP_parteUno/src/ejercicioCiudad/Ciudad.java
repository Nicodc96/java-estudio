package ejercicioCiudad;

public class Ciudad {
	private String nombre;
	private Integer poblacion;
	private String pais;
	private String presidente;
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean setNombre(String nombre) {
		if (nombre.length() > 0) {
			this.nombre = nombre;
			return true;
		}
		return false;
	}
	
	public Integer getPoblacion() {
		return poblacion;
	}
	
	public boolean setPoblacion(Integer poblacion) {
		if (poblacion >= 0) {
			this.poblacion = poblacion;
			return true;
		}
		return false;
	}
	public String getPais() {
		return pais;
	}
	
	public boolean setPais(String pais) {
		if (pais.length() > 0) {
			this.pais = pais;
			return true;
		}
		return false;
	}
	
	public String getPresidente() {
		return presidente;
	}
	
	public boolean setPresidente(String presidente) {
		if (presidente.length() > 0) {
			this.presidente = presidente;
			return true;
		}
		return false;
	}
	
	public Ciudad(String nombre, Integer poblacion, String pais, String presidente) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.pais = pais;
		this.presidente = presidente;
	}
	
	public Ciudad() {}
}
