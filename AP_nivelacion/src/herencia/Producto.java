package herencia;

public abstract class Producto {
    protected int id;
    protected String nombre;
    static int valorBase = 200;
    protected int cantidadDias;

    public Producto(int id, String nombre, int cantidadDias){
        super();
        this.id = id;
        this.nombre = nombre;
        this.cantidadDias = cantidadDias;
    }

    public abstract double getPrecioFinal();

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valor){
        valorBase = valor;
    }
}
