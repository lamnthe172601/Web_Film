/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.*;
import DAL.DBContext;
import java.util.*;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kudol
 */
public class CountryDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public CountryDAO() {
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

    public List<Country> getAll() {
        List<Country> list = new ArrayList<>();
        String sql = "select * from Country";
        try {
            stm = cnn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Country c = new Country(rs.getInt("CountryId"),
                        rs.getString("CountryName"));
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println("GetALL error" + e.getMessage());
        }
        return list;
    }

    public Country getCountrybyId(int id) {
        String sql = "select * from Country where Country.Countryid=?";
        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {
                Country c = new Country(rs.getInt("CountryId"),
                        rs.getString("CountryName"));
                return c;
            }
        } catch (Exception e) {
            System.out.println("getCountrybyId error" + e.getMessage());
        }
        return null;
    }
}
