/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiDAO;

import DAL.DBContext;
import DAL.GenreDAO;
import Models.Genre;
import Models.GenreFilm;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kudol
 */
public class GenreFilmDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public GenreFilmDAO() {
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

    public List<GenreFilm> getGenreFilmByFilmId(int filmid) {
        List<GenreFilm> list = new ArrayList<>();
        String sql = """
                     SELECT [GenreFilmId]
                           ,[GenreId]
                           ,[FilmId]
                       FROM [dbo].[GenreFilm]
                       where FilmId=?
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, filmid);
            rs = stm.executeQuery();
            while (rs.next()) {
                int GenreFilmId = rs.getInt("GenreFilmId");
                int GenreId = rs.getInt("GenreId");
                int FilmId = rs.getInt("FilmId");
                GenreFilm g = new GenreFilm(GenreFilmId, GenreId, FilmId);
                list.add(g);
            }
        } catch (Exception e) {
            System.out.println("getGenreFilmByFilmId error" + e.getMessage());
        }

        return list;
    }

    public void addGenreNewFilm(String filmid, String genreid) {
        String sql = """
                     INSERT INTO [dbo].[GenreFilm]
                                  ([GenreId]
                                  ,[FilmId])
                            VALUES
                                  (?
                                  ,?)
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, genreid);
            stm.setString(2, filmid);
            rs = stm.executeQuery();

        } catch (Exception e) {
            System.out.println("getGenreFilmByFilmId error" + e.getMessage());
        }

    }
    
     public void deleteGenreFilmByFilmID(String filmid) {
        String sql = """
                     DELETE FROM [dbo].[GenreFilm]
                                        WHERE FilmId = ?
                     """;
        try {
            stm = cnn.prepareStatement(sql);            
            stm.setString(1, filmid);
            rs = stm.executeQuery();

        } catch (Exception e) {
            System.out.println("getGenreFilmByFilmId error" + e.getMessage());
        }

    }
    

    public List<Genre> getGenreByFilmId(int filmid) {
        List<Genre> genrelist = new ArrayList<>();
        List<GenreFilm> genrefilmlist = getGenreFilmByFilmId(filmid);
        for (GenreFilm genreFilm : genrefilmlist) {
            GenreDAO genredao = new GenreDAO();
            Genre g = genredao.getGenrebyId(genreFilm.getGenreId());
            genrelist.add(g);
        }
        return genrelist;
    }

}
