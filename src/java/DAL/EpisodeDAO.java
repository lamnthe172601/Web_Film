/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.Episode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kudol
 */
public class EpisodeDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public EpisodeDAO() {
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

    public List<Episode> getEpisodeByFilmId(int Filmid) {
        List<Episode> list = new ArrayList<>();
        String sql = """
                     SELECT [episodeid]
                           ,[filmid]
                           ,[linkepisode]
                           ,[name]
                           ,[Active]
                           ,[date]
                       FROM [dbo].[episode]
                       where filmid=?
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, Filmid);
            rs = stm.executeQuery();
            while (rs.next()) {
                int episodeid = rs.getInt("episodeid");
                int filmid = rs.getInt("filmid");
                String linkepisode = rs.getString("linkepisode");
                String name = rs.getString("name");
                boolean active = rs.getBoolean("Active");
                String date = rs.getString("date");
                Episode ep = new Episode(episodeid, filmid, linkepisode, name, active, date);
                list.add(ep);

            }
        } catch (Exception e) {
            System.out.println("getEpisodeByFilmId error" + e.getMessage());
        }
        return list;
    }

    public Episode getEpisodeByEpisoId(int episodeid) {
        
        String sql = """
                     SELECT [episodeid]
                           ,[filmid]
                           ,[linkepisode]
                           ,[name]
                           ,[Active]
                           ,[date]
                       FROM [dbo].[episode]
                       where episodeid=?
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1,episodeid);
            rs = stm.executeQuery();
            while (rs.next()) {
              return new Episode(episodeid, rs.getInt("filmid")
                      ,rs.getString("linkepisode")
                      ,rs.getString("name")
                      ,rs.getBoolean("Active")
                      ,rs.getString("date"));           

            }
        } catch (Exception e) {
            System.out.println("getEpisodeByFilmId error" + e.getMessage());
        }
        return null;
    }

    public void AddEpisodeByfilmid(String filmid, String linkepisode, String new_episode, String date) {

        String sql = """
                     INSERT INTO [dbo].[episode]
                                           ([filmid]
                                           ,[linkepisode]
                                           ,[name]
                                           ,[Active]
                                           ,[date])
                                     VALUES
                                           (? ,?,?,?,?)
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, filmid);
            stm.setString(2, linkepisode);
            stm.setString(3, new_episode);
            stm.setBoolean(4, true);
            stm.setString(5, date);
            rs = stm.executeQuery();
        } catch (SQLException e) {
            System.out.println("AddEpisodeByfilmid error:" + e.getMessage());
        }

    }

    public void UpdateEpisode(String linkepisode, String date, String episodeid) {
        String sql = """
                     UPDATE [dbo].[episode]
                        SET [linkepisode] = ?
                           ,[date] = ?
                      WHERE episodeid=?
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, linkepisode);
            stm.setString(2, date);
            stm.setString(3, episodeid);
            rs = stm.executeQuery();
        } catch (Exception e) {
            System.out.println("UpdateEpisode error:" + e.getMessage());
        }

    }

    public void isActiveByMode(String filmid, String episodeid, String mode) {
        String sql = """
                    UPDATE [dbo].[episode]
                      SET [Active] = ?
                       WHERE filmid=? and episodeid= ?  
                           
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, mode);
            stm.setString(2, filmid);
            stm.setString(3, episodeid);
            rs = stm.executeQuery();
        } catch (SQLException e) {
            System.out.println("isEpisodeActive error:" + e.getMessage());
        }
    }
//    public static void main(String[] args) {
//        EpisodeDAO dao = new EpisodeDAO();
//        dao.isActiveByMode("1","2","false");
//        dao.AddEpisodeByfilmid("36","ww","2","2024-01-01");
//    }
}
