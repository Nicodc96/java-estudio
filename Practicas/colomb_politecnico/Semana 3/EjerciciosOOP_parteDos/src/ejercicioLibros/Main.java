package ejercicioLibros;

public class Main {
	public static void main(String[] args) {
		Libro cienAniosDeSoledad = new Libro("Gabriel García Márquez", "Cien años de Soledad", 471);
		Libro colmilloBlanco = new Libro("Jack London", "Colmillo blanco");
		
		// Antes de la siguiente linea, el libro pudo instanciarse con páginas = 0
		colmilloBlanco.setPaginas(272);
		
		System.out.println(cienAniosDeSoledad.mostrarLibro());
		System.out.println(colmilloBlanco.mostrarLibro());
		
		System.out.println("El título con más páginas es: " + Libro.compararLibros(cienAniosDeSoledad, colmilloBlanco));
	}
	
	
}
