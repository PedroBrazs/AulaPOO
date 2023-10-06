package Questao2;

class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String datainicio, String datafim,
                                String descAlimento, float qtde) {
        super(nomeProjeto, descricao, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        return datafim.isEmpty();
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomeProjeto + "\n" +
                "Descrição: " + descricao + "\n" +
                "Data de Início: " + datainicio + "\n" +
                "Data de Fim: " + datafim + "\n" +
                "Descrição do Alimento: " + descAlimento + "\n" +
                "Quantidade: " + qtde;
    }
}
