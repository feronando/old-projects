package ifrn.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Atleta implements Serializable {

    private long matricula;
    private String nome;
    private Sexo sexo;
    private Categoria categoria;
    private Curso curso;
    private int ano_periodo;
    private ArrayList<Modalidade> moda;

    public Atleta() {
        moda = new ArrayList<Modalidade>();
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setSexo(int sexo) {
        switch (sexo) {
            case 1:
                this.sexo = Sexo.Feminino;
                break;
            case 2:
                this.sexo = Sexo.Masculino;
                break;
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCategoria(int categoria) {
        switch (categoria) {
            case 1:
                this.categoria = Categoria.Aluno;
                break;
            case 2:
                this.categoria = Categoria.Servidor;
                break;
        }
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setCurso(int curso) {
        switch (curso) {
            case 0:
                this.curso = Curso.Sem_Curso;
                break;
            case 1:
                this.curso = Curso.Integrado_Informatica;
                break;
            case 2:
                this.curso = Curso.Integrado_Mecatronica;
                break;
            case 3:
                this.curso = Curso.Subsequente_Mecatronica;
                break;
            case 4:
                this.curso = Curso.Subsequente_Redes_de_Computadores;
                break;
            case 5:
                this.curso = Curso.Graduacao_Tecnologia_Sistemas_para_Internet;
                break;
            case 6:
                this.curso = Curso.Licenciatura_Formacao_Pedagogica_Docentes;
                break;
            case 7:
                this.curso = Curso.PosGraduacao_Ensino_Ciencias_Naturais_E_Matematica;
                break;
        }
    }

    public int getAno_periodo() {
        return ano_periodo;
    }

    public void setAno_periodo(int ano_periodo) {
        this.ano_periodo = ano_periodo;
    }

    public ArrayList<Modalidade> getMod() {
        return moda;
    }

    public void setMod(String[] moda) {
        for (int i = 0; i < moda.length; i++) {
            switch (Integer.parseInt(moda[i])) {
                case 1:
                    this.moda.add(Modalidade.Atl);
                    break;
                case 2:
                    this.moda.add(Modalidade.Bas);
                    break;
                case 3:
                    this.moda.add(Modalidade.FutC);
                    break;
                case 4:
                    this.moda.add(Modalidade.Futs);
                    break;
                case 5:
                    this.moda.add(Modalidade.Han);
                    break;
                case 6:
                    this.moda.add(Modalidade.JiuJ);
                    break;
                case 7:
                    this.moda.add(Modalidade.Nat);
                    break;
                case 8:
                    this.moda.add(Modalidade.TenM);
                    break;
                case 9:
                    this.moda.add(Modalidade.Vol);
                    break;
            }
        }
    }

    public void setMod(int moda) {
        switch (moda) {
            case 1:
                this.moda.add(Modalidade.Atl);
                break;
            case 2:
                this.moda.add(Modalidade.Bas);
                break;
            case 3:
                this.moda.add(Modalidade.FutC);
                break;
            case 4:
                this.moda.add(Modalidade.Futs);
                break;
            case 5:
                this.moda.add(Modalidade.Han);
                break;
            case 6:
                this.moda.add(Modalidade.JiuJ);
                break;
            case 7:
                this.moda.add(Modalidade.Nat);
                break;
            case 8:
                this.moda.add(Modalidade.TenM);
                break;
            case 9:
                this.moda.add(Modalidade.Vol);
                break;
        }

    }
}
