/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA;

import JAVA.conjuntos.Bocasknn;
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
@WebServlet(name = "varBoca", urlPatterns = {"/TipoBoca"})
public class varBoca extends HttpServlet {

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
           
            
            //boca
            String grosLab = request.getParameter("GrosLab");
            String ejeHor = request.getParameter("EjeHor");
            String surNaso = request.getParameter("SurNaso");
            String formaCom = request.getParameter("FormaCom");
            
            
            
            //clases
            Bocasknn bocas = new Bocasknn();

            
            
            //variables boca
            double bo1 = Double.parseDouble(grosLab);
            double bo2 = Double.parseDouble(ejeHor);
            double bo3 = Double.parseDouble(surNaso);
            double bo4 = Double.parseDouble(formaCom);
            
            
            //boca
            bocas.bo1 = bo1;
            bocas.bo2 = bo2;
            bocas.bo3 = bo3;
            bocas.bo4 = bo4;
            
            
            bocas.main();
            
            
            
            String boc1 = bocas.majClass;
            

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejemplo</title>");  
            out.println("<link rel='stylesheet' href='rasgos/cssservelest/bocaserv.css'>");    
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1> Tipo de Boca: "  +bocas.majClass +"</h1>"); 
            out.println("</div>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1>Datos Boca: " +grosLab  +", " +ejeHor +", " +surNaso  +", " +formaCom  + "</h1>");
            out.println("</div>");
            
            
            
            
            out.println("<div class = 'conjunto'>");
           
            out.println("<div class = 'seccionboc'>");

                 out.println("<img class = 'bocas' src='bocas/labios frente/"+boc1+".png'>");
  
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
