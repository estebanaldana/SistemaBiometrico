<%-- 
    Document   : Orejas
    Created on : 23/11/2016, 04:38:36 PM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Orejas</title>
        <link rel="stylesheet" href="rasgos/cssrasgos/orejas.css">
    </head>
    <body>
        <form action="TipoOrejas" method="GET">
            <div class="bloque">

                    <div class="seccion">
                    
                        <div class="titulo">
                            <label>Oreja</label>
                        </div>
                
                        <div class="subtitulos">
                            <label>Forma Pabellón auricular</label>
                        </div>
                
                        <div class="inputs">
                            <input type="number" step="any" name="FormaPA"  requiered>
                        </div>
                
                        <div class="subtitulos">
                            <label>Tubérculo de Darwin</label>
                        </div>
                
                        <div class="inputs">
                            <input type="number" step="any" name="TubDarwin"  requiered>
                        </div>
                
                        <div class="subtitulos">
                            <label>Implantación del lóbulo</label>
                        </div>
                
                        <div class="inputs">
                            <input type="number" step="any" name="Implobulo" requiered>
                        </div>
                
                        <div class="tipo">
                            <label>TIPO DE OREJA</label>
                        </div>
                    
             
                    </div>

                </div>
            <input class="entrar" type="submit" name="Entrar"  id="Entrar" value="Entrar"> 
     
        </form>
    </body>
</html>
