package ClasesOperadores;

public class Ejercicio3 {
	public static void main(String[] args) {
		Integer numeroUno = 8;
		Integer numeroDos = 2;
		Integer auxInteger = numeroUno;
		
		numeroUno = numeroDos;
		numeroDos = auxInteger;
		
		System.out.println("Valor numeroUno: " + numeroUno);
		System.out.println("Valor numeroDos: " + numeroDos);
		
	}
}
