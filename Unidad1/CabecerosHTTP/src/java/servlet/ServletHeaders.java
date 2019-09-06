/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio Lopez Robles
 */
@WebServlet(name = "ServletHeaders", urlPatterns = {"/ServletHeaders"})
public class ServletHeaders extends HttpServlet {

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
            out.println("<title>Servlet ServletHeaders</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletHeaders at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
            //Obtener informacion de los headers
            String metodoHttp = request.getMethod();
            String ur = request.getRequestURI();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cabecera HTTP (metadatos)</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>METODOS DE HTTP</h1>");
            out.println("Metodos HTTP: " + metodoHttp);
            out.println("<br><br>");
            out.println("URI solicitado: " + ur);
            out.println("</body>");
            out.println("</html>");
        
        }finally{
            out.close();
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
        //processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
            //Obtener informacion de los headers
            String metodoHttp = request.getMethod();
            String ur = request.getRequestURI();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cabecera HTTP (metadatos)</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>METODOS DE HTTP</h1>");
            out.println("Metodos HTTP: " + metodoHttp);
            out.println("<br><br>");
            out.println("URI solicitado: " + ur);
            out.println("<br><br>");
            Enumeration cabeceros = request.getHeaderNames();
            while(cabeceros.hasMoreElements()){
                String nombreCabecero = (String) cabeceros.nextElement();
                out.println("<b>"+nombreCabecero+"</b>");
                out.println(request.getHeader(nombreCabecero));
                out.println("<br>");
            }
            
            out.println("</body>");
            out.println("</html>");
        
        }finally{
            out.close();
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
