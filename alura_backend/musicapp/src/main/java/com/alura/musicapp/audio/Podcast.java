package com.alura.musicapp.audio;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.alura.musicapp.popularidad.IPopularity;

public class Podcast extends Audio implements IPopularity {
    private List<String> presentadores;
    private String descripcion;

    public List<String> getPresentadores() {
        return presentadores;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Podcast(String titulo, Float duracion, Integer totalReproducciones, Integer cantidadMeGusta,
            List<String> presentadores, String descripcion) {
        super(titulo, duracion, totalReproducciones, cantidadMeGusta);
        this.presentadores = presentadores;
        this.descripcion = descripcion;
    }

    public Podcast(String titulo, Float duracion, Integer totalReproducciones, Integer cantidadMeGusta,
            String descripcion) {
        this(titulo, duracion, totalReproducciones, cantidadMeGusta, new ArrayList<>(), descripcion);
    }

    public Boolean agregarPresentador(String nombre) {
        if (!Objects.isNull(this.presentadores) && !Objects.isNull(nombre) && nombre.length() >= 3
                && !this.presentadores.contains(nombre.toLowerCase())) {
            return this.presentadores.add(nombre);
        } else
            return false;
    }

    @Override
    public void meGusta() {
        this.cantidadMeGusta += 2; // Se valoriza doble
    }

    @Override
    public void reproducir() {
        this.totalReproducciones += 1;
    }

    @Override
    public Boolean esPopular() {
        // Es popular si al menos el 30% de las reproducciones les gustó
        return (this.cantidadMeGusta / this.totalReproducciones) >= 0.35;
    }

    @Override
    public String estadoActual() {
        StringBuilder sB = new StringBuilder();

        Double calculoPopularidad = Double.valueOf(this.cantidadMeGusta) / this.totalReproducciones;
        sB.append(calculoPopularidad >= 0.35d ? (calculoPopularidad > 0.5d ? "¡Es tendencia!" : "Es popular!")
                : "No es popular");

        return sB.toString();
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();

        sB.append(super.toString());
        sB.append("Duracion: ").append(this.calcularTiempo(false)).append(System.lineSeparator());
        sB.append("¿Es popular actualmente? ").append(this.estadoActual()).append(System.lineSeparator());
        sB.append("Presentadores: ");
        if (this.presentadores.size() > 0) {
            // Muestra cada presentador separado por coma, excepto por el último de la lista
            this.presentadores.stream()
                    .forEach((presentador) -> sB.append(presentador)
                            .append(this.presentadores.get(this.presentadores.size() - 1).equals(presentador)
                                    ? System.lineSeparator()
                                    : ", "));
        } else {
            sB.append("Sin presentadores.").append(System.lineSeparator());
        }

        return sB.toString();
    }
}
