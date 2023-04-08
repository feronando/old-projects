package ifrn.model;

public enum Modalidade {
    Atl(1,"Atletismo",Tipo.Individual),
    Bas(2,"Basquete", Tipo.Coletiva),
    FutC(3,"Futebol de Campo",Tipo.Coletiva),
    Futs(4,"Futsal",Tipo.Coletiva),
    Han(5,"Handebol",Tipo.Coletiva),
    JiuJ(6,"Jiu-Jitsu",Tipo.Individual),
    Nat(7,"Natação",Tipo.Individual),
    TenM(8,"Tenis de Mesa",Tipo.Individual),
    Vol(9,"Voleibol",Tipo.Coletiva);
    
    private final int cod;
    private final String nome;
    private final Tipo tipo;

    Modalidade(int cod, String nome, Tipo tipo) {
        this.cod = cod;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
