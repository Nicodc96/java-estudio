package herencia;

public class Libro extends Producto {
    private int cantidadHojas;
    static int valorBase = 500;
    public Libro(int id, String nombre, int cantidadDias, int cantidadHojas){
        super(id, nombre, cantidadDias);
        this.cantidadHojas = cantidadHojas;
    }

    public int getCantidadHojas(){
        return this.cantidadHojas;
    }

    @Override
    public double getPrecioFinal() {
        return this.cantidadDias * valorBase;
    }
}
