import java.util.Stack;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.inserir("Marcos");
        System.out.println(pilha);
        pilha.inserir("Guilherme");
        System.out.println(pilha);

        String r1 = pilha.remover();
        System.out.println(r1+" removido");
        System.out.println(pilha);

        Stack<String> stack = new Stack<String>();
        stack.push("Marcos");
        stack.push("Marcelo");
        stack.push("Mendes");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        String nome = stack.peek();
        System.out.println(nome);
    }
}
