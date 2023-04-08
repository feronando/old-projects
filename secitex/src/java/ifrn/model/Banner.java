package ifrn.model;

import java.io.Serializable;

public class Banner implements Serializable {
    private int id; 
    private String titulo;
    private String resumo;
    
    public Banner() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    
    
}
