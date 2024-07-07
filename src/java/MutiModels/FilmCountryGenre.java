/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MutiModels;

import Models.Country;
import Models.Episode;
import Models.Film;
import Models.Genre;
import Models.UserView;
import java.util.List;

/**
 *
 * @author kudol
 */
public class FilmCountryGenre {
    Film film;
    Country country;
    List<Genre> genre;
    UserView userview;
    Episode episode;
    public FilmCountryGenre() {
    }

    public FilmCountryGenre(Film film, Country country, List<Genre> genre, UserView userview, Episode episode) {
        this.film = film;
        this.country = country;
        this.genre = genre;
        this.userview = userview;
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

    public UserView getUserview() {
        return userview;
    }

    public void setUserview(UserView userview) {
        this.userview = userview;
    }

    public Episode getEpisode() {
        return episode;
    }

    public void setEpisode(Episode episode) {
        this.episode = episode;
    }

    

   
    }
    

