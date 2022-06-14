import java.util.List;
import java.util.LinkedList;

public class Pilha {
    
    private List<String> nomes = new LinkedList<String>();

    public void inserir(String nome){
        nomes.add(nome);
    }

    public String remover(){
        return nomes.remove(nomes.size()-1);
    }

    public boolean vazio(){
        return false;
    }

    @Override 
    public String toString(){
        return nomes.toString();
    }

}
