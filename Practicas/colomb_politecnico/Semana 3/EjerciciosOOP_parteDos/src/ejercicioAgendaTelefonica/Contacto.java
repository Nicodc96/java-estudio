package ejercicioAgendaTelefonica;

public class Contacto {
	private String nombre;
	private Integer numero;
		
	public String getNombre() {
		return nombre;
	}
	
	public boolean setNombre(String nombre) {
		if (nombre.length() > 0 && !nombre.equals(null)) {
			this.nombre = nombre;
			return true;
		} else return false;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public boolean setNumero(Integer numero) {
		if (numero >= 8 && numero < 11) {
			this.numero = numero;
			return true;
		} else return false;
	}
	
	public Contacto(String nombre, Integer numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
}
