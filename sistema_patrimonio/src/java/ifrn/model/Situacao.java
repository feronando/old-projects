package ifrn.model;

public enum Situacao {
    Uso(1, "Em uso"),
    Def(2, "Defeituoso"),
    Dep(3, "No depósito"),
    Que(4, "Quebrado"),
    Ina(5, "Inacessível");

    private int codSituacao;
    private String situacao;

    Situacao(int codSituacao, String situacao) {
        this.codSituacao = codSituacao;
        this.situacao = situacao;
    }

    public int getCodSituacao() {
        return codSituacao;
    }

    public String getSituacao() {
        return situacao;
    }
}
