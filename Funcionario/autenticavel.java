public abstract interface autenticavel {

    public abstract void setLogin(String login);

    public abstract void setSenha(int senha);

    public abstract boolean autentica(String login, int senha);

    public abstract int getSenha();

    public abstract String getLogin();
}
