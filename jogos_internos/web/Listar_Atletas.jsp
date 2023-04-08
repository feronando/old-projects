<%@page import="ifrn.model.Categoria"%>
<%@page import="ifrn.model.Curso"%>
<%@page import="ifrn.model.Modalidade"%>
<%@page import="ifrn.model.Atleta"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de Atletas Inscritos</title>
        <style>
            table {
                border-collapse: collapse;
                width: 100%;
            }

            th, td {
                padding: 8px;
            }

            .cor:nth-child(even){background-color: #f2f2f2}
        </style>
        <script src="jquery-2.2.1.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#nome2').hide();
                $('#curso2').hide();
                $('#categoria2').hide();
                $('#ano_periodo2').hide();
                $('#modalidade2').hide();

                $('#crit').change(function () {
                    if ($('#crit').val === 2){
                        $('#nome2').show();
                    } else if($('#crit').val === 3){
                        $('#curso2').show();
                    } else if($('#crit').val === 4){
                        $('#ano_periodo2').show();
                    } else if($('#crit').val === 5){
                        $('#categoria2').show();
                    } else if($('#crit').val === 6){
                        $('#modalidade2').show();
                    }
                });
            });

        </script>
    </head>
    <body>
        <jsp:useBean class="ifrn.model.Atleta_ModalidadeDAO" id="AtlMod" scope="request"/>

        <form>
            <table>
                <thead>
                    <tr>
                        <th colspan="2" align="center">LISTAGEM DE ATLETAS</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label for="crit"><b>Critério:</b></label></td>
                        <td>
                            <select name="crit" id="crit">
                                <option value="" selected>--</option>
                                <option value="<%=1%>">Listar Todos</option>
                                <option value="<%=2%>">nome</option>
                                <option value="<%=3%>">Listar por Curso</option>
                                <option value="<%=4%>">Ano/Período</option>
                                <option value="<%=5%>">Listar por Categoria</option>
                                <option value="<%=6%>">Listar por Modalidade</option>
                            </select>  
                        </td>
                    </tr>
                    <tr id="nome2">
                        <td><label for="nome"><b>Listar por Nome:</b></label></td>
                        <td><input type="text" name="nome" id="nome"/></td>
                    </tr>
                    <tr id="curso2">
                        <td><label for="curso"><b>Listar por Curso:</b></label></td>
                        <td>
                            <select name="curso" id="curso">
                                <option value="<%=Curso.Sem_Curso%>" selected>0 - Sem curso</option>
                                <option value="<%=Curso.Integrado_Informatica%>">1 - Técnico Integrado em Informática</option>
                                <option value="<%=Curso.Integrado_Mecatronica%>">2 - Técnico Integrado em Mecatrônica</option>
                                <option value="<%=Curso.Subsequente_Mecatronica%>">3 - Técnico Subsequente em Mecatrônica</option>
                                <option value="<%=Curso.Subsequente_Redes_de_Computadores%>">4 - Técnico Subsequente em Redes de Computadores</option>
                                <option value="<%=Curso.Graduacao_Tecnologia_Sistemas_para_Internet%>">5 - Graduação em Tecnologia em Sistemas para Internet</option>
                                <option value="<%=Curso.Licenciatura_Formacao_Pedagogica_Docentes%>">6 - Licenciatura em Formação Pedagógica de Docentes para a Educação Profissional e Tecnológica</option>
                                <option value="<%=Curso.PosGraduacao_Ensino_Ciencias_Naturais_E_Matematica%>">7 - Pós-Graduação em Ensino de Ciências Naturais e Matemática</option>
                            </select>
                        </td>
                    </tr>
                    <tr id="ano_periodo2">
                        <td><label for="ano_periodo"><b>Listar por Ano/Período:</b></label></td>
                        <td>
                            <select name="ano_periodo" id="ano_periodo">
                                <option value="<%=0%>" selected/>0</option>
                                <option value="<%=1%>"/>1</option>
                                <option value="<%=2%>"/>2</option>
                                <option value="<%=3%>"/>3</option>
                                <option value="<%=4%>"/>4</option>
                                <option value="<%=5%>"/>5</option>
                                <option value="<%=6%>"/>6</option>
                            </select>
                        </td>
                    </tr>
                    <tr id="categoria2">
                        <td><label for="categoria"><b>Listar por Categoria:</b></label></td>
                        <td>
                            <input type="radio" name="categoria" id="categoria" value="<%=Categoria.Aluno%>"/>Aluno
                            <input type="radio" name="categoria" id="categoria" value="<%=Categoria.Servidor%>" checked/>Servidor
                        </td>
                    </tr>
                    <tr id="modalidade2">
                        <td><label for="modalidade"><b>Listar por Modalidade:</b></label></td>
                        <td>
                            <select name="modalidade" id="modalidade">
                                <option value="<%=1%>" selected>Atletismo</option>
                                <option value="<%=2%>">Basquete</option>
                                <option value="<%=3%>">Futebol de Campo</option>
                                <option value="<%=4%>">Futsal</option>
                                <option value="<%=5%>">Handebol</option>
                                <option value="<%=6%>">Jiu-Jitsu</option>
                                <option value="<%=7%>">Natação</option>
                                <option value="<%=8%>">Tênis de Mesa</option>
                                <option value="<%=9%>">Voleibol</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="right"><input type="submit" value="Listar"/></td>
                    </tr>
                </tbody>
            </table>

        </form>
        <%
            ArrayList<Atleta> lista = AtlMod.listar();
            if (lista.isEmpty()) {
        %>
    <center><b>Erro: Não há atletas inscritos!</b></center>
        <%
        } else {
        %>
    <table>
        <thead>
            <tr class="cor">
                <th colspan="7" align="center">LISTA DE ATLETAS INSCRITOS</th>
            </tr>
            <tr class="cor">
                <th>Matrícula</th>
                <th>Nome</th>
                <th>Sexo</th>
                <th>Categoria</th>
                <th>Curso</th>
                <th>Ano/Período</th>
                <th>Modalidades</th>
            </tr>
        </thead>
        <tbody>
            <%
                for (Atleta e : lista) {
            %>
            <tr class="cor" align="center">
                <td><% out.print(e.getMatricula()); %></td>
                <td><% out.print(e.getNome()); %></td>
                <td><% out.print(e.getSexo().getGenero()); %></td>
                <td><% out.print(e.getCategoria().getCat()); %></td>
                <td><% out.print(e.getCurso().getNome()); %></td>
                <td><% out.print(e.getAno_periodo()); %></td>
                <td><%
                    for (int h = 0; h < e.getMod().size(); h++) {
                        if (h == e.getMod().size() - 1) {
                            out.print(e.getMod().get(h).getNome());
                        } else {
                            out.print(e.getMod().get(h).getNome() + " <b>|</b> ");
                        }
                    }
                    %>       
                </td>
            </tr>
            <%
                }
            %>
            <tr>
                <td><td colspan="7" align="right"><a href="index.jsp"><button>Voltar</button></a></td></td>
            </tr>
        </tbody>
    </table>
    <%
        }
    %>
</body>
</html>
