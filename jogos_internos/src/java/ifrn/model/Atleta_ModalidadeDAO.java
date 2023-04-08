package ifrn.model;

import ifrn.db.ConnectionFactory;
import ifrn.db.DBDriver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Atleta_ModalidadeDAO {

    Connection con;

    public Atleta_ModalidadeDAO() {
        if (con == null) {
            con = new ConnectionFactory().getConnection(DBDriver.MYSQL, "jogos_internos", "root", "");
        }
    }

    public boolean adicionar(Atleta atl) {
        if (existe(atl)) {
            return false;
        } else {
            int l = 0;
            for (int k = 0; k < atl.getMod().size(); k++) {
                if (atl.getMod().get(k).getTipo().getCod() == 2) {
                    l++;
                }
            }
            if (l > 3) {
                return false;
            } else {
                String add = "insert into atleta (Matricula, Nome, Sexo, Categoria, Curso, Ano_Periodo) values (?,?,?,?,?,?)";
                String add_2 = "insert into atleta_modalidade (Matricula_Atleta, Cod_Modalidade) values (?,?)";
                PreparedStatement pst;
                PreparedStatement psta;
                try {
                    pst = con.prepareStatement(add);
                    pst.setLong(1, atl.getMatricula());
                    pst.setString(2, atl.getNome());
                    pst.setInt(3, atl.getSexo().getCod());
                    pst.setInt(4, atl.getCategoria().getCategoria());
                    if (atl.getCategoria() == Categoria.Servidor) {
                        pst.setInt(5, 0);
                        pst.setInt(6, 0);
                    } else {
                        pst.setInt(5, atl.getCurso().getCod());
                        pst.setInt(6, atl.getAno_periodo());
                    }
                    int res = pst.executeUpdate();
                    int rest = 2;
                    psta = con.prepareStatement(add_2);
                    for (int i = 0; i < atl.getMod().size(); i++) {
                        psta.setLong(1, atl.getMatricula());
                        psta.setInt(2, atl.getMod().get(i).getCod());
                        rest = psta.executeUpdate();
                    }
                    if (rest == 1 && res == 1) {
                        return true;
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        return false;
    }

    public boolean existe(Atleta atl) {
        try {
            String existe = "select Matricula from atleta where Matricula = ?";
            PreparedStatement pst = con.prepareStatement(existe);
            pst.setLong(1, atl.getMatricula());
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                if (res.getLong("Matricula") == atl.getMatricula()) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return false;
    }
    
    public ArrayList<Atleta> listar() {
        String list = "select * from atleta";
        String am = "select * from atleta_modalidade where Matricula_Atleta = ?";
        ArrayList<Atleta> lista = new ArrayList<Atleta>();
        try{
            PreparedStatement pst = con.prepareStatement(list);
            ResultSet resp = pst.executeQuery();
            while(resp.next()){
                Atleta atl = new Atleta();
                atl.setMatricula(resp.getLong("Matricula"));
                atl.setNome(resp.getString("Nome"));
                atl.setSexo(resp.getInt("Sexo"));
                atl.setCategoria(resp.getInt("Categoria"));
                atl.setCurso(resp.getInt("Curso"));
                atl.setAno_periodo(resp.getInt("Ano_Periodo"));
                PreparedStatement kgb = con.prepareStatement(am);
                kgb.setLong(1, atl.getMatricula());
                ResultSet resu = kgb.executeQuery();
                while(resu.next()){
                    atl.setMod(resu.getInt("Cod_Modalidade"));
                }
                lista.add(atl);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        return lista;
    }
}
