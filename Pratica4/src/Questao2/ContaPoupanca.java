package Questao2;
class ContaPoupanca implements Conta {
    private double saldo;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
}

class GeradorExtratos {
    public void gerarExtrato(Conta conta) {
        System.out.println("Saldo Atual: " + conta.getSaldo());
    }
}
