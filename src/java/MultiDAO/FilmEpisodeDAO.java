/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiDAO;

import DAL.DBContext;
import DAL.EpisodeDAO;
import DAL.FilmDAO;
import Models.Episode;
import MutiModels.FilmEpisode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class FilmEpisodeDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public FilmEpisodeDAO() {
        connect();
    }

    private void connect() {
        try {
            cnn = connection;
            if (cnn != null) {
                System.out.println("Connect Successfull");
            } else {
                System.out.println("Connect failed");
            }
        } catch (Exception e) {
            System.out.println("Connect error" + e.getMessage());
        }

    }

    public FilmEpisode getFilmEpisodeByFilmid(int filmid) {
        FilmEpisode filmepisode = new FilmEpisode();
        EpisodeDAO episodedao = new EpisodeDAO();
        List<Episode> episodelist = episodedao.getEpisodeByFilmId(filmid);
        FilmDAO filmdao = new FilmDAO();
        filmepisode.setFilm(filmdao.getFilmByfilmid(filmid));
        filmepisode.setListEpisode(episodelist);

        return filmepisode;
    }
}
