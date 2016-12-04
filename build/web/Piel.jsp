<%-- 
    Document   : Piel
    Created on : 24/11/2016, 12:59:17 AM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Piel</title>
        <link rel="stylesheet" href="rasgos/cssrasgos/piel.css">
    </head>
    <body>
         <form action="TipoPiel" method="GET">
        <div class="bloque">

            <div class="seccion">
                
                <div class="titulo">
                    <label>Piel</label>
                </div>
        
                <div class="subtitulos">
                    <label>Pigmentación</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="PigmenPiel" requiered>
                </div>
        
                <div class="tipo">
                    <label>TIPO DE PIEL</label>
                </div>
        
            </div>
           </div>
        <input class="entrar" type="submit" name="Entrar" value="Aceptar"> 
     
        </form>
    </body>
</html>
