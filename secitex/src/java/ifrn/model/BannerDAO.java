package ifrn.model;

import ifrn.db.ConnectionFactory;
import ifrn.db.DBDriver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BannerDAO implements BannerDAO_I {
    Connection con; 
    
    public BannerDAO () {
        if (con == null) {
            con = new ConnectionFactory().getConnection(DBDriver.MYSQL,"sctpar", "root", "");
        }
    }
    
    @Override
    public boolean adicionar(Banner banner) {
        if (existe(banner)) {
            return false; 
        } else{
            String adicionar = "INSERT INTO banner (id, titulo, resumo) VALUES (?,?,?)";
            PreparedStatement pst;
            try {
                pst = con.prepareStatement(adicionar);
                pst.setInt(1, banner.getId());
                pst.setString(2, banner.getTitulo());
                pst.setString(3, banner.getResumo());
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
    
    public boolean existe(Banner banner) {
        if (banner == null){ 
            return false; 
        } else{
            try {
                String existe = "SELECT titulo FROM banner WHERE titulo = ?";
                PreparedStatement pst = con.prepareStatement(existe);
                pst.setString(1,banner.getTitulo()); 
                ResultSet res = pst.executeQuery(); 
                if (res.next()) {
                    if (res.getString("titulo").equals(banner.getTitulo())) {
                        return true; 
                    }
                } 
            } catch (SQLException ex) {
                throw new RuntimeException(ex); 
            }
        }
        return false; 
    }

    @Override
    public List<Banner> obterTodos() {
        String sql = "select * from banner";
        ArrayList<Banner> tod = new ArrayList<Banner>();
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            while(res.next()){
                Banner b = new Banner();
                b.setId(res.getInt("id"));
                b.setTitulo(res.getString("titulo"));
                b.setResumo(res.getString("resumo"));
                tod.add(b);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        return tod;
    }

    @Override
    public Banner obter(String titulo) {
        String obter = "SELECT * FROM banner WHERE titulo = ?";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(obter);
            pst.setString(1, titulo);
            ResultSet res = pst.executeQuery();
            if(res.next()){
                Banner b = new Banner();
                b.setId(res.getInt("id"));
                b.setTitulo(res.getString("titulo"));
                b.setResumo(res.getString("resumo"));
                return b;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public boolean atualizar(Banner banner) {
        String atualizar = "UPDATE banner SET titulo = ?, resumo = ? WHERE id = ?";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(atualizar);
            pst.setString(1, banner.getTitulo());
            pst.setString(2, banner.getResumo());
            pst.setInt(1, banner.getId());
            int res = pst.executeUpdate();
            if(res == 1){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean remover(Banner banner) {
        String remover = "DELETE FROM banner WHERE id = ?";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(remover);
            pst.setInt(1, banner.getId());
            int res = pst.executeUpdate();
            if(res == 1){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
