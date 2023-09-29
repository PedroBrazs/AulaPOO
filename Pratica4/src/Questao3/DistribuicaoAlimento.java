package Questao3;
public class DistribuicaoAlimento extends Projeto{
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    @Override
    public boolean validaProjeto(){
        if (getDataFim() =="")
            return true;
        else
            return false;
    }


    public String imprimeProjeto(){
        return "nome: " + getNomeProjeto()
                + "/n Descrição " + getDescricao()
                + "/n Data inicio: " + getDataInicio()
                + "/n Data Fim : " + getDataFim()
                + "/n Descrição Alimento: " + getDescAlimento()
                + "/n Quantidade: " + getQtde();


    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
}
