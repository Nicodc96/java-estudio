package ejercicioAgendaTelefonica;

public class Main {
	public static void main(String[] args) {
		// Instancio 4 contactos
		Contacto contactoUno = new Contacto("Juan", 1175849511);
		Contacto contactoDos = new Contacto("María", 1578492877);
		Contacto contactoTres = new Contacto("Julia", 1106589111);
		Contacto contactoCuatro = new Contacto("Claudio", 42674487);
		
		
		// Instancio una agenda
		Agenda agendaDeContactos = new Agenda();
		
		// Pregunto cuantos contactos tiene la agenda antes de agregar los contactos
		System.out.println(agendaDeContactos.listarContactos()
							+ "Hay " + agendaDeContactos.disponibles()
							+ " espacios disponibles.");
		
		// Agrego los contactos
		System.out.println(agendaDeContactos.registrarContacto(contactoUno) ?
				"¡Contacto registrado!" : "La agenda se encuentra llena.");
		System.out.println(agendaDeContactos.registrarContacto(contactoDos) ?
				"¡Contacto registrado!" : "La agenda se encuentra llena.");
		System.out.println(agendaDeContactos.registrarContacto(contactoTres) ?
				"¡Contacto registrado!" : "La agenda se encuentra llena.");
		System.out.println(agendaDeContactos.registrarContacto(contactoCuatro) ?
				"¡Contacto registrado!" : "La agenda se encuentra llena.");
		
		// Vuelvo a preguntar su disponibilidad y listar la agenda
		System.out.println(agendaDeContactos.listarContactos()
				+ "Hay " + agendaDeContactos.disponibles()
				+ " espacios disponibles.");
		
		// Busco el contacto 'Claudio' en la agenda
		System.out.println(agendaDeContactos.buscarContacto("Claudio") == -1 ?
				"Contacto no encontrado en la agenda." : "El numero es: " + agendaDeContactos.buscarContacto("Claudio"));
		
		// Busco el contacto 'Enrique' en la agenda
		System.out.println(agendaDeContactos.buscarContacto("Enrique") == -1 ?
				"Contacto no encontrado en la agenda." : "El numero es: " + agendaDeContactos.buscarContacto("Enrique"));
	}
}
