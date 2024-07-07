/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kudol
 */
public class FilmStar {
    private int voteFilmId;
    private int Rating;
    private int UserId;
    private int FilmId;

    public FilmStar() {
    }

    public FilmStar(int voteFilmId, int Rating, int UserId, int FilmId) {
        this.voteFilmId = voteFilmId;
        this.Rating = Rating;
        this.UserId = UserId;
        this.FilmId = FilmId;
    }

    public int getVoteFilmId() {
        return voteFilmId;
    }

    public void setVoteFilmId(int voteFilmId) {
        this.voteFilmId = voteFilmId;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
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
