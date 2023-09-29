package Questao3;

public class TrabalhoVoluntario extends Projeto{
    private String  tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto(){
        if ( getDuracaoTrabalho() > 2)
            return true;
        else
           return false;

    }

    @Override
    public String imprimeProjeto(){
        return "Nome: " + getNomeProjeto()
                + "/n Descrição " + getDescricao()
                + "/n Data inicio: " + getDataInicio()
                + "/n Data Fim : " + getDataFim()
                + "/n Tipo Trabalho: " + getTipoTrabalho()
                + "/n Duração Trabalho: " + getDuracaoTrabalho();
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }
}
