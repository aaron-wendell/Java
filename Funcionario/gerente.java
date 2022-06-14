public class gerente extends funcionariomaior implements autenticavel{ // gerente eh um funcionario, herda da class funcionario

    protected int senha;
    protected String login;

    public double getBonificacao(){
        // gerente
        System.out.println("Bonificacao do Gerente");
        //return super.getBonificacao() + super.getSalario();
        return 500;
    }

    @Override
    public boolean autentica(String login, int senha){
        if(this.login == login && this.senha == senha){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void setLogin(String login){
        this.login = login;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public int getSenha() {
        return senha;
    }
    
}
