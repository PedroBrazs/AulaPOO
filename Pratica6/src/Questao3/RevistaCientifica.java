package Questao3;

import java.util.ArrayList;

class RevistaCientifica {
    private String titulo;
    private long issn;
    private String periodicidade;
    private ArrayList<Edicao> edicoes;

    public RevistaCientifica(String titulo, long issn, String periodicidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.periodicidade = periodicidade;
        this.edicoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public void adicionaEdicao(Edicao edicao) {
        edicoes.add(edicao);
    }

    public ArrayList<Edicao> getEdicoes() {
        return edicoes;
    }
}
