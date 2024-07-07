/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MutiModels;

import Models.CommentFilm;
import Models.User;

/**
 *
 * @author kudol
 */
public class UserComment {
    User user;
    CommentFilm comment;

    public UserComment(User user, CommentFilm comment) {
        this.user = user;
        this.comment = comment;
    }

    public UserComment() {
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CommentFilm getComment() {
        return comment;
    }

    public void setComment(CommentFilm comment) {
        this.comment = comment;
    }
    
}
