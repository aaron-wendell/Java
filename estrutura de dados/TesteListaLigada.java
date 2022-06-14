public class TesteListaLigada {
    public static void main(String[] args) {
        listaLigada lista = new listaLigada();

        lista.adiciona("Cheroso");
        lista.adiciona("Juca");
        lista.adicionaComeco("Cecilia");
        System.out.println(lista);
        lista.adiciona("Ana Clara");
        System.out.println(lista);
        lista.adiciona(3, "Alice");
        System.out.println(lista);

        Object x = lista.pega(2);
        System.out.println(x);

        System.out.println(lista.tamanho());
        lista.removeComeco();
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        System.out.println(lista.contem("Ana Clara"));
        System.out.println(lista.contem("Alice"));
    }
}
