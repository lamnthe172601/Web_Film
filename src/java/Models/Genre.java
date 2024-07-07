/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kudol
 */
public class Genre {
    private int GenreId;
    private String GenreName;

    public Genre() {
    }

    public Genre(int GenreId, String GenreName) {
        this.GenreId = GenreId;
        this.GenreName = GenreName;
    }

    public int getGenreId() {
        return GenreId;
    }

    public void setGenreId(int GenreId) {
        this.GenreId = GenreId;
    }

    public String getGenreName() {
        return GenreName;
    }

    public void setGenreName(String GenreName) {
        this.GenreName = GenreName;
    }
    
}
