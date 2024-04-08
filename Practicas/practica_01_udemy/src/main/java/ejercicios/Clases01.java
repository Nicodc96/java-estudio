package ejercicios;

import ejercicios.clasesAux.Animal;

public class Clases01 {
    public static void ejercicio(){
        Animal animal1 = new Animal("Holandes", 2.13, "Conejo");
        Animal animal2 = new Animal("Pitbull", 28.7, "Perro");

        System.out.println(animal1.informacion());
        System.out.println(animal2.informacion());
    }
}
