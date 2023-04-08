<%@page import="ifrn.model.Categoria"%>
<%@page import="ifrn.model.Sexo"%>
<%@page import="ifrn.model.Curso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Atletas</title>
    </head>
    <body bgcolor="#f2f2f2">
        <form method="post" action="Cadastro_Atleta.jsp">
            <table align="center">
                <thead>
                    <tr>
                        <th colspan="2" align="center">CADASTRO DE ATLETAS</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label for="matricula"><b>Matrícula:</b></label></td>
                        <td><input type="number" size="100" name="matricula" id="matricula"/></td>
                    </tr>
                    <tr>
                        <td><label for="nome"><b>Nome:</b></label></td>
                        <td><input type="text" name="nome" id="nome"/></td>
                    </tr>
                    <tr>
                        <td><label for="sexo"><b>Sexo:</b></label></td>
                        <td>
                            <input type="radio" name="sexo" id="sexo" value="<%=Sexo.Feminino%>" checked/>Feminino
                            <input type="radio" name="sexo" id="sexo" value="<%=Sexo.Masculino%>"/>Masculino
                        </td>
                    </tr>
                    <tr>
                        <td><label for="categoria"><b>Categoria:</b></label></td>
                        <td>
                            <input type="radio" name="categoria" id="categoria" value="<%=Categoria.Aluno%>"/>Aluno
                            <input type="radio" name="categoria" id="categoria" value="<%=Categoria.Servidor%>" checked/>Servidor
                        </td>
                    </tr>
                    <tr>
                        <td><label for="curso"><b>Curso:</b></label></td>
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
                    <tr>
                        <td><label for="ano_periodo"><b>Ano/Período(0-6):</b></label></td>
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
                    <tr>
                        <th colspan="4" align="center"><hr>INSCRIÇÃO DE ATLETAS EM MODALIDADES</th>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><b>Individuais:</b></td>
                                    <td><b>Coletivas:</b></td>
                                </tr>
                                <tr>
                                    <td><input type="checkbox" id="Atlestismo" name="modalidades" value="<%=1%>"/><label for="Atletismo">Atletismo</label></td>
                                    <td><input type="checkbox" id="Basquete" name="modalidades" value="<%=2%>"/><label for="Basquete">Basquete</label></td>
                                </tr>
                                <tr>
                                    <td><input type="checkbox" id="Jiu_Jitsu" name="modalidades" value="<%=6%>"/><label for="Jiu_Jitsu">Jiu-Jitsu</label></td>
                                    <td><input type="checkbox" id="Futebol_Campo" name="modalidades" value="<%=3%>"/><label for="Futebol_Campo">Futebol de Campo</label></td>
                                </tr>
                                <tr>
                                    <td><input type="checkbox" id="Natacao" name="modalidades" value="<%=7%>"/><label for="Natacao">Natação</label></td>
                                    <td><input type="checkbox" id="Futsal" name="modalidades" value="<%=4%>"/><label for="Futsal">Futsal</label></td>
                                </tr>
                                <tr>
                                    <td><input type="checkbox" id="Tenis_Mesa" name="modalidades" value="<%=8%>"/><label for="Tenis_Mesa">Tênis de Mesa</label></td>
                                    <td><input type="checkbox" id="Handebol" name="modalidades" value="<%=5%>"/><label for="Handebol">Handebol</label></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td><input type="checkbox" id="Voleibol" name="modalidades" value="<%=9%>"/><label for="Voleibol">Voleibol</label></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="Cadastrar Atleta"/>
                            <a href="index.jsp"><input type="button" value="Voltar"/></a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
