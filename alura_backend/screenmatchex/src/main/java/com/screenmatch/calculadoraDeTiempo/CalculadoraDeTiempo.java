package com.screenmatch.calculadoraDeTiempo;

import com.screenmatch.titulo.*;
public class CalculadoraDeTiempo {
    private int tiempoDisponibleEnMinutos;
    private int tiempoTotal;

    public int getTiempoDisponibleEnMinutos() {
        return tiempoDisponibleEnMinutos;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public CalculadoraDeTiempo(int tiempoDisponibleEnMinutos){
        this.tiempoDisponibleEnMinutos = tiempoDisponibleEnMinutos;
        this.tiempoTotal = 0;
    }
    
    public CalculadoraDeTiempo(){
        this(0);
    }

    public void agregarTitulo(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionTotal();
    }

    /**
     * Consulta internamente si, según un tiempo inicial disponible, es posible ver
     * toda la selección de títulos ingresados (valores no negativos). Dependiendo el 
     * caso indica el tiempo que sobra o falte en minutos.
     * @return {@code String} cadena de texto con la respuesta adecuada
     */
    public String tengoTiempo(){
        StringBuilder sB = new StringBuilder();

        if (tiempoTotal <= tiempoDisponibleEnMinutos){
            sB.append("Dispones del tiempo disponible, y te quedan ")
            .append(this.tiempoDisponibleEnMinutos - this.tiempoTotal)
            .append(" minutos restantes.\n");
        } else{
            sB.append("¡No te alcanza el tiempo! Necesitarías ")
            .append((this.tiempoDisponibleEnMinutos - this.tiempoTotal) * -1)
            .append(" minutos para poder visualizar todo.\n");
        }
        
        return sB.toString();
    }
}
