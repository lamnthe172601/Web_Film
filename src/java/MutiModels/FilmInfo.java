/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MutiModels;

import Models.Country;
import Models.Episode;
import Models.Film;
import Models.Genre;
import java.util.List;

/**
 *
 * @author kudol
 */
public class FilmInfo {
    Film film;
    Country country;
    List<Genre> genre;
    List<Episode> episode;

    public FilmInfo() {
    }

    public FilmInfo(Film film, Country country, List<Genre> genre, List<Episode> episode) {
        this.film = film;
        this.country = country;
        this.genre = genre;
        this.episode = episode;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
    }

    public List<Episode> getEpisode() {
        return episode;
    }

    public void setEpisode(List<Episode> episode) {
        this.episode = episode;
    }
     public int  getAmountEpisode(){
         return episode.size();
     }

    @Override
    public String toString() {
        return "FilmInfo{" + "film=" + film + ", country=" + country + ", genre=" + genre + ", episode=" + episode + '}';
    }
    

   
}
