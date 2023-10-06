package Questao2;

abstract class Projeto {
    protected String nomeProjeto;
    protected String descricao;
    protected String endereco;
    protected String datainicio;
    protected String datafim;

    public Projeto(String nomeProjeto, String descricao, String datainicio, String datafim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public abstract boolean validaProjeto(String nomeProjeto);

    public abstract String imprimeProjeto();
}
