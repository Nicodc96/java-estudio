package switchCase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scannerMain = new Scanner(System.in);
		Boolean continuar = true;
		double num1 = 0;
		double num2 = 0;
		do {
			switch(simpleMenu(num1, num2, scannerMain)) {
				case 'a':
					System.out.print("Ingrese el nuevo valor para el primer número: ");
					try {
						num1 = scannerMain.nextDouble();
						System.out.println("El primer número ahora es: "+num1);
					} catch (InputMismatchException e) {
						System.out.println("¡Valor inválido! El primer número ahora es 0.");
						num1 = 0;
					}
					break;
				case 'b':
					System.out.print("Ingrese el nuevo valor para el segundo número: ");
					try {
						num2 = scannerMain.nextDouble();
						System.out.println("El segundo número ahora es: "+num2);
					} catch (InputMismatchException e) {
						System.out.println("¡Valor inválido! El segundo número ahora es 0.");
						num2 = 0;
					}
					break;
				case '1':
					System.out.printf("La suma de %.2f y %.2f es: %.2f\n", num1, num2, num1+num2);
					break;
				case '2':
					System.out.printf("La resta entre %.2f y %.2f es: %.2f\n", num1, num2, num1-num2);
					break;
				case '3':
					System.out.printf("La multiplicacion entre %.2f y %.2f es: %.2f\n", num1, num2, num1*num2);
					break;
				case '4':
					if (num2 == 0) {
						System.out.println("No es posible dividir por zero.");
					} else {
						double resultado = num1/num2;
						System.out.printf("La división entre %.2f y %.2f es: %.2f (redondeado)\n", num1, num2, resultado);
					}					
					break;
				case '5':
					System.out.printf("El factorial de %.2f es: %.2f\n", num1, factorial(num1));
					System.out.printf("El factorial de %.2f es: %.2f\n", num2, factorial(num2));
					break;
				case '6':
					System.out.printf("La raiz cuadrada de %.2f es: %.6f\n", num1, Math.sqrt(num1));
					System.out.printf("La raiz cuadrada de %.2f es: %.6f\n", num2, Math.sqrt(num2));
					break;
				case '7':
					System.out.printf("El logaritmo natural de %.2f es: %.6f\n", num1, Math.log(num1));
					System.out.printf("El logaritmo natural de %.2f es: %.6f\n", num2, Math.log(num2));
					break;
				case '8':
					int opcion;
					System.out.println("Invertir signos de:");
					System.out.println("1) Primer número");
					System.out.println("2) Segundo número");
					System.out.println("3) Ambos números");
					System.out.println("4) Cancelar\n");
					System.out.print("Elija una opción: ");
					try {
						opcion = scannerMain.nextInt();
					} catch(InputMismatchException ex) {
						opcion = 4;
					}
					switch (opcion) {
						case 1:
							System.out.printf("El número %.2f ahora es %.2f\n", num1, num1*-1);
							num1 = num1*-1;
							break;
						case 2:
							System.out.printf("El número %.2f ahora es %.2f\n", num2, num2*-1);
							num2 = num2*-1;
							break;
						case 3:
							System.out.printf("El número %.2f ahora es %.2f\n", num1, num1*-1);
							System.out.printf("El número %.2f ahora es %.2f\n", num2, num2*-1);
							num1 = num1*-1;
							num2 = num2*-1;
							break;
						default:
							break;
					}
					break;
				case '9':
					System.out.println("Saliendo...");
					continuar = false;
					break;
				default:
					break;
			}
			pressEnterToContinue(scannerMain);
			System.out.println("\n\n\n\n\n\n");
		} while (continuar);
		scannerMain.close();
	}
	
	public static char simpleMenu(double num1, double num2, Scanner scanner) {
		StringBuilder sB = new StringBuilder();
		char opcion;
		
		sB.append("\n - Calculadora simple - \n");
		sB.append("---- Primer número almacenado: " + num1 + "\n");
		sB.append("---- Segundo número almacenado: " + num2 + "\n");
		sB.append("a) Ingresar número 1\n");
		sB.append("b) Ingresar número 2\n");
		sB.append("1) Sumar\n");
		sB.append("2) Restar\n");
		sB.append("3) Multiplicar\n");
		sB.append("4) Dividir\n");
		sB.append("5) Factorial\n");
		sB.append("6) Raiz cuadrada\n");
		sB.append("7) Logaritmo natural\n");
		sB.append("8) Invertir signos\n");
		sB.append("9) Salir\n\n");
		sB.append("Elija una opcion: ");
		System.out.print(sB.toString());
		opcion = scanner.next().charAt(0);
		
		return opcion;
	}
	// Método para simular el "Press Enter to continue..." utilizando scanner
	 private static void pressEnterToContinue(Scanner scanner){ 
	        System.out.println("Pulsa Enter para continuar...");
	        try{
	            System.in.read();
	            scanner.nextLine();
	        }  
	        catch(Exception e){}
	 }
	 
	 private static double factorial(double value){
	        // Si se intenta calcular el factorial de un negativo, devolverá -1
	        if (value < 0) return -1;
	        // Si decide calcular el factorial de 1 o 0, retornará 1
	        double factorial = 1;
	        for (int i = 2; i <= value; i++){
	            factorial *= i;
	        }
	        return factorial;
	    }
}
