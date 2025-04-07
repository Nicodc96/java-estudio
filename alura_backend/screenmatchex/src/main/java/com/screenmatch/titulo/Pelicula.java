package com.screenmatch.titulo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.screenmatch.clasificacion.ClasificacionEdad;
import com.screenmatch.clasificacion.Popularidad;

public class Pelicula extends Titulo implements Popularidad{
    private String director;

    public Pelicula(String nombre, int duracion, LocalDate fechaLanzamiento, ClasificacionEdad clasificacion, String director){
        super(nombre, duracion, fechaLanzamiento, clasificacion);
        this.director = director;
    }

    public String getDirector() { return this.director; }

    @Override
    public String toString(){
        StringBuilder sB = new StringBuilder();

        sB.append("Nombre de la película: ").append(this.nombre).append("\n");
        sB.append("Fecha de estreno: ").append(this.fechaDeLanzamiento.format(DateTimeFormatter.ofPattern("dd/MM/yyy"))).append("\n");
        sB.append("Duración: ").append(this.duracion).append(" minutos\n");
        sB.append("Valoración: ").append(String.format("%.1f", this.obtenerValoracionGeneral())).append("\n");

        return sB.toString();
    }

    @Override
    public boolean esPopular() {
        return this.obtenerValoracionGeneral() > 6.0;
    }
}
