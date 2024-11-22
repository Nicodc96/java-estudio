package InterfacesFuncionales;

import java.util.Arrays;
import java.util.List;

public class EjercicioInterfacesFuncionales {
    public static void ejercicioNumeros(){
        List<Integer> listaNumeros = Arrays.asList(5, 7, 8, 11, 15, 21);
        Operacion sumaDeATres = (lista) -> lista.stream().map(num -> num+3).toList();

        Operacion multiplicarDeATres = (lista) -> lista.stream().map(num -> num*3).toList();

        System.out.println("Lista original");
        listaNumeros.forEach(System.out::println);
        System.out.println("---------");
        System.out.println("Lista donde x -> x + 3");
        sumaDeATres.operar(listaNumeros).forEach(System.out::println);
        System.out.println("---------");
        System.out.println("Lista donde x -> x * 3");
        multiplicarDeATres.operar(listaNumeros).forEach(System.out::println);
        System.out.println("---------");
        System.out.println("Lista donde primero x + 3 y luego x * 3");
        multiplicarDeATres.operar(sumaDeATres.operar(listaNumeros)).forEach(System.out::println);
    }

    public static void ejercicioMayus(){
        List<String> listaPalabras = Arrays.asList("Hola", "Mundo", "Soy", "Nicolás");

        Mayusculas<List<String>, List<String>> aMayus = (lista) -> lista.stream().map(String::toUpperCase).toList();

        System.out.println("Lista original:");
        listaPalabras.forEach(System.out::println);
        System.out.println("---------");
        System.out.println("Lista a mayúsculas:");
        aMayus.toUpperCase(listaPalabras).forEach(System.out::println);
    }
}
