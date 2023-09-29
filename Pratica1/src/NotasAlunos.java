public class NotasAlunos {
}
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;

    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(double novaNotaAV1) {
        this.notaAV1 = novaNotaAV1;
    }

    public void alteraNotaAV2(double novaNotaAV2) {
        this.notaAV2 = novaNotaAV2;
    }

    public void alteraNotaAE(double novaNotaAE) {
        this.notaAE = novaNotaAE;
    }

    public void avaliarAluno() {
        double notaTotal = notaAV1 + notaAV2;
        if (notaTotal >= 60) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Recuperação");
        }
    }

    public void avaliarRecuperacao(double notaAE) {
        double notaTotal = notaAV1 + notaAV2 + notaAE;
        if (notaTotal >= 60) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a nota AV1 do aluno: ");
        double notaAV1 = scanner.nextDouble();

        System.out.print("Digite a nota AV2 do aluno: ");
        double notaAV2 = scanner.nextDouble();

        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.next();

        System.out.print("Digite o período do aluno: ");
        int periodo = scanner.nextInt();

        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        System.out.println();
        System.out.println("Dados do aluno:");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Curso: " + aluno.curso);
        System.out.println("Período: " + aluno.periodo);

        System.out.println();
        System.out.println("Situação do aluno após a AV1 e AV2:");
        aluno.avaliarAluno();

        System.out.print("Digite a nota AE do aluno: ");
        double notaAE = scanner.nextDouble();
        aluno.alteraNotaAE(notaAE);

        System.out.println();
        System.out.println("Situação do aluno após a recuperação:");
        aluno.avaliarRecuperacao(notaAE);

        scanner.close();
    }
}