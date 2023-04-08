package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifrn.model.Categoria;
import ifrn.model.Curso;
import ifrn.model.Modalidade;
import ifrn.model.Atleta;
import java.util.ArrayList;

public final class Listar_005fAtletas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listagem de Atletas Inscritos</title>\n");
      out.write("        <style>\n");
      out.write("            table {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .cor:nth-child(even){background-color: #f2f2f2}\n");
      out.write("        </style>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#modalidade\").hide();\n");
      out.write("                });\n");
      out.write(" \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      ifrn.model.Atleta_ModalidadeDAO AtlMod = null;
      synchronized (request) {
        AtlMod = (ifrn.model.Atleta_ModalidadeDAO) _jspx_page_context.getAttribute("AtlMod", PageContext.REQUEST_SCOPE);
        if (AtlMod == null){
          AtlMod = new ifrn.model.Atleta_ModalidadeDAO();
          _jspx_page_context.setAttribute("AtlMod", AtlMod, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\" align=\"center\">LISTAGEM DE ATLETAS</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"crit\"><b>Critério:</b></label></td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"crit\" id=\"crit\">\n");
      out.write("                                <option value=\"\" selected>--</option>\n");
      out.write("                                <option value=\"todos\">Listar Todos</option>\n");
      out.write("                                <option value=\"nome\">Listar por Nome</option>\n");
      out.write("                                <option value=\"curso\">Listar por Curso</option>\n");
      out.write("                                <option value=\"ano_periodo\">Ano/Período</option>\n");
      out.write("                                <option value=\"categoria\">Listar por Categoria</option>\n");
      out.write("                                <option value=\"modalidade\">Listar por Modalidade</option>\n");
      out.write("                              </select>  \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"nome\"><b>Listar por Nome:</b></label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"nome\" id=\"nome\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"curso\"><b>Listar por Curso:</b></label></td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"curso\" id=\"curso\">\n");
      out.write("                                <option value=\"");
      out.print(Curso.Sem_Curso);
      out.write("\" selected>0 - Sem curso</option>\n");
      out.write("                                <option value=\"");
      out.print(Curso.Integrado_Informatica);
      out.write("\">1 - Técnico Integrado em Informática</option>\n");
      out.write("                                <option value=\"");
      out.print(Curso.Integrado_Mecatronica);
      out.write("\">2 - Técnico Integrado em Mecatrônica</option>\n");
      out.write("                                <option value=\"");
      out.print(Curso.Subsequente_Mecatronica);
      out.write("\">3 - Técnico Subsequente em Mecatrônica</option>\n");
      out.write("                                <option value=\"");
      out.print(Curso.Subsequente_Redes_de_Computadores);
      out.write("\">4 - Técnico Subsequente em Redes de Computadores</option>\n");
      out.write("                                <option value=\"");
      out.print(Curso.Graduacao_Tecnologia_Sistemas_para_Internet);
      out.write("\">5 - Graduação em Tecnologia em Sistemas para Internet</option>\n");
      out.write("                                <option value=\"");
      out.print(Curso.Licenciatura_Formacao_Pedagogica_Docentes);
      out.write("\">6 - Licenciatura em Formação Pedagógica de Docentes para a Educação Profissional e Tecnológica</option>\n");
      out.write("                                <option value=\"");
      out.print(Curso.PosGraduacao_Ensino_Ciencias_Naturais_E_Matematica);
      out.write("\">7 - Pós-Graduação em Ensino de Ciências Naturais e Matemática</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"ano_periodo\"><b>Listar por Ano/Período:</b></label></td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"ano_periodo\" id=\"ano_periodo\">\n");
      out.write("                                <option value=\"");
      out.print(0);
      out.write("\" selected/>0</option>\n");
      out.write("                                <option value=\"");
      out.print(1);
      out.write("\"/>1</option>\n");
      out.write("                                <option value=\"");
      out.print(2);
      out.write("\"/>2</option>\n");
      out.write("                                <option value=\"");
      out.print(3);
      out.write("\"/>3</option>\n");
      out.write("                                <option value=\"");
      out.print(4);
      out.write("\"/>4</option>\n");
      out.write("                                <option value=\"");
      out.print(5);
      out.write("\"/>5</option>\n");
      out.write("                                <option value=\"");
      out.print(6);
      out.write("\"/>6</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"categoria\"><b>Listar por Categoria:</b></label></td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" name=\"categoria\" id=\"categoria\" value=\"");
      out.print(Categoria.Aluno);
      out.write("\"/>Aluno\n");
      out.write("                            <input type=\"radio\" name=\"categoria\" id=\"categoria\" value=\"");
      out.print(Categoria.Servidor);
      out.write("\" checked/>Servidor\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"modalidade\"><b>Listar por Modalidade:</b></label></td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"modalidade\" id=\"modalidade\">\n");
      out.write("                                <option value=\"");
      out.print(1);
      out.write("\" selected>Atletismo</option>\n");
      out.write("                                <option value=\"");
      out.print(2);
      out.write("\">Basquete</option>\n");
      out.write("                                <option value=\"");
      out.print(3);
      out.write("\">Futebol de Campo</option>\n");
      out.write("                                <option value=\"");
      out.print(4);
      out.write("\">Futsal</option>\n");
      out.write("                                <option value=\"");
      out.print(5);
      out.write("\">Handebol</option>\n");
      out.write("                                <option value=\"");
      out.print(6);
      out.write("\">Jiu-Jitsu</option>\n");
      out.write("                                <option value=\"");
      out.print(7);
      out.write("\">Natação</option>\n");
      out.write("                                <option value=\"");
      out.print(8);
      out.write("\">Tênis de Mesa</option>\n");
      out.write("                                <option value=\"");
      out.print(9);
      out.write("\">Voleibol</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"right\"><input type=\"submit\" value=\"Listar\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        ");

            ArrayList<Atleta> lista = AtlMod.listar();
            if (lista.isEmpty()) {
        
      out.write("\n");
      out.write("    <center><b>Erro: Não há atletas inscritos!</b></center>\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <thead>\n");
      out.write("            <tr class=\"cor\">\n");
      out.write("                <th colspan=\"7\" align=\"center\">LISTA DE ATLETAS INSCRITOS</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"cor\">\n");
      out.write("                <th>Matrícula</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>Sexo</th>\n");
      out.write("                <th>Categoria</th>\n");
      out.write("                <th>Curso</th>\n");
      out.write("                <th>Ano/Período</th>\n");
      out.write("                <th>Modalidades</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                for (Atleta e : lista) {
            
      out.write("\n");
      out.write("            <tr class=\"cor\" align=\"center\">\n");
      out.write("                <td>");
 out.print(e.getMatricula()); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(e.getNome()); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(e.getSexo().getGenero()); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(e.getCategoria().getCat()); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(e.getCurso().getNome()); 
      out.write("</td>\n");
      out.write("                <td>");
 out.print(e.getAno_periodo()); 
      out.write("</td>\n");
      out.write("                <td>");

                    for (int h = 0; h < e.getMod().size(); h++) {
                        if (h == e.getMod().size() - 1) {
                            out.print(e.getMod().get(h).getNome());
                        } else {
                            out.print(e.getMod().get(h).getNome() + " <b>|</b> ");
                        }
                    }
                    
      out.write("       \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><td colspan=\"7\" align=\"right\"><a href=\"index.jsp\"><button>Voltar</button></a></td></td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    ");

        }
    
      out.write("\n");
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
