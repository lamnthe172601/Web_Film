/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiDAO;

import DAL.DBContext;
import Models.FilmStar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kudol
 */
public class FilmStarDAO extends DBContext{
    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public FilmStarDAO() {
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
    public boolean VoteStar(String filmid,String rating,int userid) {
        int check = 0;
        String sql = """
                     INSERT INTO [dbo].[VoteFilm]
                                ([Rating]
                                ,[FilmId]
                                ,[UserId])
                          VALUES
                                (?,?,?)
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, rating);
            stm.setString(2, filmid);
            stm.setInt(3, userid);
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("VoteStar error" + e.getMessage());
        }
        return check>0;
    }
    public FilmStar getByUseridAndFilmId(int userid,int filmId){
        
        String sql = """
                     SELECT [VoteFilmId]
                           ,[Rating]
                           ,[FilmId]
                           ,[UserId]
                       FROM [dbo].[VoteFilm]
                       where UserId=? and FilmId=?
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, userid);
            stm.setInt(2, filmId);
            rs = stm.executeQuery();
            while (rs.next()) {
                return new FilmStar(rs.getInt("VoteFilmId"), rs.getInt("Rating"),rs.getInt("UserId"), rs.getInt("FilmId"));
            }
        } catch (Exception e) {
            System.out.println("getByUseridAndFilmId error" + e.getMessage());
        }
        
        return null;
    }
    
}
