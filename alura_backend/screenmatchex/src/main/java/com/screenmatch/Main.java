package com.screenmatch;

import java.time.LocalDate;

import com.screenmatch.calculadoraDeTiempo.CalculadoraDeTiempo;
import com.screenmatch.clasificacion.ClasificacionEdad;
import com.screenmatch.titulo.*;

public class Main {
    public static void main(String[] args) {
        // ejecutarEjercicioSinListas();
        // ejecutarEjercicioListas();
    }

    public static void ejecutarEjercicioSinListas() {

        Pelicula matrix = new Pelicula("Matrix", 136, LocalDate.of(1999, 6, 10), ClasificacionEdad.R13,
                "Sisters Wachowski");

        matrix.agregarValoracion(10);
        matrix.agregarValoracion(7);
        matrix.agregarValoracion(8.3);
        matrix.agregarValoracion(6.2);
        matrix.agregarValoracion(11);
        matrix.agregarValoracion(9);
        matrix.agregarValoracion(10);

        System.out.println(matrix);

        Serie juegoDeTronos = new Serie("Juego de Tronos", LocalDate.of(2011, 4, 17), ClasificacionEdad.R18, 1);

        juegoDeTronos.agregarValoracion(9.5);
        juegoDeTronos.agregarValoracion(10);
        juegoDeTronos.agregarValoracion(6);
        juegoDeTronos.agregarValoracion(7.5);
        juegoDeTronos.agregarValoracion(7.7);
        juegoDeTronos.agregarValoracion(7.7);
        juegoDeTronos.agregarValoracion(8.3);

        System.out.println(juegoDeTronos);
        System.out.println("Duración total de la serie: " + juegoDeTronos.getDuracionTotal() + " minutos.");

        CalculadoraDeTiempo nuevaCalculadora = new CalculadoraDeTiempo(180);
        nuevaCalculadora.agregarTitulo(matrix);

        System.out.println(nuevaCalculadora.tengoTiempo());
    }

    public static void ejecutarEjercicioListas() {
        // Serie losSimpsons = new Serie("Los Simpsons", LocalDate.of(1989, 12, 17),
        // ClasificacionEdad.ATP, 1);
    }
}