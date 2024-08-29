package ejercicioLibros;

public class Libro {
	private String autor;
	private String titulo;
	private Integer paginas;
	
	
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public Integer getPaginas() {
		return paginas;
	}
	
	public boolean setPaginas(Integer paginas) {
		if (paginas > 0) {
			this.paginas = paginas;
			return true;
		} else return false;
	}	
	
	public Libro(String autor, String titulo, Integer paginas) {
		this.autor = autor;
		this.titulo = titulo;
		this.paginas = paginas;
	}
	
	public Libro(String autor, String titulo) {
		this(autor, titulo, 0);
	}
	
	public static String compararLibros(Libro libroUno, Libro libroDos) {
		return libroUno.getPaginas() > libroDos.getPaginas() ? 
				libroUno.getTitulo() : libroDos.getTitulo();
	}
	
	public String mostrarLibro() {
		StringBuilder sB = new StringBuilder();
		
		sB.append("El libro ").append(this.getTitulo());
		sB.append(", del autor ").append(this.getAutor());
		sB.append(", tiene ").append(this.getPaginas()).append(" páginas.");

		return sB.toString();
	}
}
