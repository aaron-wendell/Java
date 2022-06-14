public abstract class Funcionario {
    
    private String nome;
    private String cpf;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /* public double getBonificacao(){
        // funcionario comum
        return this.salario * 0.1;
    }*/

    // abstract = nao ha implementacao do metodo nessa classe, metodo sem corpo (geralmente eh implementado nos filhos)
    public abstract double getBonificacao();


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
}
