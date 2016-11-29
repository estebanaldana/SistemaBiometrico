package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro de Datos Biométricos</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"bloqueuno\">\n");
      out.write("                <div class=\"bloquecuatro\">\n");
      out.write("                        <div class=\"labelcuatro\">\n");
      out.write("                            <label>Fecha: </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"labelcuatro\">\n");
      out.write("                            <input type=\"date\" name=\"Fecha\" requiered/>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"bloquecuatro\">\n");
      out.write("                         <div class=\"labelcuatro\">\n");
      out.write("                            <label>Numero de Registro: </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"labelcuatro\">\n");
      out.write("                            <input type=\"number\" name=\"Folio\" placeholder=\"Num. Registro\" requiered/>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"bloquedos\">\n");
      out.write("                    <div class=\"bloquetres\">\n");
      out.write("                        <div class=\"labeltres\">\n");
      out.write("                            <label>Nombre: </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"labeltres\">\n");
      out.write("                            <input type=\"text\" name=\"Nombre\" placeholder=\"Nombre\" requiered />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Edad: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"number\" name=\"Edad\" placeholder=\"Edad\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"bloquedos\">\n");
      out.write("                <div class=\"labeltres\">\n");
      out.write("                    <label>Sexo: </label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"checkbox\" name=\"SexoH\" requiered />\n");
      out.write("                    </div> \n");
      out.write("                    <img class=\"imagen\"  src=\"imagenes/hombre.png\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\"> \n");
      out.write("                        <input type=\"checkbox\" name=\"SexoM\" requiered />\n");
      out.write("                    </div>    \n");
      out.write("                    <img class=\"imagen\"  src=\"imagenes/mujer.png\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"bloquedos\">\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Talla: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"Talla\" placeholder=\"Talla\" requiedred />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Peso: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"number\" name=\"Peso\" placeholder=\"Peso\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Complexión: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"Complexion\" placeholder=\"Complexión\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Lugar de Nacimiento</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"Nacimiento\" placeholder=\"Lugar de Nacimiento\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"bloquedos\">\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Nombre del Padre: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"Padre\" placeholder=\"Nombre del Padre\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Nombre de la Madre: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"Madre\" placeholder=\"Nombre de la Madre\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"bloquedos\">\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Abuelos Paternos</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Abuelos Maternos</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"bloquedos\">\n");
      out.write("                <div class=\"bloquetres\">    \n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Nombre de la Abuela: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"AbuelaP\" placeholder=\"Nombre de la Abuela\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Nombre del Abuelo: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"AbueloP\" placeholder=\"Nombre del Abuelo\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                            \n");
      out.write("                <div class=\"bloquetres\">\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Nombre de la Abuela: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"AbuelaM\" placeholder=\"Nombre de la Abuela\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <label>Nombre del Abuelo: </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"labeltres\">\n");
      out.write("                        <input type=\"text\" name=\"AbueloM\" placeholder=\"Nombre del Abuelo\" requiered />\n");
      out.write("                    </div>\n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"enlaces\">\n");
      out.write("            \n");
      out.write("            <a href=\"medidasfaciales.jsp\">Enalce</a>\n");
      out.write("            <a href=\"antropometricasfaciales.jsp\">Enalce</a>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
