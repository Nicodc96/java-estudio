package ejercicios.clasesAux;

public class Perro {
    public static String nombre;
    public static String raza;
    private static Perro innerPerro;

    private Perro(String nombreParam, String razaParam){
        nombre = nombreParam;
        raza = razaParam;
    }

    public static Perro obtenerPerro(String nombre, String raza){
        if (innerPerro == null){
            innerPerro = new Perro(nombre, raza);
        }
        return innerPerro;
    }

    public static String mostrarInformacion(){
        StringBuilder sB = new StringBuilder();
        sB.append("- Perro existente -");
        sB.append("\nNombre: ").append(nombre);
        sB.append("\nRaza: ").append(raza);
        return sB.toString();
    }
}
