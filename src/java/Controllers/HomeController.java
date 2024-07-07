/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAL.*;
import Models.*;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author kudol
 */
public class HomeController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        //genre
        GenreDAO gendao = new GenreDAO();
        List<Genre> listgenre = gendao.getAll();
        session.setAttribute("listgenre", listgenre);
        //Country
        CountryDAO countrydao = new CountryDAO();
        session.setAttribute("listcountry", countrydao.getAll());
        //Film top star
        FilmDAO filmdao = new FilmDAO();
        request.setAttribute("listfilm", filmdao.getFilmTopStar());
        //New release single movie
        request.setAttribute("newreleasesinglelist", filmdao.get_NewRelease_SingleMovies());
        //TopViewed single movie
        request.setAttribute("topviewedsinglelist", filmdao.get_TopView_SingleMovies());
        //New release TV series
        request.setAttribute("newreleaseSerieslist", filmdao.get_NewRelease_TVseries());
        //TopViewed TV series
        request.setAttribute("topviewedSerieslist", filmdao.get_TopView_TVseries());
        request.getRequestDispatcher("Views/home.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
