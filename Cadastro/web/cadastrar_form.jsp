<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IFRN - Controle de funcionários</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method="post" action="cadastrar.jsp">
            <br><label for="codFuncionario">Código do Funcionário:</label>
            <input type="number" name="codFuncionario" id="codFuncionario"/><br><br>
            <label for="Nome">Nome:</label>
            <input type="text" name="nome" id="nome"/><br><br>
            <a>Sexo:</a>
            <select name="sexo" id="sexo">
                <option value="masculino">Masculino</option>
                <option value="feminino">Feminino</option>
            </select><br><br>
            <label for="email">Email:</label>
            <input type="email" name="email" id="email"/><br><br>
            <label for="cargo">Cargo:</label>
            <input type="text" name="cargo" id="cargo"/><br><br>
            <input type="submit" value="cadastrar"/>
        </form>
    </body>
</html>
