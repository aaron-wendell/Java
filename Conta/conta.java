public abstract class conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private titular cliente;
    private static int total;

    public conta(int agencia, int numero){
        if(agencia<=0 || numero<=0) {
            System.out.println("Agencia e numero necessitam ser positivos");
        } else {
            total++;
            this.agencia = agencia;
            this.numero = numero;
            // System.out.println("Total de contas ja criadas: "+ conta.total);
        }
    }

    public abstract void depositar(double valor);

    boolean sacar(double valor){
        System.out.println("Sacando R$"+valor);
        if(valor > this.saldo){
            System.out.println("Impossivel sacar o valor requisitado!\nO valor e maior que o saldo da conta");
            return false;
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual: R$"+this.saldo);
            return true;
        }
    }

    boolean transferir(double valor, conta destino){
        
        if(valor <= this.saldo){
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println("Saldo atual: R$"+this.saldo);
            return true;
        }
        else{
            System.out.println("Impossivel transferir o valor requisitado!\nO valor e maior que o saldo da conta");
            return false;
        }
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setCliente(titular cliente) {
        this.cliente = cliente;
    }

    public titular getCliente() {
        return cliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    double getSaldo(){
        return this.saldo;
    }

    public static int getTotal(){
        return conta.total;
    }
}

