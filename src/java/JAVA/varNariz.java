/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA;

import JAVA.conjuntos.Naricesknn;
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
@WebServlet(name = "varNariz", urlPatterns = {"/TipoNariz"})
public class varNariz extends HttpServlet {

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
            
            
            //nariz
            String raizN = request.getParameter("RaizN");
            String dorsoN = request.getParameter("DorsoN");
            String puntaN = request.getParameter("PuntaN");
            String baseN = request.getParameter("BaseN");
            String oriNasales = request.getParameter("OriNasales");
            
            
            //clases
            Naricesknn narices = new Naricesknn();
   
            
            
            //valores nariz
            double na1 = Double.parseDouble(raizN);
            double na2 = Double.parseDouble(dorsoN);
            double na3 = Double.parseDouble(puntaN);
            double na4 = Double.parseDouble(baseN);
            double na5 = Double.parseDouble(oriNasales);
            
            
            //nariz
            narices.na1 = na1;
            narices.na2 = na2;
            narices.na3 = na3;
            narices.na4 = na4;
            narices.na5 = na5;
            
            
            narices.main();
            

            String nac1 = narices.majClass;
            

            
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejemplo</title>");  
            out.println("<link rel='stylesheet' href='rasgos/cssservelest/narizserv.css'>");    
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1> Tipo de Nariz: "  +narices.majClass +"</h1>");
            out.println("</div>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1>Datos Nariz: " + baseN +", " +dorsoN +", " +puntaN +", " +baseN +", " +oriNasales  + "</h1>");
            out.println("</div>");
            
            

            out.println("<div class = 'conjunto'>");
            
            out.println("<div class = 'bloque'>");
            
            
            out.println("<div class = 'seccionnar'>");

                 out.println("<img class = 'narices' src='narices/superior/"+nac1+".png'>");

            out.println("</div>");
            
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
