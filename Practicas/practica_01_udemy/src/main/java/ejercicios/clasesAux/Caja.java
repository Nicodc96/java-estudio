package ejercicios.clasesAux;

public class Caja {
    private int ancho;
    private int alto;
    private int profundidad;

    public Caja(){}

    public Caja(int ancho, int alto, int profundidad){
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public double calcularVolumen(){
        return this.ancho * this.alto * this.profundidad;
    }
}
