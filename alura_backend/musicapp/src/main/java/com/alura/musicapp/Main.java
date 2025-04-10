package com.alura.musicapp;

import com.alura.musicapp.audio.*;

public class Main {
        public static void main(String[] args) {
                // Hago el llamado al método que realiza las pruebas
                ejecutarPrueba();
        }

        public static void ejecutarPrueba() {
                // Canciones
                Audio fiveHours = new Cancion("Five Hours", 5.27f, 50000, 37854, "Deorro", GeneroMusical.ELECTRONICA,
                                "Sencillo");
                Audio imBeliever = new Cancion("I'm a Believer", 3.05f, 65321, 56415, "Smash Mouth", GeneroMusical.POP,
                                "Smash Mouth");
                Audio whatIveDone = new Cancion("What I've Done", 3.25f, 465211, 131511, "Linkin Park",
                                GeneroMusical.ROCK_AND_ROLL, "Minutes to Midnight");
                Audio funkyTown = new Cancion("Funkytown", 7.50f, 89821, 46123, "Lipps Inc", GeneroMusical.DISCO,
                                "Mouth to Mouth");
                Audio redemptionSong = new Cancion("Redemption Song", 3.47f, 121555, 62123, "Bob Marley",
                                GeneroMusical.REGGAE,
                                "Uprising");
                Audio rapGod = new Cancion("Rap God", 6.03f, 748132, 698411, "Eminem", GeneroMusical.HIP_HOP,
                                "The Marshall Mathers LP 2");
                Audio wonderfulWorld = new Cancion("What a Wonderful World", 2.19f, 146101, 41211, "Louis Armstrong",
                                GeneroMusical.JAZZ, "Sencillo");

                // Podcasts
                Audio venganzaTerrible = new Podcast("La venganza será terrible 1", 64.51f, 15134, 13689,
                                "Comedia, teatro, música y reflexión argentina");
                Audio bastaChicos = new Podcast("Basta Chicos: La vida de Ricardo Fort 1", 34.08f, 9155, 3411,
                                "La historia completa del millonario más mediático de Argentina");
                Audio libertadUnaIlusion = new Podcast("La libertad, ¿una ilusión?", 133.15f, 16711, 7461,
                                "Debate filosófico y científico sobre la libertad y el libertinaje");

                // Muestro las canciones
                System.out.println(fiveHours);
                System.out.println(imBeliever);
                System.out.println(whatIveDone);
                System.out.println(funkyTown);
                System.out.println(redemptionSong);
                System.out.println(rapGod);
                System.out.println(wonderfulWorld);

                // Muestro los podcast

                System.out.println(venganzaTerrible);
                System.out.println(bastaChicos);
                System.out.println(libertadUnaIlusion);

                // Agrego participantes a los podcast
                ((Podcast) venganzaTerrible).agregarPresentador("Alejandro Dolina");
                ((Podcast) venganzaTerrible).agregarPresentador("Patricio Barton");

                ((Podcast) bastaChicos).agregarPresentador("Damián Kuc");

                ((Podcast) libertadUnaIlusion).agregarPresentador("Javier Santaolalla");
                ((Podcast) libertadUnaIlusion).agregarPresentador("Enric F. Gel");

                // Vuelvo a mostrar los podcast
                System.out.println(venganzaTerrible);
                System.out.println(bastaChicos);
                System.out.println(libertadUnaIlusion);
        }
}