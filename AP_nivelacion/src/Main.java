import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

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
        BasesDeDatos db1 = new BasesDeDatos("localhost:3306", "root", "");

        System.out.println(BasesDeDatos.ConsultarTodos("cac_java_test", db1));
    }
}