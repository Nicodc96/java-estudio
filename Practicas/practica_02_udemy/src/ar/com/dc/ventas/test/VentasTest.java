package ar.com.dc.ventas.test;

import ar.com.dc.ventas.*;
public class VentasTest {
    public static void main(String[] args) {
        Producto producto_1 = new Producto("Camisa", 50.00);
        Producto producto_2 = new Producto("Pantalón", 100.00);

        Orden orden_1 = new Orden();
        orden_1.agregarProducto(producto_1);
        orden_1.agregarProducto(producto_2);
        System.out.println(orden_1.mostrarOrden());
    }
}
