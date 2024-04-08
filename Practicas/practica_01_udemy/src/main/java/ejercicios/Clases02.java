package ejercicios;

import ejercicios.clasesAux.Perro;

public class Clases02 {
    public static void ejercicio(){
        System.out.println("A continuación cree una clase 'Perro' con patrón singleton.");
        System.out.println("----------------------------");
        System.out.println("Este patrón me permitirá crear un 'perro' y sólo un 'perro'.");
        System.out.println("Haciendo uso de su método estático Perro.obtenerPerro().");
        System.out.println("Si el perro ya fue creado, no importa que intente crear otro,");
        System.out.println("Siempre me devolverá el mismo.");
        System.out.println("----------------------------");
        System.out.println("Si intento acceder al 'perro' sin inicializar me lanzará un error");
        System.out.println("Ya que será inicialmente null");
        System.out.println("----------------------------");
        System.out.println("Creare un perro llamado 'Tobby' y de raza 'Caniche'");
        Perro.obtenerPerro("Tobby", "Caniche");
        System.out.println(Perro.mostrarInformacion());
        System.out.println("----------------------------");
        System.out.println("Ahora intentaré crear otro perro llamado 'Tyson' de raza 'Pitbull'");
        System.out.println("Utilizando la misma clase 'Perro'");
        Perro.obtenerPerro("Tyson", "Pitbull");
        System.out.println(Perro.mostrarInformacion());
        System.out.println("----------------------------");
        System.out.println("Como funciona el patron singleton, ya existia una instancia interna");
        System.out.println("De 'Perro' que es siempre el primero que se define o se obtiene");
        System.out.println("Y nunca cambiará");
        System.out.println("----------------------------");
    }
}
