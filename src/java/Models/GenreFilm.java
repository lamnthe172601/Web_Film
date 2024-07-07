/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kudol
 */
public class GenreFilm {
    private int GenreFilmId;
    private int GenreId;
    private int FilmId;

    public GenreFilm() {
    }

    public GenreFilm(int GenreFilmId, int GenreId, int FilmId) {
        this.GenreFilmId = GenreFilmId;
        this.GenreId = GenreId;
        this.FilmId = FilmId;
    }

    public int getGenreFilmId() {
        return GenreFilmId;
    }

    public void setGenreFilmId(int GenreFilmId) {
        this.GenreFilmId = GenreFilmId;
    }

    public int getGenreId() {
        return GenreId;
    }

    public void setGenreId(int GenreId) {
        this.GenreId = GenreId;
    }

    public int getFilmId() {
        return FilmId;
    }

    public void setFilmId(int FilmId) {
        this.FilmId = FilmId;
    }
    
}
