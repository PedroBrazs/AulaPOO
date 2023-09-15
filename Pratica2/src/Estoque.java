public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void darBaixa(int qtde) {
        if (qtdAtual >= qtde) {
            qtdAtual -= qtde;
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
    }


    public String mostra() {
        return "Nome: " + nome + ", Quantidade Mínima: " + qtdMinima + ", Quantidade Atual: " + qtdAtual;
    }

    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }

    public static void main(String[] args) {

        Estoque estoque = new Estoque("Produto A", 10, 5);

        System.out.println("Dados do estoque:");
        System.out.println(estoque.mostra());

        estoque.darBaixa(3);
        System.out.println("Após dar baixa de 3 unidades:");
        System.out.println(estoque.mostra());

        estoque.darBaixa(10); // Tentativa de dar baixa em quantidade maior que o estoque atual
        System.out.println("Após dar baixa de 10 unidades:");
        System.out.println(estoque.mostra());

        if (estoque.precisaRepor()) {
            System.out.println("É necessário repor o estoque.");
        } else {
            System.out.println("Não é necessário repor o estoque.");
        }
    }
}
