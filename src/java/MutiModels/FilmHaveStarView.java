/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MutiModels;

/**
 *
 * @author kudol
 */
public class FilmHaveStarView {

    private int FilmId;
    private String FilmName;
    private String Date;
    private String Description;
    private String LinkImg;
    private String LinkTrailer;
    private int View;
    private int CountryId;
    private boolean IsSeries;
    private int Star;
    private String LinkImg2;

    public FilmHaveStarView() {
    }

    public FilmHaveStarView(int FilmId, String FilmName, String Date, String Description, String LinkImg, String LinkTrailer, int View, int CountryId, boolean IsSeries, int Star, String LinkImg2) {
        this.FilmId = FilmId;
        this.FilmName = FilmName;
        this.Date = Date;
        this.Description = Description;
        this.LinkImg = LinkImg;
        this.LinkTrailer = LinkTrailer;
        this.View = View;
        this.CountryId = CountryId;
        this.IsSeries = IsSeries;
        this.Star = Star;
        this.LinkImg2 = LinkImg2;
    }

    public String getLinkImg2() {
        return LinkImg2;
    }

    public void setLinkImg2(String LinkImg2) {
        this.LinkImg2 = LinkImg2;
    }

    public int getStar() {
        return Star;
    }

    public void setStar(int Star) {
        this.Star = Star;
    }

    public boolean isIsSeries() {
        return IsSeries;
    }

    public void setIsSeries(boolean IsSeries) {
        this.IsSeries = IsSeries;
    }

    public int getFilmId() {
        return FilmId;
    }

    public void setFilmId(int FilmId) {
        this.FilmId = FilmId;
    }

    public String getFilmName() {
        return FilmName;
    }

    public void setFilmName(String FilmName) {
        this.FilmName = FilmName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getLinkImg() {
        return LinkImg;
    }

    public void setLinkImg(String LinkImg) {
        this.LinkImg = LinkImg;
    }

    public String getLinkTrailer() {
        return LinkTrailer;
    }

    public void setLinkTrailer(String LinkTrailer) {
        this.LinkTrailer = LinkTrailer;
    }

    public int getView() {
        return View;
    }

    public void setView(int View) {
        this.View = View;
    }

    public int getCountryId() {
        return CountryId;
    }

    public void setCountryId(int CountryId) {
        this.CountryId = CountryId;
    }

}
