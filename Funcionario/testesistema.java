public class testesistema {
    public static void main(String args[]){
        gerente g = new gerente();


        autenticavel g2 = new gerente();

        autenticavel cli = new cliente();

        autenticavel adm = new administrador();

        sistemainterno si = new sistemainterno();

        g.setLogin("marcos");
        g.setSenha(2222);
        
        g2.setLogin("adm");
        g2.setSenha(1111);
        
        cli.setLogin("adm");
        cli.setSenha(2222);

        adm.setLogin("adm");
        adm.setSenha(2222);

        si.autenticar(g2);
        si.autenticar(cli);
        si.autenticar(g);
        si.autenticar(adm);
    }
}
