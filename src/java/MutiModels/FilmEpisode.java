/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MutiModels;

import Models.Episode;
import Models.Film;
import java.util.List;

/**
 *
 * @author kudol
 */
public class FilmEpisode {
    Film film;
    List<Episode> listEpisode;

    public FilmEpisode() {
    }

    public FilmEpisode(Film film, List<Episode> listEpisode) {
        this.film = film;
        this.listEpisode = listEpisode;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public List<Episode> getListEpisode() {
        return listEpisode;
    }

    public void setListEpisode(List<Episode> listEpisode) {
        this.listEpisode = listEpisode;
    }

}
