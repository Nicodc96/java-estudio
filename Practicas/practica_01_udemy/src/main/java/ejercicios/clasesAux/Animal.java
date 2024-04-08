package ejercicios.clasesAux;

public class Animal {
    String raza;
    double peso;
    String tipo;

    public Animal(String raza, double peso, String tipo){
        this.raza = raza;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String informacion(){
        StringBuilder sB = new StringBuilder();
        sB.append("Animal de tipo: ").append(this.tipo);
        sB.append("\nRaza: ").append(this.raza);
        sB.append("\nPeso aproximado: ").append(this.peso).append(" kg.");
        return sB.toString();

    }
}
