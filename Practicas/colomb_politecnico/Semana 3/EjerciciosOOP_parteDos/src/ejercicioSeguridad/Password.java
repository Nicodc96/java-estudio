package ejercicioSeguridad;

public class Password {
	private Integer longitud;
	private String password;
	
	public Integer getLongitud() {
		return this.longitud;
	}
	
	public boolean setLongitud(Integer longitud) {
		if (longitud >= 10) {
			this.longitud = longitud;
			return true;
		} else return false;
	}
	
	public String getPassword() {
		return this.password == null ? "No se ha generado la contraseña." : this.password;
	}
	
	public Password() {
		this.longitud = 10;
	}
	
	public Password(Integer longitud) {
		this.longitud = longitud;
	}
	
	public boolean generar() {
		if (this.password != null) return false;
		String password = "";
		for (int i = 0; i < this.longitud ; i++) {
			int eleccion = (int) Math.round(Math.random()*3);
			
			switch(eleccion) {
				case 1:
					// Son 26 los caracteres en minusculas y comienzan como mínimo en el 97 (ASCII)
					// que es la suma que se le agregará al resultado del random y ese valor
					// será el casteado a char.
					char minusculas = (char) ((int)Math.round(Math.random()*26+96));
					password += minusculas;
					break;
				case 2:
					// Lo mismo que las minusculas pero comienzan en 65 (segun ASCII)
					char mayusculas = (char) ((int)Math.round(Math.random()*26+65));
					password += mayusculas;
					break;
				default:
					// Lo mismo pero son 10 los caracteres numéricos y empiezan en 48 (ASCII)
					char numeros = (char) ((int)Math.round(Math.random()*10+48));
					password += numeros;
					break;
			}
		}
		this.password = password;		
		return true;
	}
	
	public String validar() {
		int cantidadMinusculas = 0;
		int cantidadMayusculas = 0;
		int cantidadNumeros = 0;
		
		if (this.password == null) return "Contraseña no establecida.";
		
		for (int i = 0; i < this.password.length(); i++) {
			if (this.password.charAt(i) >= 48 && this.password.charAt(i) <= 57) {
				cantidadNumeros++;
			}
			if (this.password.charAt(i) >= 65 && this.password.charAt(i) <= 90) {
				cantidadMayusculas++;
			}
			if (this.password.charAt(i) >= 97 && this.password.charAt(i) <= 122) {
				cantidadMinusculas++;
			}
		}
		
		return (cantidadNumeros >= 5 && cantidadMinusculas >= 1 && cantidadMayusculas >= 2) ?
				"Contraseña segura." : "Contraseña no segura.";
	}
}
