/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.CommentFilm;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kudol
 */
public class CommentDAO extends DBContext {

    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public CommentDAO() {
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

    public List<CommentFilm> getCommentByFilmId(int filmid) {
        List<CommentFilm> list = new ArrayList<>();
        String sql = """
                     SELECT [CommentId]
                                                  ,[CommentContent]
                                                  ,[UserId]
                                                  ,[FilmId]
                                              FROM [dbo].[CommentFilms]
                                              where FilmId=?
                       					   order by CommentId desc
                     
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setInt(1, filmid);
            rs = stm.executeQuery();
            while (rs.next()) {
                int commentid = rs.getInt("CommentId");
                String content = rs.getString("CommentContent");
                int userid = rs.getInt("UserId");
                int Filmid = rs.getInt("FilmId");
                CommentFilm comment = new CommentFilm(commentid, content, userid, Filmid);
                list.add(comment);
            }
        } catch (Exception e) {
            System.out.println("getCommentByFilmId error" + e.getMessage());
        }
        return list;
    }

    public boolean addComment(CommentFilm t) {
        int check = 0;
        String sql = """
                     INSERT INTO [dbo].[CommentFilms]
                                ([CommentContent]
                                ,[UserId]
                                ,[FilmId])
                          VALUES
                                (?,?,?)
                     """;

        try {

            stm = cnn.prepareStatement(sql);
            stm.setString(1, t.getCommentContent());
            stm.setInt(2, t.getUserId());
            stm.setInt(3, t.getFilmId());
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("addComment error" + e.getMessage());
        }
        return check > 0;
    }

    public boolean updateComment(CommentFilm t, int commentid) {
        int check = 0;
        String sql = """
                        UPDATE [dbo].[CommentFilms]
                           SET [CommentContent] =?
                         WHERE CommentId=?
                     """;

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, t.getCommentContent());
            stm.setInt(2, commentid);
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("updateComment error" + e.getMessage());
        }
        return check > 0;
    }

    public boolean deleteCommentbycommentid(int commentid) {
        int check = 0;
        String sql = """
                     DELETE FROM [dbo].[CommentFilms]
                           WHERE CommentId=?
                     """;

        try {

            stm = cnn.prepareStatement(sql);
            stm.setInt(1, check);
            stm.setInt(1, commentid);
            check = stm.executeUpdate();
        } catch (Exception e) {
            System.out.println("deleteCommentbycommentid error" + e.getMessage());
        }
        return check > 0;
    }
}
