import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Marco");
        fila.adiciona("Ace");
        System.out.println(fila);

        String x1 = fila.remover();
        System.out.println(fila);
        System.out.println(x1);
        System.out.println(fila);

        Queue<String> filaJava = new LinkedList<String>();

        filaJava.add("Barba Branca");
        System.out.println(filaJava);

        String x2 = filaJava.poll();
        System.out.println(x2);
    }
}
