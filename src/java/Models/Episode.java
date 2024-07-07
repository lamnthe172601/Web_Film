/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kudol
 */
public class Episode {
    private int episodeid,filmid;
    private String linkepisode,name;
   private boolean active;
    private String date;

    public Episode() {
    }

    public Episode(int episodeid, int filmid, String linkepisode, String name, boolean active, String date) {
        this.episodeid = episodeid;
        this.filmid = filmid;
        this.linkepisode = linkepisode;
        this.name = name;
        this.active = active;
        this.date = date;
    }

    public int getEpisodeid() {
        return episodeid;
    }

    public void setEpisodeid(int episodeid) {
        this.episodeid = episodeid;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public String getLinkepisode() {
        return linkepisode;
    }

    public void setLinkepisode(String linkepisode) {
        this.linkepisode = linkepisode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
}
