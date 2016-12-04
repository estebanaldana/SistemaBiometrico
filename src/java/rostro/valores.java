/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rostro;

import JAVA.conjuntos.Bocasknn;
import JAVA.conjuntos.Cabelloknn;
import JAVA.conjuntos.Carasknn;
import JAVA.conjuntos.Naricesknn;
import JAVA.conjuntos.Ojosknn;
import JAVA.conjuntos.Orejasknn;
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
@WebServlet(name = "valores", urlPatterns = {"/rostro"})
public class valores extends HttpServlet {

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
            
            //oreja
            String formaPA = request.getParameter("FormaPA");
            String tubDarwin = request.getParameter("TubDarwin");
            String implobulo = request.getParameter("Implobulo");
            
            //nariz
            String raizN = request.getParameter("RaizN");
            String dorsoN = request.getParameter("DorsoN");
            String puntaN = request.getParameter("PuntaN");
            String baseN = request.getParameter("BaseN");
            String oriNasales = request.getParameter("OriNasales");
            
            //pilosidad
            String barba = request.getParameter("Barba");
            String bigote = request.getParameter("Bigote");
            
            //boca
            String grosLab = request.getParameter("GrosLab");
            String ejeHor = request.getParameter("EjeHor");
            String surNaso = request.getParameter("SurNaso");
            String formaCom = request.getParameter("FormaCom");
            
            //cara
            String contCara = request.getParameter("ContCara");
            String pil = request.getParameter("Pil");
            
            //cabello
            String formaCab = request.getParameter("FormaCab");
            String abun = request.getParameter("Abun");
            String inser = request.getParameter("Inser");
            String calvicie = request.getParameter("Calvicie");
            String pigme = request.getParameter("Pigme");
            
            //piel
            String pigmenPiel  = request.getParameter("PigmenPiel");
            
            Ojosknn ojos = new Ojosknn();
            Orejasknn orejas = new Orejasknn();
            Naricesknn nariz = new Naricesknn();
            Bocasknn boca = new Bocasknn();
            Carasknn cara  = new Carasknn();
            Cabelloknn cabello = new Cabelloknn();
            Pielknn piel = new Pielknn();
            
            //valores ojos
            double oj1 = Double.parseDouble(OformaD);
            double oj2 = Double.parseDouble(OformaI);
            double oj3 = Double.parseDouble(OinclD);
            double oj4 = Double.parseDouble(OinclI);
            double oj5 = Double.parseDouble(OcejaD);
            double oj6 = Double.parseDouble(OcejaI);
            
            //valores orejas
            double or1 = Double.parseDouble(formaPA);
            double or2 = Double.parseDouble(tubDarwin);
            double or3 = Double.parseDouble(implobulo);
            
            //valores nariz
            double na1 = Double.parseDouble(raizN);
            double na2 = Double.parseDouble(dorsoN);
            double na3 = Double.parseDouble(puntaN);
            double na4 = Double.parseDouble(baseN);
            double na5 = Double.parseDouble(oriNasales);
            
          
            //variables boca
            double bo1 = Double.parseDouble(grosLab);
            double bo2 = Double.parseDouble(ejeHor);
            double bo3 = Double.parseDouble(surNaso);
            double bo4 = Double.parseDouble(formaCom);
            
            //variables cara
            double ca1 = Double.parseDouble(contCara);
            double ca2 = Double.parseDouble(pil);
            
            //valores cabello
            double cab1 = Double.parseDouble(formaCab);
            double cab2 = Double.parseDouble(abun);
            double cab3 = Double.parseDouble(inser);
            double cab4 = Double.parseDouble(calvicie);
            double cab5 = Double.parseDouble(pigme);
            
            //valores piel
            double pl1 = Double.parseDouble(pigmenPiel);

            //ojos
            ojos.oj1 = oj1;
            ojos.oj2 = oj2;
            ojos.oj3 = oj3;
            ojos.oj4 = oj4;
            ojos.oj5 = oj5;
            ojos.oj6 = oj6;
            //orejas
            orejas.or1 = or1;
            orejas.or2 = or2;
            orejas.or3 = or3;
            //nariz
            nariz.na1 = na1;
            nariz.na2 = na2;
            nariz.na3 = na3;
            nariz.na4 = na4;
            nariz.na5 = na5;
            //pilosidad
            
            //boca
            boca.bo1 = bo1;
            boca.bo2 = bo2;
            boca.bo3 = bo3;
            boca.bo4 = bo4;
            //cara
            cara.ca1 = ca1;
            cara.ca2 = ca2;
            //cabello
            cabello.cab1 = cab1;
            cabello.cab2 = cab2;
            cabello.cab3 = cab3;
            cabello.cab4 = cab4;
            cabello.cab5 = cab5;
            //piel
            piel.pl1 = pl1;
            
            ojos.main();
            orejas.main();
            nariz.main();
            boca.main();
            cara.main();
            cabello.main();
            piel.main();
            
            String ojost = ojos.majClass;
            
            String oredt = orejas.majClass;
            
            String orec1 = "oreja1d";
            String orec2 = "oreja2d";
            String orec3 = "oreja3d";
            String orec4 = "oreja4d";
            String orec5 = "oreja5d";
            String orec6 = "oreja6d";
            
            String nart = nariz.majClass;
            
            String boct = boca.majClass;
            
            String cart = cara.majClass;
            
            String cabet = cabello.majClass;
            
            String pielt = piel.majClass;

            
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejemplo</title>");  
            if(cart == "cara1"){
            out.println("<link rel='stylesheet' href='css/cssrostros/rostro1.css'>");    
            }
            if(cart == "cara2"){
            out.println("<link rel='stylesheet' href='css/cssrostros/rostro2.css'>");    
            }
            if(cart == "cara3"){
            out.println("<link rel='stylesheet' href='css/cssrostros/rostro3.css'>");    
            }
            if(cart == "cara4"){
            out.println("<link rel='stylesheet' href='css/cssrostros/rostro4.css'>");    
            }
            else{
            out.println("<link rel='stylesheet' href='css/servlets.css'>"); 
            }
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1> Tipo de Ojos: "  +ojos.majClass +"</h1>");
            out.println("<h1> Tipo de Orejas: "  +orejas.majClass +"</h1>");
            out.println("<h1> Tipo de Nariz: "  +nariz.majClass +"</h1>");
            out.println("<h1> Tipo de Boca: " +boca.majClass +"</h1>"); 
            out.println("<h1> Tipo de Cara: "  +cara.majClass +"</h1>");
            out.println("<h1> Tipo de Cabello: "  +cabello.majClass +"</h1>");
            out.println("<h1> Color de Piel: "  +piel.majClass +"</h1>");
            out.println("</div>");
            out.println("<div class = 'Datos'> ");
            out.println("<h1>Datos Ojos: " + OformaD +" " +OformaI +" " +OinclD +" " +OinclI +" " +OcejaD +" " +OcejaI + "</h1>");
            out.println("<h1>Datos Orejas: " + formaPA +" " +tubDarwin +" " +implobulo + "</h1>");
            out.println("<h1>Datos Nariz: " + baseN +" " +dorsoN +" " +puntaN +" " +baseN +" " +oriNasales  + "</h1>");
            out.println("<h1>Datos Boca: " +grosLab  +" " +ejeHor +" " +surNaso  +" " +formaCom  + "</h1>");
            out.println("<h1>Datos Cara: " + contCara +" " +pil  + "</h1>");
            out.println("<h1>Datos Cabello: " +formaCab  +" " +abun +" " +inser +" " +calvicie +" " +pigme + "</h1>");
            out.println("<h1>Datos Piel: " +pigmenPiel  + "</h1>");
            out.println("</div>");
            
            //piel
            
            out.println("<div class = 'piel'>");
             
            out.println("<img class = 'pieles' src='pieles/"+pielt+".png'>");
            
            out.println("</div>");
            
            //cara 
            
            out.println("<div class = 'cara'>");
                  
            out.println("<img class = 'caras' src='caras/caras rostro/"+cart+".png'>");

            //conjunto
            
            out.println("<div class = 'conjunto'>");
            
            out.println("<div class = 'bloque'>");
            
            
            out.println("<div class = 'seccionore'>");
            
            if(oredt == orec1)
            {
                 out.println("<img class = 'orejas' src='orejas/oreja1i.png'>");
            }
            else if(oredt == orec2) 
            {
                out.println("<img class = 'orejas' src='orejas/oreja2i.png'>");
            } 
            else if(oredt == orec3) 
            {
                out.println("<img class = 'orejas' src='orejas/oreja3i.png'>");
            } 
            else if(oredt == orec4) 
            {
                out.println("<img class = 'orejas' src='orejas/oreja4i.png'>");
            } 
            else if(oredt == orec5) 
            {
                out.println("<img class = 'orejas' src='orejas/oreja5i.png'>");
            } 
            else if(oredt == orec6) 
            {
                out.println("<img class = 'orejas' src='orejas/oreja6i.png'>");
            } 
            
            out.println("</div>");
            
            //ojos
            
            out.println("<div class='seccionojo'>");
            
                 out.println("<img class = 'ojos' src='ojos/"+ojost+".png'>");
            
            out.println("</div>");
            
            
            //orejas derecha
            
            out.println("<div class = 'seccionore'>");
            
                 out.println("<img class = 'orejas' src='orejas/"+oredt+".png'>");
            
            out.println("</div>");
            
            
            out.println("</div>");
            
            //nariz 
            
            out.println("<div class = 'bloque1'>");

                 out.println("<img class = 'narices' src='narices/narices rostro/"+nart+".png'>");
            
            out.println("</div>");
            
            //labios
            
            out.println("<div class = 'bloque2'>");
            
                 out.println("<img class = 'bocas' src='bocas/labios rostro/"+boct+".png'>");
                 
            out.println("</div>");
            
            //conjunto
            out.println("</div>");
            
            
            
            //cara
            
            out.println("</div>");
            
            //cabello
            
            out.println("<div class = 'cabello'>");
            
            out.println("<img class = 'cabellos' src='cabello/"+cabet+".png'>");

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
