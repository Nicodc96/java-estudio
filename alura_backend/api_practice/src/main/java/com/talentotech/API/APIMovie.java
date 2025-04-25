package com.talentotech.API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

public class APIMovie {
    private static APIMovie instancia;
    private HttpClient cliente;
    private HttpRequest solicitud;
    private HttpResponse<String> respuesta;
    private String URL = "https://www.omdbapi.com/";
    private String ApiKey = "TUAPIKEYAQUI";

    private APIMovie() {
        this.cliente = HttpClient.newHttpClient();
        this.solicitud = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/"))
                .build();
    }

    public static APIMovie getAPIMovie() {
        if (Objects.isNull(instancia)) {
            instancia = new APIMovie();
        }
        return instancia;
    }

    public void peticionSimple() {
        try {
            this.respuesta = this.cliente.send(HttpRequest.newBuilder()
                    .uri(URI.create(String.format("%s?t=matrix&apikey=%s", this.URL, this.ApiKey))).build(),
                    HttpResponse.BodyHandlers.ofString());
            System.out.println(this.respuesta.body());
        } catch (IOException ex) {
            System.out.println("¡Error en la petición a la URL!");
        } catch (InterruptedException ex) {
            System.out.println("¡Error! ¡Se ha interrumpido la solicitud!");
        }
    }

    private HttpResponse<String> establecerPedido(String solicitudStr) throws IOException, InterruptedException{
        return this.cliente.send(HttpRequest.newBuilder().uri(URI.create(solicitudStr)).build(), HttpResponse.BodyHandlers.ofString());
    }

    private String normalizeInputString(String stringANormalizar){
        return stringANormalizar.replace(" ", "+").toLowerCase();
    }

    public String pedirPeliculaPorNombre(String nombrePelicula){
        String solicitudStr = String.format("%s?t=%s&%s", this.URL, this.normalizeInputString(nombrePelicula), this.ApiKey);
        try {
            this.respuesta = establecerPedido(solicitudStr);
        } catch (IOException ex) {
            System.out.println("¡Error en la petición a la URL!");
        } catch (InterruptedException ex) {
            System.out.println("¡Error! ¡Se ha interrumpido la solicitud!");
        }
        return respuesta.body();
    }
}
