package herencia;

import herencia.color.Color;

public class Bicicleta extends Producto{
    private final Color color;

    public Bicicleta(int id, String nombre, int cantidadDias, Color color){
        super(id, nombre, cantidadDias);
        this.color = color;
    }

    public String getColor(){
        return this.color.toString();
    }
    @Override
    public double getPrecioFinal() {
        return this.cantidadDias * valorBase;
    }
}
