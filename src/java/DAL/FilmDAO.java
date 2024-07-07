/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.*;
import MutiModels.FilmHaveStarView;
import java.util.*;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kudol
 */
public class FilmDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public FilmDAO() {
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

    public List<Film> getAllFilm() {
        List<Film> list = new ArrayList<>();
        String sql = """
                    SELECT [FilmId]
                           ,[FilmName]
                           ,[Date]
                           ,[Description]
                           ,[LinkImg]
                           ,[LinkTrailer]
                           ,[View]
                           ,[CountryId]
                           ,[IsSeries]
                           ,[Linkimg2]
                           ,[Active]
                       FROM [dbo].[Film]
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Film f = new Film(rs.getInt("FilmId"),
                        rs.getString("FilmName"),
                        rs.getString("Date"),
                        rs.getString("Description"),
                        rs.getString("LinkImg"),
                        rs.getString("LinkTrailer"),
                        rs.getInt("View"),
                        rs.getInt("CountryId"),
                        rs.getBoolean("IsSeries"),
                        rs.getString("Linkimg2"),
                        rs.getBoolean("Active")
                );
                
                list.add(f);
            }
        } catch (Exception e) {
            System.out.println("GetALL error" + e.getMessage());
        }
        return list;
    }

    public List<FilmHaveStarView> getFilmTopStar() {
        List<FilmHaveStarView> list = new ArrayList<>();
        String sql = """
                     SELECT Film.FilmId,[FilmName],YEAR(Date) AS Year,[Description],[LinkImg],[LinkTrailer],[View],[CountryId],[IsSeries], AVG(FS.Rating) AS Star,Film.Linkimg2
                     FROM Film LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId
                     where Film.[View]>-1 and Film.Active='true'
                     GROUP BY 
                     Film.FilmId, Film.FilmName, YEAR(Film.Date), Film.Description, Film.LinkImg, 
                     Film.LinkTrailer, Film.[View], Film.CountryId,film.IsSeries,Film.Linkimg2
                     ORDER BY 
                     Star desc""";

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
            System.out.println("GetALL error" + e.getMessage());
        }
        return list;
    }

    public List<FilmHaveStarView> get_NewRelease_SingleMovies() {
        List<FilmHaveStarView> list = new ArrayList<>();
        String sql = """
                     SELECT Film.FilmId,[FilmName],YEAR(Date) AS Year,[Description],[LinkImg],[LinkTrailer],[View],[CountryId],[IsSeries], AVG(FS.Rating) AS Star,Film.Linkimg2
                                          FROM Film LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId
                                          where Film.IsSeries ='false' and Film.Active='true'
                                          GROUP BY 
                                          Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                                          Film.LinkTrailer, Film.[View], Film.CountryId,film.IsSeries,Film.Linkimg2
                                          ORDER BY 
                                          Date desc""";

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
            System.out.println("Get_NewRelease_SingleMovies error" + e.getMessage());
        }
        return list;
    }

    public List<FilmHaveStarView> get_TopView_SingleMovies() {
        List<FilmHaveStarView> list = new ArrayList<>();
        String sql = """
                     SELECT Film.FilmId,[FilmName],YEAR(Date) AS Year,[Description],[LinkImg],[LinkTrailer],[View],[CountryId],[IsSeries], AVG(FS.Rating) AS Star,Film.Linkimg2
                                          FROM Film LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId
                                          where Film.IsSeries ='false' and Film.Active='true'
                                          GROUP BY 
                                          Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                                          Film.LinkTrailer, Film.[View], Film.CountryId,film.IsSeries,Film.Linkimg2
                                          ORDER BY 
                                          [View] desc""";

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
            System.out.println("Get_TopView_SingleMovies error" + e.getMessage());
        }
        return list;
    }

    public List<FilmHaveStarView> get_NewRelease_TVseries() {
        List<FilmHaveStarView> list = new ArrayList<>();
        String sql = """
                     SELECT Film.FilmId,[FilmName],YEAR(Date) AS Year,[Description],[LinkImg],[LinkTrailer],[View],[CountryId],[IsSeries], AVG(FS.Rating) AS Star,Film.Linkimg2
                                          FROM Film LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId
                                          where Film.IsSeries ='true' and Film.Active='true'
                                          GROUP BY 
                                          Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                                          Film.LinkTrailer, Film.[View], Film.CountryId,film.IsSeries,Film.Linkimg2
                                          ORDER BY 
                                          Date desc""";

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
            System.out.println("Get_NewRelease_SingleMovies error" + e.getMessage());
        }
        return list;
    }

    public List<FilmHaveStarView> get_TopView_TVseries() {
        List<FilmHaveStarView> list = new ArrayList<>();
        String sql = """
                     SELECT Film.FilmId,[FilmName],YEAR(Date) AS Year,[Description],[LinkImg],[LinkTrailer],[View],[CountryId],[IsSeries], AVG(FS.Rating) AS Star,Film.Linkimg2
                                          FROM Film LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId
                                          where Film.IsSeries ='true' and Film.Active='true'
                                          GROUP BY 
                                          Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                                          Film.LinkTrailer, Film.[View], Film.CountryId,film.IsSeries,Film.Linkimg2
                                          ORDER BY 
                                          [View] desc""";

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
            System.out.println("Get_TopView_SingleMovies error" + e.getMessage());
        }
        return list;
    }

    public int getSizeFilmbyGenreID(int genreid) {
        try {

            String sql = """
                       SELECT COUNT(*) 
                                              FROM (
                       SELECT 
                           Film.FilmId,
                           Film.FilmName,
                           YEAR(Film.Date) AS Year,
                           Film.Description,
                           Film.LinkImg,
                           Film.LinkTrailer,
                           Film.[View],
                           Film.CountryId,
                           Film.IsSeries,
                           AVG(FS.Rating) AS Star,
                           Film.Linkimg2
                       FROM 
                           Film
                       LEFT JOIN 
                           VoteFilm FS ON Film.FilmId = FS.FilmId
                       LEFT JOIN 
                           GenreFilm GF ON Film.FilmId = GF.FilmId
                       LEFT JOIN 
                           Genre ON GF.GenreId = Genre.GenreId 
                       WHERE 
                           Genre.GenreId = ? 
                           AND Film.Active = 'true'
                       GROUP BY 
                           Film.FilmId, Film.FilmName, YEAR(Film.Date), Film.Description, Film.LinkImg, 
                           Film.LinkTrailer, Film.[View], Film.CountryId, Film.IsSeries, Film.Linkimg2
                       ) AS Subquery; 
                       """;
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, genreid);
            rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("getSizeFilmbyGenreID:" + e.getMessage());
        }
        return 0;
    }

    public List<FilmHaveStarView> get_Filmby_GenreId(int genreid, int index, int pageSize) {
        List<FilmHaveStarView> list = new ArrayList<>();
        String sql = """
                     SELECT *
                                            FROM (
                     SELECT 
                         Film.FilmId,
                         Film.FilmName,
                         YEAR(Film.Date) AS Year,
                         Film.Description,
                         Film.LinkImg,
                         Film.LinkTrailer,
                         Film.[View],
                         Film.CountryId,
                         Film.IsSeries,
                         AVG(FS.Rating) AS Star,
                         Film.Linkimg2,
                     	ROW_NUMBER() OVER (ORDER BY Film.Date DESC) AS RowNum
                     FROM 
                         Film
                     LEFT JOIN 
                         VoteFilm FS ON Film.FilmId = FS.FilmId
                     LEFT JOIN 
                         GenreFilm GF ON Film.FilmId = GF.FilmId
                     LEFT JOIN 
                         Genre ON GF.GenreId = Genre.GenreId 
                     WHERE 
                         Genre.GenreId = ? 
                         AND Film.Active = 'true'
                     GROUP BY 
                         Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                         Film.LinkTrailer, Film.[View], Film.CountryId, Film.IsSeries, Film.Linkimg2
                     ) AS Subquery
                     WHERE RowNum BETWEEN ?*?-(?-1) and ?*?;
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, genreid);
            stm.setInt(2, index);

            stm.setInt(3, pageSize);
            stm.setInt(4, pageSize);
            stm.setInt(5, index);
            stm.setInt(6, pageSize);
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
            System.out.println("get_Filmby_GenreId error" + e.getMessage());
        }
        return list;
    }

    public List<FilmHaveStarView> getFilmbyMethod(boolean isSeries, int index, int pageSize) {
        List<FilmHaveStarView> list = new ArrayList<>();

        String sql = """
                       SELECT *
                                              FROM (
                                                  SELECT Film.FilmId, [FilmName], YEAR(Date) AS Year, [Description], [LinkImg], [LinkTrailer], [View], [CountryId], [IsSeries], AVG(FS.Rating) AS Star, Film.Linkimg2,
                                                         ROW_NUMBER() OVER (ORDER BY Film.Date DESC) AS RowNum
                                                  FROM Film 
                                                  LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId 
                                                  WHERE Film.IsSeries=? AND Film.Active = 'true' 
                                                  GROUP BY 
                                                  Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                                                  Film.LinkTrailer, Film.[View], Film.CountryId, film.IsSeries, Film.Linkimg2
                                              ) AS Subquery
                                              WHERE RowNum BETWEEN ?*?-(?-1) and ?*?;
                       """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setBoolean(1, isSeries);
            stm.setInt(2, index);

            stm.setInt(3, pageSize);
            stm.setInt(4, pageSize);
            stm.setInt(5, index);
            stm.setInt(6, pageSize);
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
            System.out.println("getFilmbyMethod Successfull");
        } catch (Exception e) {
            System.out.println("getFilmbyMethod:" + e.getMessage());
        }
        return list;
    }

    public int getSizeFilmbyCountryId(int countryid) {
        try {

            String sql = """
                       SELECT COUNT(*) 
                        FROM (
                            SELECT Film.FilmId,[FilmName],YEAR(Date) AS Year,[Description],[LinkImg],[LinkTrailer],[View],[CountryId],[IsSeries], AVG(FS.Rating) AS Star,Film.Linkimg2
                            FROM Film LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId
                            where Film.CountryId=? and Film.Active='true'
                            GROUP BY 
                            Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                            Film.LinkTrailer, Film.[View], Film.CountryId,film.IsSeries,Film.Linkimg2
                            ) AS Subquery;
                       """;
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, countryid);
            rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("getSizeFilmbyCountryId:" + e.getMessage());
        }
        return 0;
    }

    public List<FilmHaveStarView> get_Filmby_CountryId(int countryid, int index, int pageSize) {
        List<FilmHaveStarView> list = new ArrayList<>();
        String sql = """
                     SELECT *
                                            FROM (
                                                SELECT Film.FilmId, [FilmName], YEAR(Date) AS Year, [Description], [LinkImg], [LinkTrailer], [View], [CountryId], [IsSeries], AVG(FS.Rating) AS Star, Film.Linkimg2,
                                                       ROW_NUMBER() OVER (ORDER BY Film.Date DESC) AS RowNum
                                                FROM Film 
                                                LEFT JOIN VoteFilm FS ON Film.FilmId = FS.FilmId 
                                                WHERE Film.CountryId=? AND Film.Active = 'true' 
                                                GROUP BY 
                                                Film.FilmId, Film.FilmName, Film.Date, Film.Description, Film.LinkImg, 
                                                Film.LinkTrailer, Film.[View], Film.CountryId, film.IsSeries, Film.Linkimg2
                                            ) AS Subquery
                                            WHERE RowNum BETWEEN ?*?-(?-1) and ?*?;
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, countryid);
            stm.setInt(2, index);

            stm.setInt(3, pageSize);
            stm.setInt(4, pageSize);
            stm.setInt(5, index);
            stm.setInt(6, pageSize);
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
            System.out.println("get_Filmby_CountryId error" + e.getMessage());
        }
        return list;
    }

    public List<Film> getMayConcern() {
        List<Film> list = new ArrayList<>();
        String sql = """
                     SELECT TOP 5 * FROM film ORDER BY NEWID();
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Film c = new Film(rs.getInt("FilmId"),
                        rs.getString("FilmName"),
                        rs.getString("Date"),
                        rs.getString("Description"),
                        rs.getString("LinkImg"),
                        rs.getString("LinkTrailer"),
                        rs.getInt("View"),
                        rs.getInt("CountryId"),
                        rs.getBoolean("IsSeries"),
                        rs.getString("Linkimg2"),
                        rs.getBoolean("Active")
                );
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println("getMayConcern error" + e.getMessage());
        }
        return list;
    }

    public List<Film> getTopView() {
        List<Film> list = new ArrayList<>();
        String sql = """
                     SELECT TOP 3 * FROM film 
                     where Active=1
                     ORDER BY [View] DESC;
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Film c = new Film(rs.getInt("FilmId"),
                        rs.getString("FilmName"),
                        rs.getString("Date"),
                        rs.getString("Description"),
                        rs.getString("LinkImg"),
                        rs.getString("LinkTrailer"),
                        rs.getInt("View"),
                        rs.getInt("CountryId"),
                        rs.getBoolean("IsSeries"),
                        rs.getString("Linkimg2"),
                        rs.getBoolean("Active")
                );
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println("getTopView error" + e.getMessage());
        }
        return list;
    }
    public int getFilmIdByEpisodeId(int Episoid) {
       
        String sql = """
                     select filmid from episode
                     where episodeid=?
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, Episoid);
            rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt("filmid");
            }
        } catch (Exception e) {
            System.out.println("getTopView error" + e.getMessage());
        }
        return 0;
    }
    public Film getFilmByfilmid(int filmid) {

        String sql = """
                     SELECT [FilmId]
                             ,[FilmName]
                             ,[Date]
                             ,[Description]
                             ,[LinkImg]
                             ,[LinkTrailer]
                             ,[View]
                             ,[CountryId]
                             ,[IsSeries]
                             ,[Linkimg2]
                             ,[Active]
                         FROM [dbo].[Film] where FilmId=?
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, filmid);
            rs = stm.executeQuery();
            while (rs.next()) {
                int FilmId = rs.getInt("FilmId");
                String FilmName = rs.getString("FilmName");
                String date = rs.getString("Date");
                String Description = rs.getString("Description");
                String LinkImg = rs.getString("LinkImg");
                String LinkTrailer = rs.getString("LinkTrailer");
                int View = rs.getInt("View");
                int CountryId = rs.getInt("CountryId");
                boolean IsSeries = rs.getBoolean("IsSeries");
                String Linkimg2 = rs.getString("Linkimg2");
                Film film = new Film(FilmId, FilmName, date, Description, LinkImg, LinkTrailer, View, CountryId, IsSeries, Linkimg2,rs.getBoolean("Active"));
                return film;
            }
        } catch (Exception e) {
            System.out.println("getFilmByfilmid error" + e.getMessage());
        }

        return null;
    }
    
     public void IsActiveFilmByMode(String filmid,String mode) {

        String sql = """                   
                         UPDATE [dbo].[Film]
                            SET 
                               [Active] =? 
                          WHERE FilmId=?
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, mode);
            stm.setString(2, filmid);
          
            rs = stm.executeQuery();
            
        } catch (Exception e) {
            System.out.println("getFilmByfilmid error" + e.getMessage());
        }   
    }
      public void addNewFilm(String filmname,String date,String description,String linkImg,String linkTrailer,String countryid,boolean isSeries,String linkImag2) {

        String sql = """                   
                         INSERT INTO [dbo].[Film]
                                    ([FilmName]
                                    ,[Date]
                                    ,[Description]
                                    ,[LinkImg]
                                    ,[LinkTrailer]
                                    ,[View]
                                    ,[CountryId]
                                    ,[IsSeries]
                                    ,[Linkimg2]
                                    ,[Active])
                              VALUES
                                    (?
                                    ,?
                                    ,?
                                    ,?
                                    ,?
                                    ,?
                                    ,?
                                    ,?
                                    ,?
                                    ,?)
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1,filmname );
            stm.setString(2,date);
            stm.setString(3,description);
            stm.setString(4, linkImg);
            stm.setString(5, linkTrailer);
            stm.setInt(6, 0);
            stm.setString(7, countryid);
            stm.setBoolean(8, isSeries);
            stm.setString(9, linkImag2);
            stm.setBoolean(10,true);
            
            
            rs = stm.executeQuery();
            
        } catch (SQLException e) {
            System.out.println(" addNewFilm error" + e.getMessage());
        }   
        
    }
      
      public void updateFilm(String filmname,String description,String linkImg,String linkTrailer,String countryid,String isSeries,String linkImag2,String filmid) {

        String sql = """                   
                         UPDATE [dbo].[Film]
                                       SET [FilmName] = ?     
                                          ,[Description] = ?
                                          ,[LinkImg] = ?
                                          ,[LinkTrailer] = ?  
                                          ,[CountryId] = ?
                                          ,[IsSeries] = ?
                                          ,[Linkimg2] = ?
                                     WHERE FilmId = ?
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1,filmname );         
            stm.setString(2,description);
            stm.setString(3, linkImg);
            stm.setString(4, linkTrailer);         
            stm.setString(5, countryid);
            stm.setString(6, isSeries);
            stm.setString(7, linkImag2);
            stm.setString(8, filmid);          
            
            
            rs = stm.executeQuery();
            
        } catch (SQLException e) {
            System.out.println(" addNewFilm error" + e.getMessage());
        }   
        
    }
      public String getNewfilmid() {
        String sql = """
                     SELECT TOP 1 FilmId
                     FROM Film
                     ORDER BY FilmId DESC;
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            
            rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getString("FilmId");
            }
        } catch (Exception e) {
            System.out.println("getFilmByfilmid error" + e.getMessage());
        }

        return null;
    }
 

     public boolean updateView(int View,int filmid) {
        int check = 0;
        String sql = """
                     UPDATE [dbo].[Film]
                        SET 
                           [View] = ?
                           
                      WHERE FilmId=?
                     """;

        try {
            
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, View);
            stm.setInt(2, filmid);
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("updateView error" + e.getMessage());
        }
        return check>0;
    }
     
 
    
}
