/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAL.UserDAO;
import Models.User;
import java.io.IOException;
import java.io.PrintWriter;
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
public class LoginController extends HttpServlet {

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
            out.println("<title>Servlet LoginController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        User account = (User) session.getAttribute("account");
        
        if (account != null) {
            response.sendRedirect("HomeController");
        } else {
            String wrong = (String) request.getAttribute("wrong");
            if (wrong == null) {
                request.getRequestDispatcher("Views/login.jsp").forward(request, response);
            } else {
                if (wrong.equals("true")) {
                    request.setAttribute("notice", "Username or password wrong!");
                    request.getRequestDispatcher("Views/login.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("Views/login.jsp").forward(request, response);
                }
            }
        }

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
        HttpSession session = request.getSession();
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");
        UserDAO userdao = new UserDAO();
        List<User> userlist = userdao.getUser();
        User account = new User();
        for (User user : userlist) {
            if (user.getUserName().equals(username) && user.getPasswword().equals(password)) {
                account.setEmail(user.getEmail());
                account.setImg(user.getImg());
                account.setName(user.getName());
                account.setPasswword(user.getPasswword());
                account.setPhone(user.getPhone());
                account.setRoleId(user.getRoleId());
                account.setUserId(user.getUserId());
                account.setUserName(user.getUserName());
                break;
            }
        }
        if (account.getUserName() == null) {
            request.setAttribute("wrong", "true");
            doGet(request, response);
        } else {
            if (account.getUserName().equals(username) && account.getPasswword().equals(password)) {
                session.setAttribute("account", account);
                doGet(request, response);
            } else {
                request.setAttribute("wrong", "true");
                doGet(request, response);
            }
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
