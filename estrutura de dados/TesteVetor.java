import java.util.ArrayList;

public class TesteVetor {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Maria");

        Vetor lista = new Vetor();

        lista.adicionar(a1);
        System.out.println(lista.tamanho()); 
        lista.adicionar(a2);

        System.out.println(lista);

        Aluno a3 = new Aluno("Danilo");
        System.out.println(lista.contem(a3));

        lista.adicionar(0, a3);

        System.out.println(lista);

        lista.remover(0);
        System.out.println(lista);

        for(int i = 0; i < 300; i++) {
            Aluno y = new Aluno("Juca "+i);
            lista.adicionar(y);
        }
        System.out.println(lista);
        ArrayList<Aluno> listaDoJava = new ArrayList<Aluno>();
        System.out.println(listaDoJava);
    }
}
