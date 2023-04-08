<%@page import="java.util.ArrayList"%>
<%@page import="ifrn.model.Modalidade"%>
<%@page import="ifrn.model.Curso"%>
<%@page import="ifrn.model.Categoria"%>
<%@page import="ifrn.model.Sexo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cadastro de Atletas</title>
    </head>
    <body bgcolor="#f2f2f2">
        <jsp:useBean class="ifrn.model.Atleta_ModalidadeDAO" id="alt_mod" scope="request"/>
        <jsp:useBean class="ifrn.model.Atleta" id="atl" scope="request"/>
        <%@include file="form.jsp" %>
        <c:choose>
            <c:when test="${empty param.matricula or empty param.nome or empty param.modalidades}">
                <c:out value="Erro: Todos os campos devem ser preenchidos!"/>
            </c:when>
            <c:otherwise>
                <%
                    atl.setMod(request.getParameterValues("modalidades"));
                %>
                <jsp:setProperty name="atl" property="matricula" param="matricula"/>
                <jsp:setProperty name="atl" property="nome" param="nome"/>
                <jsp:setProperty name="atl" property="sexo" param="sexo"/>
                <jsp:setProperty name="atl" property="categoria" param="categoria"/>
                <jsp:setProperty name="atl" property="curso" param="curso"/>
                <jsp:setProperty name="atl" property="ano_periodo" param="ano_periodo"/>
                <c:choose>
                    <c:when test="${alt_mod.adicionar(atl)}">
                        <c:out value="O atleta foi cadastrado com sucesso!"/>
                    </c:when>
                    <c:otherwise>
                        <c:out value="Erro: Ocorreu algum problema na inscrição do atleta!"/>
                    </c:otherwise>
                </c:choose>
            </c:otherwise>
        </c:choose>
</html>
