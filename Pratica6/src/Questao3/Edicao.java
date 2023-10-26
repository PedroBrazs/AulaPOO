package Questao3;

import java.util.ArrayList;

class Edicao {
    private int numero;
    private int volume;
    private String dataEdicao;
    private int tiragem;
    private ArrayList<Artigo> artigos;

    public Edicao(int numero, int volume, String dataEdicao, int tiragem) {
        this.numero = numero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.tiragem = tiragem;
        this.artigos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public void adicionaArtigo(Artigo artigo) {
        artigos.add(artigo);
    }

    public ArrayList<Artigo> getArtigos() {
        return artigos;
    }
}
