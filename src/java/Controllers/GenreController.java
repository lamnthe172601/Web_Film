/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controllers;

import DAL.CountryDAO;
import DAL.FilmDAO;
import DAL.GenreDAO;
import Models.Genre;
import Models.User;
import MutiModels.FilmHaveStarView;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author dodat
 */
public class GenreController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        GenreDAO gendao = new GenreDAO();       
        //Ten genre
        String genreid_raw=request.getParameter("id");
        int genreid=Integer.parseInt(genreid_raw);
        String index_raw=request.getParameter("index");
        int index=Integer.parseInt(index_raw);
        int pageSize=3;
        FilmDAO filmdao=new FilmDAO();
        List<FilmHaveStarView> listfilm =filmdao.get_Filmby_GenreId(genreid, index, pageSize);
        int row=filmdao.getSizeFilmbyGenreID(genreid);
        int endPage=row/pageSize;
        if(row%pageSize!=0)endPage++;
        request.setAttribute("listfilm", listfilm);
        request.setAttribute("endPage",endPage);
        request.setAttribute("save", genreid);
        request.setAttribute("index_save", index);
        request.setAttribute("genre", gendao.getGenrebyId(genreid));
        request.getRequestDispatcher("Views/genre.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
