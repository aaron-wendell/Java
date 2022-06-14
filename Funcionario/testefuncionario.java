public class testefuncionario {

    public static void main(String[] args) {
         
        funcionariomaior g1 = new gerente();
        g1.setNome("Marcos");
        g1.setCpf("235.568.524-13");
        g1.setSalario(5000);
        
        Funcionario f1 = new Designer();
        f1.setNome("Juca");
        f1.setCpf("158.563.559-74");
        f1.setSalario(2000);

        Funcionario e1 = new EditorVideo();
        e1.setNome("Edvaldo");
        e1.setCpf("359.354.217-95");
        e1.setSalario(1600);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        g1.setLogin("marcos");
        boolean autenticou = g1.autentica("marcos", 2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
        System.out.println(f1.getBonificacao());
        System.out.println(e1.getBonificacao());
    }
}
