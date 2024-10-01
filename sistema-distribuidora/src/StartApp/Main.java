package StartApp;

import BuilderProducts.Diretor;
import BuilderProducts.ProdutoBuilder;
import Errors.HistoricoException;
import Facade.NotaFiscal;
import Memento.PedidoHistorico;
import Memento.PedidoMemento;
import Models.Cliente;
import Models.Flyweight.Endereco;
import Models.Flyweight.EnderecoRegiao;
import Models.PedidoProduto;
import Models.Produto;
import Models.enums.FormaPagamento;
import Models.enums.TipoPedido;
import Repositorys.Clientes;
import Repositorys.EstoqueProdutos;
import Repositorys.Pedidos;
import Services.Caixa;
import Services.Pedido;
import Strategy.Entrega;
import Strategy.EntregaCarro;
import Strategy.EntregaEstrategia;
import Strategy.EntregaMoto;


public class Main {
    
    public static void main(String[] args) {
        
        ProdutoBuilder builder = new ProdutoBuilder();
        Diretor diretor = new Diretor(builder);
        
        EstoqueProdutos<Produto> estoque = EstoqueProdutos.getInstancia();
        Clientes clientes = Clientes.getInstancia();
        Pedidos pedidos = Pedidos.getInstancia();
        
        Produto cocaLata = diretor.cocaLata();
        Produto fanta2L = diretor.fanta2L();
        
        estoque.adicionarProduto(fanta2L, 100);
        estoque.adicionarProduto(cocaLata, 50);

        EnderecoRegiao araraquara = new EnderecoRegiao("Araraquara","Sao Paulo");
        EnderecoRegiao saoCarlos = new EnderecoRegiao("Sao Carlos", "Sao Paulo");

        Endereco enderecoJoao = new Endereco("Ap 401 bloco 24", 1301, "Lupo II", "14802195",araraquara ,"Araraquara", "Av Governador Orestes Quercia");
        Endereco enderecoMaria = new Endereco("Ap 24", 1424, "Lupo I","14802195", saoCarlos,"Araraquara", "Av Rodrigo Fernando Grilo");

        Cliente joao = new Cliente("João Pedro da Silva Vieira", "16992155796", enderecoJoao);
        Cliente maria = new Cliente("Maria Aparecida", "16992155796", enderecoMaria);
        
        clientes.cadastrarCliente(maria);
        clientes.cadastrarCliente(joao);
        
        PedidoProduto p1 = new PedidoProduto(cocaLata, 12);
        PedidoProduto p2 = new PedidoProduto(fanta2L, 6);
        PedidoProduto p3 = new PedidoProduto(cocaLata, 10);
        
        Pedido pedido1 = new Pedido(joao, FormaPagamento.DEBITO, TipoPedido.ENTREGA, estoque);
        Pedido pedido2 = new Pedido (maria, FormaPagamento.DINHEIRO, TipoPedido.RETIRADA, estoque);
        
        pedido1.adicionarProdutosAoPedido(p1);
        pedido1.adicionarProdutosAoPedido(p2);
        pedido1.adicionarProdutosAoPedido(p3);
       
        pedido1.lancarPedido(pedidos);
        pedido1.finalizarPedido();
        
        pedido2.adicionarProdutosAoPedido(p3);
        pedido2.adicionarProdutosAoPedido(p2);
        pedido2.lancarPedido(pedidos);
        pedido2.finalizarPedido();

        Pedido pedido3 = new Pedido(joao, FormaPagamento.DEBITO, TipoPedido.ENTREGA, estoque);
        pedido3.adicionarProdutosAoPedido(p1);
        pedido3.adicionarProdutosAoPedido(p2);
        PedidoHistorico historico = new PedidoHistorico();
        System.out.println("Pedido atual:");
        System.out.println(pedido3);
        System.out.println("Valor total do pedido: " + pedido3.getValorTotal());

        // Salvar o estado atual do pedido (backup)
        PedidoMemento backup = pedido3.criarBackup();
        historico.salvarBackup(backup);

        pedido3.removerProdutosDoPedido(p2);
        pedido3.calcularValorTotalPedido();

        System.out.println("\nPedido após remoção de um produto:");
        System.out.println(pedido3);
        System.out.println("Valor total do pedido: " + pedido3.getValorTotal());

        PedidoMemento ultimoBackup = null;
        try {
            ultimoBackup = historico.restaurarUltimoBackup();
        } catch (HistoricoException e) {
            throw new RuntimeException(e);
        }
        if (ultimoBackup != null) {
            pedido3.restaurarBackup(ultimoBackup);
        }

        System.out.println("\nPedido restaurado ao estado anterior:");
        System.out.println(pedido3);
        System.out.println("Valor total do pedido: " + pedido3.getValorTotal());

        EntregaEstrategia formaDeEntrega = new EntregaCarro();
        Entrega entrega = new Entrega(formaDeEntrega);

        EntregaEstrategia formaDeEntregaII = new EntregaMoto();
        Entrega entregaII = new Entrega(formaDeEntregaII);

        Caixa.FaturamentoTotal(pedidos);

        new NotaFiscal().criarNotaFiscal("C:\\Users\\gabriel.dellatore\\projetos\\sistema-distribuidora\\NOTASFISCAIS\\",pedido3,entrega);
        new NotaFiscal().criarNotaFiscal("C:\\Users\\gabriel.dellatore\\projetos\\sistema-distribuidora\\NOTASFISCAIS\\",pedido2,entregaII);


    }
    
    
}
