public class Rendimento {
}
    private double vrInicial;
    private double txMensal;
    private int numMeses;

    public Investimento(double vrInicial, double txMensal, int numMeses) {
        this.vrInicial = vrInicial;
        this.txMensal = txMensal;
        this.numMeses = numMeses;
    }

    public double calcularRendimento() {
        double rendimentoTotal = vrInicial * (1 + txMensal * numMeses);
        double rendimento = rendimentoTotal - vrInicial;
        return rendimento;
    }

    public static void main(String[] args) {
        Rendimento = new Rendimento(1000, 0.05, 12);
        double rendimento = rendimento.calcularRendimento();

        System.out.println("Investimento inicial: R$" + rendimento.get.());
        System.out.println("Taxa mensal de rendimento: " + (rendimento.getTaxaMensal() * 100) + "%");
        System.out.println("Número de meses: " + rendimento.getNumeroMeses());
        System.out.println("Rendimento: R$" + rendimento);
    }

    public double getVrInicial() {
        return vrInicial;
    }

    public double getTxMensal() {
        return txMensal;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setVrInicial(double vrInicial) {
        this.vrInicial = vrInicial;
    }

    public void setTxMensal(double txMensal) {
        this.txMensal = txMensal;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }
}