package com.screenmatch.titulo;

public class Episodio {
    private String nombre;
    private int duracion;
    private int serieID;
    private int temporadaID;

    public String getNombre() { return nombre; }
    public int getDuracion() { return duracion; }
    public int getSerieID() { return serieID; }
    public int getTemporadaID() { return temporadaID; }

    public boolean setNombre(String nuevoNombre){
        if (nuevoNombre.length() > 0){
            this.nombre = nuevoNombre;
            return true;
        }
        return false;
    }

    public boolean setDuracion(int nuevaDuracion){
        if (nuevaDuracion > 0){
            this.duracion = nuevaDuracion;
            return true;
        }
        return false;
    }

    public void setSerieID(int nuevaID){
        this.serieID = nuevaID;
    }

    public void setTemporadaID(int nuevaTemporadaID){
        this.temporadaID = nuevaTemporadaID;
    }

    public Episodio(String nombre, int duracion, int serieID, int temporadaID){
        this.nombre = nombre;
        this.duracion = duracion;
        this.serieID = serieID;
        this.temporadaID = temporadaID;
    }

    @Override
    public String toString(){
        StringBuilder sB = new StringBuilder();

        sB.append("Nombre: ").append(this.nombre).append("\n");
        sB.append("Duración: ").append(this.duracion).append(" minutos").append("\n");

        return sB.toString();
    }
}
