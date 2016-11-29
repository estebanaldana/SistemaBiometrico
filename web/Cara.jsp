<%-- 
    Document   : Cara
    Created on : 24/11/2016, 12:58:57 AM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cara</title>
        <link rel="stylesheet" href="rasgos/cssrasgos/cara.css">
    </head>
    <body>
        <form action="TipoCara" method="GET">
        <div class="bloque">

            <div class="seccion">
                
                <div class="titulo">
                    <label>Cara</label>
                </div>
      
                <div class="subtitulos">
                    <label>Contorno</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="ContCara" requiered>
                </div>
      
                <div class="subtitulos">
                    <label>Pilosidad</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="Pil" requiered>
                </div>
      
                <div class="tipo">
                    <label>TIPO DE CARA</label>
                </div>
            
            </div>

        </div>
        <input class="entrar" type="submit" name="Entrar"  id="Entrar" value="Entrar"> 
     
        </form>
    </body>
</html>
