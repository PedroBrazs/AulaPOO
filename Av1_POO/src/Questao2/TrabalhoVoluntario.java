package Questao2;

class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String datainicio, String datafim,
                              String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        return duracaoTrabalho > 2;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomeProjeto + "\n" +
                "Descrição: " + descricao + "\n" +
                "Data de Início: " + datainicio + "\n" +
                "Data de Fim: " + datafim + "\n" +
                "Tipo de Trabalho: " + tipoTrabalho + "\n" +
                "Duração do Trabalho: " + duracaoTrabalho + " horas";
    }
}