/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import Models.User;
import MultiDAO.FilmCountryGenreDAO;
import MultiDAO.UserViewDAO;
import MutiModels.FilmCountryGenre;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author kudol
 */
public class MyFilmController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyFilmController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyFilmController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        User account = (User) request.getSession().getAttribute("account");
        FilmCountryGenreDAO filmcountrygenredao = new FilmCountryGenreDAO();
        List<FilmCountryGenre> filmcountrygenrelist = filmcountrygenredao.getMyFilmByUserId(account.getUserId());
        request.setAttribute("filmcountrygenrelist", filmcountrygenrelist);
        request.getRequestDispatcher("Views/myFilm.jsp").forward(request, response);
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
        User account = (User) request.getSession().getAttribute("account");
        //delete userview
        if (request.getParameter("userviewid") != null) {
            UserViewDAO userviewdao = new UserViewDAO();
            int userviewid = Integer.parseInt(request.getParameter("userviewid"));
            try {
                userviewdao.deleteByuserviewid(userviewid);
                request.setAttribute("mess", "delete successfull");
            } catch (Exception e) {
                request.setAttribute("mess", "delete failed");
            }
        }

        if (request.getParameter("mode") != null) {
            //delete all
            UserViewDAO userviewdao = new UserViewDAO();
            try {
                userviewdao.deleteByUserid(account.getUserId());
                request.setAttribute("mess", "delete successfull");
            } catch (Exception e) {
                request.setAttribute("mess", "delete failed ");
            }
        }
        //get bang
        FilmCountryGenreDAO filmcountrygenredao = new FilmCountryGenreDAO();
        List<FilmCountryGenre> filmcountrygenrelist = filmcountrygenredao.getMyFilmByUserId(account.getUserId());
        request.setAttribute("filmcountrygenrelist", filmcountrygenrelist);
        request.getRequestDispatcher("Views/myFilm.jsp").forward(request, response);
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
