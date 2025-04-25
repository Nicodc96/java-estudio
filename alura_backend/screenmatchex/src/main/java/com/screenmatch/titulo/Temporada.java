package com.screenmatch.titulo;

import java.util.ArrayList;
import java.util.Objects;
public class Temporada {
    private int id;
    private int serieID;
    private ArrayList<Episodio> listaEpisodios;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSerieID() {
        return serieID;
    }
    public void setSerieID(int serieID) {
        this.serieID = serieID;
    }
    public ArrayList<Episodio> getListaEpisodios() {
        return this.listaEpisodios;
    }

    public Temporada(int serieID, int ultimoIdRegistrado, ArrayList<Episodio> listaEpisodios){
        this.id = ultimoIdRegistrado + 1;
        this.serieID = serieID;
        this.listaEpisodios = listaEpisodios;
    }

    public Temporada(int serieID, int ultimoIdRegistrado){
        this(serieID, ultimoIdRegistrado, new ArrayList<>());
    }

    public boolean agregarEpisodio(Episodio episodio){
        if (Objects.isNull(this.listaEpisodios)) return false;
        return !this.listaEpisodios.stream()
            .anyMatch((ep) -> ep.getSerieID() == episodio.getSerieID()) 
            ? this.listaEpisodios.add(episodio) : false;
    }

    @Override
    public String toString(){
        StringBuilder sB = new StringBuilder();

        sB.append("Lista de episodios:\n");
        this.listaEpisodios.forEach((ep) -> sB.append(ep.toString()));
        sB.append("Duración total de la temporada: ").append(this.getDuracionTotal()).append(" minutos\n");        

        return sB.toString();
    }
    
    public int getDuracionTotal(){
        return this.listaEpisodios.stream()
            .map((ep) -> ep.getDuracion())
            .reduce(0, (n1, n2) -> n1 + n2);
    }
}
