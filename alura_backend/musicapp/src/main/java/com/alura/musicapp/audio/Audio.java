package com.alura.musicapp.audio;

import java.util.Objects;

public abstract class Audio {
    protected String titulo;
    protected Float duracion;
    protected Integer totalReproducciones;
    protected Integer cantidadMeGusta;

    public String getTitulo() {
        return this.titulo;
    }

    public Float getDuracion() {
        return this.duracion;
    }

    public Integer getTotalReproducciones() {
        return this.totalReproducciones;
    }

    public Integer getMeGustas() {
        return this.cantidadMeGusta;
    }

    public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public void setDuracion(Float nuevaDuracion) {
        this.duracion = nuevaDuracion;
    }

    public Audio() {
    }

    public Audio(String titulo, Float duracion, Integer totalReproducciones, Integer cantidadMeGusta) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.totalReproducciones = totalReproducciones;
        this.cantidadMeGusta = cantidadMeGusta;
    }

    public abstract void meGusta();

    public abstract void reproducir();

    protected String calcularTiempo(Boolean esCancion) {
        Float primerNumero = Float.valueOf(Objects.toString(this.getDuracion()).split("[.]")[0]);
        Float segundoNumero = Float.valueOf(Objects.toString(this.getDuracion()).split("[.]")[1]);
        String strRespuesta = "";

        if (!esCancion) {
            segundoNumero = segundoNumero + (primerNumero % 60);
            primerNumero = (primerNumero - (primerNumero % 60)) / 60;
        }

        if (segundoNumero >= 60) {
            primerNumero++;
            segundoNumero -= 60;
        }
        
        if (esCancion) {
            strRespuesta = primerNumero == 0 ? String.format("%.0f seg", segundoNumero)
                    : String.format("%.0f m %.0f seg", primerNumero, segundoNumero);
        } else {
            strRespuesta = primerNumero == 0 ? String.format("%.0f min", segundoNumero)
                    : String.format("%.0f h %.0f min", primerNumero, segundoNumero);
        }

        return strRespuesta;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();

        sB.append("Título: ").append(this.getTitulo()).append(System.lineSeparator());
        sB.append("Cantidad reproducciones: ").append(this.getTotalReproducciones()).append(" veces.")
                .append(System.lineSeparator());
        sB.append("Cantidad de 'Me gusta': ").append(this.getMeGustas()).append(System.lineSeparator());

        return sB.toString();
    }
}
