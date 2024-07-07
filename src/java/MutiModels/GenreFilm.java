/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MutiModels;

import Models.Film;
import Models.Genre;

/**
 *
 * @author kudol
 */
public class GenreFilm {
    Genre genre;
    Film film;

    public GenreFilm() {
    }

    public GenreFilm(Genre genre, Film film) {
        this.genre = genre;
        this.film = film;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
    
}
