package Questao2;

public class Principal {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Funcionario("João", "joao@example.com", "123456789", "Departamento 1",
                5000.0, "01/01/2022", "1234567890");
        funcionarios[1] = new Funcionario("Maria", "maria@example.com", "987654321", "Departamento 2",
                6000.0, "02/02/2022", "0987654321");
        funcionarios[2] = new Funcionario("Pedro", "pedro@example.com", "111222333", "Departamento 1",
                5500.0, "03/03/2022", "1112223334");
        funcionarios[3] = new Funcionario("Ana", "ana@example.com", "444555666", "Departamento 3",
                7000.0, "04/04/2022", "4445556667");
        funcionarios[4] = new Funcionario("Carlos", "carlos@example.com", "777888999", "Departamento 2",
                4500.0, "05/05/2022", "7778889990");

        Empresa empresa = new Empresa("Minha Empresa", "1234567890", 5);

        for (Funcionario funcionario : funcionarios) {
            empresa.adicionarFuncionario(funcionario);
        }

        empresa.mostrarFuncionarios();
    }
}
