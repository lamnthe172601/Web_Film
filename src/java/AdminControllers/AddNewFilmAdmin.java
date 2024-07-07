/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package AdminControllers;

import DAL.FilmDAO;
import MultiDAO.GenreFilmDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author kudol
 */
public class AddNewFilmAdmin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fimlname = request.getParameter("filmname");
        String releasedate = request.getParameter("releasedate");
        String description = request.getParameter("description");
        String linkImg = request.getParameter("linkimg1");
        String linkTrailer = request.getParameter("linktrailer");
        String countryid_raw = request.getParameter("country");
        String[] genreid_raw = request.getParameterValues("genre");
        String isSeriesValue = request.getParameter("isSeries");
        boolean isSeries = (isSeriesValue != null && isSeriesValue.equals("on"));
        String linkImg2 = request.getParameter("linkimg2");
        FilmDAO d = new FilmDAO();
        System.out.println(releasedate);
        try {
            d.addNewFilm(fimlname, releasedate, description, linkImg, linkTrailer, countryid_raw, isSeries, linkImg2);
        } catch (Exception e) {
            System.out.println("err is");
        }
        GenreFilmDAO genreFilmDAO = new GenreFilmDAO();
        String filmid = d.getNewfilmid();
        for (String genreid : genreid_raw) {
            genreFilmDAO.addGenreNewFilm(filmid, genreid);
        }
        response.sendRedirect("ManageFilmAdmin");

    }

}
