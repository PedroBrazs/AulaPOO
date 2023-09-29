public class EmpregoFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public double getGastos() {
        double gastos = salario + (horasAula * 40); // Adiciona o bônus de R$40 por hora/aula
        return gastos;
    }

    public String getInfo() {
        double salarioTotal = salario + (horasAula * 40); // Calcula o salário total com o bônus
        return "Nome: " + nome + ", Salário: R$" + salarioTotal;
    }

    public static void main(String[] args) {
        EmpregadoDaFaculdade professor = new EmpregadoDaFaculdade();
        professor.nome = "João";
        professor.salario = 2000.0;
        professor.horasAula = 10;

        System.out.println("Gastos: R$" + professor.getGastos());
        System.out.println(professor.getInfo());
    }
}
