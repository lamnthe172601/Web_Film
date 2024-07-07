/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAL.EpisodeDAO;
import DAL.FilmDAO;
import Models.Episode;
import Models.Film;
import Models.User;
import Models.UserView;
import MultiDAO.FilmHaveStarDAO;
import MultiDAO.UserViewDAO;
import MutiModels.FilmHaveStarView;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class EpisodeController extends HttpServlet {

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
            out.println("<title>Servlet EpisodeController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EpisodeController at " + request.getContextPath() + "</h1>");
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
         
        boolean isActive = false;

        FilmDAO filmdao = new FilmDAO();     
     //chan lien ket
        String filmid_raw = request.getParameter("id");
        String episodeid_raw = request.getParameter("episodeid");
       
        List<FilmHaveStarView> list = filmdao.getFilmTopStar();
        EpisodeDAO episodeDAO = new EpisodeDAO();
        try {            
        int filmid = Integer.parseInt(filmid_raw);
        int episodeid = Integer.parseInt(episodeid_raw);        
            for (FilmHaveStarView filmHaveStar : list) {
                if (filmid == filmHaveStar.getFilmId() && 
                        filmdao.getFilmByfilmid(Integer.parseInt(filmid_raw)).isIsActive()
                        && episodeDAO.getEpisodeByEpisoId(episodeid).isActive()) {
                    
                    isActive = true;
                    break;
                }
            } 
            if (!isActive) {
                response.sendRedirect("HomeController");
                return;
            }
        } catch (IOException | NumberFormatException e) {
            response.sendRedirect("HomeController");
            return;
        }

        doPost(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = currentDate.format(formatter);
        User account = (User) request.getSession().getAttribute("account");
        request.setAttribute("account", account);
        String episodeId_raw = request.getParameter("episodeid");

        //Top View
        FilmDAO filmdao = new FilmDAO();
        request.setAttribute("mayconcern", filmdao.getTopView());
        //Get Film
        String filmid_raw = request.getParameter("id");
        int filmid = Integer.parseInt(filmid_raw);
        List<FilmHaveStarView> list = filmdao.getFilmTopStar();
        for (FilmHaveStarView filmHaveStar : list) {
            if (filmid == filmHaveStar.getFilmId()) {
                request.setAttribute("filmdetail", filmHaveStar);
                break;
            }
        }
        //get list Episode
        EpisodeDAO episodedao = new EpisodeDAO();
        List<Episode> episodelist = episodedao.getEpisodeByFilmId(filmid);
        request.setAttribute("episodelist", episodelist);
        //get Episode detail
        try {
            for (Episode episode : episodelist) {
                if (episode.getEpisodeid()==Integer.parseInt(episodeId_raw)) {
                    request.setAttribute("episodedetail", episode);
                    break;
                }
            }
        } catch (Exception e) {
        }

        //add userview
        if (account != null && account.getUserId() != 1) {
            UserViewDAO userviewdao = new UserViewDAO();
            FilmDAO filmDAO = new FilmDAO();
            boolean isexist = false;
            int userviewid = 0;
            List<UserView> userviewlist = userviewdao.getByUserid(account.getUserId());
            for (UserView userView : userviewlist) {
                if (filmid == filmDAO.getFilmIdByEpisodeId(userView.getEpisodeId())) {
                    userviewid = userView.getUserViewId();
                    isexist = true;
                }
            }

            if (!isexist) {
                //add userview            

                userviewdao.addUserView(account.getUserId(), episodeId_raw, date);
            } else {
                //update userview               
                userviewdao.updateUserView(episodeId_raw, date, userviewid);
            }

        }
        //add Views
        Film film = filmdao.getFilmByfilmid(filmid);
        filmdao.updateView(film.getView() + 1, filmid);

        //get relate film
        FilmHaveStarDAO filmhavestardao = new FilmHaveStarDAO();
        request.setAttribute("relatefilmlist", filmhavestardao.getRanDomFilmHaveStar());
        request.getRequestDispatcher("Views/episode.jsp").forward(request, response);
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
