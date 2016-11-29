<%-- 
    Document   : Boca
    Created on : 23/11/2016, 04:58:13 PM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Boca</title>
        <link rel="stylesheet" href="rasgos/cssrasgos/boca.css">
    </head>
    <body>
        <form action="TipoBoca" method="GET">
        <div class="bloque">
            
            <div class="seccion">
          
                <div class="titulo">
                    <label>Boca</label>
                </div>
      
                <div class="subtitulos">
                    <label>Grosor Labios</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="GrosLab" requiered>
                </div>
      
                <div class="subtitulos">
                    <label>Eje Horizontal</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="EjeHor" requiered>
                </div>
      
                <div class="subtitulos">
                    <label>Surco Nasolabial</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="SurNaso" requiered>
                </div>
      
                <div class="subtitulos">
                    <label>Forma Comisuras</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="FormaCom" requiered>
                </div>
      
                <div class="tipo">
                    <label>TIPO DE BOCA</label>
                </div>
      
            </div>
            
            </div>
        <input class="entrar" type="submit" name="Entrar"  id="Entrar" value="Entrar"> 
     
        </form>
        
    </body>
</html>
