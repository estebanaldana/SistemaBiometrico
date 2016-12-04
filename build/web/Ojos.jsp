<%-- 
    Document   : Ojos
    Created on : 23/11/2016, 02:14:27 AM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ojos</title>
        <link rel="stylesheet" href="rasgos/cssrasgos/ojos.css">
    </head>
    <body>
    <form action="TipoOjos" method="GET">
        <div class="bloque">
                      
                <div class="seccion">
                 
                        <div class="titulo">
                            <label>Ojos</label>
                        </div>


                        <div class="subtitulos">
                            <label>Forma</label>
                        </div>

                        <div class="inputs">
                            <input type="number" step="any" name="OFormaD" placeholder="Derecho"  required>
                        </div>

                        <div class="inputs">
                            <input type="number" step="any" name="OFormaI" placeholder="Izquierdo"  requiered>
                        </div>

                        <div class="subtitulos">
                            <label>Inclinación</label>
                        </div>               

                        <div class="inputs">
                            <input type="number" step="any" name="OInclD" placeholder="Derecho"  requiered>
                        </div>

                        <div class="inputs">
                            <input type="number" step="any" name="OInclI" placeholder="Izquierdo"  requiered>
                        </div>

                        <div class="subtitulos">
                            <label>Ceja</label>
                        </div>

                        <div class="inputs">
                            <input type="number" step="any" name="OCejaD" placeholder="Derecho"  requiered>
                        </div>

                        <div class="inputs">
                            <input type="number" step="any" name="OCejaI" placeholder="Izquierdo" requiered>
                        </div>

                        <div class="tipo">
                            <label>TIPO DE OJOS</label>
                        </div> 
                   
            
                </div>

            </div>
        <input class="entrar" type="submit" name="Entrar" value="Aceptar"> 
        </form>
    </body>
</html>
