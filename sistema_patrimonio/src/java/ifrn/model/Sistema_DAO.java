package ifrn.model;

import ifrn.db.ConnectionFactory;
import ifrn.db.DBDriver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Sistema_DAO {

    Connection con;

    public Sistema_DAO() {
        if (con == null) {
            con = new ConnectionFactory().getConnection(DBDriver.MYSQL, "sistema_patrimonio", "root", "");
        }
    }

    public boolean adicionarPatrimonio(Patrimonio pat) {
        if (buscarPatrimonio(pat.getCodPatrimonio()) == null) {
            return false;
        } else {
            String add = "INSERT INTO patrimonio (codPatrimonio, descricao, valorPatrimonio, situacao, setor) VALUES (?,?,?,?,?)";
            PreparedStatement pst;
            try {
                pst = con.prepareStatement(add);
                pst.setInt(1, pat.getCodPatrimonio());
                pst.setString(2, pat.getDescricao());
                pst.setFloat(3, pat.getValorPatrimonio());
                pst.setInt(4, 1);
                pst.setInt(5, pat.getSetor().getCodSetor());
                int res = pst.executeUpdate();
                if (res == 1) {
                    return true;
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        return false;
    }

    public Patrimonio buscarPatrimonio(int cod) {
        Patrimonio pat = new Patrimonio();
        try {
            String existe = "SELECT * FROM patrimonio WHERE codPatrimonio = ?";
            PreparedStatement pst = con.prepareStatement(existe);
            pst.setInt(1, cod);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                pat.setCodPatrimonio(res.getInt("codPatrimonio"));
                pat.setDescricao(res.getString("descricao"));
                pat.setValorPatrimonio(res.getFloat("valorPatrimonio"));
                pat.setCodSituacao(res.getInt("situacao"));
                pat.setCodSetor(res.getInt("setor"));
                return pat;
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }
    
    public ArrayList<Patrimonio> listar() {
        String list = "SELECT * FROM patrimonio";
        ArrayList<Patrimonio> lista = new ArrayList<Patrimonio>();
        try{
            PreparedStatement pst = con.prepareStatement(list);
            ResultSet res = pst.executeQuery();
            while(res.next()){
                Patrimonio pat = new Patrimonio();
                pat.setCodPatrimonio(res.getInt("codPatrimonio"));
                pat.setDescricao(res.getString("descricao"));
                pat.setValorPatrimonio(res.getFloat("valorPatrimonio"));
                pat.setCodSituacao(res.getInt("situacao"));
                pat.setCodSetor(res.getInt("setor")); 
                lista.add(pat);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        return lista;
    }
    
    public ArrayList<Patrimonio> listar(Setor setor) {
        String list = "SELECT * FROM patrimonio WHERE setor = ?";
        ArrayList<Patrimonio> lista = new ArrayList<Patrimonio>();
        try{
            PreparedStatement pst = con.prepareStatement(list);
            pst.setInt(1, setor.getCodSetor());
            ResultSet res = pst.executeQuery();
            while(res.next()){
                Patrimonio pat = new Patrimonio();
                pat.setCodPatrimonio(res.getInt("codPatrimonio"));
                pat.setDescricao(res.getString("descricao"));
                pat.setValorPatrimonio(res.getFloat("valorPatrimonio"));
                pat.setCodSituacao(res.getInt("situacao"));
                pat.setCodSetor(res.getInt("setor")); 
                lista.add(pat);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        return lista;
    }
    
    public boolean moverPatrimonio(int cod, Setor setor) {
        if (buscarPatrimonio(cod) == null) {
            return false;
        } else {
            String add = "UPDATE patrimonio SET setor = ? WHERE codPatrimonio = ?";
            PreparedStatement pst;
            try {
                pst = con.prepareStatement(add);
                pst.setInt(1, setor.getCodSetor());
                pst.setInt(1, cod);
                int res = pst.executeUpdate();
                if (res == 1) {
                    return true;
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        return false;
    }
    
    public boolean mudarSituacao(int cod, Situacao situacao) {
        if (buscarPatrimonio(cod) == null) {
            return false;
        } else {
            if (situacao.getCodSituacao() == 5) {
                String add = "UPDATE patrimonio SET situacao = ?, setor = ? WHERE codPatrimonio = ?";
                PreparedStatement pst;
                try {
                    pst = con.prepareStatement(add);
                    pst.setInt(1, situacao.getCodSituacao());
                    pst.setInt(2, 21);
                    pst.setInt(1, cod);
                    int res = pst.executeUpdate();
                    if (res == 1) {
                        return true;
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            } else {
                String add = "UPDATE patrimonio SET situacao = ? WHERE codPatrimonio = ?";
                PreparedStatement pst;
                try {
                    pst = con.prepareStatement(add);
                    pst.setInt(1, situacao.getCodSituacao());
                    pst.setInt(1, cod);
                    int res = pst.executeUpdate();
                    if (res == 1) {
                        return true;
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        return false;
    }
    
}
