/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kudol
 */
public class GenreDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public GenreDAO() {
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

    public List<Genre> getAll() {
        List<Genre> list = new ArrayList<>();
        String sql = "select * from Genre";
        try {
            stm = cnn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Genre c = new Genre(rs.getInt("GenreId"),
                        rs.getString("GenreName"));
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println("GetALL error" + e.getMessage());
        }
        
        return list;
    }
    
    public Genre getGenrebyId(int id) {
        String sql = "select * from Genre where Genre.GenreId=?";
        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {
                Genre c = new Genre(rs.getInt("GenreId"),
                                           rs.getString("GenreName"));
                return c;
            }
        } catch (Exception e) {
            System.out.println("getGenrebyId error" + e.getMessage());
        }
        return null;
    }
    
//    public static void main(String[] args) {
//         GenreDAO d = new GenreDAO();
//         List<Genre> listgenre= d.getAll();
//         for (Genre genre : listgenre) {
//             System.out.println("genre");
//        }
//    }
    
}
