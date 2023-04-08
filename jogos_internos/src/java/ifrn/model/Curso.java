package ifrn.model;

public enum Curso {
    Sem_Curso(0,"Não está cursando nenhum curso"),
    Integrado_Informatica(1,"Técnico Integrado em Informática"),
    Integrado_Mecatronica(2,"Técnico Integrado em Mecatrônica"),
    Subsequente_Mecatronica(3,"Técnico Subsequente em Mecatrônica"),
    Subsequente_Redes_de_Computadores(4,"Técnico Subsequente em Redes de Computadores"),
    Graduacao_Tecnologia_Sistemas_para_Internet(5,"Graduação em Tecnologia em Sistemas para Internet"),
    Licenciatura_Formacao_Pedagogica_Docentes(6,"Licenciatura em Formação Pedagógica de Docentes para a Educação Profissional e Tecnológica"),
    PosGraduacao_Ensino_Ciencias_Naturais_E_Matematica(7,"Pós-Graduação em Ensino de Ciências Naturais e Matemática");
    
    private int cod;
    private String nome;

    Curso(int cod,String nome) {
        this.nome = nome;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }
    
    public int getCod() {
        return cod;
    }
}
