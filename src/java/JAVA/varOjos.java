/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA;

import JAVA.conjuntos.Ojosknn;
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
@WebServlet(name = "varOjos", urlPatterns = {"/TipoOjos"})
public class varOjos extends HttpServlet {

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
            //ojos
            String OformaD = request.getParameter("OFormaD");
            String OformaI = request.getParameter("OFormaI");
        
            String OinclD = request.getParameter("OInclD");
            String OinclI = request.getParameter("OInclI");
        
            String OcejaD = request.getParameter("OCejaD");
            String OcejaI = request.getParameter("OCejaI");

            //clases
            Ojosknn ojos = new Ojosknn();
 
            //valores ojos
            double oj1 = Double.parseDouble(OformaD);
            double oj2 = Double.parseDouble(OformaI);
            double oj3 = Double.parseDouble(OinclD);
            double oj4 = Double.parseDouble(OinclI);
            double oj5 = Double.parseDouble(OcejaD);
            double oj6 = Double.parseDouble(OcejaI);
           
            //ojos
            ojos.oj1= oj1;
            ojos.oj2 = oj2;
            ojos.oj3 = oj3;
            ojos.oj4 = oj4;
            ojos.oj5 = oj5;
            ojos.oj6 = oj6;
          
            
            ojos.main();
            
            String ojoAl = "Almendrados";
            String ojoAs = "Asiaticos";
            String ojoCai = "Caidos";  
            String ojoEn = "Entornados";
            String ojoHun = "Hundidos";
            String ojoJu = "Juntos";
            String ojoSal = "Saltones";
            String ojoSep = "Separados";

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejemplo</title>");  
            out.println("<link rel='stylesheet' href='rasgos/cssservelest/ojosserv.css'>");    
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1> Tipo de Ojos: "  +ojos.majClass +"</h1>");
            out.println("</div>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1>Datos Ojos: " + OformaD +", " +OformaI +", " +OinclD +", " +OinclI +", " +OcejaD +", " +OcejaI + "</h1>");
            out.println("</div>");
            
            
            out.println("<div class = 'conjunto'>");
            
            out.println("<div class = 'bloque'>");

            out.println("<div class='seccionojo'>");
            if(ojos.majClass == ojoAl)
            {
                 out.println("<img class = 'ojos' src='ojos/ojosalmendradost.png'>");
            }
            else if(ojos.majClass == ojoAs) 
            {
                out.println("<img class = 'ojos' src='ojos/ojosasiaticost.png'>");
            } 
            else if(ojos.majClass == ojoCai)
            {
                out.println("<img class = 'ojos' src='ojos/ojoscaidost.png'>");
            }
            else if(ojos.majClass == ojoEn) 
            {
                out.println("<img class = 'ojos' src='ojos/ojosentornadost.png'>");
            } 
            else if(ojos.majClass == ojoHun)
            {
                out.println("<img class = 'ojos' src='ojos/ojoshundidost.png'>");
            }
            else if(ojos.majClass == ojoJu) 
            {
                out.println("<img class = 'ojos' src='ojos/ojosjuntost.png'>");
            } 
            else if(ojos.majClass == ojoSal)
            {
                out.println("<img class = 'ojos' src='ojos/ojossaltonest.png'>");
            }
            else if(ojos.majClass == ojoSep) 
            {
                out.println("<img class = 'ojos' src='ojos/ojosseparadost.png'>");
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
