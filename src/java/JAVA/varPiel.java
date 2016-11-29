/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA;

import JAVA.conjuntos.Pielknn;
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
@WebServlet(name = "varPiel", urlPatterns = {"/TipoPiel"})
public class varPiel extends HttpServlet {

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
            
            
            //piel
            String pigmenPiel  = request.getParameter("PigmenPiel");
            
            
            //clases
            Pielknn piel = new Pielknn();
            
            
            //valores piel
            double pl1 = Double.parseDouble(pigmenPiel);

            //piel
            piel.pl1 = pl1;
            
            piel.main();
           
            
            String piel1 = "Piel Blanca";
            String piel2 = "Piel Blanco Claro";
            String piel3 = "Piel Oscura";
            String piel4 = "Piel Morena";
            String piel5 = "Piel Morena Oscura";
            String piel6 = "Piel Negra";

            
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejemplo</title>");  
            out.println("<link rel='stylesheet' href='rasgos/cssservelest/pielserv.css'>");    
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1> Color de Piel: "  +piel.majClass +"</h1>");
            out.println("</div>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1>Datos Piel: " +pigmenPiel  + "</h1>");
            out.println("</div>");
            
            
            
            
            out.println("<div class = 'conjunto'>");
            
            out.println("<div class = 'bloque'>");
            
            
            out.println("<div class = 'seccionpiel'>");
            
            if(piel.majClass == piel1)
            {
            out.println("<img class = 'pieles' src='pieles/piel1.png'>");
            }
            if(piel.majClass == piel2)
            {
            out.println("<img class = 'pieles' src='pieles/piel2.png'>");
            }
            if(piel.majClass == piel3)
            {
            out.println("<img class = 'pieles' src='pieles/piel3.png'>");
            }
            if(piel.majClass == piel4)
            {
            out.println("<img class = 'pieles' src='pieles/piel4.png'>");
            }
            if(piel.majClass == piel5)
            {
            out.println("<img class = 'pieles' src='pieles/piel5.png'>");
            }
            if(piel.majClass == piel6)
            {
            out.println("<img class = 'pieles' src='pieles/piel6.png'>");
            }
            
            out.println("</div>");

            out.println("</div>");

            //conjunto
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
