/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controllers;

import DAL.CountryDAO;
import DAL.FilmDAO;
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
public class CountryController extends HttpServlet {
   
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
        CountryDAO countrydao=new CountryDAO();       
        //Ten genre
        String countryid_raw=request.getParameter("id");
        int countryid=Integer.parseInt(countryid_raw);
        String index_raw=request.getParameter("index");
        int index=Integer.parseInt(index_raw);
        int pageSize=3;
        FilmDAO filmdao=new FilmDAO();
        List<FilmHaveStarView> listfilm =filmdao.get_Filmby_CountryId(countryid, index, pageSize);
        int row=filmdao.getSizeFilmbyCountryId(countryid);
        int endPage=row/pageSize;
        if(row%pageSize!=0)endPage++;
        request.setAttribute("listfilm", listfilm);
        request.setAttribute("endPage",endPage);
        request.setAttribute("save", countryid);
        request.setAttribute("index_save", index);
        request.setAttribute("country",countrydao.getCountrybyId(countryid));
        request.getRequestDispatcher("Views/country.jsp").forward(request, response);
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
