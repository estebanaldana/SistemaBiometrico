<%-- 
    Document   : Seleccion
    Created on : 22/11/2016, 08:45:52 PM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/seleccion.css">
    </head>
    <body>
        <div class="menu">
        <ul>
            <li><a href="">Rasgos Faciales</a>
                <ul class="rasgos">
                    <li><a href="Ojos.jsp" target="articulo">Ojos</a></li>
                    <li><a href="Orejas.jsp" target="articulo">Oreja</a></li>
                    <li><a href="Nariz.jsp" target="articulo">Nariz</a></li>
                    <li><a href="Pilocidad.jsp"  target="articulo">Pilocidad</a>
                    <li><a href="Boca.jsp" target="articulo">Boca</a></li>
                    <li><a href="Cara.jsp" target="articulo">Cara</a></li>
                    <li><a href="Cabello.jsp" target="articulo">Cabello</a></li>
                    <li><a href="Piel.jsp" target="articulo">Piel</a>
                </ul>
        </ul>
    </div>

    <div class="frame">
        <iframe  name="articulo" width="1000" height="500" frameborder="0"></iframe>
    </div>
    </body>
</html>
