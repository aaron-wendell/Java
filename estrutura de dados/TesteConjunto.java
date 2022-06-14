import java.util.HashSet;
import java.util.Set;

public class TesteConjunto {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        conjunto.adicionar("Mauricio");
        System.out.println(conjunto);
        conjunto.adicionar("Paulo");
        System.out.println(conjunto);
        conjunto.adicionar("Guilherme");
        System.out.println(conjunto);
        conjunto.remover("Guilherme");
        System.out.println(conjunto);

        Set<String> conjuntoJava = new HashSet<String>();

        conjuntoJava.add("Omar");
        conjuntoJava.add("Edmilson");
        System.out.println(conjuntoJava);

        String x = "Guilherme";
        x.hashCode();
        System.out.println(x);
        System.out.println("Guilherme".hashCode());
    }
}
