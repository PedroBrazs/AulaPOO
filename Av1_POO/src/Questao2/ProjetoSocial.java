package Questao2;
import javax.swing.JOptionPane;
public class ProjetoSocial {
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 3) {
            String input = JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1 - Distribuição de Alimentos\n" +
                            "2 - Trabalho Voluntário\n" +
                            "3 - Sair"
            );
            opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1:
                    String nomeProjeto1 = JOptionPane.showInputDialog("Nome do Projeto:");
                    String descricao1 = JOptionPane.showInputDialog("Descrição:");
                    String datainicio1 = JOptionPane.showInputDialog("Data de Início:");
                    String datafim1 = JOptionPane.showInputDialog("Data de Fim (deixe em branco se não definida):");
                    String descAlimento = JOptionPane.showInputDialog("Descrição do Alimento:");
                    float qtde = Float.parseFloat(JOptionPane.showInputDialog("Quantidade:"));

                    DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento(nomeProjeto1, descricao1,
                            datainicio1, datafim1, descAlimento, qtde);

                    if (distribuicaoAlimento.validaProjeto(nomeProjeto1)) {
                        JOptionPane.showMessageDialog(null, distribuicaoAlimento.imprimeProjeto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Projeto inválido.");
                    }
                    break;

                case 2:
                    String nomeProjeto2 = JOptionPane.showInputDialog("Nome do Projeto:");
                    String descricao2 = JOptionPane.showInputDialog("Descrição:");
                    String datainicio2 = JOptionPane.showInputDialog("Data de Início:");
                    String datafim2 = JOptionPane.showInputDialog("Data de Fim (deixe em branco se não definida):");
                    String tipoTrabalho = JOptionPane.showInputDialog("Tipo de Trabalho:");
                    int duracaoTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Duração do Trabalho (em horas):"));

                    TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario(nomeProjeto2, descricao2,
                            datainicio2, datafim2, tipoTrabalho, duracaoTrabalho);

                    if (trabalhoVoluntario.validaProjeto(nomeProjeto2)) {
                        JOptionPane.showMessageDialog(null, trabalhoVoluntario.imprimeProjeto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Projeto inválido.");
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}
