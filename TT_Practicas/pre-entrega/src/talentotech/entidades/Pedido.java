package talentotech.entidades;

import java.util.List;
import java.util.ArrayList;

public final class Pedido {
    public static int idGenerado = 500;
    private int id;
    private List<Producto> listaDeProductos;

    public int getId() {
        return this.id;
    }

    public List<Producto> getListaProductos() {
        return this.listaDeProductos;
    }

    public Pedido() {
        this.listaDeProductos = new ArrayList<>();
        this.id = idGenerado++;
    }

    public boolean agregarProducto(Producto productoParaAgregar) {
        if (this.listaDeProductos.stream().anyMatch(p -> p.equals(productoParaAgregar)))
            return false;

        this.listaDeProductos.add(productoParaAgregar);
        return true;
    }

    public String obtenerTotal() {
        return "Total del pedido: $ " + this.listaDeProductos.stream().mapToDouble(p -> p.getPrecio()).sum();
    }

    public String mostrarPedidoId() {
        StringBuilder sB = new StringBuilder();
        for (Producto producto : this.listaDeProductos) {
            sB.append(String.format("- %s | ID: %d\n", producto.getNombre(), producto.getId()));
        }
        return sB.toString();
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();

        sB.append(String.format("---  Lista de productos actuales en el pedido ID %d ---", this.id))
                .append(System.lineSeparator());
        for (Producto producto : this.listaDeProductos) {
            sB.append(String.format("- %s\n", producto.getNombre()));
        }
        sB.append(this.obtenerTotal()).append(System.lineSeparator());

        return sB.toString();
    }

    // private Producto formatearProducto(Producto productoAFormatear) {
    // NumberFormat nF = NumberFormat.getInstance(Locale.getDefault());
    // nF.setMaximumFractionDigits(2);
    // productoAFormatear.setPrecio(Double.parseDouble(nF.format(productoAFormatear.getPrecio())));

    // productoAFormatear.setNombre(productoAFormatear.getNombre()
    // .toUpperCase().charAt(0) +
    // productoAFormatear.getNombre().substring(1).toLowerCase());

    // productoAFormatear.setDescripcion(productoAFormatear.getDescripcion().toLowerCase().charAt(0)
    // + productoAFormatear.getDescripcion().substring(1).toLowerCase());

    // return productoAFormatear;
    // }
}
