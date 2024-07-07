/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiDAO;

import DAL.CommentDAO;
import DAL.DBContext;
import DAL.UserDAO;
import Models.CommentFilm;
import Models.User;
import MutiModels.UserComment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kudol
 */
public class UserCommentDAO extends DBContext{
    java.sql.Connection cnn;//ket noi voi database
    PreparedStatement stm;//dung de thuc hien cau lenh sql
    ResultSet rs;//dung de luu tru xu ly du lieu

    public UserCommentDAO() {
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
    public List<UserComment> GetUserComment(int filmid){
        List<UserComment> usercommentlist=new ArrayList<>();
        UserDAO userdao=new UserDAO();
        CommentDAO commentdao=new CommentDAO();
        List<CommentFilm> commentlist=commentdao.getCommentByFilmId(filmid);
        for (CommentFilm commentFilm : commentlist) {
            UserComment userComment=new UserComment();
            userComment.setComment(commentFilm);
            User user=userdao.getUserbyUserId(commentFilm.getUserId());
            userComment.setUser(user);
            usercommentlist.add(userComment);
        }
        return usercommentlist;
    }
    
}
