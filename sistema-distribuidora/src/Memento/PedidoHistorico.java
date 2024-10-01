package Memento;

import Errors.HistoricoException;

import java.util.Stack;

//implementando padrao de projeto comportamental Memento, para manipular o historico de pedidos
public class PedidoHistorico {

    private Stack<PedidoMemento> history = new Stack<>();


    public void salvarBackup(PedidoMemento memento) {
        history.push(memento);
    }


    public PedidoMemento restaurarUltimoBackup() throws HistoricoException {
        if (!history.isEmpty()) {
            return history.pop();
        }
        throw new HistoricoException("Erro ao restaurar o historico de pedidos");
    }
}
