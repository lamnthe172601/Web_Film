/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiDAO;

import DAL.DBContext;
import Models.UserView;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kudol
 */
public class UserViewDAO extends DBContext{
    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public UserViewDAO() {
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
    public List<UserView> getByUserid(int userid){
        List<UserView> list = new ArrayList<>();
        String sql = """
                     SELECT [UserViewId]
                             ,[UserId]
                             ,[EpisodeId]
                             ,[Date]
                     FROM [dbo].[UserView] where UserID=?
                     order by Date desc
                     """;
        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, userid);
            rs = stm.executeQuery();
            while (rs.next()) {
                int UserViewId=rs.getInt("UserViewId");
                int UserId=rs.getInt("UserId");
                int EpisodeId=rs.getInt("EpisodeId");
                String date=rs.getString("Date");
                UserView uv=new UserView(UserViewId, UserId, EpisodeId, date);
                list.add(uv);
            }
        } catch (Exception e) {
            System.out.println("getByUserid error" + e.getMessage());
        }
        
        return list;
    }
    public boolean addUserView(int userId, String episodeId,String date) {
        int check = 0;
        String sql = """
                     INSERT INTO [dbo].[UserView]
                                ([UserId]
                                ,[EpisodeId]
                                ,[Date])
                          VALUES
                                (?,?,?)
                     """;

        try {
            
            stm = cnn.prepareStatement(sql);
            stm.setInt(1,userId);
            stm.setString(2,episodeId);
            stm.setString(3,date);
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("addUserView error" + e.getMessage());
        }
        return check>0;
    }
    public boolean updateUserView(String episodeId,String date,int userviewid) {
        int check = 0;
        String sql = """
                     UPDATE [dbo].[UserView]
                        SET [EpisodeId] = ?,
                         [Date] = ?
                      WHERE UserViewId=?
                     """;

        try {
            
            stm = cnn.prepareStatement(sql);
            stm.setString(1, episodeId);
            stm.setString(2, date);
            stm.setInt(3,userviewid);
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("updateUserView error" + e.getMessage());
        }
        return check>0;
    }
    public boolean deleteByuserviewid(int userviewid) {
        int check = 0;
        String sql = """
                     DELETE FROM [dbo].[UserView]
                           WHERE UserViewId=?
                     """;

        try {
            
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, userviewid);
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("deleteByuserviewid error" + e.getMessage());
        }
        return check>0;
    }
    public boolean deleteByUserid(int userid) {
        int check = 0;
        String sql = """
                     DELETE FROM [dbo].[UserView]
                           WHERE UserId=?
                     """;

        try {
            
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, userid);
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("deleteByUserid error" + e.getMessage());
        }
        return check>0;
    }
   
  
}
