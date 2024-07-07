/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kudol
 */
public class UserDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public UserDAO() {
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
    public List<User> getUser(){
      List<User> list = new ArrayList<>();
        String sql = """
                     SELECT [UserID]
                           ,[Username]
                           ,[Password]
                           ,[Name]
                           ,[Img]
                           ,[Email]
                           ,[Phone]
                           ,[RoleId]
                       FROM [dbo].[User]
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                int userid=rs.getInt("UserID");
                String username=rs.getString("Username");
                String pass=rs.getString("Password");
                String name=rs.getString("Name");
                String img=rs.getString("Img");
                String email=rs.getString("Email");
                String phone=rs.getString("Phone");
                int roleid=rs.getInt("RoleId");
                User user=new User(userid, username, pass, name, img, email, phone, roleid);
                list.add(user);
            }
        } catch (Exception e) {
            System.out.println("getUser error" + e.getMessage());
        }
        return list;  
    }
    public User getUserbyUserId(int userid){
      
        String sql = """
                     SELECT [UserID]
                                                  ,[Username]
                                                  ,[Password]
                                                  ,[Name]
                                                  ,[Img]
                                                  ,[Email]
                                                  ,[Phone]
                                                  ,[RoleId]
                                              FROM [dbo].[User]
                       					   where UserID=?
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, userid);
            rs = stm.executeQuery();
            while (rs.next()) {
                int Userid=rs.getInt("UserID");
                String username=rs.getString("Username");
                String pass=rs.getString("Password");
                String name=rs.getString("Name");
                String img=rs.getString("Img");
                String email=rs.getString("Email");
                String phone=rs.getString("Phone");
                int roleid=rs.getInt("RoleId");
                User user=new User(Userid, username, pass, name, img, email, phone, roleid);
                return user;
            }
        } catch (Exception e) {
            System.out.println("getUserbyUserId error" + e.getMessage());
        }
        return null;  
    }
    public boolean checkUsername(String username){
        List<User> list = getUser();
        boolean check=false;
        for (User user : list) {
            if(username.equals(user.getUserName())){
                check=true;
            }
        }
        return check;
    }
    public boolean checkEmail(String email){
        List<User> list = getUser();
        boolean check=false;
        for (User user : list) {
            if(email.equals(user.getEmail())){
                check=true;
            }
        }
        return check;
    }
    public boolean checkPhone(String phone){
        List<User> list = getUser();
        boolean check=false;
        for (User user : list) {
            if(phone.equals(user.getPhone())){
                check=true;
            }
        }
        return check;
    }
    public boolean addNew(User t) {
        int check = 0;
        String sql = """
                     INSERT INTO [dbo].[User]
                                ([Username]
                                ,[Password]
                                ,[Name]
                                ,[Img]
                                ,[Email]
                                ,[Phone]
                                ,[RoleId])
                          VALUES
                                (?,?,?,?,?,?,?);
                     """;

        try {
            
            stm = cnn.prepareStatement(sql);
            stm.setString(1,t.getUserName());
            stm.setString(2,t.getPasswword());
            stm.setString(3,t.getName());
            stm.setString(4,t.getImg());
            stm.setString(5,t.getEmail());
            stm.setString(6,t.getPhone());
            stm.setInt(7,t.getRoleId());
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("addNew error" + e.getMessage());
        }
        return check>0;
    }
    public boolean updateUser(User t) {
        int check = 0;
        String sql = """
                     UPDATE [dbo].[User]
                                   SET [Username] = ?
                                      ,[Password] = ?
                                      ,[Name] = ?
                                      ,[Img] = ?
                                      ,[Email] = ?
                                      ,[Phone] = ?
                                      ,[RoleId] = ?
                                 WHERE [UserID]=?
                     """;

        try {
            
            stm = cnn.prepareStatement(sql);
            stm.setString(1,t.getUserName());
            stm.setString(2,t.getPasswword());
            stm.setString(3,t.getName());
            stm.setString(4,t.getImg());
            stm.setString(5,t.getEmail());
            stm.setString(6,t.getPhone());
            stm.setInt(7,t.getRoleId());
            stm.setInt(8,t.getUserId());
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("addNew error" + e.getMessage());
        }
        return check>0;
    }
}
