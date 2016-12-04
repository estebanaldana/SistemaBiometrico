/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA;

import JAVA.conjuntos.Orejasknn;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dante_000
 */
@WebServlet(name = "varOrejas", urlPatterns = {"/TipoOrejas"})
public class varOrejas extends HttpServlet {

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
        PrintWriter out = response.getWriter();
         try {
          
            //oreja
            String formaPA = request.getParameter("FormaPA");
            String tubDarwin = request.getParameter("TubDarwin");
            String implobulo = request.getParameter("Implobulo");
            
            //clases
            Orejasknn orejas = new Orejasknn();

            //valores orejas
            double or1 = Double.parseDouble(formaPA);
            double or2 = Double.parseDouble(tubDarwin);
            double or3 = Double.parseDouble(implobulo);
            
            //orejas
            orejas.or1 = or1;
            orejas.or2 = or2;
            orejas.or3 = or3;
            
            
            orejas.main();

            
            String orec1 = orejas.majClass;

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejemplo</title>");  
            out.println("<link rel='stylesheet' href='rasgos/cssservelest/orejasserv.css'>");    
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1> Tipo de Orejas: "  +orejas.majClass +"</h1>");
            out.println("</div>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1>Datos Orejas: " + formaPA +", " +tubDarwin +", " +implobulo + "</h1>");
            out.println("</div>");
            
           
            
            out.println("<div class = 'conjunto'>");

            out.println("<div class = 'seccionore'>");
            
                 out.println("<img class = 'orejas' src='orejas/"+orec1+".png'>");
            
            out.println("</div>");
            
            out.println("</div>");
            
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        processRequest(request, response);
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
