<%-- 
    Document   : index
    Created on : 27/10/2016, 08:52:06 PM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Datos Biométricos</title>
        <link rel="stylesheet" href="css/index.css">
    </head>
    <body>
    
        <div class="contenedor">
            
            
            
            <div class="bloqueuno">
                <div class="bloquecuatro">
                        <div class="labelcuatro">
                            <label>Fecha: </label>
                        </div>
                        <div class="labelcuatro">
                            <input type="date" name="Fecha" requiered/>
                        </div>
                </div>
                
                <div class="bloquecuatro">
                         <div class="labelcuatro">
                            <label>Numero de Registro: </label>
                        </div>
                        <div class="labelcuatro">
                            <input type="number" name="Folio" placeholder="Num. Registro" requiered/>
                        </div>
                </div>
            </div>
            
            
            
            <div class="bloquedos">

                    <div class="bloquetres">
                        <div class="labeltres">
                            <label>Nombre: </label>
                        </div>
                        <div class="labeltres">
                            <input type="text" name="nombre"  placeholder="Nombre"  requiered />
                        </div>
                    </div>
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Edad: </label>
                    </div>
                    <div class="labeltres">
                        <input type="number" name="edad"  placeholder="Edad"  requiered />
                    </div>
                </div>

            </div>
            
           
            
            
            
            
            <div class="bloquedos">
                <div class="labeltres">
                    <label>Sexo: </label>
                </div>
                <div class="bloquetres">
                    <div class="labeltres">
                        <input type="checkbox" name="SexoH" requiered />
                    </div> 
                    <img class="imagen"  src="imagenes/hombre.png">
                </div>
                <div class="bloquetres">
                    <div class="labeltres"> 
                        <input type="checkbox" name="SexoM" requiered />
                    </div>    
                    <img class="imagen"  src="imagenes/mujer.png">
                </div>
            </div>
            
            
            
            
            <div class="bloquedos">
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Talla: </label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="Talla" placeholder="Talla" requiedred />
                    </div>
                </div>
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Peso: </label>
                    </div>
                    <div class="labeltres">
                        <input type="number" name="Peso" placeholder="Peso" requiered />
                    </div>
                </div>
                
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Complexión: </label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="Complexion" placeholder="Complexión" requiered />
                    </div>
                </div>
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Lugar de Nacimiento</label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="Nacimiento" placeholder="Lugar de Nacimiento" requiered />
                    </div>
                </div>
            </div>



            <div class="bloquedos">
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Nombre del Padre: </label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="Padre" placeholder="Nombre del Padre" requiered />
                    </div>
                </div>
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Nombre de la Madre: </label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="Madre" placeholder="Nombre de la Madre" requiered />
                    </div>
                </div>
            </div>

            
            
            <div class="bloquedos">
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Abuelos Paternos</label>
                    </div>
                </div>
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Abuelos Maternos</label>
                    </div>
                </div>
            </div>
            
            
            
            <div class="bloquedos">
                <div class="bloquetres">    
                    <div class="labeltres">
                        <label>Nombre de la Abuela: </label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="AbuelaP" placeholder="Nombre de la Abuela" requiered />
                    </div>
                
                    <div class="labeltres">
                        <label>Nombre del Abuelo: </label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="AbueloP" placeholder="Nombre del Abuelo" requiered />
                    </div>
                </div>
                            
                <div class="bloquetres">
                    <div class="labeltres">
                        <label>Nombre de la Abuela: </label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="AbuelaM" placeholder="Nombre de la Abuela" requiered />
                    </div>
                
                    <div class="labeltres">
                        <label>Nombre del Abuelo: </label>
                    </div>
                    <div class="labeltres">
                        <input type="text" name="AbueloM" placeholder="Nombre del Abuelo" requiered />
                    </div>
                </div>    
            </div>
            
        </div>
        
        
        
        <div class="enlaces"> 
            <a class="enl" href="Seleccion.jsp">Mediadas Faciles</a>
            <a class="enl" href="antropometricasfaciales.jsp">Antropometricas Faciales</a>
        </div>
        
</body>
</html>
