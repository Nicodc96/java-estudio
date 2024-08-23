import java.util.Scanner;

public class CicloWhile_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textoIngresado;
        System.out.print("Ingrese un texto a invertir: ");
        textoIngresado = scanner.next();
        System.out.println("Texto ingresado: " + textoIngresado);
        System.out.println("Texto invertido: " + invertirPalabra(textoIngresado));
    }

    public static String invertirPalabra(String texto){
        StringBuilder textoInvertido = new StringBuilder();
        int i = 0;
        int j = texto.length() - 1;
        while (textoInvertido.length() != texto.length()){
            textoInvertido.insert(i, texto.charAt(j));
            i++; j--;
        }
        return textoInvertido.toString();
    }
}
