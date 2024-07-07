/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiDAO;

import DAL.CountryDAO;
import DAL.DBContext;
import DAL.EpisodeDAO;
import DAL.FilmDAO;
import Models.Country;
import Models.Episode;
import Models.Film;
import Models.Genre;
import Models.UserView;
import MutiModels.FilmCountryGenre;
import MutiModels.FilmInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kudol
 */
public class FilmCountryGenreDAO extends DBContext {
   public static FilmCountryGenreDAO dao = new FilmCountryGenreDAO();
    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public FilmCountryGenreDAO() {
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

    public List<FilmCountryGenre> getMyFilmByUserId(int userid) {
        List<FilmCountryGenre> list = new ArrayList<>();
        UserViewDAO userviewdao = new UserViewDAO();
        List<UserView> userviewlist = userviewdao.getByUserid(userid);
        for (UserView userView : userviewlist) {
            //setfilm
            FilmDAO filmdao = new FilmDAO();
            Film film = filmdao.getFilmByfilmid(filmdao.getFilmIdByEpisodeId(userView.getEpisodeId()));
            FilmCountryGenre filmcountrygenre = new FilmCountryGenre();
            filmcountrygenre.setFilm(film);
            //setcountry
            CountryDAO countrydao = new CountryDAO();
            Country country = countrydao.getCountrybyId(film.getCountryId());
            filmcountrygenre.setCountry(country);
            //set genre
            GenreFilmDAO genrefilmdao = new GenreFilmDAO();
            List<Genre> genrelist = genrefilmdao.getGenreByFilmId(film.getFilmId());
            filmcountrygenre.setGenre(genrelist);           
            //set Userviewid
            filmcountrygenre.setUserview(userView);
            //set Episode
            EpisodeDAO episodeDAO = new EpisodeDAO();
            filmcountrygenre.setEpisode(episodeDAO.getEpisodeByEpisoId(userView.getEpisodeId()));
            list.add(filmcountrygenre);
            
        }
        return list;
    }

    public List<FilmInfo> getAllFilmInfo() {
        List<FilmInfo> list = new ArrayList<>();
        FilmDAO filmdao = new FilmDAO();
        for (Film f : filmdao.getAllFilm()) {           
            FilmInfo filmInfo = new FilmInfo();
            filmInfo.setFilm(f);
            //setcountry
            CountryDAO countrydao = new CountryDAO();
            Country country = countrydao.getCountrybyId(f.getCountryId());
            filmInfo.setCountry(country);
            //set genre
            GenreFilmDAO genrefilmdao = new GenreFilmDAO();
            List<Genre> genrelist = genrefilmdao.getGenreByFilmId(f.getFilmId());
            filmInfo.setGenre(genrelist);
            //set episode
            EpisodeDAO episodeDAO = new EpisodeDAO();
            List<Episode> episodelist = episodeDAO.getEpisodeByFilmId(f.getFilmId());
            filmInfo.setEpisode(episodelist);
            list.add(filmInfo);
        }
        return list;
    }
     public FilmInfo getFilmInfoByID(int filmid) {
        for (FilmInfo film : dao.getAllFilmInfo()) { 
            if(film.getFilm().getFilmId()==filmid){
                return film;
            }
        }
        return null;
    }
    
    
    public static void main(String[] args) {
        for (FilmInfo list : dao.getAllFilmInfo()) {          
        System.out.print(list.getFilm().getFilmName());
            for (Genre l : list.getGenre()) {
        System.out.print(l.getGenreName());                
            }
            System.out.println("");
            
        }
    }
}
