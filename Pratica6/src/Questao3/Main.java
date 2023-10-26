package Questao3;

import Questao2.Edicao;
import Questao3.Artigo;
import Questao3.RevistaCientifica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artigo> artigos = new ArrayList<>();

        artigos.add(new Artigo("Artigo 1", "Resumo do artigo 1", "Autor 1"));
        artigos.add(new Artigo("Artigo 2", "Resumo do artigo 2", "Autor 2"));
        artigos.add(new Artigo("Artigo 3", "Resumo do artigo 3", "Autor 3"));
        artigos.add(new Artigo("Artigo 4", "Resumo do artigo 4", "Autor 4"));
        artigos.add(new Artigo("Artigo 5", "Resumo do artigo 5", "Autor 5"));
        artigos.add(new Artigo("Artigo 6", "Resumo do artigo 6", "Autor 6"));
        artigos.add(new Artigo("Artigo 7", "Resumo do artigo 7", "Autor 7"));
        artigos.add(new Artigo("Artigo 8", "Resumo do artigo 8", "Autor 8"));
        artigos.add(new Artigo("Artigo 9", "Resumo do artigo 9", "Autor 9"));
        artigos.add(new Artigo("Artigo 10", "Resumo do artigo 10", "Autor 10"));

        Edicao edicao = new Edicao(1, 2023, "01/01Desculpe, parece que houve uma interrupção no código. Aqui está a continuação:

                ```java
                Edicao edicao = new Edicao(1, 2023, "01/01/2023", 1000);

        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        RevistaCientifica revista = new RevistaCientifica("Revista Científica", 1234567890, "Mensal");
        revista.adicionaEdicao(edicao);
    }
}