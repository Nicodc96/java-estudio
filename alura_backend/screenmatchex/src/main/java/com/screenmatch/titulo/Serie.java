package com.screenmatch.titulo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.screenmatch.clasificacion.ClasificacionEdad;
import com.screenmatch.clasificacion.Popularidad;

public class Serie extends Titulo implements Popularidad {
    private int id;
    private ArrayList<Temporada> listaTemporadas;
    
    public Serie(String nombre, LocalDate fechaLanzamiento, ClasificacionEdad clasificacion, int ultimaIdRegistrado, ArrayList<Temporada> listaTemporadas){
        super(nombre, 0, fechaLanzamiento, clasificacion);
        this.listaTemporadas = listaTemporadas;
        this.id = ultimaIdRegistrado + 1;
    }

    public Serie(String nombre, LocalDate fechaLanzamiento, ClasificacionEdad clasificacion, int ultimaIdRegistrado){
        this(nombre, fechaLanzamiento, clasificacion, ultimaIdRegistrado, new ArrayList<>());
    }

    public int getCantidadTemporadas() { return this.listaTemporadas.size(); }
    public ArrayList<Temporada> getListaTemporadas() { return this.listaTemporadas; }
    public int getId() { return this.id; }

    @Override
    public String toString(){
        StringBuilder sB = new StringBuilder();

        sB.append("Nombre de la serie: ").append(this.nombre).append("\n");
        sB.append("Fecha de estreno: ").append(this.fechaDeLanzamiento.format(DateTimeFormatter.ofPattern("dd/MM/yyy"))).append("\n");
        sB.append("Valoración: ").append(String.format("%.1f", this.obtenerValoracionGeneral())).append("\n");
        sB.append("Temporadas: ").append(this.getCantidadTemporadas()).append("\n");
        sB.append("Clasificacion: ").append(this.clasificacion).append("\n");

        return sB.toString();
    }

    @Override
    public int getDuracionTotal(){
        return 0;
    }

    @Override
    public boolean esPopular() {
        return this.obtenerValoracionGeneral() > 7.0;
    }
}
