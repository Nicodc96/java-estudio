import java.util.Arrays;
import java.util.Iterator;

public class CicloWhile_3 {
    public static void main(String[] args) {
        String textoAPrueba = "Porta fames dis aenean platea neque semper? " +
                "Conubia eleifend commodo maecenas risus risus pellentesque. " +
                "Eros iaculis duis posuere integer purus euismod consequat. " +
                "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. " +
                "Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. " +
                "Platea non proin aliquet scelerisque nam maecenas elit cum.";

        System.out.printf("El texto a prueba tiene un total de %d vocales.\n", contarVocales(textoAPrueba));
    }

    public static int contarVocales(String texto){
        int i = 0,j = 0;
        int cantidadVocales = 0;
        char[] vocales = {'a','e','i','o','u'};
        while (i < texto.length()){
            while(j < vocales.length){
                if (texto.toLowerCase().charAt(i) == vocales[j]){
                    cantidadVocales++;
                }
                j++;
            }
            i++; j = 0;
        }
        return cantidadVocales;
    }
}
