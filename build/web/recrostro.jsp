<%-- 
    Document   : medidasfaciales
    Created on : 29/10/2016, 02:03:32 PM
    Author     : dante_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Morfoscopicos de la cara</title>
        <link rel="stylesheet" href="css/medidas.css">
    </head>
    <body>
        
        <%-- primer bloque--%>
        
        <div class="contenedor">
            
            
            <form action="rostro" method="GET">  
                
            <div class="bloque">
                      
                <div class="secciones">
                 
                        <div class="titulos">
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

                        <div class="tipos">
                            <label>TIPO DE OJOS</label>
                        </div> 
                   
            
                </div>
                
                
                
                
                
                
                <div class="secciones">
                    
                    <div class="titulos">
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
                
                    <div class="tipos">
                        <label>TIPO DE OREJA</label>
                    </div>
                    
             
                </div>

            </div>
            
            
            
            
            
            
            
            
            
        <%-- segundo bloque--%>    
        
        <div class="bloque">
            
            <div class="secciones">
        
                <div class="titulos">
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
        
                <div class="tipos">
                    <label>TIPO DE NARIZ</label>
                </div>

            </div>
        
        
            
            
        <div class="secciones">
          
                <div class="titulos">
                    <label>Boca</label>
                </div>
      
                <div class="subtitulos">
                    <label>Grosor Labios</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="GrosLab" requiered>
                </div>
      
                <div class="subtitulos">
                    <label>Eje Horizontal</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="EjeHor" requiered>
                </div>
      
                <div class="subtitulos">
                    <label>Surco Nasolabial</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="SurNaso" requiered>
                </div>
      
                <div class="subtitulos">
                    <label>Forma Comisuras</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="FormaCom" requiered>
                </div>
      
                <div class="tipos">
                    <label>TIPO DE BOCA</label>
                </div>
      
            </div>
            
            
               
        </div> 
        
        
        
        
        
        
       
        
      <%-- tercer bloque--%> 
      
        <div class="bloque">
            

            <div class="secciones">
                
                <div class="titulos">
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
      
                <div class="tipos">
                    <label>TIPO DE CARA</label>
                </div>
            
            </div>
            
            <div class="secciones">
            
                <div class="titulos">
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
        
                <div class="tipos">
                    <label>TIPO DE CABELLO</label>
                </div>
        
            </div>

        </div>
        
        
        
      
      
        
        <%-- cuarto bloque--%>
        
        <div class="bloque">
            

            <div class="secciones">
                
                <div class="titulos">
                    <label>Piel</label>
                </div>
        
                <div class="subtitulos">
                    <label>Pigmentación</label>
                </div>
                
                <div class="inputs">
                    <input type="number" step="any" name="PigmenPiel" requiered>
                </div>
        
                <div class="tipos">
                    <label>TIPO DE PIEL</label>
                </div>
        
            </div>
            
        </div>
        
        <input class="boton" type="submit" name="Entrar" value="Reconstruccion"> 
                    
        </form>
        
        </div>
    </body>
</html>
