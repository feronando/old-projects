<%@page import="ifrn.cadastro.prova.funcionario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<jsp:useBean class="ifrn.cadastro.prova.funcionarioDAO" id="FuncionarioDAO" scope="request"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    </head>
    <body>
        
        <h2>Controle de funcionários</h2>
              <h3>prova final</h3>
              <a href="index.jsp">voltar</a>
<%
            ArrayList<funcionario> funcionarios = FuncionarioDAO.obterTodosFuncionarios();
            if (funcionarios.isEmpty()) {
        %>
    <center><b>Não há funcionários cadastrados!</b></center>
        <%
        } else {
        %>
    <table>
        <thead>
            <tr class="cor">
                <th colspan="7" align="center">LISTA DE FUNCIONÁRIOS</th>
            </tr>
            <tr class="cor">
                <th>Código do Funcionário</th>
                <th>Nome</th>
                <th>Sexo</th>
                <th>Email</th>
                <th>Cargo</th>
            </tr>
        </thead>
        <tbody>
            <%
                for (funcionario e : funcionarios) {
            %>
            <tr class="cor" align="center">
                <td><% out.print(e.getCodFuncionario()); %></td>
                <td><% out.print(e.getNome()); %></td>
                <td><% out.print(e.getSexo()); %></td>
                <td><% out.print(e.getEmail()); %></td>
                <td><% out.print(e.getCargo()); %></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
    <%
        }
    %>
    </body>
</html>
