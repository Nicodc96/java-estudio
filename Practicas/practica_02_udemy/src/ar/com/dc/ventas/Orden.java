package ar.com.dc.ventas;

public class Orden {
    private final int idOrden;
    private final Producto[] productos;
    private static int contadorOrdenes = 0;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
        this.contadorProductos = 0;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getContadorProductos(){
        return this.contadorProductos;
    }

    public void agregarProducto(Producto p){
        if (this.contadorProductos < MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = p;
        } else{
            System.out.println("¡Lista de productos llena para esta orden!");
        }
    }

    public double calcularTotal(){
        double sumaTotal = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            sumaTotal += this.productos[i].getPrecio();
        }
        return sumaTotal;
    }

    public String mostrarOrden(){
        StringBuilder sB = new StringBuilder();
        sB.append("Orden ID: ").append(this.idOrden);
        sB.append("\nPrecio total: $ ").append(this.calcularTotal());
        sB.append("\nProductos de la orden: \n");
        for (int i = 0; i < this.contadorProductos; i++) {
            sB.append("- ").append(this.productos[i].toString()).append("\n");
        }
        return sB.toString();
    }
}
