public class novaconta {
    public static void main(String[] args) {
        conta primeiraconta = new ContaCorrente(1337, 2445);
        conta segundaconta = new ContaPoupanca(1279, 3569);
        System.out.println("Endereco da primeira conta: "+primeiraconta);
        System.out.println("Endereco da segunda conta: "+ segundaconta);
    
        segundaconta.depositar(70);
        segundaconta.sacar(5);
        primeiraconta.depositar(600);
        primeiraconta.transferir(500, segundaconta);

        titular paulo = new titular();
        //paulo.nascimento = "1995-02-23";
        paulo.setCpf("222.222.222-22");
        paulo.setNome("Paulo");
        paulo.setProfissao("Programador");

        titular maria = new titular();
        maria.setNome("Maria");
        maria.setCpf("111.111.111-11");
        //maria.nascimento = "1976-04-30";
        maria.setProfissao("Faxineira");

        primeiraconta.setCliente(paulo);
        segundaconta.setCliente(maria);

        System.out.println(paulo.getProfissao());
        System.out.println(maria.getProfissao());
        
        System.out.println("Primeira conta tem R$"+primeiraconta.getSaldo());
        System.out.println("Segunda conta tem R$"+segundaconta.getSaldo());

        System.out.println("Total de contas ja criadas: "+conta.getTotal());

        ContaCorrente cc = new ContaCorrente(1151, 1511);
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca(2252, 2222);
        cp.depositar(200);

        cp.transferir(20, cc);

        segurovida seguro = new segurovida();
        calculadorimposto calcula = new calculadorimposto();
        bolsavalores bolsa = new bolsavalores();

        System.out.println(calcula.getImposto());
        calcula.registra(cc);
        System.out.println(calcula.getImposto());
        calcula.registra(seguro);
        System.out.println(calcula.getImposto());
        calcula.registra(bolsa);
        System.out.println(calcula.getImposto());

    }    
}
