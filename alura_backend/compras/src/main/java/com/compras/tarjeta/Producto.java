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
        if (this == obj) {
            return true;
        }

        if (Objects.isNull(obj) || getClass() != obj.getClass()) {
            return false;
        }

        Producto productoAComparar = (Producto) obj;

        return productoAComparar.getNombre().equalsIgnoreCase(this.getNombre())
                && Double.compare(productoAComparar.getValor(), this.getValor()) == 0;
    }

    @Override
    public int hashCode(){
        return this.nombre.hashCode() * this.valor.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();

        sB.append("Nombre: ").append(this.nombre).append(System.lineSeparator());
        sB.append("Precio: $").append(this.valor).append(System.lineSeparator());

        return sB.toString();
    }
}
