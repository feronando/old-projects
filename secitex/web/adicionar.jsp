<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Banner</title>
    </head>
    <jsp:useBean id="db" class="ifrn.model.BannerDAO" scope="request"/>
    <jsp:useBean id="banner" class="ifrn.model.Banner" scope="request"/>
      
    <body>
        <jsp:setProperty name="banner" property="titulo" value="Título do Banner"/>
        <jsp:setProperty name="banner" property="resumo" value="Conteúdo do Banner"/>
        
        <c:choose>
            <c:when test="${db.adicionar(banner)}">
              <c:out value="Banner adicionado com sucesso!"/>
            </c:when>
            <c:otherwise>
                <c:out value="Banner não adicionado. Verifique se já não existe um banner com o mesmo título!"/>
            </c:otherwise>
        </c:choose>
    </body>
</html>
