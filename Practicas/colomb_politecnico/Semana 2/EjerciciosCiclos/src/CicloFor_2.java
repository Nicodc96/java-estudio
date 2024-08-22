import java.util.Scanner;

public class CicloFor_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número para indicar sus divisores: ");
        // Con valores no numéricos lanzará una excepción
        num = scanner.nextInt();
        System.out.print("Divisores: " + mostrarDivisores(num));
    }

    public static String mostrarDivisores(int num){
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                resultado.append(i == num ? i : i + "-");
            }
        }
        return resultado.toString();
    }
}
