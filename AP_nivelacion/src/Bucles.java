import java.util.ArrayList;

public class Bucles {
    /**
     * Pide dos números enteros, una condición que determina si salida son números pares o impares, y una condición
     * que determina si la salida es en orden A-B o B-A, devuelve una cadena de texto separando por una coma el
     * resultado.
     * @param numberA
     * @param numberB
     * @param conditionIP true par, false impar
     * @param conditionReverse true string invertido, false normal
     * @return Una cadena de texto con la respuesta solicitada.
     */
    public static String BuclesPrimero(int numberA, int numberB, boolean conditionIP, boolean conditionReverse){
        StringBuilder resultado = new StringBuilder();
        ArrayList<Integer> arrayResultado = new ArrayList<Integer>();
        if (conditionReverse){
            for (int i = numberB; i >= numberA; i--){
                if (conditionIP && i % 2 == 0){
                    arrayResultado.add(i);
                } else if (!conditionIP && i % 2 != 0){
                    arrayResultado.add(i);
                }
            }
        } else{
            for (int i = numberA; i <= numberB; i++){
                if (conditionIP && i % 2 == 0){
                    arrayResultado.add(i);
                } else if (!conditionIP && i % 2 != 0){
                    arrayResultado.add(i);
                }
            }
        }
        for (int i = 0; i < arrayResultado.size(); i++){
            resultado.append(i != arrayResultado.size()-1 ? (arrayResultado.get(i) + ", ") : arrayResultado.get(i));
        }
        return resultado.toString();
    }

    public static void TestBuclesPrimero(){
        System.out.print("Numeros de 5 a 14 (sólo pares): ");
        System.out.println(Bucles.BuclesPrimero(5, 14, true, false));

        System.out.print("Numeros de 7 a 27 (sólo pares): ");
        System.out.println(Bucles.BuclesPrimero(7, 27, true, false));

        System.out.print("Numeros de 2 a 18 (sólo pares): ");
        System.out.println(Bucles.BuclesPrimero(2, 18, true, false));

        System.out.print("Numeros de 5 a 14 (inverso y sólo pares): ");
        System.out.println(Bucles.BuclesPrimero(5, 14, true, true));

        System.out.print("Numeros de 7 a 27 (inverso y sólo pares): ");
        System.out.println(Bucles.BuclesPrimero(7, 27, true, true));

        System.out.print("Numeros de 2 a 18 (inverso y sólo pares): ");
        System.out.println(Bucles.BuclesPrimero(2, 18, true, true));

        System.out.print("Numeros de 5 a 14 (sólo impares): ");
        System.out.println(Bucles.BuclesPrimero(5, 14, false, false));

        System.out.print("Numeros de 7 a 27 (sólo impares): ");
        System.out.println(Bucles.BuclesPrimero(7, 27, false, false));

        System.out.print("Numeros de 2 a 18 (sólo impares): ");
        System.out.println(Bucles.BuclesPrimero(2, 18, false, false));

        System.out.print("Numeros de 5 a 14 (inverso y sólo impares): ");
        System.out.println(Bucles.BuclesPrimero(5, 14, false, true));

        System.out.print("Numeros de 7 a 27 (inverso y sólo impares): ");
        System.out.println(Bucles.BuclesPrimero(7, 27, false, true));

        System.out.print("Numeros de 2 a 18 (inverso y sólo impares): ");
        System.out.println(Bucles.BuclesPrimero(2, 18, false, true));
    }
}
