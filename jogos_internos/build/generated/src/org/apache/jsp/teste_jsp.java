package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdk.nashorn.internal.runtime.regexp.joni.constants.SyntaxProperties;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"teste.jsp\">\n");
      out.write("\n");
      out.write("            <input type=\"checkbox\" id=\"Atlestismo\" name=\"modalidades\" value=\"");
      out.print(1);
      out.write("\"/><label for=\"modalidades\">Atletismo</label>\n");
      out.write("            <input type=\"checkbox\" id=\"Basquete\" name=\"modalidades\" value=\"");
      out.print(2);
      out.write("\"/><label for=\"modalidades\">Basquete</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <input type=\"checkbox\" id=\"Jiu_Jitsu\" name=\"modalidades\" value=\"");
      out.print(3);
      out.write("\"/><label for=\"modalidades\">Jiu-Jitsu</label>\n");
      out.write("            <input type=\"checkbox\" id=\"Futebol_Campo\" name=\"modalidades\" value=\"");
      out.print(4);
      out.write("\"/><label for=\"modalidades\">Futebol de Campo</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <input type=\"checkbox\" id=\"Natacao\" name=\"modalidades\" value=\"");
      out.print(5);
      out.write("\"/><label for=\"modalidades\">Natação</label>\n");
      out.write("            <input type=\"checkbox\" id=\"Futsal\" name=\"modalidades\" value=\"");
      out.print(6);
      out.write("\"/><label for=\"modalidades\">Futsal</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <input type=\"checkbox\" id=\"Tenis_Mesa\" name=\"modalidades\" value=\"");
      out.print(7);
      out.write("\"/><label for=\"modalidades\">Tênis de Mesa</label>\n");
      out.write("            <input type=\"checkbox\" id=\"Handebol\" name=\"modalidades\" value=\"");
      out.print(8);
      out.write("\"/><label for=\"modalidades\">Handebol</label>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"dlksn\"/>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

        if(request.getParameterValues("modalidades") != null){
            for (int i = 0; i < request.getParameterValues("modalidades").length; i++) {
                out.print(request.getParameterValues("modalidades")[i] + "+");
            }
        } else{
            out.print("erro");
        }
        
        
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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
