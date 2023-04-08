package ifrn.model;

public enum Tipo {
    Individual(1,"Individual"),
    Coletiva(2,"Coletiva");
    
    private int cod;
    private String tipo;
    
    Tipo(int cod, String tipo) {
        this.cod = cod;
        this.tipo = tipo;
    }

    public int getCod() {
        return cod;
    }
    
    public String getTipo() {
        return tipo;
    }
}
