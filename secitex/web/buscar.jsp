<%@page import="ifrn.model.Banner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar banner</title>
    </head>
    <body>
        <jsp:useBean id="dao" class="ifrn.model.BannerDAO" scope="request"/>
        <form action="buscar.jsp">
            <table>
                <tr>
                    <td><label>Título do banner:</label></td>
                    <td><input type="text" name="titulo"></td>
                </tr>
                <tr>
                    <td colspan="2" align="right"><input type="submit" value="Buscar"></td>
                </tr>
            </table>
        </form>
        
        <c:if test="${not empty param.titulo}">
            <c:set var="bb" value="${dao.obter(param.titulo)}" scope="request"/>
            <c:out value="${bb.getResumo()}"/>
        </c:if>
    </body>
</html>
