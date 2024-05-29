package apoio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilhaEFila {
    public static void main(String[] args) {
        System.out.println("fila: ");
            Queue<String> fila = new LinkedList<>();
        fila.add("Linux");
        fila.add("Windows");
        fila.add("Android");
        fila.add("macOS");

        System.out.println("primeiro elemeno a sair: " + fila.element());
        System.out.println(fila);
        System.out.println("elemento retirado: " + fila.poll());

        System.out.println();

        System.out.println("pilha:");

        Stack<String> pilha = new Stack<>();

        pilha.push("Linux");
        pilha.push("Windows");
        pilha.push("Android");
        pilha.push("macOS");

        System.out.println("primeiro elemento a sair: " + pilha.peek());
        System.out.println("elemento retirado: " + pilha.pop());

    }

}
