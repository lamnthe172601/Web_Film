/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controllers;

import DAL.SearchDAO;
import MutiModels.FilmHaveStarView;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author kudol
 */
public class SearchController extends HttpServlet {
   
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
        // Search        
        String index_raw=request.getParameter("index");
        String txtsearch=request.getParameter("Search");        
        int index=Integer.parseInt(index_raw);        
        int pageSize=3;
        SearchDAO searchdao=new SearchDAO();
        int row=searchdao.Count(txtsearch);
        int endPage=row/pageSize;
        if(row%pageSize!=0)endPage++;
        List<FilmHaveStarView> listfilm=searchdao.getFilmbyName(txtsearch,index, pageSize);
        request.setAttribute("listfilm", listfilm);
        request.setAttribute("endPage",endPage);
        request.setAttribute("save", txtsearch);
        request.setAttribute("index_save", index);
        request.getRequestDispatcher("Views/search.jsp").forward(request, response);
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
        // Search
        
        String index_raw=request.getParameter("index");
        String txtsearch=request.getParameter("Search");
        
        int index=Integer.parseInt(index_raw);
        
        int pageSize=3;
        SearchDAO searchdao=new SearchDAO();
        int row=searchdao.Count(txtsearch);
        int endPage=row/pageSize;
        if(row%pageSize!=0)endPage++;
        List<FilmHaveStarView> listfilm=searchdao.getFilmbyName(txtsearch,index, pageSize);
        request.setAttribute("listfilm", listfilm);
        request.setAttribute("endPage",endPage);
        request.setAttribute("save", txtsearch);
        
        request.setAttribute("index_save", index);
        
        request.getRequestDispatcher("Views/search.jsp").forward(request, response);
        
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
