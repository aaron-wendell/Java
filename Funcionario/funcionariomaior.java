public abstract class funcionariomaior extends Funcionario{
    
    protected int senha;
    protected String login;

    public boolean autentica(String login, int senha){
        if(this.login == login && this.senha == senha){
            return true;
        }
        else{
            return false;
        }
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public int getSenha() {
        return senha;
    }
}
