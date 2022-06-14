public class sistemainterno {
    
    protected String login = "adm";
    protected int senha = 2222;
    
    public void autenticar(autenticavel g){

        boolean autenticou = g.autentica(this.login, this.senha);

        if(autenticou){
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }
}
