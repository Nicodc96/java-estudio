package ar.com.dc.ventas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos = 0;

    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append("{Producto ID: ").append(this.idProducto);
        sB.append(", nombre: ").append(this.nombre);
        sB.append(", precio: ").append(this.precio).append("}");
        return sB.toString();
    }
}
