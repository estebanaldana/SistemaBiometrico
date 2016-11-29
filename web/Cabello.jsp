<%-- 
    Document   : Cabello
    Created on : 24/11/2016, 12:59:09 AM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cabello</title>
        <link rel="stylesheet" href="rasgos/cssrasgos/cabello.css">
    </head>
    <body>
         <form action="TipoCabello" method="GET">
       <div class="bloque">
            
            <div class="secciones">
            
                <div class="titulo">
                    <label>Cabello</label>
                </div>
        
                <div class="subtitulos">
                    <label>Forma</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="FormaCab" requiered>
                </div>
                
                <div class="subtitulos">
                    <label>Abundancia</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="Abun" requiered>
                </div>
        
                <div class="subtitulos">
                    <label>Inserciones</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="Inser" requiered>
                </div>
        
                <div class="subtitulos">
                    <label>Calvicie</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="Calvicie" requiered>
                </div>
        
                <div class="subtitulos">
                    <label>Pigmentación</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="Pigme" requiered>
                </div>
        
                <div class="tipo">
                    <label>TIPO DE CABELLO</label>
                </div>
        
            </div>

           </div>
        <input class="entrar" type="submit" name="Entrar"  id="Entrar" value="Entrar"> 
     
        </form>
    </body>
</html>
