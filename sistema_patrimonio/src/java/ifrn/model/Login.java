package ifrn.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "LoginSP")
public class Login implements Serializable{
    private String login;
    private String senha;
    
    public Login(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String realizarLogin(){
        Usuario user = new Usuario();
        if(login.equals(user.getLogin()) && senha.equals(user.getSenha())) {
            return "/menu.faces"; 
        } else {
            return "/erroLogin.faces";
        }
    }
}
