/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA;

import JAVA.conjuntos.Cabelloknn;
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
@WebServlet(name = "varCabello", urlPatterns = {"/TipoCabello"})
public class varCabello extends HttpServlet {

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
            
            
            //cabello
            String formaCab = request.getParameter("FormaCab");
            String abun = request.getParameter("Abun");
            String inser = request.getParameter("Inser");
            String calvicie = request.getParameter("Calvicie");
            String pigme = request.getParameter("Pigme");

            //clases
            Cabelloknn cabello = new Cabelloknn();
            
            
            //valores cabello
            double cab1 = Double.parseDouble(formaCab);
            double cab2 = Double.parseDouble(abun);
            double cab3 = Double.parseDouble(inser);
            double cab4 = Double.parseDouble(calvicie);
            double cab5 = Double.parseDouble(pigme);
            
            
            //cabello
            cabello.cab1 = cab1;
            cabello.cab2 = cab2;
            cabello.cab3 = cab3;
            cabello.cab4 = cab4;
            cabello.cab5 = cab5;
            
            
            cabello.main();
            
           
            
            String cabe1 = "Cabello Crespo";
            String cabe2 = "Cabello Liso";
            String cabe3 = "Cabello Grueso y Recto";
            String cabe4 = "Cabello Ondulado";
            String cabe5 = "Cabello Grueso y Ondulado";
            String cabe6 = "Cabello Grueso y Liso";
            
            
            
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejemplo</title>");  
            out.println("<link rel='stylesheet' href='rasgos/cssservelest/cabelloserv.css'>");    
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1> Tipo de Cabello: "  +cabello.majClass +"</h1>");
            out.println("</div>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1>Datos Cabello: " +formaCab  +", " +abun +", " +inser +", " +calvicie +", " +pigme + "</h1>");
            out.println("</div>");
            
            
            
            
            out.println("<div class = 'conjunto'>");
            
            out.println("<div class = 'bloque'>");
            
            
            out.println("<div class = 'seccioncab'>");
            
            if(cabello.majClass == cabe1)
            {
            out.println("<img class = 'cabellos' src='cabello/cabello1.png'>");
            }
            if(cabello.majClass == cabe2)
            {
            out.println("<img class = 'cabellos' src='cabello/cabello2.png'>");
            }
            if(cabello.majClass == cabe3)
            {
            out.println("<img class = 'cabellos' src='cabello/cabello3.png'>");
            }
            if(cabello.majClass == cabe4)
            {
            out.println("<img class = 'cabellos' src='cabello/cabello4.png'>");
            }
            if(cabello.majClass == cabe5)
            {
            out.println("<img class = 'cabellos' src='cabello/cabello5.png'>");
            }
            if(cabello.majClass == cabe6)
            {
            out.println("<img class = 'cabellos' src='cabello/cabello6.png'>");
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
