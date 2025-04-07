package ar.javaestudio.nicodc96.tendencia;

import java.time.LocalDateTime;

public class Song {
    private String name;
    private String artist;
    private Integer duration;
    private String album;
    private String albumDate;
    private Integer totalPlays;
    private Integer quantityLikes;
    private Integer quantityDislikes;

    private LocalDateTime lastPlay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbumDate() {
        return albumDate;
    }

    public void setAlbumDate(String albumDate) {
        this.albumDate = albumDate;
    }

    public Integer getQuantityLikes() {
        return quantityLikes;
    }

    public void setQuantityLikes(Integer quantityLikes) {
        this.quantityLikes = quantityLikes;
    }

    public Integer getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(Integer totalPlays) {
        this.totalPlays = totalPlays;
    }

    public Integer getQuantityDislikes() {
        return quantityDislikes;
    }

    public void setQuantityDislikes(Integer quantityDislikes) {
        this.quantityDislikes = quantityDislikes;
    }

    public LocalDateTime getLastPlay() {
        return lastPlay;
    }

    public void setLastPlay(LocalDateTime lastPlay) {
        this.lastPlay = lastPlay;
    }

    private Song(){
        this.totalPlays = 0;
        this.quantityLikes = 0;
        this.quantityDislikes = 0;
        this.lastPlay = LocalDateTime.now();
    }

    public Song(String name, String artist, Integer duration, String album, String albumDate) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.album = album;
        this.albumDate = albumDate;
    }
}
