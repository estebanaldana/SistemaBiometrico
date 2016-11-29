<%-- 
    Document   : Pilocidad
    Created on : 23/11/2016, 04:54:17 PM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pilocidad</title>
        <link rel="stylesheet" href="rasgos/cssrasgos/pilocidad.css">
    </head>
    <body>
       <form action="TipoPilocidad" method="GET">
       <div class="bloque">

            <div class="seccion">
                
                <div class="titulo">
                    <label>Pilosidad</label>
                </div>
      
                <div class="subtitulos">
                    <label>Barba</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="Barba" requiered>
                </div>
      
                <div class="subtitulos">
                    <label>Bigote</label>
                </div>
                    
                <div class="inputs">
                    <input type="number" step="any" name="Bigote" requiered>
                </div>
      
                <div class="tipo">
                    <label>TIPO DE PILOSIDAD</label>
                </div>
                
            </div>
            
               
        </div>
           <input class="entrar" type="submit" name="Entrar"  id="Entrar" value="Entrar"> 
     
        </form>
    </body>
</html>
