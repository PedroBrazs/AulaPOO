package Questão2;
public abstract class Funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularProventos(){
        return getSalario();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" + "Matricula: " + getMatricula() + "\n" + "Salario: " + getSalario();
    }
}



