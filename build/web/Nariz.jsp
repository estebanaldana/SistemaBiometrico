<%-- 
    Document   : Nariz
    Created on : 23/11/2016, 04:49:25 PM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="rasgos/cssrasgos/nariz.css">
    </head>
    <body>
         <form action="TipoNariz" method="GET">
            <div class="bloque">
            
                <div class="seccion">
        
                    <div class="titulo">
                        <label>Nariz</label>
                    </div>
        
                    <div class="subtitulos">
                        <label>Raiz</label>
                    </div>
                
                    <div class="inputs">
                        <input type="number" step="any" name="RaizN" requiered>
                    </div>
        
                    <div class="subtitulos">
                        <label>Dorso</label>
                    </div>
                
                    <div class="inputs">
                        <input type="number" step="any" name="DorsoN" requiered>
                    </div>
        
                    <div class="subtitulos">
                        <label>Punta</label>
                    </div>
                
                    <div class="inputs">
                        <input type="number" step="any" name="PuntaN" requiered>
                    </div>
        
                    <div class="subtitulos">
                        <label>Base</label>
                    </div>
                
                    <div class="inputs">
                        <input type="number" step="any" name="BaseN" requiered>
                    </div>
        
                    <div class="subtitulos">
                        <label>Forma Orificios Nasales</label>
                    </div>
                
                    <div class="inputs">
                        <input type="number" step="any" name="OriNasales" requiered>
                    </div>
        
                    <div class="tipo">
                        <label>TIPO DE NARIZ</label>
                    </div>

                </div>
               
            </div>
        <input class="entrar" type="submit" name="Entrar" value="Aceptar"> 
     
        </form>
    </body>
</html>
