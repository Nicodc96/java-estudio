import java.util.Scanner;

public class CicloFor_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroACalcular;
        double calculo;

        System.out.print("Ingrese el número a calcular su factorial: ");

        // Si se ingresa un valor no casteable a Double lanzará una excepción
        numeroACalcular = scanner.nextDouble();
        calculo = factorial(numeroACalcular);

        if (calculo == -1){
            System.out.println("\nNo es posible calcular el factorial de un número negativo.");
        } else{
            System.out.printf("Factorial de %.0f: %.0f", numeroACalcular, calculo);
        }
    }

    public static double factorial(double value){
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
