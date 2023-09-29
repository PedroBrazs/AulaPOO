// Classe abstrata Celular
public abstract class Celular implements InterfaceCelular {
    private boolean enviarMensagem;
    private boolean acessoInternet;
    private boolean acessoEmails;
    private boolean radio;
    private boolean tv;
    private boolean verificarSistemaArquivos;
    private double preco;

    // Construtor
    public Celular(double preco) {
        this.preco = preco;
    }

    // Getters e Setters

    public boolean isEnviarMensagem() {
        return enviarMensagem;
    }

    public void setEnviarMensagem(boolean enviarMensagem) {
        this.enviarMensagem = enviarMensagem;
    }

    public boolean isAcessoInternet() {
        return acessoInternet;
    }

    public void setAcessoInternet(boolean acessoInternet) {
        this.acessoInternet = acessoInternet;
    }

    public boolean isAcessoEmails() {
        return acessoEmails;
    }

    public void setAcessoEmails(boolean acessoEmails) {
        this.acessoEmails = acessoEmails;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isVerificarSistemaArquivos() {
        return verificarSistemaArquivos;
    }

    public void setVerificarSistemaArquivos(boolean verificarSistemaArquivos) {
        this.verificarSistemaArquivos = verificarSistemaArquivos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
