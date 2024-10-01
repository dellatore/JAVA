package Memento;

import Models.Cliente;
import Models.PedidoProduto;
import Models.enums.FormaPagamento;
import Models.enums.Status;
import Models.enums.TipoPedido;
import Repositorys.EstoqueProdutos;

import java.util.ArrayList;

//implementando padrao de projeto comportamental Memento, para salvar o historico de pedidos
public class PedidoMemento {

    private final Cliente cliente;
    private final Status status;
    private final FormaPagamento formaPagamento;
    private final TipoPedido tipoPedido;
    private final double valorTotal;
    private final ArrayList<PedidoProduto> produtos;
    private final EstoqueProdutos estoqueProdutos;

    public PedidoMemento(Cliente cliente, Status status, FormaPagamento formaPagamento, TipoPedido tipoPedido,
                         double valorTotal, ArrayList<PedidoProduto> produtos, EstoqueProdutos estoqueProdutos) {
        this.cliente = cliente;
        this.status = status;
        this.formaPagamento = formaPagamento;
        this.tipoPedido = tipoPedido;
        this.valorTotal = valorTotal;
        this.produtos = new ArrayList<>(produtos);
        this.estoqueProdutos = estoqueProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Status getStatus() {
        return status;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<PedidoProduto> getProdutos() {
        return produtos;
    }

    public EstoqueProdutos getEstoqueProdutos() {
        return estoqueProdutos;
    }
}
