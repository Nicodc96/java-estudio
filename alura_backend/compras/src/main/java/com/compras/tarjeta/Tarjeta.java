package com.compras.tarjeta;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Tarjeta {
    private Double limite;
    private List<Producto> listaProductos;

    public Double getLimite() {
        return this.limite;
    }

    public List<Producto> getProductos() {
        return Objects.isNull(this.listaProductos) ? new ArrayList<>() : this.listaProductos;
    }

    public void setLimite(Double nuevoLimite) {
        if (!Objects.isNull(nuevoLimite)) {
            this.limite = nuevoLimite;
        }
    }

    public Tarjeta(Double limite) {
        this.limite = limite;
        this.listaProductos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la lista de {@code Producto} de la instancia actual
     * 
     * @param producto Una instancia de la clase {@code Producto}
     * 
     * @return {@code -1} Si el objecto recibido al hacer la comparación es nulo,
     * {@code 0} Si el producto ya se encuentra en la lista,
     * {@code 1} Si el producto se agregado exitosamente,
     * {@code 2} Si el valor del producto supera al límite de la instancia actual.
     */
    public Integer agregarProducto(Producto producto) {
        try {
            // La sobreescritura del método equals en producto puede lanzar un
            // NullPointerException
            if (this.listaProductos.stream().anyMatch((p) -> p.equals(producto))) {
                return 0;
            }
            if (this.limite - producto.getValor() >= 0){
                this.limite -= producto.getValor();
                this.listaProductos.add(producto);
                return 1;
            }
            return 2;
        } catch (NullPointerException e) {
            return -1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();

        sB.append("***************************************").append(System.lineSeparator());
        sB.append("--- COMPRAS REALIZADAS ---").append(System.lineSeparator()).append(System.lineSeparator());
        this.listaProductos.stream().forEach((producto) -> sB.append(producto).append(System.lineSeparator()));
        sB.append("***************************************").append(System.lineSeparator());

        return sB.toString();
    }
}
