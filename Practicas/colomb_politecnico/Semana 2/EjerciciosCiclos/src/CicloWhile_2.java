import java.text.Normalizer;
import java.lang.Object;
import java.util.Scanner;

public class CicloWhile_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textoIngresado;
        System.out.print("Ingrese un texto a verificar si es palíndromo: ");
        textoIngresado = scanner.next();
        System.out.println(esPalindroma(textoIngresado) ? "Es palíndromo.":"No es palíndromo.");
    }

    public static boolean esPalindroma(String texto){
        StringBuilder textoAComparar = new StringBuilder();

        /*
            Agrego el texto a comparar sin espacios y en minisculas, esto
            es así porque los palindromos se evalúan sin tener en cuenta
            estos dos primeros aspectos.

            Además, tengo en cuenta que 'A' != 'a', y no es posible usar
            equals() con primitivos (es un método de objetos).
        */
        textoAComparar.append(texto.replaceAll("\\W", "").toLowerCase());

        int i = 0;
        int j = textoAComparar.length() - 1;

        while (i < textoAComparar.length()){
            if (textoAComparar.charAt(i) != textoAComparar.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
