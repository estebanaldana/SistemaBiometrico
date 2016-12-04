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
        <title>Medidas Faciales</title>
        <link rel="stylesheet" href="css/seleccion.css">
    </head>
    <body>
        <div class="menu">
        <ul>
            <li><a href="">Rasgos Faciales</a>
                <ul class="rasgos">
                    <li><a class="sub" href="Ojos.jsp" target="articulo">Ojos</a></li>
                    <li><a class="sub" href="Orejas.jsp" target="articulo">Oreja</a></li>
                    <li><a class="sub" href="Nariz.jsp" target="articulo">Nariz</a></li>
                    <li><a class="sub" href="Pilocidad.jsp"  target="articulo">Pilocidad</a>
                    <li><a class="sub" href="Boca.jsp" target="articulo">Boca</a></li>
                    <li><a class="sub" href="Cara.jsp" target="articulo">Cara</a></li>
                    <li><a class="sub" href="Cabello.jsp" target="articulo">Cabello</a></li>
                    <li><a class="sub" href="Piel.jsp" target="articulo">Piel</a>
                    <li><a class="sub" href="recrostro.jsp" target="articulo">Rostro</a>
                </ul>
        </ul>
    </div>

    <div class="frame">
        <iframe  name="articulo" width="1000" height="500" frameborder="0"></iframe>
    </div>
    </body>
</html>
