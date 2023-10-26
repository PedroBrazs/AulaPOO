package Questao1;

import Questao1.Publicacao;

import java.util.ArrayList;

class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<Publicacao> publicacoes;

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.publicacoes = new ArrayList<>();
    }

    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        for (Publicacao publi : publicacoes) {
            System.out.println("Data de publicação: " + publi.getDataPublicacao());
            System.out.println("Texto: " + publi.getTextoPublicacao());
            System.out.println("Link da mídia: " + publi.getLinkMidia());
            System.out.println();
        }
    }
}

