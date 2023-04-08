package ifrn.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@Named("Navegacao")
@ManagedBean()
public class MenuNavegacao implements Serializable{
    private Patrimonio pat;
    private Sistema_DAO sistema;
    
    public MenuNavegacao(){
        sistema = new Sistema_DAO();
        pat = new Patrimonio();
    }

    public Patrimonio getPat() {
        return pat;
    }

    public void setPat(Patrimonio pat) {
        this.pat = pat;
    }

    public Sistema_DAO getSistema() {
        return sistema;
    }

    public void setSistema(Sistema_DAO sistema) {
        this.sistema = sistema;
    }
    
    public String adicionar(){
        if(sistema.adicionarPatrimonio(pat)){
            pat = new Patrimonio();
            return "/mensagemSucesso.faces";
        } else{
            pat = new Patrimonio();
            return "/mensagemErro.faces";
        }
    }
    
    public String buscar(){
        pat = sistema.buscarPatrimonio(pat.getCodPatrimonio());
        if(pat != null){
            return "/buscar2.faces";
        } else{
            return "/mensagemErro.faces";
        }
    }
}
