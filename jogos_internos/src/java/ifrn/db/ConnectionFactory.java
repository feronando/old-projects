package ifrn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    /**
     * Cria e devolve uma conexão ao banco de dados.
     *
     * @param driver constante que representa o driver para o SGBD utilizado.
     * @param dbname nome da base de dados.
     * @param user nome do usuário do banco de dados.
     * @param pwd senha do usuário do banco de dados.
     * 
     * @return Uma conexão ao banco ou null caso a conexão não tenha 
     *         sido estabelecida. 
     */
    public Connection getConnection(String driver, String dbname, String user, String pwd) {
        Connection con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(getConnectionUrl(driver, dbname, user, pwd));
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }

        return con;
    }

    /** Obtém a URL para conexão com a base de dados.  */
    public String getConnectionUrl(String driver, String dbname, String user, String pwd) { 
        if (driver.equals(DBDriver.MYSQL)) {
            return "jdbc:mysql://localhost/" + dbname + "?user=" + user + "&password=" + pwd;
        } else if (driver.equals(DBDriver.SQLSERVER)) {
            return "jdbc:sqlserver://localhost; databaseName=" + dbname + "; user=" + user + ";password=" + pwd + ";";
        }
        return null;
    }
}
