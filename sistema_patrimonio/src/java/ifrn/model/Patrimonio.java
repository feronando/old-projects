package ifrn.model;

public class Patrimonio{
    private int codPatrimonio;
    private String descricao;
    private float valorPatrimonio;
    private Situacao situacao;
    private Setor setor;
    private int codSetor;
    private int codSituacao;
    
    public Patrimonio(){}

    public int getCodPatrimonio() {
        return codPatrimonio;
    }

    public void setCodPatrimonio(int codPatrimonio) {
        this.codPatrimonio = codPatrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorPatrimonio() {
        return valorPatrimonio;
    }

    public void setValorPatrimonio(float valorPatrimonio) {
        this.valorPatrimonio = valorPatrimonio;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public int getCodSituacao() {
        return codSituacao;
    }

    public void setCodSituacao(int codSituacao) {
        this.codSituacao = codSituacao;
        switch (codSituacao) {
            case 1:
                this.situacao = Situacao.Uso;
                break;
            case 2:
                this.situacao = Situacao.Def;
                break;
            case 3:
                this.situacao = Situacao.Dep;
                break;
            case 4:
                this.situacao = Situacao.Que;
                break;
            case 5:
                this.situacao = Situacao.Ina;
                break;
        }
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
        switch (codSetor) {
            case 1:
                this.setor = Setor.Apo;
                break;
            case 2:
                this.setor = Setor.Cai;
                break;
            case 3:
                this.setor = Setor.Can;
                break;
            case 4:
                this.setor = Setor.CeaM;
                break;
            case 5:
                this.setor = Setor.CurN;
                break;
            case 6:
                this.setor = Setor.Ipa;
                break;
            case 7:
                this.setor = Setor.JoaC;
                break;
            case 8:
                this.setor = Setor.Laj;
                break;
            case 9:
                this.setor = Setor.Mac;
                break;
            case 10:
                this.setor = Setor.Mos;
                break;
            case 11:
                this.setor = Setor.NatCe;
                break;
            case 12:
                this.setor = Setor.NatCi;
                break;
            case 13:
                this.setor = Setor.NatZ;
                break;
            case 14:
                this.setor = Setor.NovC;
                break;
            case 15:
                this.setor = Setor.Pare;
                break;
            case 16:
                this.setor = Setor.Parn;
                break;
            case 17:
                this.setor = Setor.PauF;
                break;
            case 18:
                this.setor = Setor.SanC;
                break;
            case 19:
                this.setor = Setor.SaoGA;
                break;
            case 20:
                this.setor = Setor.SaoPP;
                break;
            case 21:
                this.setor = Setor.ForI;
                break;
        }
    }
}
