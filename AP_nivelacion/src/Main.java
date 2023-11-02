import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import herencia.*;
import herencia.color.Color;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.print("Hola mundo!\nA continuación, ejercicios en java:\n\n");

        System.out.println("Resultado de Ejercicio 1: ciclos, condicionales y arrayList:\n");
        Bucles.TestBuclesPrimero();

        System.out.println("Resultado de Ejercicio 2: \n");
        String rutaActual = "D:\\Users\\Nicolas\\Desktop\\Repositorios\\Propios\\java-estudio\\AP_nivelacion";
        Archivos.Escritura("src\\escritura3.txt", "hola, estoy probando 3!");

        Archivos.Lectura(rutaActual + "\\escritura2.txt");
        try{
            System.out.println(Files.write(Files.createTempFile("algo", ".txt"), "saracatunga a".getBytes(StandardCharsets.ISO_8859_1)));
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        String[] separado = "3_tristes tigres_del_13".split("_");
        for (String lineas : separado){
            System.out.println(lineas);
        }
        */
        /*BasesDeDatos db1 = new BasesDeDatos("localhost:3306", "root", "");

        System.out.println(BasesDeDatos.ConsultarTodos("cac_java_test", db1));*/

        Producto libro1 = new Libro(1, "Colmillo Blanco", 5, 315);
        libro1.setValorBase(100);
        System.out.println(libro1.getValorBase());

        Producto bicicleta1 = new Bicicleta(2, "BMX Blanca", 15, Color.BLANCO);

        System.out.println(bicicleta1.getValorBase());

        /*
            Nota: cuando se cambia el valor static de una clase padre en alguna clase hija
            repecurtirá en toda las demás instancias no importa que no herenden de esa clase
            hija.
         */
    }
}