package com.screenmatch.titulo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.screenmatch.clasificacion.ClasificacionEdad;

public class Titulo {
    protected String nombre;
    protected int duracion;
    protected LocalDate fechaDeLanzamiento;
    protected int cantidadValoraciones;
    protected float sumaValoraciones;
    protected ClasificacionEdad clasificacion;

    public Titulo(String nombre, int duracion, LocalDate fechaLanzamiento, ClasificacionEdad clasificacion){
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechaDeLanzamiento = fechaLanzamiento;
        this.cantidadValoraciones = 0;
        this.sumaValoraciones = 0;
        this.clasificacion = clasificacion;
    }

    public String getNombre() { return this.nombre; }
    public int getDuracion() { return this.duracion; }
    public LocalDate fechaDeLanzamiento() { return this.fechaDeLanzamiento; }
    public String getClasificacion() { return this.clasificacion.toString(); }

    @Override
    public String toString(){
        StringBuilder sB = new StringBuilder();

        sB.append("Nombre: ").append(this.nombre).append("\n");
        sB.append("Fecha de estreno: ").append(this.fechaDeLanzamiento.format(DateTimeFormatter.ofPattern("dd/MM/yyy"))).append("\n");
        sB.append("Duración: ").append(this.duracion).append(" minutos\n");
        sB.append("Valoración: ").append(String.format("%.1f", this.obtenerValoracionGeneral())).append("\n");
        sB.append("Clasificacion: ").append(this.clasificacion).append("\n");

        return sB.toString();
    }

    public boolean agregarValoracion(Number valoracion){
        if (valoracion.floatValue() > 0.0 && valoracion.floatValue() < 11.0){
            this.cantidadValoraciones += 1;
            this.sumaValoraciones += valoracion.floatValue();
            return true;
        }
        return false;
    }

    public double obtenerValoracionGeneral(){
        return this.sumaValoraciones > 0 ? (this.sumaValoraciones / this.cantidadValoraciones) : 0;
    }

    public int getDuracionTotal(){
        return this.duracion;
    }
}
