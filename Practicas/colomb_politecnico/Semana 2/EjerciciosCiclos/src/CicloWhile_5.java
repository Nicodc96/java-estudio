import java.util.Arrays;

public class CicloWhile_5 {
    public static void main(String[] args) {
        /*
            Ejercico de mi autoría: Desarrollar un programa que determine si existe un
            tipo específico de caracter o array de caracteres
            dentro de un texto utilizando WHILE.
         */
        char[] caracteresABuscar = {'f','g','a','o'};
        String textoAComprobar = "Porta fames dis aenean platea neque semper? " +
                "Conubia eleifend commodo maecenas risus risus pellentesque. " +
                "Eros iaculis duis posuere integer purus euismod consequat. " +
                "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. " +
                "Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. " +
                "Platea non proin aliquet scelerisque nam maecenas elit cum.";
        int[] cantidadCaracteres = contarCaracteres(caracteresABuscar, textoAComprobar);

        System.out.println("En el texto a comprobar existe(n):");
        for (int i = 0; i < cantidadCaracteres.length; i++){
            System.out.printf("- Un total de %d %c(s).\n", cantidadCaracteres[i], caracteresABuscar[i]);
        }
    }

    public static int[] contarCaracteres(char[] arrayCaracteres, String texto) {
        int[] arrayRespuesta = new int[arrayCaracteres.length];
        int i = 0, j = 0;
        while (i < texto.length()) {
            while (j < arrayRespuesta.length) {
                if (arrayCaracteres[j] == texto.charAt(i)) {
                    arrayRespuesta[j]++;
                }
                j++;
            }
            i++; j = 0;
        }
        return arrayRespuesta;
    }
}
