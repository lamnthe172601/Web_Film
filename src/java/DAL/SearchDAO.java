/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import MutiModels.FilmHaveStarView;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kudol
 */
public class SearchDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement ps;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public SearchDAO() {
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

    public int Count(String search) {
        try {

            String sql = """
                       SELECT COUNT(*) 
                       FROM (
                       SELECT Film.FilmId,[FilmName],YEAR(Date) AS Year,[Description],[LinkImg],[LinkTrailer],[View],[CountryId],[IsSeries], AVG(FS.StarId) AS Star,Film.Linkimg2
                                            FROM Film LEFT JOIN FilmStar FS ON Film.FilmId = FS.FilmId
                                            where Film.FilmName like ? and Film.Active='true'
                                            GROUP BY 
                                            Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                                            Film.LinkTrailer, Film.[View], Film.CountryId,film.IsSeries,Film.Linkimg2
                        ) AS Subquery; 
                       """;
            ps = cnn.prepareStatement(sql);
            ps.setString(1,"%"+search+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Count:" + e.getMessage());
        }
        return 0;
    }

    public List<FilmHaveStarView> getFilmbyName(String search, int index, int pageSize) {
        List<FilmHaveStarView> list = new ArrayList<>();

        String sql = """
                       SELECT *
                       FROM (
                           SELECT Film.FilmId, [FilmName], YEAR(Date) AS Year, [Description], [LinkImg], [LinkTrailer], [View], [CountryId], [IsSeries], AVG(FS.StarId) AS Star, Film.Linkimg2,
                                  ROW_NUMBER() OVER (ORDER BY Film.Date DESC) AS RowNum
                           FROM Film 
                           LEFT JOIN FilmStar FS ON Film.FilmId = FS.FilmId 
                           WHERE Film.FilmName LIKE ? AND Film.Active = 'true' 
                           GROUP BY 
                           Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                           Film.LinkTrailer, Film.[View], Film.CountryId, film.IsSeries, Film.Linkimg2
                       ) AS Subquery
                       WHERE RowNum BETWEEN ?*?-(?-1) and ?*?;
                       """;
        try {
            ps=cnn.prepareStatement(sql);
            ps.setString(1,"%"+search+"%");
            ps.setInt(2, index);
            
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            ps.setInt(5, index);
            ps.setInt(6, pageSize);
            rs=ps.executeQuery();
            while(rs.next()){
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
            System.out.println("getFilmbyName Successfull");
        } catch (Exception e) {
            System.out.println("getFilmbyName:" + e.getMessage());
        }
        return list;
    }
    
}
