public class ContaPoupanca extends conta{
    
    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor)
    {
        if(valor>0){
            System.out.println("Depositando R$"+valor);
            super.saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$"+super.saldo);
        }
        else{
            System.out.println("Necessario ser um valor positivo maior que 0");
        }
    }

    @Override
    public boolean transferir(double valor, conta numero){
        double valorsaque = valor + 0.2;
        return super.transferir(valorsaque, numero);
    }
}
