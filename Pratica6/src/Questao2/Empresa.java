package Questao2;

class Empresa {
    private String nome;
    private String cnpj;
    private int qtde_de_funcionario;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtde_de_funcionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtde_de_funcionario = qtde_de_funcionario;
        this.funcionarios = new Funcionario[100];
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtde_de_funcionario < 100) {
            funcionarios[qtde_de_funcionario] = funcionario;
            qtde_de_funcionario++;
        } else {
            System.out.println("Limite máximo de funcionários atingido.");
        }
    }

    public void mostrarFuncionarios() {
        for (int i = 0; i < qtde_de_funcionario; i++) {
            funcionarios[i].mostrarDados();
        }
    }
}
