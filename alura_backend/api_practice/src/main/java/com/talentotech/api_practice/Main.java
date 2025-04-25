package com.talentotech.api_practice;

import com.talentotech.API.APIMovie;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDeDatos = new Scanner(System.in);
        String nombrePelicula = "";

        System.out.print("Ingrese el nombre de una pelicula a buscar: ");
        nombrePelicula = entradaDeDatos.nextLine();

        APIMovie instanciaSingletonPeliculas = APIMovie.getAPIMovie();
        System.out.println("******* JSON CRUDO *******");
        System.out.println(instanciaSingletonPeliculas.pedirPeliculaPorNombre(nombrePelicula));


        entradaDeDatos.close();
    }
}