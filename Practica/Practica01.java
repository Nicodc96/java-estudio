import java.util.Scanner;

public class Practica01{
    public static void main(String[] args) {
        // System.out.println("Hola Mundo desde Java");

        int ejemploNumero = 73;
        float ejemploNumeroDecimalSimple = 15.1f;
        double ejemploNumeroDecimalDoble = 95.356;
        char ejemploLetra = 'm';
        String ejemploString = "Hola mundo!";

        System.out.println("Mi ejemplo de int tiene de valor: " + ejemploNumero);
        System.out.println("Mi ejemplo de float tiene de valor: " + ejemploNumeroDecimalSimple);
        System.out.println("Mi ejemplo de double tiene de valor: " + ejemploNumeroDecimalDoble);
        System.out.println("Mi ejemplo de char tiene de valor: " + ejemploLetra);
        System.out.println("Mi ejemplo de String tiene de valor: " + ejemploString);


        String nombre = "Nicolas";
        String apellido = "Díaz";

        System.out.println("Mi nombre es " + nombre + " " + apellido);

        System.out.println("Ejemplo de salto de línea:\n----\nSalto de Línea\n----");

        System.out.println("Ejemplo de tabulador: \t" + nombre);

        /*
         * En este ejemplo por cada '\b' que exista, se retrocede un caracter. Al existir
         * dos de ellos, las 'aa' no se muestran por consola.
         */
        System.out.println("Ejemplo de retroceso: aa\b\b" + nombre);

        System.out.println("Como utiliza comillas dobles: \"Ejemplo\"");
        System.out.println("Como utiliza comillas simples: 'Ejemplo'");

        // Class Scanner
        // EjemploScanner();   
        EjemploScannerDos();     
    }

    public static void EjemploScanner(){
        System.out.println("Ingrese un nombre: ");
        Scanner lecturaEjemplo = new Scanner(System.in);

        String nombreLectura = lecturaEjemplo.nextLine();

        System.out.println("Su nombre es: " + nombreLectura);

        /*
        * No olvidar cerrar siempre la clase scanner una vez instanciada
        */
        lecturaEjemplo.close();
    }

    public static void EjemploScannerDos(){
        Scanner lecturaSuma = new Scanner(System.in);
        lecturaSuma.reset();
        
        System.out.println("Ingrese el primer número: ");
        double numeroLecturaUno = Double.parseDouble(lecturaSuma.nextLine());
        System.out.println("Ingrese el segundo número: ");
        double numeroLecturaDos = Double.parseDouble(lecturaSuma.nextLine());

        System.out.println("El resultado de " + numeroLecturaUno + " y " + numeroLecturaDos + " es igual a: " + (numeroLecturaUno + numeroLecturaDos));

        /*
        * No olvidar cerrar siempre la clase scanner una vez instanciada
        */
        lecturaSuma.close();
    }
}