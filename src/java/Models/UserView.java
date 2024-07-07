/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kudol
 */
public class UserView {
    private int UserViewId;
    private int UserId;
    private int EpisodeId;
    private String Date;

    public UserView() {
    }

    public UserView(int UserViewId, int UserId, int EpisodeId, String Date) {
        this.UserViewId = UserViewId;
        this.UserId = UserId;
        this.EpisodeId = EpisodeId;
        this.Date = Date;
    }

    public int getUserViewId() {
        return UserViewId;
    }

    public void setUserViewId(int UserViewId) {
        this.UserViewId = UserViewId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public int getEpisodeId() {
        return EpisodeId;
    }

    public void setEpisodeId(int EpisodeId) {
        this.EpisodeId = EpisodeId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

   
    
}
