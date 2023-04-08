<%-- 
    Document   : index.jsp
    Created on : 19/12/2017, 15:09:25
    Author     : Pablo Rodrigues
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
    <head>
        <title>IFRN - Controle de funcionários</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <jsp:useBean class="ifrn.cadastro.prova.funcionarioDAO" id="FuncionarioDAO" scope="request"/>
        <jsp:useBean class="ifrn.cadastro.prova.funcionario" id="Funcionario" scope="request"/>
        
        <div>
            <h2>Controle de funcionários</h2>
            <h3>prova final</h3>
            <a href="index.jsp">voltar</a>
            <%@include file="cadastrar_form.jsp" %>
        </div>
        <c:choose>
            <c:when test="${empty param.codFuncionario or empty param.nome or empty param.sexo or empty param.email or empty param.cargo}">
                <c:out value="Todos os campos devem ser preenchidos!"/>
            </c:when>
            <c:otherwise>
              <jsp:setProperty name="Funcionario" property="codFuncionario" param="codFuncionario"/>
              <jsp:setProperty name="Funcionario" property="nome" param="nome"/>
              <jsp:setProperty name="Funcionario" property="sexo" param="sexo"/>
              <jsp:setProperty name="Funcionario" property="email" param="email"/>
              <jsp:setProperty name="Funcionario" property="cargo" param="cargo"/>
                <c:choose>
                    <c:when test="${FuncionarioDAO.CriarFuncionario(Funcionario)}">
                        <c:out value="Funcionario adicionado com sucesso!"/>
                    </c:when>
                    <c:otherwise>
                        <c:out value="Funcionario não adicionado!"/>
                    </c:otherwise>
                </c:choose>
            </c:otherwise>
        </c:choose>
    </body>
</html>
