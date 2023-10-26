package Questao1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criando uma nova rede social...");
        System.out.print("Data de criação: ");
        String dataCriacao = scanner.nextLine();
        System.out.print("Nome do usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        System.out.println("\nCriando publicações...");

        for (int i = 1; i <= 2; i++) {
            System.out.println("Publicação " + i);
            System.out.print("Data de publicação: ");
            String dataPublicacao = scanner.nextLine();
            System.out.print("Texto: ");
            String textoPublicacao = scanner.nextLine();
            System.out.print("Link da mídia: ");
            String linkMidia = scanner.nextLine();

            Publicacao publicacao = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
            redeSocial.inserePublicacao(publicacao);
        }

        System.out.println("\nImprimindo publicações...");
        redeSocial.imprimePublicacoes();

        scanner.close();
    }
}