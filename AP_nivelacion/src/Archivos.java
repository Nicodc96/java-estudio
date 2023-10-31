import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Archivos {
    public static void Lectura(String ruta){
        try{
            for (String linea : Files.readAllLines(Paths.get(ruta))){
                System.out.println(linea);
            }
        } catch (Exception error){
            System.out.println("Ha ocurrido un error\nRazón: " + error.getMessage());
        }
    }

    public static void Escritura(String ruta, String texto){
        try{
            System.out.println(Files.write(Paths.get(ruta), texto.getBytes()));
        } catch(IOException error){
            System.out.println("Ha ocurrido un error\nRazón: " + error.getMessage());
        }
    }
}
