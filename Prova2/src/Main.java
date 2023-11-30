import java.util.ArrayList;
import java.util.Date;

class Evento {
    private String nomeEvento;
    private Date dataEvento;
    private double precoEvento;
    private String desEvento;
    private int qtdeIngresso;
    private Categoria categoria;

    public Evento(String nomeEvento, Date dataEvento, double precoEvento, String desEvento, int qtdeIngresso, Categoria categoria) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.precoEvento = precoEvento;
        this.desEvento = desEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.categoria = categoria;
    }

    public Evento(Object nomeEvento, int i, Object o, int i1, Object o1) {
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public double getPrecoEvento() {
        return precoEvento;
    }

    public void setPrecoEvento(double precoEvento) {
        this.precoEvento = precoEvento;
    }

    public String getDesEvento() {
        return desEvento;
    }

    public void setDesEvento(String desEvento) {
        this.desEvento = desEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean buscarEvento(Evento evento) {
        return nomeEvento.equals(evento.getNomeEvento());
    }

    public void inserirEvento() {
        // Lógica para inserir o evento
        // ...
    }
}

class Categoria {
    private String descCategoria;

    public Categoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }
}

class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = new Date();
        this.precoTotal = 0;
        this.statusPedido = 1;
        this.itensPedido = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public void inserirPedido() {
        // Lógica para inserir o pedido
        // ...
    }

    public int alterarStatus() {
        return statusPedido;
    }

    public boolean consultarPedido() {
        return true;
    }

    public void inserirItensPedido() {
        // Lógica para inserir itens no pedido
        // ...
    }

    public void excluirItensPedido() {
        // Lógica para excluir itens do pedido
        // ...
    }

    public double calculaTotalPagar() {
        // Lógica para calcular o total a pagar
        precoTotal = itensPedido.stream()
                .mapToDouble(item -> item.getPrecoIngresso() * item.getQtdeIngresso())
                .sum();
        return precoTotal;
    }
}

class PedidoItem {
    private String nomeEvento;
    private int qtdeIngresso;
    private double precoIngresso;

    public PedidoItem(String nomeEvento, int qtdeIngresso, double precoIngresso) {
        this.nomeEvento = nomeEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.precoIngresso = precoIngresso;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public boolean atualizaEstoqueIngresso() {
        // Lógica para atualizar o estoque de ingressos do evento
        // ...
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("Categoria 1");
        Categoria categoria2 = new Categoria("Categoria 2");

        Evento evento1 = new Evento("Evento 1", new Date(), 50.0, "A culpa é do Cabral", 900, categoria1);
        Evento evento2 = new Evento("Evento 2", new Date(), 30.0, "Show do Perícles", 800, categoria2);

        Pedido pedido1 = new Pedido(1);

        PedidoItem item1 = new PedidoItem("Evento 1", 2, 85.0);
        PedidoItem item2 = new PedidoItem("Evento 2", 1, 120.0);

        if (evento1.buscarEvento(new Evento(item1.getNomeEvento(), null, 0, null, 0, null))) {
            pedido1.getItensPedido().add(item1);
            item1.atualizaEstoqueIngresso();
        }

        if (evento1.buscarEvento(new Evento(item2.getNomeEvento(), null, 0, null, 0, null))) {
            pedido1.getItensPedido().add(item2);
            item2.atualizaEstoqueIngresso();
        }

        if (evento2.buscarEvento(new Evento(item1.getNomeEvento(),
                0, null, 0, null))) {
            pedido1.getItensPedido().add(item2);
            item1.atualizaEstoqueIngresso();
        }

        pedido1.setStatusPedido(2);

        double totalPagarPedido1 = pedido1.calculaTotalPagar();

        System.out.println("Valor total a pagar - Pedido 1: " + totalPagarPedido1);
    }
}