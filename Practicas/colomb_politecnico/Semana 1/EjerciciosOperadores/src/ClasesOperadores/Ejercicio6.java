package ClasesOperadores;

public class Ejercicio6 {
	public static void main(String[] args) {
		Integer ladoCuadrado = 8;
		
		Integer perimetroCuadrado = ladoCuadrado * 4;
		Integer areaCuadrado = ladoCuadrado * ladoCuadrado;
		
		Integer baseTriangulo = 9;
		Integer alturaTriangulo = 8;
		Integer ladoTrianguloUno = 8;
		Integer ladoTrianguloDos = 8;
		
		Integer perimetroTriangulo = baseTriangulo + ladoTrianguloUno + ladoTrianguloDos;
		Integer areaTriangulo = baseTriangulo * alturaTriangulo / 2;
		
		Integer baseRectangulo = 8;
		Integer alturaRectangulo = 6;
		
		Integer perimetroRectangulo = baseRectangulo * 2 + alturaRectangulo * 2;
		Integer areaRectangulo = baseRectangulo * alturaRectangulo;
		
		System.out.println("Perimetro cuadrado: " + perimetroCuadrado);
		System.out.println("Area cuadrado: " + areaCuadrado);
		System.out.println("Perimetro Triangulo: " + perimetroTriangulo);
		System.out.println("Area Triangulo: " + areaTriangulo);
		System.out.println("Perimetro Rectangulo: " + perimetroRectangulo);
		System.out.println("Area Rectangulo: " + areaRectangulo);
	}
}
