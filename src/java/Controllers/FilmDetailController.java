/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAL.CommentDAO;
import DAL.EpisodeDAO;
import DAL.FilmDAO;
import Models.CommentFilm;
import Models.Episode;
import Models.FilmStar;
import Models.User;
import MultiDAO.FilmStarDAO;
import MultiDAO.GenreFilmDAO;
import MultiDAO.UserCommentDAO;
import MutiModels.FilmHaveStarView;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;

public class FilmDetailController extends HttpServlet {

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
            out.println("<title>Servlet FilmDetailController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FilmDetailController at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        //Account
        HttpSession sission = request.getSession();
        User account = (User) sission.getAttribute("account");        
        boolean isActive = false;
        //May Concern
        FilmDAO filmdao = new FilmDAO();
        request.setAttribute("mayconcern", filmdao.getTopView());
        //Get Film
        String filmid_raw = request.getParameter("id");
        int filmid = Integer.parseInt(filmid_raw);
        List<FilmHaveStarView> list = filmdao.getFilmTopStar();
        try {
            
            for (FilmHaveStarView filmHaveStar : list) {
                if (filmid == filmHaveStar.getFilmId() && filmdao.getFilmByfilmid(Integer.parseInt(filmid_raw)).isIsActive()) {
                    request.setAttribute("filmdetail", filmHaveStar);
                    isActive = true;
                    break;
                }
            } 
            if (!isActive) {
                response.sendRedirect("HomeController");
                return;
            }
        } catch (Exception e) {
            response.sendRedirect("HomeController");
            return;
        }

        //get Episode
        EpisodeDAO episodedao = new EpisodeDAO();
        List<Episode> episodelist = episodedao.getEpisodeByFilmId(filmid);
        request.setAttribute("episodelist", episodelist);
        
        if (account != null) {
            FilmStarDAO filmstardao = new FilmStarDAO();
            FilmStar filmstar2 = filmstardao.getByUseridAndFilmId(account.getUserId(), filmid);
            request.setAttribute("filmstar", filmstar2);            
            
        }
        //getComment
        UserCommentDAO usercommentdao = new UserCommentDAO();
        request.setAttribute("usercommentlist", usercommentdao.GetUserComment(filmid));
        GenreFilmDAO genrefilmdao = new GenreFilmDAO();
        request.setAttribute("genre", genrefilmdao.getGenreByFilmId(filmid));
        request.getRequestDispatcher("Views/filmDetail.jsp").forward(request, response);
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

        //Account
        User account = (User) request.getSession().getAttribute("account");
        request.setAttribute("account", account);
        //May Concern
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

//        add comment
        if (account != null) {
            
            if (request.getParameter("mode").equals("SEND")) {
                CommentFilm c = new CommentFilm();
                c.setCommentContent(request.getParameter("commentcontent"));
                c.setFilmId(filmid);
                c.setUserId(account.getUserId());
                CommentDAO commentdao = new CommentDAO();
                commentdao.addComment(c);
            } else if (request.getParameter("mode").equals("update")) {
                //update comment
                String commentid_raw = request.getParameter("commentid");
                int commentid = Integer.parseInt(commentid_raw);
                CommentFilm c = new CommentFilm();
                c.setCommentContent(request.getParameter("commentcontent"));
                CommentDAO commentdao = new CommentDAO();
                commentdao.updateComment(c, commentid);
            } else if (request.getParameter("mode").equals("delete")) {
                //delete comment
                String commentid_raw = request.getParameter("commentid");
                if (commentid_raw != null) {
                    int commentid = Integer.parseInt(commentid_raw);
                    CommentDAO commentdao = new CommentDAO();
                    commentdao.deleteCommentbycommentid(commentid);
                }
            } else if (request.getParameter("mode").equals("Vote")) {
                //Vote star
                if (request.getParameter("rating") != null) {
                    FilmStarDAO filmstardao = new FilmStarDAO();
                    FilmStar filmstar2 = filmstardao.getByUseridAndFilmId(account.getUserId(), filmid);
                    
                    if (filmstar2 != null) {
                        request.setAttribute("notice", "You have already vote!");
                    } else {
                        String rating = request.getParameter("rating");
                        
                        try {
                            filmstardao.VoteStar(filmid_raw, rating, account.getUserId());
                            request.setAttribute("notice", "Vote successfull");
                            request.setAttribute("filmstar", filmstar2);
                        } catch (Exception e) {                            
                            request.setAttribute("notice", "Vote failed");
                        }
                    }
                } else {
                    request.setAttribute("notice", "please choose your vote star");
                }
            }
            FilmStarDAO filmstardao = new FilmStarDAO();
            request.setAttribute("filmstar", filmstardao.getByUseridAndFilmId(account.getUserId(), filmid));
            UserCommentDAO usercommentdao = new UserCommentDAO();
            request.setAttribute("usercommentlist", usercommentdao.GetUserComment(filmid));
            GenreFilmDAO genrefilmdao = new GenreFilmDAO();
            request.setAttribute("genre", genrefilmdao.getGenreByFilmId(filmid));
            request.getRequestDispatcher("Views/filmDetail.jsp").forward(request, response);
        } else {
            response.sendRedirect("LoginController");
        }        
        
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
