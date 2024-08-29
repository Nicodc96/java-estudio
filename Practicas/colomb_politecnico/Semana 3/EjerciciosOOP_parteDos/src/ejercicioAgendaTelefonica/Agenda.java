package ejercicioAgendaTelefonica;

public class Agenda {
	private Contacto[] contactos;
	private final static int MAX_CONTACTOS = 10;
	
	public Agenda() {
		this.contactos = new Contacto[MAX_CONTACTOS];
	}
	
	private int verificarEspacioDisponible() {
		int indiceDisponible = -1;
		for (int i = 0; i < MAX_CONTACTOS; i++) {
			if (this.contactos[i] == null) {
				indiceDisponible = i;
				break;
			}
		}
		return indiceDisponible;
	}
	
	private int contactosRegistrados() {
		int contactos = 0;		
		for (int i = 0; i < MAX_CONTACTOS; i++) {
			if (this.contactos[i] != null) {
				contactos++;
			}
		}
		return contactos;
	}
	
	public boolean registrarContacto(Contacto contacto) {
		int indice = this.verificarEspacioDisponible();
		
		if (indice == -1) return false;
		
		this.contactos[indice] = contacto;
		return true;
	}
	
	public String listarContactos() {
		StringBuilder sB = new StringBuilder();
		
		sB.append("La agenda posee ").append(this.contactosRegistrados()).append(" contactos.\n");
		for (int i = 0; i < MAX_CONTACTOS; i++) {
			if (this.contactos[i] != null) {
				sB.append("Contacto ").append(i+1).append(":\n");
				sB.append("- Nombre: ").append(this.contactos[i].getNombre());
				sB.append("\n- Número: ").append(this.contactos[i].getNumero()).append("\n");
			}
		}				
		return sB.toString();
	}
	
	public int disponibles() {
		int disponibles = 0;		
		for (int i = 0; i < MAX_CONTACTOS; i++) {
			if (this.contactos[i] == null) {
				disponibles++;
			}
		}
		return disponibles;
	}
	
	public Integer buscarContacto(String nombreContacto) {
		Integer numeroContacto = -1;
		
		for (int i = 0; i < MAX_CONTACTOS; i++) {
			if (this.contactos[i] != null && this.contactos[i].getNombre().equals(nombreContacto)) {
				numeroContacto = this.contactos[i].getNumero();
			}
		}
		return numeroContacto;
	}
}
