public class ContaCorrente extends conta implements tributavel{
    
    public ContaCorrente(int agencia, int numero){
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
    public double getImposto() {
        return super.saldo * 0.01;
    }
}
