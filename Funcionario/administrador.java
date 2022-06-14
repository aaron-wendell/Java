public class administrador extends Funcionario implements autenticavel{

    protected int senha;
    protected String login;

    @Override
    public double getBonificacao() {
        return 400;
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
