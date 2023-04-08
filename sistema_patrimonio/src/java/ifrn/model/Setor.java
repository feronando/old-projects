package ifrn.model;

public enum Setor {
    Apo(1, "Apodi"),
    Cai(2, "Caicó"),
    Can(3, "Canguaretama"),
    CeaM(4, "Ceará-Mirim"),
    CurN(5, "Currais Novos"),
    Ipa(6, "Ipanguaçu"),
    JoaC(7, "João Câmara"),
    Laj(8, "Lajes"),
    Mac(9, "Macau"),
    Mos(10, "Mossoró"),
    NatCe(11, "Natal – Central"),
    NatCi(12, "Natal – Cidade Alta"),
    NatZ(13, "Natal – Zona Norte"),
    NovC(14, "Nova Cruz"),
    Pare(15, "Parelhas"),
    Parn(16, "Parnamirim"),
    PauF(17, "Pau dos Ferros"),
    SanC(18, "Santa Cruz"),
    SaoGA(19, "São Gonçalo do Amarante"),
    SaoPP(20, "São Paulo do Potengi"),
    ForI(21, "Fora da Instituição");

    private int codSetor;
    private String setor;

    Setor(int codSetor, String setor) {
        this.codSetor = codSetor;
        this.setor = setor;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public String getSetor() {
        return setor;
    }
}
