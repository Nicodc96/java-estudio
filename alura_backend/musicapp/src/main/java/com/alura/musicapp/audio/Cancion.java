package com.alura.musicapp.audio;

import com.alura.musicapp.popularidad.IPopularity;

public class Cancion extends Audio implements IPopularity {
    private String artista;
    private GeneroMusical genero;
    private String album;

    public String getArtista() {
        return artista;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Cancion(String titulo, Float duracion, Integer totalReproducciones, Integer cantidadMeGusta, String artista,
            GeneroMusical genero, String album) {
        super(titulo, duracion, totalReproducciones, cantidadMeGusta);
        this.artista = artista;
        this.genero = genero;
        this.album = album;
    }

    @Override
    public void meGusta() {
        this.cantidadMeGusta += 1;
    }

    @Override
    public void reproducir() {
        this.totalReproducciones += 1;
    }

    @Override
    public Boolean esPopular() {
        // Es popular si al menos el 50% de las reproducciones les gustó
        return (this.cantidadMeGusta / this.totalReproducciones) >= 0.5;
    }

    @Override
    public String estadoActual() {
        StringBuilder sB = new StringBuilder();

        Double calculoPopularidad = this.cantidadMeGusta / Double.valueOf(this.totalReproducciones);
        sB.append(calculoPopularidad >= 0.5d ? (calculoPopularidad > 0.75d ? "¡Es un hitazo!" : "Es popular!")
                : "No es popular");

        return sB.toString();
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();

        sB.append(super.toString());
        sB.append("Duracion: ").append(this.calcularTiempo(true)).append(System.lineSeparator());
        sB.append("¿Es popular actualmente? ").append(this.estadoActual()).append(System.lineSeparator());

        return sB.toString();
    }
}
