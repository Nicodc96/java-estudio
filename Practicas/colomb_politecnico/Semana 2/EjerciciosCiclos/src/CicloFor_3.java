import java.util.Scanner;

public class CicloFor_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;
        System.out.print("Ingrese un número para indicar si es perfecto: ");
        // Si se ingresa un valor no número lanzará una excepción
        numeroIngresado = scanner.nextInt();

        System.out.printf(esPerfecto(numeroIngresado) ? "%d es perfecto." : "%d no es perfecto.", numeroIngresado);
    }

    public static boolean esPerfecto(int num){
        int acu = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                acu += i;
            }
        }
        return acu == num;
    }
}
