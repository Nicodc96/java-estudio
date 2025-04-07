package com.screenmatch.titulo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.screenmatch.clasificacion.ClasificacionEdad;
import com.screenmatch.clasificacion.Popularidad;

public class Serie extends Titulo implements Popularidad {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    
    public Serie(String nombre, LocalDate fechaLanzamiento, ClasificacionEdad clasificacion, int numeroTemporadas, int episodiosPorTemporada, int minutosPorEpisodio){
        super(nombre, 0, fechaLanzamiento, clasificacion);
        this.temporadas = numeroTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() { return this.temporadas; }
    public int getEpisodiosPorTemporada() { return this.episodiosPorTemporada; }
    public int getMinutosPorEpisodio() { return this.minutosPorEpisodio; }

    @Override
    public String toString(){
        StringBuilder sB = new StringBuilder();

        sB.append("Nombre de la serie: ").append(this.nombre).append("\n");
        sB.append("Fecha de estreno: ").append(this.fechaDeLanzamiento.format(DateTimeFormatter.ofPattern("dd/MM/yyy"))).append("\n");
        sB.append("Valoración: ").append(String.format("%.1f", this.obtenerValoracionGeneral())).append("\n");
        sB.append("Temporadas: ").append(this.temporadas).append("\n");
        sB.append("Episodios por temporada: ").append(this.episodiosPorTemporada).append("\n");
        sB.append("Minutos por episodio: ").append(this.minutosPorEpisodio).append("\n");
        sB.append("Clasificacion: ").append(this.clasificacion).append("\n");

        return sB.toString();
    }

    @Override
    public int getDuracionTotal(){
        return this.temporadas * this.minutosPorEpisodio;
    }

    @Override
    public boolean esPopular() {
        return this.obtenerValoracionGeneral() > 7.0;
    }
}
