package ejercicioSeguridad;

public class Main {
	public static void main(String[] args) {
		Password contraseñaUno = new Password(20);
		Password contraseñaDos = new Password();
		
		if (contraseñaUno.generar()) {
			System.out.println("Contraseña generada!");
		}
		if (contraseñaDos.generar()) {
			System.out.println("Contraseña generada!");
		}
		
		System.out.println("Contraseña uno: " + contraseñaUno.getPassword());
		System.out.println("Contraseña dos: " + contraseñaDos.getPassword());
		
		System.out.println(contraseñaUno.validar());
		System.out.println(contraseñaDos.validar());		
	}
}
