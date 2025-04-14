package com.compras.tarjeta;

import java.util.Objects;

public class Producto {
    private String nombre;
    private Double valor;

    public String getNombre() {
        return this.nombre;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setNombre(String nuevoNombre) {
        if (!Objects.isNull(nuevoNombre)) {
            this.nombre = nuevoNombre;
        }
    }

    public void setValor(Double nuevoValor) {
        if (!Objects.isNull(nuevoValor)) {
            this.valor = nuevoValor;
        }
    }

    public Producto() {
    }

    public Producto(String nombre, Double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        // No nulo, obj == Producto y, nombre y valores iguales
        if (Objects.isNull(obj))
            throw new NullPointerException();
        if (!(obj instanceof Producto))
            return false;
        if (((Producto) obj).getNombre().toLowerCase().equals(this.getNombre().toLowerCase())
                && ((Producto) obj).getValor().equals(this.getValor())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();

        sB.append("Nombre: ").append(this.nombre).append(System.lineSeparator());
        sB.append("Precio: $").append(this.valor).append(System.lineSeparator());

        return sB.toString();
    }
}
