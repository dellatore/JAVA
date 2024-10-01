
package Facade;

import Services.Pedido;
import Strategy.Entrega;

import java.io.File;
import java.io.FileWriter;
import java.util.stream.Collectors;

//Implementando padrao estrutural de projeto Facade, para abstrair a criação e escrita em arquivos.txt.
public class NotaFiscal {

    
    public void criarNotaFiscal(String diretorio, Pedido pedido, Entrega entrega){

        final String origem = "IFSP";

        if (diretorio == null) {
                diretorio = "./";
            }
        
        File aquivo;
        
        try {
            
            aquivo = new File(diretorio + "NF-e_" + pedido.getCliente().getNome());
            
            FileWriter escritor = new FileWriter(aquivo, true);
            
            escritor.write("===================================NOTA FISCAL " + pedido.getCliente().getNome().toUpperCase() + "===================================\n");
            escritor.write("provedor: Distribuidora IFSP\n\n\n\n\n" );

            escritor.write("===================================DADOS DO COMPRADOR===================================\n\n");
            escritor.write("nome: " + pedido.getCliente().getNome() + "\n");
            escritor.write("contato: " + pedido.getCliente().getContato() + "\n");
            escritor.write("endereço: " + pedido.getCliente().getEndereco().getRua() + " ," + pedido.getCliente().getEndereco().getNumero()
                            + " " + pedido.getCliente().getEndereco().getBairro() + " , " + pedido.getCliente().getEndereco().getRegiao().getCidade());
            
            escritor.write("\n\n===================================DADOS DA COMPRA===================================\n\n");

            escritor.write(pedido.getProdutos().stream()
                .map(produto -> produto.getProduto().getDescricao() + "------" + produto.getQuantidade() + "x------" + produto.getProduto().getPrecoUnitario())
                .collect(Collectors.joining("\n")));
            
            escritor.write("\nfrete: " + pedido.getFrete());
            escritor.write("\nvalor total: " + pedido.getValorTotal());
            escritor.write("\nforma de pagamento: " + pedido.getFormaPagamento());
            


            escritor.write("\n\n===================================DADOS DA ENTREGA===================================\n\n");
            escritor.write(entrega.entrega(origem,pedido.getCliente().getEndereco().getRua() + " " + pedido.getCliente().getEndereco().getNumero()));

            escritor.close();

        } catch(Exception ex) {
            ex.printStackTrace();
        }    
    }

}
