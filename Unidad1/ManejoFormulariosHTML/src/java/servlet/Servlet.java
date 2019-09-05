/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio Lopez Robles
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

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
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        //processRequest(request, response);
        
        response .setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        String [] tecnologias = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica = request.getParameter("musica");
        String comentarios = request.getParameter("comentario");
        
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th colspan='2'>Tabla</th>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Usuario</td>");
            out.println("<td>"+usuario+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Password</td>");
            out.println("<td>"+password+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Tecnologias</td>");
            out.println("<td>"+tecnologias[0]+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Genero</td>");
            out.println("<td>"+genero+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Ocupacion</td>");
            out.println("<td>"+ocupacion+"</td>");
            out.println("</tr>");
            out.println("<td>Musica</td>");
            out.println("<td>"+musica+"</td>");
            out.println("</tr>");
            out.println("<td>Comentarios</td>");
            out.println("<td>"+comentarios+"</td>");
            out.println("</tr>");
            out.println("</table>");
            
//            out.println("El parametro de usuario es: " + usuario);
//            out.println("El parametro de password es: " + password);
//            out.println("El parametro de tecnologia es: " + tecnologias[0]);
//            out.println("El parametro de genero es: " + genero);
//            out.println("El parametro de ocupacion es: " + ocupacion);
//            out.println("El parametro de musica es: " + musica);
//            out.println("El parametro de comentarios es: " + comentarios);
            out.println("</body>");
            out.println("</html>");
            out.close();
            
            //Completar ocupacion, musica y comentario
            //Hacer una tabla de dos columnas patra mostrar los parametros
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
