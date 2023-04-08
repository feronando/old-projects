package ifrn.model;

public enum Categoria {
    Aluno(1, "Aluno"),
    Servidor(2, "Servidor");
    
    private int categoria;
    private String cat;

    Categoria(int categoria, String cat) {
        this.categoria = categoria;
        this.cat = cat;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getCat() {
        return cat;
    }
}
