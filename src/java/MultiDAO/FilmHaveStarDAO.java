/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiDAO;

import DAL.DBContext;
import MutiModels.FilmHaveStarView;
import java.util.*;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kudol
 */
public class FilmHaveStarDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public FilmHaveStarDAO() {
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

    
    public List<FilmHaveStarView> getRanDomFilmHaveStar() {
        List<FilmHaveStarView> list = new ArrayList<>();
        String sql = """
                      SELECT TOP 9 Film.FilmId, [FilmName], YEAR(Date) AS Year, [Description], [LinkImg], [LinkTrailer], [View], [CountryId], [IsSeries], AVG(FS.Rating) AS Star, Film.Linkimg2
                                              FROM Film 
                                              LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId
                                              WHERE Film.[View] > -1 AND Film.Active = 'true'
                                              GROUP BY 
                                                  Film.FilmId, [FilmName], YEAR(Date), [Description], [LinkImg], [LinkTrailer], [View], [CountryId], [IsSeries], Film.Linkimg2
                                              ORDER BY 
                                                  NEWID(); """;

        try {
            stm = cnn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                FilmHaveStarView c = new FilmHaveStarView(rs.getInt("FilmId"),
                        rs.getString("FilmName"),
                        rs.getString("Year"),
                        rs.getString("Description"),
                        rs.getString("LinkImg"),
                        rs.getString("LinkTrailer"),
                        rs.getInt("View"),
                        rs.getInt("CountryId"),
                        rs.getBoolean("IsSeries"),
                        rs.getInt("Star"),
                        rs.getString("Linkimg2"));
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println("getRanDomFilmHaveStar error" + e.getMessage());
        }
        return list;
    }
    
}
