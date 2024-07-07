/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kudol
 */
public class CommentFilm {
    private int CommentId;
    private String CommentContent;
    private int UserId;
    private int FilmId;

    public CommentFilm() {
    }

    public CommentFilm(int CommentId, String CommentContent, int UserId, int FilmId) {
        this.CommentId = CommentId;
        this.CommentContent = CommentContent;
        this.UserId = UserId;
        this.FilmId = FilmId;
    }

    public int getCommentId() {
        return CommentId;
    }

    public void setCommentId(int CommentId) {
        this.CommentId = CommentId;
    }

    public String getCommentContent() {
        return CommentContent;
    }

    public void setCommentContent(String CommentContent) {
        this.CommentContent = CommentContent;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public int getFilmId() {
        return FilmId;
    }

    public void setFilmId(int FilmId) {
        this.FilmId = FilmId;
    }
    
}
