package ifrn.cadastro.prova;

import ifrn.cadastro.db.DBConnection;
import ifrn.cadastro.db.DBDriver;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class funcionarioDAO implements Serializable {

    Connection con;

    public funcionarioDAO() {
        if (con == null) {
            con = new DBConnection().getConnection(DBDriver.MYSQL, "ifrn", "root", "");
        }
    }

    public boolean CriarFuncionario(funcionario funcionario) {
        if(existe(funcionario)){
            return false;
        } else {
            String nf = "INSERT INTO funcionario (codFuncionario, nome, sexo, email, cargo) VALUES (?,?,?,?,?)";
            PreparedStatement pst;
            try {
                pst = con.prepareStatement(nf);
                pst.setInt(1, funcionario.getCodFuncionario());
                pst.setString(2, funcionario.getNome());
                pst.setString(3, funcionario.getSexo());
                pst.setString(4, funcionario.getEmail());
                pst.setString(5, funcionario.getCargo());
                int res = pst.executeUpdate();
                if (res == 1) {
                    return true;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public boolean existe(funcionario funcionario) {
        try {
            String existe = "SELECT codFuncionario FROM funcionario WHERE codFuncionario = ?";
            PreparedStatement pst = con.prepareStatement(existe);
            pst.setInt(1, funcionario.getCodFuncionario());
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                if (res.getLong("codFuncionario") == funcionario.getCodFuncionario()) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return false;
    }

    public ArrayList<funcionario> obterTodosFuncionarios() {
        String todos = "SELECT * FROM funcionario";
        PreparedStatement ps;
        ArrayList<funcionario> funcionarios = new ArrayList<>();
        try {
            ps = con.prepareStatement(todos);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                funcionario a = new funcionario();
                a.setCodFuncionario(rs.getInt("codFuncionario"));
                a.setNome(rs.getString("nome"));
                a.setSexo(rs.getString("sexo"));
                a.setEmail(rs.getString("email"));
                a.setCargo(rs.getString("cargo"));
                funcionarios.add(a);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return funcionarios;
    }
}
